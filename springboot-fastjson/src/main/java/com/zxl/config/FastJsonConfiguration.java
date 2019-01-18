package com.zxl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class FastJsonConfiguration extends WebMvcConfigurerAdapter{

//    @Override
    public void configureMessageConverters(ResourceHandlerRegistry registry){
        registry.addResourceHandler("com/zxl/qqq/**").addResourceLocations("classpath:/static");
    }
}
