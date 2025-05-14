package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FufeiyinpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FufeiyinpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeiyinpinView;


/**
 * 付费音频
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface FufeiyinpinService extends IService<FufeiyinpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FufeiyinpinVO> selectListVO(Wrapper<FufeiyinpinEntity> wrapper);
   	
   	FufeiyinpinVO selectVO(@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);
   	
   	List<FufeiyinpinView> selectListView(Wrapper<FufeiyinpinEntity> wrapper);
   	
   	FufeiyinpinView selectView(@Param("ew") Wrapper<FufeiyinpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FufeiyinpinEntity> wrapper);
   	
}

