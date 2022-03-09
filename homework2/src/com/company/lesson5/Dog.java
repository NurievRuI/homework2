package com.company.lesson5;

public class Dog {
    String name;
    int age;
    String color;
    int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void initializer(String name) {
        this.name = name;
    }

    public void initializer(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initializer(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    Dog(String name) {
        this.name = name;

    }

    Dog(String name, int height) {
        this.name = name;
        this.height = height;

    }

    Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
