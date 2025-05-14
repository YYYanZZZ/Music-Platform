package com.dao;

import com.entity.FufeiyinpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FufeiyinpinVO;
import com.entity.view.FufeiyinpinView;


/**
 * 付费音频
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface FufeiyinpinDao extends BaseMapper<FufeiyinpinEntity> {
	
	List<FufeiyinpinVO> selectListVO(@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);
	
	FufeiyinpinVO selectVO(@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);
	
	List<FufeiyinpinView> selectListView(@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);

	List<FufeiyinpinView> selectListView(Pagination page,@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);
	
	FufeiyinpinView selectView(@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);
	
}
