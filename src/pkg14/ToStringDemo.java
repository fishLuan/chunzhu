package pkg14;

public class ToStringDemo {
    public static void main(String []args){
        String s1=new Object().toString();
        System.out.println(s1);
        String s2=new Mobile1().toString();
        System.out.println(s2);
        System.out.println(new Dog("阿黄",7,true));
    }
}
class Mobile1{

}
class Dog{
    String name;
    int age;
    boolean sex;
    Dog(String name,int age,boolean sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    @Override
    public String toString(){
        return "狗"+":"+name+" "+age+"个月大"+" "+(sex? "公":"母");
    }
}