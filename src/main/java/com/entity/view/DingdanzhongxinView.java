package com.entity.view;

import com.entity.DingdanzhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("dingdanzhongxin")
public class DingdanzhongxinView  extends DingdanzhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanzhongxinView(){
	}
 
 	public DingdanzhongxinView(DingdanzhongxinEntity dingdanzhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanzhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
