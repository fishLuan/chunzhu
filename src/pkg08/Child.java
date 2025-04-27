package pkg08;

public class Child implements pupil{
    private String name;
    private int age;
    private boolean sex;
    public Child(String name,int age,boolean sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    void eat(){
        System.out.println("吃饭" );
    }
    void drink(){
        System.out.println("喝水");
    }
    public void takeClass(){
        System.out.println("上课");
    }
    public void doExercise(){
        System.out.println("做练习");
    }
}
