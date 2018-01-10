package com.neterbox;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.neterbox.customadapter.Search_Friend_Adapter;

public class FriendList extends AppCompatActivity {
    ListView list3;
    Search_Friend_Adapter friend_adapter;
    public FriendList sfriendlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);

        sfriendlist=this;
        Resources res=getResources();
        list3=(ListView) findViewById(R.id.list3);
        friend_adapter=new Search_Friend_Adapter(sfriendlist);
        list3.setAdapter(friend_adapter);
    }
}
