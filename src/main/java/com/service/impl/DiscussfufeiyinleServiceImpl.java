package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussfufeiyinleDao;
import com.entity.DiscussfufeiyinleEntity;
import com.service.DiscussfufeiyinleService;
import com.entity.vo.DiscussfufeiyinleVO;
import com.entity.view.DiscussfufeiyinleView;

@Service("discussfufeiyinleService")
public class DiscussfufeiyinleServiceImpl extends ServiceImpl<DiscussfufeiyinleDao, DiscussfufeiyinleEntity> implements DiscussfufeiyinleService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfufeiyinleEntity> page = this.selectPage(
                new Query<DiscussfufeiyinleEntity>(params).getPage(),
                new EntityWrapper<DiscussfufeiyinleEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfufeiyinleEntity> wrapper) {
		  Page<DiscussfufeiyinleView> page =new Query<DiscussfufeiyinleView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfufeiyinleVO> selectListVO(Wrapper<DiscussfufeiyinleEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfufeiyinleVO selectVO(Wrapper<DiscussfufeiyinleEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfufeiyinleView> selectListView(Wrapper<DiscussfufeiyinleEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfufeiyinleView selectView(Wrapper<DiscussfufeiyinleEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
