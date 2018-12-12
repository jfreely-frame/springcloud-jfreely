package com.springcloud.jfreely.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.jfreely.core.client.IGoodsClient;

@RestController
public class TestGoodsController {
	@Autowired
	private IGoodsClient iGoodsClient;
	
	@RequestMapping(value = "/getGoodsInfo")
	@ResponseBody
	public JSONObject getGoodsInfo() {
		return iGoodsClient.getGoodsInfo();
	}
}
