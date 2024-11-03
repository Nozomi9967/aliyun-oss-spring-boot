package com.aliyun.oss;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AliOSSProperties.class)
public class AliOSSAutoConfiguration {

    @Bean
    public AliOSSUtil aliOSSUtil(AliOSSProperties aliOSSProperties) {
        AliOSSUtil aliOSSUtil = new AliOSSUtil();
        aliOSSUtil.setAliOSSProperties(aliOSSProperties);
        return aliOSSUtil;
    }
}
