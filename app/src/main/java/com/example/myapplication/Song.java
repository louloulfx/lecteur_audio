package com.example.myapplication;

public class Song {
    private long id;
    private String title;
    private String duration;
    private String size;

    public Song(long songId,String songTitle, String songDuration, String songSize) {
        id=songId;
        title=songTitle;
        duration=songDuration;
        size=songSize;
    }
    public long getID(){
        return id;
    }

    public String getDuration(){
        return duration;
    }

    public String getTitle(){
        return title;
    }

    public String getSize(){
        return size;
    }
}
