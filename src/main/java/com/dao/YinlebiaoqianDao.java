package com.dao;

import com.entity.YinlebiaoqianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlebiaoqianVO;
import com.entity.view.YinlebiaoqianView;


/**
 * 音乐标签
 * 
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface YinlebiaoqianDao extends BaseMapper<YinlebiaoqianEntity> {
	
	List<YinlebiaoqianVO> selectListVO(@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);
	
	YinlebiaoqianVO selectVO(@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);
	
	List<YinlebiaoqianView> selectListView(@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);

	List<YinlebiaoqianView> selectListView(Pagination page,@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);
	
	YinlebiaoqianView selectView(@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);
	
}
