package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlebiaoqianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlebiaoqianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlebiaoqianView;


/**
 * 音乐标签
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface YinlebiaoqianService extends IService<YinlebiaoqianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlebiaoqianVO> selectListVO(Wrapper<YinlebiaoqianEntity> wrapper);
   	
   	YinlebiaoqianVO selectVO(@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);
   	
   	List<YinlebiaoqianView> selectListView(Wrapper<YinlebiaoqianEntity> wrapper);
   	
   	YinlebiaoqianView selectView(@Param("ew") Wrapper<YinlebiaoqianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlebiaoqianEntity> wrapper);
   	
}

