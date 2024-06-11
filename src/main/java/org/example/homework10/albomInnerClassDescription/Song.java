package org.example.homework10.albomInnerClassDescription;

public class Song {
    private String songTitle;
    private double songTime;

    public Song(String songTitle, double songTime) {
        this.songTitle = songTitle;
        this.songTime = songTime;
    }

    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return this.songTitle + ": " + this.songTime;
    }
}