package pkg18;

import java.util.Scanner;

public final class Circle {
    final float r;
    final static float pi=3.14f;
    Circle(float r){
        this.r=r;
    }
    @Override
    public String toString(){
        return "Circle [r="+r+"]";
    }
    final float perimeter(){
        return 2*pi*r;
    }
    float aera(){
        return pi*r*r;
    }
//    static {
//        System.out.println("请输入所选的精度1，2：");
//        Scanner scanner = new Scanner(System.in);
//        int precise = scanner.nextInt();
//        if (precise == 1) {
//            PI = 3.14f;
//        } else {
//            PI = 3.1415f;
//        }
//        scanner.close();
//    }
//    float perimeter(){
//        System.out.println("请输入所选的精度1，2：");
//        Scanner scanner=new Scanner(System.in);
//        int precise=scanner.nextInt();
//        if(precise==1){
//            pi=3.14f;
//        }else{
//            pi=3.1415f;
//        }
//        scanner.close();
//        return pi*2*r;
//    }
//    float Aera(){
//           return PI*r*r;
//    }
}
