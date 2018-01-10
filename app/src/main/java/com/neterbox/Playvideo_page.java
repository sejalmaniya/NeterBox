package com.neterbox;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.neterbox.customadapter.Playlist_Adapter;
import com.neterbox.customadapter.Playvideo_Adapter;

public class Playvideo_page extends AppCompatActivity {

    ListView playvideo_listview;
    Playvideo_Adapter adapter;
    public Playvideo_page playvideo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playvideo_page);

        playvideo = this;

        Resources res =getResources();
        playvideo_listview =(ListView)findViewById( R.id.playvideo_listview );

        adapter=new Playvideo_Adapter(playvideo);
        playvideo_listview.setAdapter( adapter );


    }


}
