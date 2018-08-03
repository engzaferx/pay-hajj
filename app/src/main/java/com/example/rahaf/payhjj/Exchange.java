package com.example.rahaf.payhjj;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Exchange extends Fragment implements View.OnClickListener {

    ImageView coponsButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.exchange, container, false);

        coponsButton = (ImageView)root.findViewById(R.id.copons);
        coponsButton.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View view) {
        if(view == coponsButton){
            startActivity(new Intent(getContext(), List_of_copons.class));
        }
    }
}
