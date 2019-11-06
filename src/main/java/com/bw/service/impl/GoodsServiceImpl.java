package com.bw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.mapper.GoodsMapper;
import com.bw.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsMapper goodsMapper;
	

	public List<Brand> queryBrandAll() {
		return goodsMapper.queryBrandAll();
	}

	public List<Goodskind> queryGoodskindAll() {
		return  goodsMapper.queryGoodskindAll();
	}

	public boolean addGoods(Goods goods) {
		return goodsMapper.addGoods(goods)>0?true:false;
	}

	public List<Goods> queryGoods() {
		return goodsMapper.queryGoods();
	}

}
