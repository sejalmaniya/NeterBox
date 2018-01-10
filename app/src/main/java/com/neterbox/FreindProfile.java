package com.neterbox;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.neterbox.customadapter.Friendpro_Adapter;
import com.neterbox.customadapter.Userpro_Adapter;

public class FreindProfile extends AppCompatActivity {

    ListView frnd_listview;
    Friendpro_Adapter adapter;
    public FreindProfile frndProfile ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freind_profile);

        frndProfile = this;

        Resources res =getResources();
        frnd_listview =(ListView)findViewById( R.id.frnd_listview );

        adapter=new Friendpro_Adapter(frndProfile);
        frnd_listview.setAdapter( adapter );


    }
}
