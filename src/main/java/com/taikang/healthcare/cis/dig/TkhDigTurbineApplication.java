package com.taikang.healthcare.cis.dig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

/**
 * 项目的启动类，指定扫描的包路径
 * @author itw_huomb
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
@EnableEurekaClient
public class TkhDigTurbineApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(TkhDigTurbineApplication.class, args);
	}
}
