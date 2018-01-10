package com.neterbox;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.neterbox.customadapter.ContactsforoneChatAdapter;

public class Contactsforoneononechat extends AppCompatActivity {
    ListView lonechat;
    ContactsforoneChatAdapter adapter;
    public Contactsforoneononechat Chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactsforoneononechat);

        Chat=this;

        Resources res=getResources();
        lonechat=(ListView) findViewById(R.id.lonechat);

        adapter=new ContactsforoneChatAdapter(Chat);
        lonechat.setAdapter(adapter);
    }
}
