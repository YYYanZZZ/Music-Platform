package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FufeiyinleEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FufeiyinleVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeiyinleView;


/**
 * 付费音乐
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface FufeiyinleService extends IService<FufeiyinleEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FufeiyinleVO> selectListVO(Wrapper<FufeiyinleEntity> wrapper);
   	
   	FufeiyinleVO selectVO(@Param("ew") Wrapper<FufeiyinleEntity> wrapper);
   	
   	List<FufeiyinleView> selectListView(Wrapper<FufeiyinleEntity> wrapper);
   	
   	FufeiyinleView selectView(@Param("ew") Wrapper<FufeiyinleEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FufeiyinleEntity> wrapper);
   	
}

