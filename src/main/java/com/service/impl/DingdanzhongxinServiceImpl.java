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


import com.dao.DingdanzhongxinDao;
import com.entity.DingdanzhongxinEntity;
import com.service.DingdanzhongxinService;
import com.entity.vo.DingdanzhongxinVO;
import com.entity.view.DingdanzhongxinView;

@Service("dingdanzhongxinService")
public class DingdanzhongxinServiceImpl extends ServiceImpl<DingdanzhongxinDao, DingdanzhongxinEntity> implements DingdanzhongxinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanzhongxinEntity> page = this.selectPage(
                new Query<DingdanzhongxinEntity>(params).getPage(),
                new EntityWrapper<DingdanzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanzhongxinEntity> wrapper) {
		  Page<DingdanzhongxinView> page =new Query<DingdanzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanzhongxinVO> selectListVO(Wrapper<DingdanzhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanzhongxinVO selectVO(Wrapper<DingdanzhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanzhongxinView> selectListView(Wrapper<DingdanzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanzhongxinView selectView(Wrapper<DingdanzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
