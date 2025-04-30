package pkg16;

public class PoliceDog extends Dog {
    int tired;
    void work(){
        System.out.println("抓捕");
        tired++;
        this.rest();
    }
    void rest() {
        if (this.tired>8) {
            System.out.println("休息");
        }else{
            super.rest();
        }
            tired--;

    }
}
