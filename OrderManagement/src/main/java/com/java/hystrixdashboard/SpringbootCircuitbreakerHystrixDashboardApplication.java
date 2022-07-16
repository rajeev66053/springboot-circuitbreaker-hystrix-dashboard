package com.java.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class SpringbootCircuitbreakerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCircuitbreakerHystrixDashboardApplication.class, args);
    }

}