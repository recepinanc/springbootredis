package com.recepinanc.springredis.springredis;

import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.recepinanc.springredis.springredis.person.entity.Person;

@Configuration
public class RedisConfiguration
{
    @Bean
    public RedisTemplate<UUID, Person> redisTemplate(RedisConnectionFactory connectionFactory)
    {
        RedisTemplate<UUID, Person> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        return template;
    }
}
