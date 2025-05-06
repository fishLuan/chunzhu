package pkg20;

import java.util.Objects;

public class Latiao {
    String brand;
    int netWeight;
    String taste;
    Latiao(String brand,int netWeight,String taste){
        this.brand=brand;
        this.netWeight=netWeight;
        this.taste=taste;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Latiao latiao = (Latiao) o;
        return netWeight == latiao.netWeight &&
                Objects.equals(brand, latiao.brand) &&
                Objects.equals(taste, latiao.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, netWeight, taste);
    }
//    @Override
//    public int hashCode(){
//        return Objects.hash(this.brand,this.netWeight,this.taste);
//    }
//    @Override
//    public boolean equals(Object obj){
//         if(obj==null){
//             return false;
//         }else{
//             Latiao other=(Latiao)obj;
//             return this.brand.equals(other.brand)&&
//                     this.netWeight==other.netWeight&&
//                     this.taste.equals(other.taste);
//         }
//    }
}
