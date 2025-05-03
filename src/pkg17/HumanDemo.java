package pkg17;

public class HumanDemo {
    public static void main(String []args){
        Human human=new Human();
        System.out.println(human.wealth);
        System.out.println(human.local);
        System.out.println(human.sex ? "男" : "女");
    }
}
