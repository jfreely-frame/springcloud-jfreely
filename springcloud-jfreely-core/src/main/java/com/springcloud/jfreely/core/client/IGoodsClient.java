package com.springcloud.jfreely.core.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.jfreely.core.client.impl.GoodsClientImpl;

@FeignClient(name = "jfreely-client2", fallbackFactory = GoodsClientImpl.class)
public interface IGoodsClient {
		@RequestMapping(value = "/getGoodsInfo")
		JSONObject getGoodsInfo();
}
