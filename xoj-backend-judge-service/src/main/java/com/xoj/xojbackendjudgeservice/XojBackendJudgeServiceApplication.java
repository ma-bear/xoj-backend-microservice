package com.xoj.xojbackendjudgeservice;

import com.xoj.xojbackendjudgeservice.rabbitmq.InitRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xoj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xoj.xojbackendserviceclient.service"})
public class XojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        InitRabbitMq.doInit();
        SpringApplication.run(XojBackendJudgeServiceApplication.class, args);
    }

}
