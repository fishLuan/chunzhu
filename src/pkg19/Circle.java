package pkg19;

import java.util.Scanner;

public final class Circle {
    float r;
    final static float pi=3.14f;
     boolean login(int password){
        if(password==12345678){
            return true;
        }else{
            return false;
        }
    }
    Circle(float r) {
        this.r = r;
    }
        @Override
        public String toString () {
            return "Circle [r=" + r + "]";
        }

    float perimeter(){
        return 2*this.r*pi;
    }
    float aera(){
        System.out.println("请输入密码:");
        Scanner scanner=new Scanner(System.in);
        int password=scanner.nextInt();
        scanner.close();
        if(this.login(password)) {
            return pi * this.r * this.r;
        }else{
            return -1f;
        }
    }
}
