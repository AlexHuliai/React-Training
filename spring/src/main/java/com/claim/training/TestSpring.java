package com.claim.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
//System.out.println(classicalMusic.getSong());
//       Music music= context.getBean("rockMusic",Music.class);
//        Music music2= context.getBean("classicalMusic",Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
////    MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music2);
//       musicPlayer.playMusic();
//        musicPlayer1.playMusic();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
       MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
       musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
        context.close();

    }


}
