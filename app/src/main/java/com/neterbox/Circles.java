package com.neterbox;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.neterbox.customadapter.Circle_Adapter;

public class Circles extends AppCompatActivity {
    GridView gcirclegrid;
    Circle_Adapter circle_adapter;
    public Circles circles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circles);

        circles=this;

        Resources res=getResources();
        gcirclegrid=(GridView) findViewById(R.id.gcirclegrid);

        circle_adapter=new Circle_Adapter(circles);
        gcirclegrid.setAdapter(circle_adapter);
    }
}
