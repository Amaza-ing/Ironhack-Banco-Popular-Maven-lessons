package com.ironhack.w1.d4;

public class AndroidPlayer extends Player implements IPlayable, IShareable{
    public AndroidPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing AndroidPlayer");
    }

    @Override
    public void play() {
        System.out.println("Playing AndroidPlayer");
    }

    @Override
    public void pause() {
        System.out.println("Pausing AndroidPlayer");
    }

    @Override
    public void mute() {
        setVolume(0);
    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume() + 0.1);
    }

    @Override
    public String share() {
        return "Sharing...";
    }
}
