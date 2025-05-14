package com.entity.view;

import com.entity.YinlebiaoqianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐标签
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("yinlebiaoqian")
public class YinlebiaoqianView  extends YinlebiaoqianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinlebiaoqianView(){
	}
 
 	public YinlebiaoqianView(YinlebiaoqianEntity yinlebiaoqianEntity){
 	try {
			BeanUtils.copyProperties(this, yinlebiaoqianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
