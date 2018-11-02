package com.github.yhs0092.springbootdemo.servicecombcontroller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "serviceCombController")
@RequestMapping(path = "/servicecomb")
public class ServiceCombController {
  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello world from ServiceComb";
  }
}
