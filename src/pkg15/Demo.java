package pkg15;

public class Demo {
    public static void main(String []args){
//        Dog[] dogs={new Dog("阿黄"),new Dog("旺财")};
     Carer carer=new Carer();
//        for(int i=0;i<dogs.length;i++) {
//            carer.care(dogs[i]);
//        }
//            Cat[] cat={new Cat("小花"),new Cat("小黑")};
//            for(int i=0;i<cat.length;i++){
//                carer.care(cat[i]);
//
//        }
        Pet[] pets={new Dog("阿黄"),new Dog("旺财"),
                    new Cat("小花"),new Cat("小黑"),
                    new Pig("小肥"),new Pig("小胖")};
            for(int i=0;i<pets.length;i++){
                carer.care(pets[i]);
            }
    }
}
