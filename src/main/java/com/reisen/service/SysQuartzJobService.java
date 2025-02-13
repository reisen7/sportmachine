package com.reisen.service;

import com.reisen.common.base.BaseService;
import com.reisen.common.quartz.QuartzSchedulerUtil;
import com.reisen.common.quartz.ScheduleConstants;
import com.reisen.common.support.ConvertUtil;
import com.reisen.mapper.auto.SysQuartzJobMapper;
import com.reisen.model.auto.SysQuartzJob;
import com.reisen.model.auto.SysQuartzJobExample;
import com.reisen.model.custom.Tablepar;
import com.reisen.util.SnowflakeIdWorker;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 定时任务调度表 SysQuartzJobService
 * @Title: SysQuartzJobService.java
 * @Package com.reisen.service
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2024-09-13 00:03:35
 **/
@Service
public class SysQuartzJobService implements BaseService<SysQuartzJob, SysQuartzJobExample>{
	@Autowired
	private SysQuartzJobMapper sysQuartzJobMapper;
	@Autowired
	private QuartzSchedulerUtil quartzSchedulerUtil;
      	   	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param tablepar
	 * @return
	 */
	 public PageInfo<SysQuartzJob> list(Tablepar tablepar,String name){
	        SysQuartzJobExample testExample=new SysQuartzJobExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andJobNameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<SysQuartzJob> list= sysQuartzJobMapper.selectByExample(testExample);
	        PageInfo<SysQuartzJob> pageInfo = new PageInfo<SysQuartzJob>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
		List<String> lista=ConvertUtil.toListStrArray(ids);
		SysQuartzJobExample example=new SysQuartzJobExample();
		example.createCriteria().andIdIn(lista);
		return sysQuartzJobMapper.deleteByExample(example);
	}
	
	
	@Override
	public SysQuartzJob selectByPrimaryKey(String id) {
		
		return sysQuartzJobMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysQuartzJob record) {
		int i= sysQuartzJobMapper.updateByPrimaryKeySelective(record);
		if(i>0) {
			//修改定时器
			quartzSchedulerUtil.modifyJob(record);
		}
		return i;
	}
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysQuartzJob record) {
		//添加雪花主键id
		record.setId(SnowflakeIdWorker.getUUID());
		return sysQuartzJobMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysQuartzJob record, SysQuartzJobExample example) {
		
		return sysQuartzJobMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysQuartzJob record, SysQuartzJobExample example) {
		
		return sysQuartzJobMapper.updateByExample(record, example);
	}

	@Override
	public List<SysQuartzJob> selectByExample(SysQuartzJobExample example) {
		
		return sysQuartzJobMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysQuartzJobExample example) {
		
		return sysQuartzJobMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysQuartzJobExample example) {
		
		return sysQuartzJobMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysQuartzJob
	 * @return
	 */
	public int checkNameUnique(SysQuartzJob sysQuartzJob){
		SysQuartzJobExample example=new SysQuartzJobExample();
		example.createCriteria().andJobNameEqualTo(sysQuartzJob.getJobName());
		List<SysQuartzJob> list=sysQuartzJobMapper.selectByExample(example);
		return list.size();
	}
	
	
	/**
     * 恢复任务
     * 
     * @param job 调度信息
     */
    @Transactional
    public int resumeJob(SysQuartzJob job) throws SchedulerException
    {
        job.setStatus(ScheduleConstants.Status.NORMAL.getValue());
        int rows = sysQuartzJobMapper.updateByPrimaryKeySelective(job);
        if (rows > 0)
        {
			quartzSchedulerUtil.resumeJob(job);
        }
        return rows;
    }
    
    
    /**
     * 暂停任务
     * 
     * @param job 调度信息
     */
    @Transactional
    public int pauseJob(SysQuartzJob job) throws SchedulerException
    {
        job.setStatus(ScheduleConstants.Status.PAUSE.getValue());
        //job.setUpdateBy(SaTokenUtil.getLoginName());
        int rows = sysQuartzJobMapper.updateByPrimaryKeySelective(job);
        if (rows > 0)
        {
			quartzSchedulerUtil.pauseJob(job);
        }
        return rows;
    }
    
    /**
     * 任务调度状态修改
     * 
     * @param job 调度信息
     */
    @Transactional
    public int changeStatus(SysQuartzJob job) throws SchedulerException
    {
        int rows = 0;
        Integer status = job.getStatus();
        if (ScheduleConstants.Status.NORMAL.getValue().equals(status))
        {
            rows = resumeJob(job);
        }
        else if (ScheduleConstants.Status.PAUSE.getValue().equals(status))
        {
            rows = pauseJob(job);
        }
        return rows;
    }
    
    
    /**
     * 立即运行任务
     * 
     * @param job 调度信息
     */
    @Transactional
    public void run(SysQuartzJob job) throws SchedulerException
    {

		quartzSchedulerUtil.run(job);
    	
    }



	/**
	 * 容器初始化时执行此方法
	 * 也就是类初始化的时候
	 */
	@PostConstruct
	public void init() throws SchedulerException {

    	List<SysQuartzJob> quartzJobs=sysQuartzJobMapper.selectByExample(new SysQuartzJobExample());
    	for (SysQuartzJob job : quartzJobs) {
    		try {
                //防止因为数据问题重复创建
                if(quartzSchedulerUtil.checkJobExists(job))
                {
					quartzSchedulerUtil.deleteJob(job);
                }
				quartzSchedulerUtil.createSchedule(job);
	        } catch (SchedulerException e) {
	            e.printStackTrace();
	        }
		}
	}
}
