package com.dao;

import com.entity.DingdanzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanzhongxinVO;
import com.entity.view.DingdanzhongxinView;


/**
 * 订单中心
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface DingdanzhongxinDao extends BaseMapper<DingdanzhongxinEntity> {
	
	List<DingdanzhongxinVO> selectListVO(@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);
	
	DingdanzhongxinVO selectVO(@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);
	
	List<DingdanzhongxinView> selectListView(@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);

	List<DingdanzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);
	
	DingdanzhongxinView selectView(@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);
	
}
