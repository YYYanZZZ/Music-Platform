package com.dao;

import com.entity.FufeiyinleEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FufeiyinleVO;
import com.entity.view.FufeiyinleView;


/**
 * 付费音乐
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface FufeiyinleDao extends BaseMapper<FufeiyinleEntity> {
	
	List<FufeiyinleVO> selectListVO(@Param("ew") Wrapper<FufeiyinleEntity> wrapper);
	
	FufeiyinleVO selectVO(@Param("ew") Wrapper<FufeiyinleEntity> wrapper);
	
	List<FufeiyinleView> selectListView(@Param("ew") Wrapper<FufeiyinleEntity> wrapper);

	List<FufeiyinleView> selectListView(Pagination page,@Param("ew") Wrapper<FufeiyinleEntity> wrapper);
	
	FufeiyinleView selectView(@Param("ew") Wrapper<FufeiyinleEntity> wrapper);
	
}
