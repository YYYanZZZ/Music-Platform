package com.dao;

import com.entity.DiscussyinlekuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinlekuVO;
import com.entity.view.DiscussyinlekuView;


/**
 * 音乐库评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:09
 */
public interface DiscussyinlekuDao extends BaseMapper<DiscussyinlekuEntity> {
	
	List<DiscussyinlekuVO> selectListVO(@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);
	
	DiscussyinlekuVO selectVO(@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);
	
	List<DiscussyinlekuView> selectListView(@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);

	List<DiscussyinlekuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);
	
	DiscussyinlekuView selectView(@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);
	
}
