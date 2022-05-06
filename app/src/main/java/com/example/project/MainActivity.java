package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        Button button = findViewById(R.id.activityButton);
        button.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SharedActivity.class));
        });
        setSupportActionBar(toolbar);
    }

}
