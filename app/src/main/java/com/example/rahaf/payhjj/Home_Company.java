package com.example.rahaf.payhjj;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home_Company extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__company);

        fab = (FloatingActionButton)findViewById(R.id.add_copons_fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(Home_Company.this, AddCoppon.class));
    }

}

