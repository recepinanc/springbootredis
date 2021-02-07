package com.recepinanc.springredis.springredis.person.entity;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable
{
    private static final long serialVersionUID = -4939961394578733812L;

    private UUID id;
    private String name;
    private int age;

    public Person()
    {
        this.id = UUID.randomUUID();
    }

    public Person(String name, int age)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
