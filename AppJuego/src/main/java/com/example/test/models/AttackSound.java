package com.example.test.models;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.util.Random;

public class AttackSound {

    public static void SonidoAtaque(){
        String path;
        Random random = new Random();
        int randomSound = random.nextInt(2)+1;

        switch(randomSound){
            case 1:
                path = "AppJuego/Assets/sonidos/Ataque1.wav";
                break;
            case 2:
                path = "AppJuego/Assets/sonidos/Ataque2.wav";
                break;
            default:
                path = "AppJuego/Assets/sonidos/Ataque1.wav";
                break;
        }

        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
            javax.sound.sampled.Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }


        //es para .wav
        /*
        try{
            Media hit = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
        }
        catch(Exception e){
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }

         */



    }
}
