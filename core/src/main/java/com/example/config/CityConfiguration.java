package com.example.config;

import com.example.domain.City;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置
 *
 * @author yichuan
 */
@Configuration
public class CityConfiguration {
    /**
     * 使用@Bean 注解表明myBean需要交给Spring进行管理
     * 未指定bean 的名称，默认采用的是 "方法名" + "首字母小写"的配置方式
     *
     * @return
     */
    @Bean
    public City cityBean() {
        return new City();
    }
}

