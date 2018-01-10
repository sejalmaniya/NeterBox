package com.neterbox;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.neterbox.customadapter.Followers_Adapter;

public class search_followers extends AppCompatActivity {

    ListView list1;
    Followers_Adapter followers_adapter;
    public search_followers sfollwers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_followers);


            sfollwers=this;
        Resources res=getResources();
        list1=(ListView) findViewById(R.id.list1);
        followers_adapter=new Followers_Adapter(sfollwers);
        list1.setAdapter(followers_adapter);
    }

}
