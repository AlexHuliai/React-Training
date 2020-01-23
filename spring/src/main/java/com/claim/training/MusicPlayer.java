package com.claim.training;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private List<Music> musicList = new ArrayList<>();
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
   public void playMusicList(){
        for(int i =0;i<musicList.size();i++){
            System.out.println(musicList.get(i).getSong()+" is playing");
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
    //    public void setMusic(Music music){
//        this.music = music ;
//    }
}
