package com.entity.view;

import com.entity.DiscussfufeiyinleEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 付费音乐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:09
 */
@TableName("discussfufeiyinle")
public class DiscussfufeiyinleView  extends DiscussfufeiyinleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfufeiyinleView(){
	}
 
 	public DiscussfufeiyinleView(DiscussfufeiyinleEntity discussfufeiyinleEntity){
 	try {
			BeanUtils.copyProperties(this, discussfufeiyinleEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
