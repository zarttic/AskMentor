package org.zartt.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zartt
 * @description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("org.zartt.cloud.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}