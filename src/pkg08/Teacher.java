package pkg08;

public class Teacher {
    public void teach(pupil[] pupils){
        for(int i=0;i<pupils.length;i++){
            pupils[i].takeClass();
        }
        for(int i=0;i<pupils.length;i++){
            pupils[i].doExercise();
        }
    }
}
