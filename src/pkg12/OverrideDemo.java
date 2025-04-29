package pkg12;

public class OverrideDemo {
    public static void main(String []args){
        Mobile mobile=new smart();
        mobile.call();
    }
}
class Dageda{
    Voice call(String number,int During){
        System.out.println("歪~~");
        return new Voice();
    }
}
class Mobile{
    void call(){
        System.out.println("古法打电话");
    }
}
class smart extends Mobile{
    void browse(){}
    void call(){
        System.out.println("视频电话");
    }
    medi call(String number,int During){
        System.out.println("视频电话");
        return new medi();
    }
}
class Voice{}
class medi extends Voice{}