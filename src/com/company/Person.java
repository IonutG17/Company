package com.company;

public class Person {
    private int age;
    private String name;
    private int cnp;

    public Person(int age, String name, int cnp) {
        this.age = age;
        this.name = name;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }
}
