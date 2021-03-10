package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupHyperlink();
    }

    public void toProfile(View view) {
        Intent intent = new Intent(MainActivity2.this, ProfileActivity.class);
        startActivity(intent);
    }

    private void setupHyperlink(){
        TextView link = findViewById(R.id.link);
        link.setMovementMethod((LinkMovementMethod.getInstance()));
    }
}