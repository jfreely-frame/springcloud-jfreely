package com.springcloud.jfreely.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class TestGoodsController {
	
	@RequestMapping(value = "/getGoodsInfo")
	@ResponseBody
	public JSONObject getGoodsInfo () {
		return new JSONObject() {
			{
				put("id" , 1);
				put("goodsName" , "Air 1");
				put("goodsType"  , "鞋");
			}
		};
	}
}
