package com.recepinanc.springredis.springredis.person.repository;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.recepinanc.springredis.springredis.person.entity.Person;

@Component
public class PersonRepository
{
    @Autowired
    private RedisTemplate<UUID, Person> redis;

    public void save(Person person)
    {
        redis.opsForValue()
                .set(person.getId(), person);
    }

    public Person get(UUID id)
    {
        return redis.opsForValue()
                .get(id);
    }
}
