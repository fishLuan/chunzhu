package pkg06;

import pkg07.HumanHelper;

public class Dog extends Pet implements HumanHelper {
    public void job(){
        System.out.println("吃");
    }
}
