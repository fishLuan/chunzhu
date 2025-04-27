package pkg07;

import pkg06.Cat;
import pkg06.Dog;
import pkg06.Pig;

public class InterfaceDemo {
    public static void main(String []args){
        Dog dog=new Dog();
        dog.job();
        Cat cat=new Cat();
        cat.job();
        //Pig bajie=new Pig();
        //bajie.job();

    }
}
