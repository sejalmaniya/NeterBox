package com.neterbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    EditText login_euname,login_epassword;
    TextView login_tlogin, login_tsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        login_euname= (EditText) findViewById(R.id.login_euname);
        login_epassword= (EditText) findViewById(R.id.login_epassword);
        login_tlogin= (TextView) findViewById(R.id.login_tlogin);
        login_tsignin= (TextView) findViewById(R.id.login_tsignin);

        login_tsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(LoginPage.this,Registration.class);
                startActivity(it);
            }
        });

        login_tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(LoginPage.this,HomePage.class);
                startActivity(i);
            }
        });
    }
}
