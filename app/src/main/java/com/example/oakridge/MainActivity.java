package com.example.oakridge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View v){
        EditText nameField = findViewById(R.id.Name);
        EditText passwordField = findViewById(R.id.Password);
        EditText phoneNumberField = findViewById(R.id.PhoneNumber);
        String name = nameField.getText().toString();
        String password = passwordField.getText().toString();
        int phoneNumber = Integer.parseInt(phoneNumberField.getText().toString());

        Log.d("name", name);
        Log.d("passwd", password);
        Log.d("phone no", "value" + phoneNumber);
    }

}