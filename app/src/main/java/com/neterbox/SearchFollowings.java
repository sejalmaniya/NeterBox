package com.neterbox;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.neterbox.customadapter.Search_Following_Adapter;

public class SearchFollowings extends AppCompatActivity {
    ListView list2;
    Search_Following_Adapter following_adapter;
    public SearchFollowings searchFollowings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_followings);

        searchFollowings=this;
        Resources res=getResources();
        list2=(ListView) findViewById(R.id.list2);
        following_adapter=new Search_Following_Adapter(searchFollowings);
        list2.setAdapter(following_adapter);
    }
}
