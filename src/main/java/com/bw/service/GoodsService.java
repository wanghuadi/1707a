package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;

public interface GoodsService {

	List<Brand> queryBrandAll();

	List<Goodskind> queryGoodskindAll();

	boolean addGoods(Goods goods);

	List<Goods> queryGoods();

}
