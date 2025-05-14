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
 * 付费音频
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@TableName("fufeiyinpin")
public class FufeiyinpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FufeiyinpinEntity() {
		
	}
	
	public FufeiyinpinEntity(T t) {
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
