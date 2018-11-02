package com.github.yhs0092.springbootdemo.springcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 走SpringBoot默认的Servlet处理的请求，注意引入的是@RestController，不要使用@RestSchema注解。
 */
@RestController
@RequestMapping("/spring")
public class SpringController {
  public SpringController() {
    System.out.println("SpringController init!");
  }

  @RequestMapping("/hello")
  public String hello() {
    return "Hello world from SpringBoot";
  }
}
