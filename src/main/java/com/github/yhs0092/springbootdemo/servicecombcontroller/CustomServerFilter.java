package com.github.yhs0092.springbootdemo.servicecombcontroller;

import org.apache.servicecomb.common.rest.filter.HttpServerFilter;
import org.apache.servicecomb.core.Invocation;
import org.apache.servicecomb.foundation.vertx.http.HttpServletRequestEx;
import org.apache.servicecomb.foundation.vertx.http.HttpServletResponseEx;
import org.apache.servicecomb.swagger.invocation.Response;
import org.slf4j.LoggerFactory;

public class CustomServerFilter implements HttpServerFilter {
  public int getOrder() {
    return 0;
  }

  public Response afterReceiveRequest(Invocation invocation, HttpServletRequestEx requestEx) {
    LoggerFactory.getLogger(CustomServerFilter.class).info("get a request! path = [{}]", requestEx.getPathInfo());
    return null;
  }

  public void beforeSendResponse(Invocation invocation, HttpServletResponseEx responseEx) {
    responseEx.addHeader("x-custom-header", "This-request-is-precessed-by-ServiceComb");
  }
}
