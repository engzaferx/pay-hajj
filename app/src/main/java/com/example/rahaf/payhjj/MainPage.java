package com.example.rahaf.payhjj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity implements View.OnClickListener {


    private Button signup;
   private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        login = (Button) findViewById(R.id.login_button);
        signup = (Button)findViewById(R.id.signup_button);
        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == login){
            Intent intent = new Intent(MainPage.this, logIn.class);
            startActivity(intent);
        }

        if(view == signup){
            Intent intent = new Intent(MainPage.this, SignUp.class);
            startActivity(intent);
        }
    }
}
