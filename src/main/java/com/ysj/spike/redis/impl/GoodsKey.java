package com.ysj.spike.redis.impl;

import com.ysj.spike.domain.Goods;

public class GoodsKey extends BasePrefix {

    public GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static GoodsKey getGoodsList = new GoodsKey(60,"gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60,"gd");
    public static GoodsKey getSpikeGoodsStock = new GoodsKey(0,"gs");
}
