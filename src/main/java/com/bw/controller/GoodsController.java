package com.bw.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.service.GoodsService;
import com.bw.utils.FileUtils;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;

	@RequestMapping("/querySelect")
	@ResponseBody
	public Map<String, Object> querySelect(){
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		//查询所有的品牌
		List<Brand> brandList = goodsService.queryBrandAll();
		//查询所有的种类
		List<Goodskind> kindList = goodsService.queryGoodskindAll();
		
		//多条件查询xxxxxxxxxx
		System.out.println();
		map.put("brandList", brandList);
		map.put("kindList", kindList);
		
		return map;
	}
	
	@RequestMapping("/addGoods")
	public String addGoods(Goods goods,MultipartFile img) throws IllegalStateException, IOException{
		String upload = FileUtils.upload(img);
		goods.setGimg(upload);
		boolean flg = goodsService.addGoods(goods);
		if(flg){
			return "redirect:queryGoods";
		}
		
		return "add";
	}
	
	@RequestMapping("queryGoods")
	public String queryGoods(Model model){
		List<Goods> list = goodsService.queryGoods();
		model.addAttribute("list", list);
		return "goods_list";
	}
	
	
	@RequestMapping("lookImg")
	public void queryGoods(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
			
			
}
