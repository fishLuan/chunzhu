package pkg20;

public class Cash {
    float value;
    Cash(float value){
        this.value=value;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }else{
            Cash other=(Cash)obj;
            return this.value==other.value;
        }
    }
}
