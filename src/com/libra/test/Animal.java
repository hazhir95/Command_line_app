package com.libra.test;

import jaco.mp3.player.MP3Player;

import java.io.File;

public class Animal {

    //Review this section ↓↓↓↓↓↓↓
    void bark(){
        Main fun = new Main();
        System.out.println("woof");

        try {

            File f = new File("woof/woof.mp3");

            MP3Player mp3Player = new MP3Player(f);
            mp3Player.play();

            while (!mp3Player.isStopped()) {
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        fun.menu(); // Reload (recall) menu method from Main Class.
    }
}
