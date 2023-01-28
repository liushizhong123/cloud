package com.lsz.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
  @author lsz
 * @date 2023年01月27日 16:24
 */
import feign.Logger;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        //打印最详细的日志
        return Logger.Level.FULL;
    }

}

