package com.harshrajsinhraulji;

import org.springframework.stereotype.Component;


public class Dev {

    private int age;
    private Laptop laptop;

    public Dev(){
        System.out.println("Dev object created.");
    }

    public Dev(int age){
        this.age = age;
        System.out.println("Dev object created with age: " + age);
    }

    public Dev(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Dev object created with Laptop.");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void build() {
        System.out.println("Building an awesome project...");
        laptop.compile();
    }
}
