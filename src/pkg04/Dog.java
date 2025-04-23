package pkg04;

public class Dog {
    String name;
    int age;
    boolean sex;
    void bathe(){
        System.out.println(name+"洗澡了");
    }
    int limitAge(int age){
        if(age>200){
            return 200;
        }else{
            return age;
        }
    }
    Dog(String name,int age,boolean sex){
        this.name=name;
        //if(age>200){
          //  this.age=200;
        //}else{
          //  this.age=age;
        //}
        this.age=this.limitAge(age);
        this.sex=sex;
        this.bathe();
    }
    void introduce(){
        System.out.printf("我的名字叫%s,今年%d个月,是%s.\n",
                this.name,
                this.age,
                this.sex ? "公" : "母"

        );
        }
        Dog(String name,int age){
            this.name=name;
            //if(age>200){
              //  this.age=200;
            //}else{
              //  this.age=age;
            //}
            this.sex=true;
            this.age=this.limitAge(age);
        }
        Dog(String name,boolean sex){
        this(name,200,sex);
        }

    }

