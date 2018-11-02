package com.github.yhs0092.springbootdemo.servicecombcontroller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 走ServiceComb框架处理的controller，注意需要引入@RestSchema注解标识其schemaId，但不要引入@RestController
 */
@RestSchema(schemaId = "serviceCombController")
@RequestMapping(path = "/servicecomb")
public class ServiceCombController {
  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello world from ServiceComb";
  }
}
