package pkg14;

public class OverrideDemo {
    public static void main(String []args){
        Mobile mobile=new Smart();
        mobile.call();
    }
}
class Mobile{
    void call(){
        System.out.println("古法通话");
    }
}
class Smart extends Mobile{
    @Override
    void call(){
        System.out.println("视频通话");
    }
}