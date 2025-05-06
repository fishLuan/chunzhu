package pkg20;

public class EqualsApplicationDemo {
    public static void main(String []args){
        Latiao[] types={
                new Latiao("a",80,"sweet"),
                new Latiao("b",100,"spicy"),
                new Latiao("c",50,"hot")
        };
        float[] prices={3.0f,1.8f,1.5f};
        Latiao lt=new Latiao("a",80,"sweet");
        for(int i=0;i<types.length;i++){
            if(lt.equals(types[i])){
                System.out.println(prices[i]);
                break;
            }
        }
    }
}
