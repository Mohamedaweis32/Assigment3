package com.example.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void message(View v){
        setContentView(R.layout.message);
    }
    public void homepage(View v){
        setContentView(R.layout.message);
    }
    public void login(View v){
        setContentView(R.layout.login);
    }
    public void signup(View v){
        setContentView(R.layout.activity_main);
    }
}