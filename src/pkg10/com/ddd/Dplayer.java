package pkg10.com.ddd;

import pkg10.com.VideoPlayerV3;

public class Dplayer implements VideoPlayerV3 {
    public static void main(String []args){
        Dplayer bh=new Dplayer();
        bh.playAVI();
        bh.playMP4();
        bh.playTV();
        bh.playMOV();
    }
    public void playAVI(){
        System.out.println("播放AVI");
    }
    public void playMP4(){
        System.out.println("播放MP4");
    }public void playTV(){
        System.out.println("播放TV");
    }public void playMOV(){
        System.out.println("播放MOV");
    }
}
