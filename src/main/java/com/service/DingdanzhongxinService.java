package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanzhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanzhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanzhongxinView;


/**
 * 订单中心
 *
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public interface DingdanzhongxinService extends IService<DingdanzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanzhongxinVO> selectListVO(Wrapper<DingdanzhongxinEntity> wrapper);
   	
   	DingdanzhongxinVO selectVO(@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);
   	
   	List<DingdanzhongxinView> selectListView(Wrapper<DingdanzhongxinEntity> wrapper);
   	
   	DingdanzhongxinView selectView(@Param("ew") Wrapper<DingdanzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanzhongxinEntity> wrapper);
   	
}

