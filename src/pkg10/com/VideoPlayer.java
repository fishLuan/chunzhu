package pkg10.com;

public interface VideoPlayer {
    void playAVI();
    default void playMP4(){
        System.out.println("请升级");
    }

}
