package com.claim.training;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destrction");
    }
    public String getSong(){
        return "Rapsody";
    }
}
