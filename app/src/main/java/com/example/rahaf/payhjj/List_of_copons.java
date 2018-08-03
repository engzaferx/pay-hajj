package com.example.rahaf.payhjj;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class List_of_copons extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_copons);

        ArrayList<Copouns> copon = new ArrayList <Copouns>();

        copon.add(new Copouns("Mobily","add an extra 5 SR to your Balance"));
        copon.add(new Copouns("Bandah", "get Banddah copon that value 50 SR"));
        copon.add(new Copouns("STC", "have an extra 1 GB for Free"));


        CopounAdapter itemsAdapter = new CopounAdapter(this, copon);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        fab = (FloatingActionButton) findViewById(R.id.fab_add);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == fab)
            startActivity(new Intent(List_of_copons.this, AddCoppon.class));
    }
}
