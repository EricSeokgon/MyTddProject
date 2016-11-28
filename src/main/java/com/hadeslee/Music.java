package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-29.
 */
public class Music {
    private String songName;
    private String performerName;

    public Music(String songName, String performerName) {
        this.songName = songName;
        this.performerName = performerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }
}
