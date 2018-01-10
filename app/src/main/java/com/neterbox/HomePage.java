package com.neterbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView taddfriend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        taddfriend=(TextView)findViewById(R.id.taddfriend);

        taddfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i =new Intent(HomePage.this,Add.class);
//                startActivity(i);
            }
        });
    }
}
