package pkg16;

public class DagongDemo {
    public static void main(String []args){
        LaoWang xw=new XiaoWang();
        xw.work();
    }
}
class LaoWang{
    void work(){
        System.out.println("打工");
        this.rest();
    }
    void rest(){
        System.out.println("打麻将");
    }
}
class XiaoWang extends LaoWang{
    @Override
    void rest(){
        System.out.println("打游戏");
    }
}
