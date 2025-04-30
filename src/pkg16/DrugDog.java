package pkg16;

public class DrugDog extends PoliceDog {
    int tired;
    @Override
    void work(){
        System.out.println("缉毒");
        tired++;
        this.rest();
    }

}
