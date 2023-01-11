package com.example.test.controllers;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Random;

public class SoundManager {

    public static void SonidoAtaque(){
        String path;
        Random random = new Random();
        int randomSound = random.nextInt(3)+1;

        switch(randomSound){
            case 1:
                path = "/Assets/sonidos/Ataque1.wav";
                break;
            case 2:
                path = "/Assets/sonidos/Ataque2.wav";
                break;
            case 3:
                path = "/Assets/sonidos/Ataque3.wav";
                break;
            default:
                path = "/Assets/sonidos/Ataque1.wav";
                break;
        }

        playSound(path);
    }
    public static void SonidoCurar(){
        String path;
        Random random = new Random();
        int randomSound = random.nextInt(3)+1;

        switch(randomSound){
            case 1:
                path = "/Assets/sonidos/Curar1.wav";
                break;
            case 2:
                path = "/Assets/sonidos/Curar2.wav";
                break;
            case 3:
                path = "/Assets/sonidos/Curar3.wav";
                break;
            default:
                path = "/Assets/sonidos/Curar1.wav";
                break;
        }

        playSound(path);
    }

    public static void SonidoDerrota(){
        String path = "/Assets/sonidos/Derrota.wav";
        playSound(path);
    }

    public static void SonidoVictoria(){
        String path = "/Assets/sonidos/victoria.wav";
        playSound(path);
    }

    private static void playSound(String path) {
        try{
            InputStream bufferedIn = new BufferedInputStream(SoundManager.class.getResourceAsStream(path));
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedIn);
            javax.sound.sampled.Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
