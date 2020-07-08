package com.momo.user.service;

import org.apache.dubbo.config.spring.schema.DubboBeanDefinitionParser;
import org.apache.dubbo.config.spring.schema.DubboNamespaceHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * https://www.cnblogs.com/wdss/p/11141051.html
 * https://blog.csdn.net/zht741322694/article/details/83756101
 *
 * Spring Boot 应用启动类
 */
@EnableAutoConfiguration
@ImportResource("provider.xml")
public class ServiceApplication {
    //DubboBeanDefinitionParser
    //DubboNamespaceHandler
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class);
    }

}
