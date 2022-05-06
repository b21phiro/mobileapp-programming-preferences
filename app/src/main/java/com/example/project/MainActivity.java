package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        Button button = findViewById(R.id.activityButton);

        button.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, SharedActivity.class));
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences pref = getSharedPreferences("com.example.preferences.SAVED_INPUT", Context.MODE_PRIVATE);
        String savedData = pref.getString("input", null);
        TextView display = findViewById(R.id.value);
        display.setText(savedData);
    }

}
