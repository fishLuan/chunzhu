package com.chacha.catsim.pet;

public class Vet {
    public void changeSex(Cat cat){
        boolean oldSex=cat.getSex();
        boolean newSex=!oldSex;
        cat.setSex(newSex);
    }
}
