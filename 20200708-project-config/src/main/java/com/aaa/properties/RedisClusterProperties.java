package com.aaa.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: 20200708-project
 * @author: LiDian
 * @create: 2020-07-10 14:43:29
 *
 *  @ConfigurationProperties:默认只会从application.properties中取读取属性值
 **/
@Component
@PropertySource("classpath:properties/redis_cluster.properties")
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisClusterProperties {

    private String nodes;
    private Integer maxAttempts;
    private Integer commandTimeout;

}