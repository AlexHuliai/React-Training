package com.claim.training;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hello Mary");
        songs.add("MoonLight");
        songs.add("Who knows the truth");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}