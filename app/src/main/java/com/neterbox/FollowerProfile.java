package com.neterbox;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.neterbox.customadapter.Followerpro_Adapter;
import com.neterbox.customadapter.Friendpro_Adapter;

public class FollowerProfile extends AppCompatActivity {

    ListView follower_listview;
    Followerpro_Adapter adapter;
    public FollowerProfile followerProfile ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follower_profile);


        followerProfile = this;

        Resources res =getResources();
        follower_listview =(ListView)findViewById( R.id.follower_listview );

        adapter=new Followerpro_Adapter(followerProfile);
        follower_listview.setAdapter( adapter );
    }
}
