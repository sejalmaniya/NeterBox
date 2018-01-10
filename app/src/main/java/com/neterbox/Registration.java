package com.neterbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Registration extends AppCompatActivity {

    EditText register_efname,register_elname,register_eday,register_emonth,register_eyear,register_eemail,register_epassword;
    ImageView register_iday,register_imonth,register_iyear;

    Button btnRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        register_efname = (EditText) findViewById(R.id. register_efname);
        register_elname = (EditText) findViewById(R.id. register_efname);
        register_eday = (EditText) findViewById(R.id. register_efname);
        register_emonth = (EditText) findViewById(R.id. register_efname);
        register_eyear = (EditText) findViewById(R.id. register_efname);
        register_eemail = (EditText) findViewById(R.id. register_efname);
        register_epassword = (EditText) findViewById(R.id. register_efname);

        register_iday= (ImageView) findViewById(R.id.register_iday);
        register_imonth= (ImageView) findViewById(R.id.register_imonth);
        register_iyear= (ImageView) findViewById(R.id.register_iyear);

        btnRegistration=(Button)findViewById(R.id.btnRegistration);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Registration.this,HomePage.class);
                startActivity(i);
            }
        });



    }
}
