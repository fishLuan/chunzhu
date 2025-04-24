package com.chacha.catsim;

import com.chacha.catsim.app.Shop;
import com.chacha.catsim.app.customer;
import com.chacha.catsim.pet.Vet;

public class Main {
    public static void main(String []args){
        customer zs=new customer();
        Shop shop=new Shop();
        Vet wang=new Vet();
        zs.buyCat(shop,"小黑",3);
        zs.getPet().introduce();
        wang.changeSex(zs.getPet());
        zs.getPet().introduce();
    }
}
