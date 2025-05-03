package pkg17;

import java.util.Random;
public class Human {
    String wealth;
    String local;
    boolean sex;
    {
        if(new Random().nextBoolean()){
            this.wealth="欠一屁股债";
        }else{
            this.wealth="欠一屁股国债";
        }
    }
    Human(){
        if(this.wealth=="欠一屁股债"){
            this.local="非洲 ";
        }else{
            this.local="欧洲";
        }
    }
    Human(boolean sex){
        if(this.wealth=="欠一屁股债"){
            this.local="非洲 ";
        }else{
            this.local="欧洲";
        }
    }
}
