package pkg15;

public class Cat implements Pet{
    private String name;
    public Cat(String name){
        this.name=name;
    }
    void feed(){
        System.out.println(this.name+"吃饭");
    }
    void clean(){
        System.out.println(this.name+"清洗");
    }
    @Override
    public void Process(){
        this.feed();
        this.clean();
    }
}
