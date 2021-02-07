package com.recepinanc.springredis.springredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;

@SpringBootApplication(exclude = {RedisRepositoriesAutoConfiguration.class})
public class SpringredisApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringredisApplication.class, args);
    }

}
