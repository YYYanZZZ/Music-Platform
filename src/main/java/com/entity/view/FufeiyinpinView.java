package com.entity.view;

import com.entity.FufeiyinpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 付费音频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("fufeiyinpin")
public class FufeiyinpinView  extends FufeiyinpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FufeiyinpinView(){
	}
 
 	public FufeiyinpinView(FufeiyinpinEntity fufeiyinpinEntity){
 	try {
			BeanUtils.copyProperties(this, fufeiyinpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
