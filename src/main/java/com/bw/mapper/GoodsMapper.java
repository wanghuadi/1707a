package com.bw.mapper;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;

public interface GoodsMapper {

	List<Brand> queryBrandAll();

	List<Goodskind> queryGoodskindAll();

	int addGoods(Goods goods);

	List<Goods> queryGoods();
	
}
