package com.example.rahaf.payhjj;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class Services extends Fragment implements View.OnClickListener {

    private ImageButton helpButton, lostButton, childrenButton, trashButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.services, container, false);

        helpButton = (ImageButton) root.findViewById(R.id.help_button);
        lostButton = (ImageButton) root.findViewById(R.id.lost_button);
        childrenButton = (ImageButton) root.findViewById(R.id.children_button);
        trashButton = (ImageButton) root.findViewById(R.id.trash_button);

        helpButton.setOnClickListener(this);
        lostButton.setOnClickListener(this);
        childrenButton.setOnClickListener(this);
        trashButton.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View view) {
        if (view == helpButton || view==lostButton || view == childrenButton || view == trashButton){
            startActivity(new Intent(getContext(), Hajj_QR.class));

        }
    }
}
