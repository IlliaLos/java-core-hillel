package org.example.homework10.albomInnerClassDescription;

public class Main {
    public static void main(String[] args) {
        Song firstSong = new Song("My Eyes Are Gonna Shine", 2.13);
        Song secondSong = new Song("Gotta Get To Peekskill", 2.47);
        Song therdSong = new Song("Watching The Day Go By", 3.38);
        Song fourthSong = new Song("I Know How It Feels", 2.47);
        Song fifthSong = new Song("Ripping Up Boundary Line", 3.18);

        Album album = new Album("Stormbringer");

        album.songList.addSong(firstSong);
        album.songList.addSong(secondSong);
        album.songList.addSong(therdSong);
        album.songList.addSong(fourthSong);
        album.songList.addSong(fifthSong);

        System.out.println("addSong() testing");
        System.out.println(album.songList.songs.get(4));
        System.out.println("-".repeat(30));
        System.out.println("findSongByTitle() testing");
        System.out.println(album.songList.findSongByTitle("I Know How It Feels"));
        System.out.println("-".repeat(30));
        System.out.println("findSongByTrackNumber() testing");
        System.out.println(album.songList.findSongByTrackNumber(1));
    }
}