package com.cql.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author 陈琪亮
 * @version 1.0
 * @date 2020/8/6 19:22
 */
@Configuration
@EnableSwagger2     //开启swagger
public class SwaggerConfig {
//    配置swagger信息
    private ApiInfo apiInfo(){
        //    作者信息
        Contact contcat = new Contact("CQL","","2608092463@qq.com");
        return new ApiInfo("我的博客",
                "我的博客后台项目接口",
                "v1.0",
                "http://localhost",
                contcat,
                "Apache 2.0","",
                new ArrayList<>());
    }
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("a");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("b");
    }

    //配置swagger的docket实例
    @Bean
    public Docket docket(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo ()).
                select().

                apis(RequestHandlerSelectors.basePackage("com.cql.blog.controller")).
                build();
    }


}
