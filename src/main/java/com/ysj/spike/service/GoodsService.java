package com.ysj.spike.service;

import com.ysj.spike.vo.GoodsVO;

import java.util.List;

public interface GoodsService {

    List<GoodsVO> listGoodsVO();

    GoodsVO getGoodsVOByGoodsId(long goodsId);

    boolean reduceStock(GoodsVO goodsVO);
}
