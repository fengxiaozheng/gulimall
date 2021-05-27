package com.lixw.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @description
 * @date 2021/5/26
 */
@SpringBootApplication
@MapperScan("com.lixw.gulimall.product.dao")
@EnableDiscoveryClient
@EnableCaching
@EnableFeignClients(basePackages = "com.lixw.gulimall.product.feign")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
