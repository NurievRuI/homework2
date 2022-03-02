package com.company.lesson2;

public class Main {

    public static void main(String[] args) {
        //Создать объект типа Cat 2 раза.
	Cat cat1 = new Cat("Barsik",12);
    Cat cat2 = new Cat("Ijik",13);

    //Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
    Dog dog1 = new Dog("Max", 1);
    Dog dog2 = new Dog("Bella", 3);
    Dog dog3 = new Dog("Jack",6);

    //Напиши программу, которая выводит на экран надпись: «Мне так плохо! Хочу, чтобы все умерли!».
    Fish fish1 = new Fish("Goldy", 2);

    //Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
        //Присвойте каждому животному владельца (owner).
    Woman woman = new Woman("Larisa", 23);

    cat1.owner = woman;
    cat2.owner = woman;
    dog1.owner = woman;
    dog2.owner = woman;
    dog3.owner = woman;
    fish1.owner = woman;
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");

        System.out.println(19);


    }
}
