package pkg08;

public class Demo {
    public static void main(String []args){
        pupil[] pupils=new pupil[2];
        HeadMaster headmaster=new HeadMaster();
        Teacher teacher=new Teacher();

        pupil xiaoming=headmaster.enroll("小明",7,true);
        pupils[0]=xiaoming;
        pupil xiaohong=headmaster.enroll("小红",7,false);
        pupils[1]=xiaohong;
        teacher.teach(pupils);
    }
}
