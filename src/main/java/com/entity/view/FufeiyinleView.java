package com.entity.view;

import com.entity.FufeiyinleEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 付费音乐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("fufeiyinle")
public class FufeiyinleView  extends FufeiyinleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FufeiyinleView(){
	}
 
 	public FufeiyinleView(FufeiyinleEntity fufeiyinleEntity){
 	try {
			BeanUtils.copyProperties(this, fufeiyinleEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
