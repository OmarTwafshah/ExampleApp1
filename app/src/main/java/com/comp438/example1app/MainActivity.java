package com.comp438.example1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText NamePerson ;
    private EditText Password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NamePerson = findViewById(R.id.NamePerson);
        Password = findViewById(R.id.Password);
    }

    public void butSubmitOnClick(View view) {
        String name = "Your name is " + NamePerson.getText().toString();
        String pass = ", and you password is " +Password.getText().toString();
        String msg = name + pass ;
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

    }
}