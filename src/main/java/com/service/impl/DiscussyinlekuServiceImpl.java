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


import com.dao.DiscussyinlekuDao;
import com.entity.DiscussyinlekuEntity;
import com.service.DiscussyinlekuService;
import com.entity.vo.DiscussyinlekuVO;
import com.entity.view.DiscussyinlekuView;

@Service("discussyinlekuService")
public class DiscussyinlekuServiceImpl extends ServiceImpl<DiscussyinlekuDao, DiscussyinlekuEntity> implements DiscussyinlekuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinlekuEntity> page = this.selectPage(
                new Query<DiscussyinlekuEntity>(params).getPage(),
                new EntityWrapper<DiscussyinlekuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinlekuEntity> wrapper) {
		  Page<DiscussyinlekuView> page =new Query<DiscussyinlekuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyinlekuVO> selectListVO(Wrapper<DiscussyinlekuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinlekuVO selectVO(Wrapper<DiscussyinlekuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinlekuView> selectListView(Wrapper<DiscussyinlekuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinlekuView selectView(Wrapper<DiscussyinlekuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
