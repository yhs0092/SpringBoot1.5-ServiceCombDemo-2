package com.github.yhs0092.springbootdemo;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    // 启动 Spring Boot
@EnableServiceComb        // 启用 ServiceComb
public class AppMain {
  public static void main(String[] args) {
    SpringApplication.run(AppMain.class, args);
  }
}
