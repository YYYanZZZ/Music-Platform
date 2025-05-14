package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfufeiyinleEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfufeiyinleVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfufeiyinleView;


/**
 * 付费音乐评论表
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:09
 */
public interface DiscussfufeiyinleService extends IService<DiscussfufeiyinleEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfufeiyinleVO> selectListVO(Wrapper<DiscussfufeiyinleEntity> wrapper);
   	
   	DiscussfufeiyinleVO selectVO(@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);
   	
   	List<DiscussfufeiyinleView> selectListView(Wrapper<DiscussfufeiyinleEntity> wrapper);
   	
   	DiscussfufeiyinleView selectView(@Param("ew") Wrapper<DiscussfufeiyinleEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfufeiyinleEntity> wrapper);
   	
}

