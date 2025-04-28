package pkg09;

public class Add {
    public static void main(String []args){
        Add c=new Add();
        c.add(1,2);
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    int add(float a,float b){
        return (int) (a+b);
    }
}
