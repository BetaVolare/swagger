package com.example.demo.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
  public void addViewControllers(ViewControllerRegistry registry) {
//        接下来就是要为index.html提供路径映射
               registry.addViewController("/index").setViewName("/index");
           }
}
