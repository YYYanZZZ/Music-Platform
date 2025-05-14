package com.dao;

import com.entity.YinlekuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlekuVO;
import com.entity.view.YinlekuView;


/**
 * 音乐库
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface YinlekuDao extends BaseMapper<YinlekuEntity> {
	
	List<YinlekuVO> selectListVO(@Param("ew") Wrapper<YinlekuEntity> wrapper);
	
	YinlekuVO selectVO(@Param("ew") Wrapper<YinlekuEntity> wrapper);
	
	List<YinlekuView> selectListView(@Param("ew") Wrapper<YinlekuEntity> wrapper);

	List<YinlekuView> selectListView(Pagination page,@Param("ew") Wrapper<YinlekuEntity> wrapper);
	
	YinlekuView selectView(@Param("ew") Wrapper<YinlekuEntity> wrapper);
	
}
