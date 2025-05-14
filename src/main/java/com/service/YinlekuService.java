package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlekuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlekuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlekuView;


/**
 * 音乐库
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface YinlekuService extends IService<YinlekuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlekuVO> selectListVO(Wrapper<YinlekuEntity> wrapper);
   	
   	YinlekuVO selectVO(@Param("ew") Wrapper<YinlekuEntity> wrapper);
   	
   	List<YinlekuView> selectListView(Wrapper<YinlekuEntity> wrapper);
   	
   	YinlekuView selectView(@Param("ew") Wrapper<YinlekuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlekuEntity> wrapper);
   	
}

