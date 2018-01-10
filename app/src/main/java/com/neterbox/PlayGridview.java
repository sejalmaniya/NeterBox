package com.neterbox;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.neterbox.customadapter.Playgrid_Adapter;
import com.neterbox.customadapter.Playlist_Adapter;

public class PlayGridview extends AppCompatActivity {

    GridView playgrid_view;
    Playgrid_Adapter adapter;
    public PlayGridview playgridview ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_gridview);

        playgridview = this;

        Resources res =getResources();
        playgrid_view =(GridView)findViewById( R.id.playgrid_view );

        adapter=new Playgrid_Adapter(playgridview);
        playgrid_view.setAdapter( adapter );
    }
}
