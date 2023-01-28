package com.lsz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lsz
 * @date 2023年01月28日 14:07
 */
@EnableHystrixDashboard //启用Hystrix仪表板
@SpringBootApplication
public class HystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
    }

}
