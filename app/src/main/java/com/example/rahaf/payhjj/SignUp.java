package com.example.rahaf.payhjj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SignUp extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    EditText nameEditText;
    EditText emailEditText;
    EditText usernameEditText;
    EditText passwordEditText;
    EditText passwordConfEditText;
    String name;
    String username;
    String email;
    String password;
    String passwordConf;
    String type;
    Button signupButton;

    private Spinner typeSpinner;
    private ArrayAdapter typeAdapter;
    private ArrayList<String> types;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameEditText = (EditText)findViewById(R.id.editTextName);
        emailEditText = (EditText)findViewById(R.id.editTextEmail);
         usernameEditText = (EditText)findViewById(R.id.editTextUsername);
         passwordEditText = (EditText)findViewById(R.id.editTextPassword);
         passwordConfEditText = (EditText)findViewById(R.id.editTextPasswordConf);
         signupButton = (Button)findViewById(R.id.signUpButton) ;
         signupButton.setOnClickListener(this);

         name = nameEditText.getText().toString().trim();
         username = usernameEditText.getText().toString().trim();
         email = emailEditText.getText().toString().trim();
         password = passwordEditText.getText().toString().trim();
         passwordConf = passwordConfEditText.getText().toString().trim();

        typeSpinner = (Spinner)findViewById(R.id.type_spinner);
        typeSpinner.setOnItemSelectedListener(this);
        types = new ArrayList<String>();
        addTypes();
    }

    private void addTypes(){
        types.add("sign Up As..");
        types.add("Paligrim");
        types.add("Company or Sponser");
        types.add("Supervisor");


        typeAdapter = new ArrayAdapter<String>(SignUp.this, android.R.layout.simple_spinner_dropdown_item, types);
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeSpinner.setAdapter(typeAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        if (i > 0) {
            // Showing selected spinner item
            type = item;
            Toast.makeText(adapterView.getContext(), "Select your type " + item, Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        if(view == signupButton){
            if(type == "Paligrim"){
                startActivity(new Intent(SignUp.this, Home_Hajj.class));
            }
            if(type == "Company or Sponser"){
                startActivity(new Intent(SignUp.this, List_of_copons.class));
            }

            if (type == "Supervisor"){
                startActivity(new Intent(SignUp.this, Employee_Home.class));
            }
        }
    }
}
