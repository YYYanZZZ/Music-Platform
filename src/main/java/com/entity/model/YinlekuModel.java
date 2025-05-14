package com.entity.model;

import com.entity.YinlekuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 音乐库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
public class YinlekuModel  implements Serializable {
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
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 演唱者
	 */
	
	private String yanchangzhe;
		
	/**
	 * 作曲
	 */
	
	private String zuoqu;
		
	/**
	 * 作词
	 */
	
	private String zuoci;
		
	/**
	 * 音乐视频
	 */
	
	private String yinleshipin;
		
	/**
	 * 音乐
	 */
	
	private String yinle;
		
	/**
	 * 歌曲介绍
	 */
	
	private String gequjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：作曲
	 */
	 
	public void setZuoqu(String zuoqu) {
		this.zuoqu = zuoqu;
	}
	
	/**
	 * 获取：作曲
	 */
	public String getZuoqu() {
		return zuoqu;
	}
				
	
	/**
	 * 设置：作词
	 */
	 
	public void setZuoci(String zuoci) {
		this.zuoci = zuoci;
	}
	
	/**
	 * 获取：作词
	 */
	public String getZuoci() {
		return zuoci;
	}
				
	
	/**
	 * 设置：音乐视频
	 */
	 
	public void setYinleshipin(String yinleshipin) {
		this.yinleshipin = yinleshipin;
	}
	
	/**
	 * 获取：音乐视频
	 */
	public String getYinleshipin() {
		return yinleshipin;
	}
				
	
	/**
	 * 设置：音乐
	 */
	 
	public void setYinle(String yinle) {
		this.yinle = yinle;
	}
	
	/**
	 * 获取：音乐
	 */
	public String getYinle() {
		return yinle;
	}
				
	
	/**
	 * 设置：歌曲介绍
	 */
	 
	public void setGequjieshao(String gequjieshao) {
		this.gequjieshao = gequjieshao;
	}
	
	/**
	 * 获取：歌曲介绍
	 */
	public String getGequjieshao() {
		return gequjieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
