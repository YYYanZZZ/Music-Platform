package com.entity.view;

import com.entity.YinlekuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("yinleku")
public class YinlekuView  extends YinlekuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinlekuView(){
	}
 
 	public YinlekuView(YinlekuEntity yinlekuEntity){
 	try {
			BeanUtils.copyProperties(this, yinlekuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
