package com.dao;

import com.entity.DiscussfufeiyinleEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfufeiyinleVO;
import com.entity.view.DiscussfufeiyinleView;


/**
 * 付费音乐评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:09
 */
public interface DiscussfufeiyinleDao extends BaseMapper<DiscussfufeiyinleEntity> {
	
	List<DiscussfufeiyinleVO> selectListVO(@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);
	
	DiscussfufeiyinleVO selectVO(@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);
	
	List<DiscussfufeiyinleView> selectListView(@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);

	List<DiscussfufeiyinleView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);
	
	DiscussfufeiyinleView selectView(@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);
	
}
