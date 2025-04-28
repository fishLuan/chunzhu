package pkg10.com.ccc;

import pkg10.com.TVplayer;

public class Cplayer implements TVplayer {
    public static void main(String[]args){
        Cplayer ah=new Cplayer();
        ah.playAVI();
        ah.playMP4();
        ah.playTV();
    }
    public void playAVI(){
        System.out.println("播放AVI");
    }
    public void playMP4(){
        System.out.println("播放MP4");
    }
    public void playTV(){
        System.out.println("播放TV");
    }
}
