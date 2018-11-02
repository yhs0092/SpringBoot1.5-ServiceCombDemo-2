package com.github.yhs0092.springbootdemo.springcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
