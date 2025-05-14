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


import com.dao.YinlebiaoqianDao;
import com.entity.YinlebiaoqianEntity;
import com.service.YinlebiaoqianService;
import com.entity.vo.YinlebiaoqianVO;
import com.entity.view.YinlebiaoqianView;

@Service("yinlebiaoqianService")
public class YinlebiaoqianServiceImpl extends ServiceImpl<YinlebiaoqianDao, YinlebiaoqianEntity> implements YinlebiaoqianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlebiaoqianEntity> page = this.selectPage(
                new Query<YinlebiaoqianEntity>(params).getPage(),
                new EntityWrapper<YinlebiaoqianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlebiaoqianEntity> wrapper) {
		  Page<YinlebiaoqianView> page =new Query<YinlebiaoqianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlebiaoqianVO> selectListVO(Wrapper<YinlebiaoqianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlebiaoqianVO selectVO(Wrapper<YinlebiaoqianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlebiaoqianView> selectListView(Wrapper<YinlebiaoqianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlebiaoqianView selectView(Wrapper<YinlebiaoqianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
