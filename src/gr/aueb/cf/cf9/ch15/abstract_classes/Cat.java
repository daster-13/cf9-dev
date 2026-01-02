package gr.aueb.cf.cf9.ch15.abstract_classes;

import java.sql.SQLOutput;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    @Override
    public void speak() {

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("She ate all her food!");
    }
}
