package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description 一些web组件如：视图解析器，controller,HandlerMapping配置没有dispatchServlet应用上下文
 * @Author cy
 * @Date 2023/6/1 14:17
 **/
@Configuration
@EnableWebMvc
@ComponentScan("org.example")
public class WebConfig {
}
