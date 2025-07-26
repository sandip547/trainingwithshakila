package com.example;

import lombok.Builder;

import java.util.Objects;
import java.util.UUID;


public class Person {
    private UUID id;
    private String name;
    private Integer age;

    private Integer idInt;

    public Integer getIdInt() {
        return idInt;
    }

    public void setIdInt(Integer idInt) {
        this.idInt = idInt;
    }

    public Person(UUID id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Person(Integer idInt, String name, Integer age) {
        this.idInt = idInt;
        this.name = name;
        this.age = age;
    }

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(UUID id, Integer age) {
        this.id = id;
        this.age= age;
    }

    public Person() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String toStringIa() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getId(), person.getId()) && Objects.equals(getName(), person.getName()) && Objects.equals(getIdInt(), person.getIdInt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getIdInt());
    }


}
