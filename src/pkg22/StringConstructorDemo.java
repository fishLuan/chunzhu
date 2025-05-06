package pkg22;

public class StringConstructorDemo {
    public static void main(String []args){
        String s1=new String();
        System.out.println("s1="+s1);
        String s2=new String("nidie");
        System.out.println("s2="+s2);
        String s3=new String(new int[]{0x6478,0x1f01d,0x6253,0x1f005},0,3);
        System.out.println("s3="+s3);
        String s4="Hello".substring(2);
        String s5="Hello".substring(2, 4);
        System.out.println(s4);
        System.out.println(s5);
        String s6 = System.getProperty("java.version");
        System.out.println(s6);
    }
}
