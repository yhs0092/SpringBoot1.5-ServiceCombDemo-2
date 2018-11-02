package com.github.yhs0092.springbootdemo.customservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "testCustomServlet", urlPatterns = {"/testCustomServlet", "/testCustomServlet/*"})
public class MyTestServlet extends HttpServlet {

  private static final long serialVersionUID = -181025327532345174L;

  private static final Logger LOGGER = LoggerFactory.getLogger(MyTestServlet.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    LOGGER.info("doGet is called, path = [{}]", req.getPathInfo());
    resp.setStatus(200);
    doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    LOGGER.info("doPost is called, path = [{}]", req.getPathInfo());
    resp.setContentType("text/plain");
    PrintWriter writer = resp.getWriter();
    writer.print("Hello from custom servlet");
  }
}
