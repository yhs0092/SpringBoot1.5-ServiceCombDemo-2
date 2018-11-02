package com.github.yhs0092.springbootdemo.servicecombcontroller;

import org.apache.servicecomb.common.rest.filter.HttpServerFilter;
import org.apache.servicecomb.core.Invocation;
import org.apache.servicecomb.foundation.vertx.http.HttpServletRequestEx;
import org.apache.servicecomb.foundation.vertx.http.HttpServletResponseEx;
import org.apache.servicecomb.swagger.invocation.Response;
import org.slf4j.LoggerFactory;

/**
 * 扩展一个ServiceComb的HttpServerFilter，如果某个请求发到该demo时触发本filter生效了，那说明这个请求走的是ServiceComb提供的Servlet，
 * 否则走的就是SpringBoot默认的Servlet。
 */
public class CustomServerFilter implements HttpServerFilter {
  public int getOrder() {
    return 0;
  }

  /**
   * 注意一下请求进入该服务时是否打印了日志
   */
  public Response afterReceiveRequest(Invocation invocation, HttpServletRequestEx requestEx) {
    LoggerFactory.getLogger(CustomServerFilter.class).info("get a request! path = [{}]", requestEx.getPathInfo());
    return null;
  }

  /**
   * 走ServiceComb框架处理的请求，其应答会带上 "x-custom-header: This-request-is-precessed-by-ServiceComb" header，
   * 而SpringBoot的Servlet处理的请求则没有。
   */
  public void beforeSendResponse(Invocation invocation, HttpServletResponseEx responseEx) {
    responseEx.addHeader("x-custom-header", "This-request-is-precessed-by-ServiceComb");
  }
}
