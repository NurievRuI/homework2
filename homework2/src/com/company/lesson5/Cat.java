package com.company.lesson5;

public class Cat {
    String name;
    int age;
    int weight;
    int strength;
    String color;
    String adress;

    public boolean fight (Cat anotherCat)
    {
        if (anotherCat.strength > this.strength) {
            return false;
        } else {
            return true;
        }
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public void initializer(String name) {
        this.name = name;
    }

    public void initializer(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initializer(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
    }

    public void initializer(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.adress = null;
    }

    public void initializer(int weight, String color,  String adress) {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }

    Cat (String name) {
        this.name = name;
    }

    Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
    }

    Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.adress = null;
    }

    Cat (int weight, String color, String adress) {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", strength=" + strength +
                ", color='" + color + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
