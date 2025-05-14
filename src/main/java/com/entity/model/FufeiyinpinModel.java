package com.entity.model;

import com.entity.FufeiyinpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 付费音频
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public class FufeiyinpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌名
	 */
	
	private String geming;
		
	/**
	 * 音乐标签
	 */
	
	private String yinlebiaoqian;
		
	/**
	 * 演唱者
	 */
	
	private String yanchangzhe;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 音频
	 */
	
	private String yinpin;
				
	
	/**
	 * 设置：歌名
	 */
	 
	public void setGeming(String geming) {
		this.geming = geming;
	}
	
	/**
	 * 获取：歌名
	 */
	public String getGeming() {
		return geming;
	}
				
	
	/**
	 * 设置：音乐标签
	 */
	 
	public void setYinlebiaoqian(String yinlebiaoqian) {
		this.yinlebiaoqian = yinlebiaoqian;
	}
	
	/**
	 * 获取：音乐标签
	 */
	public String getYinlebiaoqian() {
		return yinlebiaoqian;
	}
				
	
	/**
	 * 设置：演唱者
	 */
	 
	public void setYanchangzhe(String yanchangzhe) {
		this.yanchangzhe = yanchangzhe;
	}
	
	/**
	 * 获取：演唱者
	 */
	public String getYanchangzhe() {
		return yanchangzhe;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：音频
	 */
	 
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
	}
			
}
