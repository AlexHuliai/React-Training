package com.claim.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

private Music music1;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic,RockMusic rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;

    }
//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

  //  private List<Music> musicList = new ArrayList<>();
//@Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
//       this.classicalMusic = classicalMusic;
//       this.rockMusic = rockMusic;
//   }
//   public void playMusicList(){
//        for(int i =0;i<musicList.size();i++){
//            System.out.println(musicList.get(i).getSong()+" is playing");
//        }
//    }

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public List<Music> getMusicList() {
//        return musicList;
//    }
//    @Autowired
//        public void setMusic(Music music){
//        this.music = music ;
//    }
    public void playMusic(MusicGenre genre){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if(genre == MusicGenre.CLASSICAL){
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        }
        else{
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }

    }
}
