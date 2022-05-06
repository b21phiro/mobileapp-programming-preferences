package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class SharedActivity extends AppCompatActivity {

    private EditText edit;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        edit = findViewById(R.id.edit);
        button = findViewById(R.id.buttonSave);
        button.setOnClickListener(view -> {
            save(edit.getText().toString());
            edit.setText("");
        });
    }

    public void save(String data) {
        SharedPreferences pref = getSharedPreferences("com.example.preferences.SAVED_INPUT", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("input", data);
        editor.apply();
    }
}