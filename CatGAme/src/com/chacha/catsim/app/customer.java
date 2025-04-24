package com.chacha.catsim.app;

import com.chacha.catsim.pet.Cat;

public class customer {
    private Cat pet;
    public void buyCat(Shop shop,String name,int age){
        this.pet=shop.sellCat(name,age);
    }
    public Cat getPet(){
        return this.pet;
    };
}
