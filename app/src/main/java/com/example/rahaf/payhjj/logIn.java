package com.example.rahaf.payhjj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logIn extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        loginButton = (Button)findViewById(R.id.user_login_button);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == loginButton){
            Intent intent = new Intent(logIn.this, Home_Hajj.class);
            startActivity(intent);
        }
    }
}
