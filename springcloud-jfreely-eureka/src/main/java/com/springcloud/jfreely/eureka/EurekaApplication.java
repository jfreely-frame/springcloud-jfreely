package com.springcloud.jfreely.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
* @Package com.springcloud.jfreely.eureka
* @ClassName:  EurekaApplication
* @Description: eureka服务注册中心
* @author qijiaxu
* @date 2018年11月20日
* @version V1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
