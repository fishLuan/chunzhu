package com.chacha.catsim.pet;
import java.util.Random;

public class Cat {
    private String name;
    private int age;
    private boolean sex;
    private int record;
    public Cat(String name,int age){
        this.name=name;
        this.age=age;

        Random r=new Random();
        this.sex=r.nextBoolean();
        this.record=r.nextInt(100);
    }
    public String getName(String name){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(int age){
        return this.age;
    }
    boolean getSex(){
        return this.sex;
    }
    void setSex(boolean sex){
        this.sex=sex;
    }
    public void introduce(){
        System.out.printf("我叫%s,今年%d,是%s\n",this.name,this.age,this.sex ? "公" : "母");
    }

}
