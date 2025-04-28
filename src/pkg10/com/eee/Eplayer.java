package pkg10.com.eee;

import pkg10.com.TVplayer;
import pkg10.com.VideoPlayerV2;

public class Eplayer implements VideoPlayerV2, TVplayer {
    public static void main(String []args){
        Eplayer eh=new Eplayer();
        eh.playAVI();
        eh.playMP4();
        eh.playTV();
        ((VideoPlayerV2)eh).playMP4();

    }
    public void playAVI(){
        System.out.println("播放AVI");
    }
    public void playMP4(){
        System.out.println("播放MP4");
    }
    public void playTV(){
        System.out.println("播放MOV");
    }
}
