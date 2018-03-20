package com.example.zyed.eniso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);

        Button b_more =(Button)findViewById(R.id.more);
        Button b_join =(Button)findViewById(R.id.join);
        Button b_login =(Button)findViewById(R.id.login);

        final EditText ed_username=(EditText)findViewById(R.id.username);
        final EditText ed_password=(EditText)findViewById(R.id.password);

        b_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),more.class);
                startActivity(i);

            }
        });

        b_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),join.class);
                startActivity(i);
            }
        });

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),login.class);
                startActivity(i);
            }
        });

    }

}
