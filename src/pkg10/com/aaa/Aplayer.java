package pkg10.com.aaa;

import pkg10.com.VideoPlayer;

public class Aplayer implements VideoPlayer {
    public static void main(String []args){
        Aplayer ah=new Aplayer();
        ah.playAVI();
        ah.playMP4();

    }
    public void playAVI(){
        System.out.println("播放AVI");
    }
    public void playMP4(){
        System.out.println("播放MP4");
    }
}
