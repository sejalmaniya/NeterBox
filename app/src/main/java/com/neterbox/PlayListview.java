package com.neterbox;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.neterbox.customadapter.Followerpro_Adapter;
import com.neterbox.customadapter.Playlist_Adapter;

public class PlayListview extends AppCompatActivity {

    ListView playlist_view;
    Playlist_Adapter adapter;
    public PlayListview playListview ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_listview);


        playListview = this;

        Resources res =getResources();
        playlist_view =(ListView)findViewById( R.id.playlist_view );

        adapter=new Playlist_Adapter(playListview);
        playlist_view.setAdapter( adapter );


    }
}
