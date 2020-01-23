package com.claim.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
System.out.println(classicalMusic.getSong());
       //Music music= context.getBean("musicBean",Music.class);
//       //MusicPlayer musicPlayer = new MusicPlayer(music);
//    MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusicList();

        context.close();

    }


}
