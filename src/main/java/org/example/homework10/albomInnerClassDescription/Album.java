package org.example.homework10.albomInnerClassDescription;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title; // назва альбому
    protected SongList songList; // екземпляр внутрішнього класу SongList

    public Album(String title) {
        this.title = title;
        songList = new SongList();
    }

    public class SongList{
        protected ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            for (Song songInList : songs)
                if(song.getSongTitle().equals(songInList.getSongTitle()))
                    return false;
            return songs.add(song);
        }

        public Song findSongByTitle (String songTitle){
            for(Song song : songs) {
                if(songTitle.equals(song.getSongTitle())) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber (int trackNumber){
            int index = trackNumber - 1;
            if(index >= 0 && songs.size() >= index)
                return songs.get(index);
            return null;
        }
    }
}