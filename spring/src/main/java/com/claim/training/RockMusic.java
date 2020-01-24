package com.claim.training;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Wind cries Mary");
        songs.add("Hell bells");
        songs.add("Highway to Hell");
    }
    @Override
    public List<String>getSongs(){
        return songs;
    }
}

