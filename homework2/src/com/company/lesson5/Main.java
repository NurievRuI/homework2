package com.company.lesson5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 10, 10, 10);
        Cat cat2 = new Cat("Cat2", 20, 20, 20);
        Cat cat3 = new Cat("Cat3", 30, 30, 30);

        Dog dog1 = new Dog("dog1", 1, "Green1");
        Dog dog2 = new Dog("dog2", 1, "Green2");

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(duck1);
        System.out.println(duck2);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));

        Man man1 = new Man("John", 25, "Test str. 5");
        Man man2 = new Man("Jack", 28, "Git ave. 47");

        Woman woman1 = new Woman("Anna", 23, "Live bvd. 79");
        Woman woman2 = new Woman("Eva", 24, "Round sqr. 2");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat thomasCat = new Cat("Tom", 50, 20);
        Dog spikeDog = new Dog ("Spike", 120, "green");

        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        Calendar currentTime = new GregorianCalendar();
        System.out.println(format.format(currentTime.getTime()));

    }


    }