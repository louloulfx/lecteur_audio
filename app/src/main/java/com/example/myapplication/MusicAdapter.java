package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends BaseAdapter {
    private ArrayList<Song> songList;
    private LayoutInflater layoutInflater;

    public MusicAdapter(Context c, ArrayList<Song> theSongs){
        songList=theSongs;
        layoutInflater=LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder") LinearLayout songLay = (LinearLayout)layoutInflater.inflate (R.layout.songs, parent, false);

        TextView titleView = (TextView)songLay.findViewById(R.id.song_title);
        TextView durationView = (TextView)songLay.findViewById(R.id.song_duration);
        TextView sizeView = (TextView)songLay.findViewById(R.id.song_size);

        Song currSong = songList.get(position);

        titleView.setText(currSong.getTitle());
        durationView.setText(currSong.getDuration());
        sizeView.setText(currSong.getSize());

        songLay.setTag(position);
        return songLay;
    }
}
