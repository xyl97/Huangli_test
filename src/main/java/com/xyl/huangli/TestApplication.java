package com.xyl.huangli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xyl.huangli.dao")
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);




    }
//    @Bean
//    public WebMvcConfigurer MyWebMvcConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//
//                        //放行哪些原始域
//                        .allowedOrigins("*")
//                        .allowedMethods(new String[]{"GET", "POST", "PUT", "DELETE"})
//                        .allowedHeaders("*")
//                        .exposedHeaders("*");
//            }
//        };


    }
