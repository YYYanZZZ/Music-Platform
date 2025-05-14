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


import com.dao.FufeiyinpinDao;
import com.entity.FufeiyinpinEntity;
import com.service.FufeiyinpinService;
import com.entity.vo.FufeiyinpinVO;
import com.entity.view.FufeiyinpinView;

@Service("fufeiyinpinService")
public class FufeiyinpinServiceImpl extends ServiceImpl<FufeiyinpinDao, FufeiyinpinEntity> implements FufeiyinpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FufeiyinpinEntity> page = this.selectPage(
                new Query<FufeiyinpinEntity>(params).getPage(),
                new EntityWrapper<FufeiyinpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FufeiyinpinEntity> wrapper) {
		  Page<FufeiyinpinView> page =new Query<FufeiyinpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FufeiyinpinVO> selectListVO(Wrapper<FufeiyinpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FufeiyinpinVO selectVO(Wrapper<FufeiyinpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FufeiyinpinView> selectListView(Wrapper<FufeiyinpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FufeiyinpinView selectView(Wrapper<FufeiyinpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
