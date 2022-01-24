package com.zw.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.zw.server.mbg.mapper")
public class MyBatisConfig {
}
