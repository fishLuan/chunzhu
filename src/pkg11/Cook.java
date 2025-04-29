package pkg11;

public class Cook {
    public static void main(String []args){
        Cook w=new Cook();
        w.cook(new meat(),new apple());
    }
    void cook(food main,food anx){
        System.out.println("乱炖");
    }
    void cook(food main,fruit anx){
        System.out.println("正常餐");
    }
    void cook(greens main,fruit anx){
        System.out.println("沙拉");
    }
}
class food{};
class fruit extends food{};
class meat extends food{};
class greens extends food{};
class apple extends fruit{};
class banana extends fruit{};
class pearl extends fruit{};

