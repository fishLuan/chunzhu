package pkg08;

public class HeadMaster {
    public pupil enroll(String name,int age,boolean sex){
        pupil stu=new Child(name,age,sex);
        return stu;
    }
}
