package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinlekuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinlekuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinlekuView;


/**
 * 音乐库评论表
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:09
 */
public interface DiscussyinlekuService extends IService<DiscussyinlekuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinlekuVO> selectListVO(Wrapper<DiscussyinlekuEntity> wrapper);
   	
   	DiscussyinlekuVO selectVO(@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);
   	
   	List<DiscussyinlekuView> selectListView(Wrapper<DiscussyinlekuEntity> wrapper);
   	
   	DiscussyinlekuView selectView(@Param("ew") Wrapper<DiscussyinlekuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinlekuEntity> wrapper);
   	
}

