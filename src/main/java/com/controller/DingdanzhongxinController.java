package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DingdanzhongxinEntity;
import com.entity.view.DingdanzhongxinView;

import com.service.DingdanzhongxinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 订单中心
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-03 20:15:08
 */
@RestController
@RequestMapping("/dingdanzhongxin")
public class DingdanzhongxinController {
    @Autowired
    private DingdanzhongxinService dingdanzhongxinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DingdanzhongxinEntity dingdanzhongxin, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			dingdanzhongxin.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DingdanzhongxinEntity> ew = new EntityWrapper<DingdanzhongxinEntity>();
		PageUtils page = dingdanzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdanzhongxin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DingdanzhongxinEntity dingdanzhongxin, HttpServletRequest request){
        EntityWrapper<DingdanzhongxinEntity> ew = new EntityWrapper<DingdanzhongxinEntity>();
		PageUtils page = dingdanzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdanzhongxin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DingdanzhongxinEntity dingdanzhongxin){
       	EntityWrapper<DingdanzhongxinEntity> ew = new EntityWrapper<DingdanzhongxinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dingdanzhongxin, "dingdanzhongxin")); 
        return R.ok().put("data", dingdanzhongxinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DingdanzhongxinEntity dingdanzhongxin){
        EntityWrapper< DingdanzhongxinEntity> ew = new EntityWrapper< DingdanzhongxinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dingdanzhongxin, "dingdanzhongxin")); 
		DingdanzhongxinView dingdanzhongxinView =  dingdanzhongxinService.selectView(ew);
		return R.ok("查询订单中心成功").put("data", dingdanzhongxinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DingdanzhongxinEntity dingdanzhongxin = dingdanzhongxinService.selectById(id);
        return R.ok().put("data", dingdanzhongxin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DingdanzhongxinEntity dingdanzhongxin = dingdanzhongxinService.selectById(id);
        return R.ok().put("data", dingdanzhongxin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DingdanzhongxinEntity dingdanzhongxin, HttpServletRequest request){
    	dingdanzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dingdanzhongxin);

        dingdanzhongxinService.insert(dingdanzhongxin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DingdanzhongxinEntity dingdanzhongxin, HttpServletRequest request){
    	dingdanzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dingdanzhongxin);

        dingdanzhongxinService.insert(dingdanzhongxin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DingdanzhongxinEntity dingdanzhongxin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dingdanzhongxin);
        dingdanzhongxinService.updateById(dingdanzhongxin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dingdanzhongxinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DingdanzhongxinEntity> wrapper = new EntityWrapper<DingdanzhongxinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = dingdanzhongxinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
