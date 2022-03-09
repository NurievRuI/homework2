package com.company.lesson4;

public class Cat {
    public static String count;
    private String name;
    private static int catsCount = 0;
    private String fullName;

    public static int countt = 0;
    
    public void setName(String firstName, String lastName) {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }
    
    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }
    
    
    
    public static void addNewCat() {
    Cat cat = new Cat();
        catsCount++;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
}
