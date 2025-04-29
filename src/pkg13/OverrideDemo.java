package pkg13;
import java.util.Scanner;
public class OverrideDemo {
    public static void main(String []args){
        Mobile x1=new Mobile();
        x1.call();
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        Mobile x2=i > 250 ? new Mobile():new Smart();
        x2.call();
    }
}
class Mobile{
    void call(){
        System.out.println("古法电话");
    }
}
class Smart extends Mobile{
    void call(){
        System.out.println("视频通话");
    }
}
