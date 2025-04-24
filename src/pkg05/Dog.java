package pkg05;

public class Dog {
    String name;
    private int age;
    boolean sex;
    Dog(String name,int age,boolean sex){
        this.name=name;
         this.age=Age(age);
         this.sex=sex;
    }
    int Age(int age){
        if(age>200){
            return 200;
        }else{
            return age;
        }
    }
    public void introduce(){
        System.out.printf("我叫%s,今年%d,是%s\n",name,age,sex ?"男":"女");
    }
}
