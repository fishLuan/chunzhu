package pkg04;

public class ConstructorDemo {
    public static void main(String []args){
        Dog shagou1=new Dog("shagou1",12,true);
        Dog shagou2=new Dog("shagou2",30,false);
        Dog weige=new Dog("伟哥",300,false);
        shagou1.introduce();
        shagou2.introduce();
        weige.introduce();
        Dog qian=new Dog("钱",500);
        qian.introduce();
        }

    }

