package com.chacha.catsim.app;
import com.chacha.catsim.pet.Cat;
public class Shop {
    public Cat sellCat(String name,int age){
        Cat cat=new Cat(name,age);
        return cat;
    }
}
