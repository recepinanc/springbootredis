package com.recepinanc.springredis.springredis.person.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recepinanc.springredis.springredis.person.entity.Person;
import com.recepinanc.springredis.springredis.person.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController
{
    @Autowired
    PersonRepository repository;

    @PostMapping
    public String create(@RequestBody Person person)
    {
        repository.save(person);
        return "Saved";
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable UUID id)
    {
        return repository.get(id);
    }
}
