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


import com.dao.YinlekuDao;
import com.entity.YinlekuEntity;
import com.service.YinlekuService;
import com.entity.vo.YinlekuVO;
import com.entity.view.YinlekuView;

@Service("yinlekuService")
public class YinlekuServiceImpl extends ServiceImpl<YinlekuDao, YinlekuEntity> implements YinlekuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlekuEntity> page = this.selectPage(
                new Query<YinlekuEntity>(params).getPage(),
                new EntityWrapper<YinlekuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlekuEntity> wrapper) {
		  Page<YinlekuView> page =new Query<YinlekuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlekuVO> selectListVO(Wrapper<YinlekuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlekuVO selectVO(Wrapper<YinlekuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlekuView> selectListView(Wrapper<YinlekuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlekuView selectView(Wrapper<YinlekuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
