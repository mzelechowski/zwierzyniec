package pl.mzelechowski;

import java.util.Collections;

public class Animal {
    private String name;
    private String sound;
    private boolean loud;

    public Animal(String name, String sound, boolean volume) {
        this.name = name;
        this.sound = sound;
        this.loud = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isLoud() {
        return loud;
    }

    public void setLoud(boolean loud) {
        this.loud = loud;
    }

    void speak(int times){
//        String s= String.join(" ", Collections.nCopies(times, sound));
        for (int i = 0; i < times; i++) {
            if(isLoud()){
                System.out.print(getSound().toUpperCase());
            }else {
                System.out.print(getSound());
            }
            System.out.print(" ");
        }
        System.out.println();
    }

}
