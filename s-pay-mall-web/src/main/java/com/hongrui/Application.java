package com.hongrui;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiumeng
 * @description 启动入口
 * @create 2024-09-27 16:56
 */
@SpringBootApplication
@Configurable
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run(Application.class);
    }
}