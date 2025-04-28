package pkg10.com.bbb;

import pkg10.com.VideoPlayerV2;

public class Bplayer implements VideoPlayerV2 {
    public static void main(String []args){
        Bplayer ph=new Bplayer();
        ph.playAVI();
        ph.playMP4();
    }
    public void playAVI(){
        System.out.println("播放AVI");
    }
    public void playMP4(){
        System.out.println("播放V2");
    }
}
