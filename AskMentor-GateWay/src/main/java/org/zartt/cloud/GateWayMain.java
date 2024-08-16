package org.zartt.cloud;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zartt
 * @description: TODO
 */
@SpringBootApplication
public class GateWayMain {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain.class, args);
    }
}