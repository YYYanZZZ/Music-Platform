package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 音乐库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("yinleku")
public class YinlekuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinlekuEntity() {
		
	}
	
	public YinlekuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
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
