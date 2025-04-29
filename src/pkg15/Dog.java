package pkg15;

public class Dog implements Pet{
    private String name;
    public Dog(String name){
        this.name=name;
    }
    void feed(){
        System.out.println(this.name+"吃饭");
    }
    void walk(){
        System.out.println(this.name+"散步");
    }
    @Override
    public void Process(){
        this.feed();
        this.walk();
    }
}
