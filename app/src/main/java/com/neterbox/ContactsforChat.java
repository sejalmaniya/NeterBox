package com.neterbox;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.neterbox.customadapter.ContactsforChatAdapter;

public class ContactsforChat extends AppCompatActivity {
    ListView groupchat;
    ContactsforChatAdapter adapter;
    public ContactsforChat contactsforChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactsfor_chat);

        contactsforChat=this;

        Resources res=getResources();
        groupchat=(ListView) findViewById(R.id.groupchat);

       adapter=new ContactsforChatAdapter(contactsforChat);
        groupchat.setAdapter(adapter);
    }
}
