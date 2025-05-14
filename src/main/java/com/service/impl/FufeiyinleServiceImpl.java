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


import com.dao.FufeiyinleDao;
import com.entity.FufeiyinleEntity;
import com.service.FufeiyinleService;
import com.entity.vo.FufeiyinleVO;
import com.entity.view.FufeiyinleView;

@Service("fufeiyinleService")
public class FufeiyinleServiceImpl extends ServiceImpl<FufeiyinleDao, FufeiyinleEntity> implements FufeiyinleService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FufeiyinleEntity> page = this.selectPage(
                new Query<FufeiyinleEntity>(params).getPage(),
                new EntityWrapper<FufeiyinleEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FufeiyinleEntity> wrapper) {
		  Page<FufeiyinleView> page =new Query<FufeiyinleView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FufeiyinleVO> selectListVO(Wrapper<FufeiyinleEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FufeiyinleVO selectVO(Wrapper<FufeiyinleEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FufeiyinleView> selectListView(Wrapper<FufeiyinleEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FufeiyinleView selectView(Wrapper<FufeiyinleEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
