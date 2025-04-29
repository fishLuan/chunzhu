package pkg15;

public class Pig implements Pet{
    private String name;
    public Pig(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(this.name+"吃饭");
    }
    void eatAgine(){
        System.out.println(this.name+"又吃饭");
    }
    @Override
    public  void Process(){
        this.eat();
        this.eatAgine();
    }
}
