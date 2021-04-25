package com.brouken.player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText=findViewById(R.id.field);
        findViewById(R.id.button).setOnClickListener(view -> {
            startActivity(new Intent(this,PlayerActivity.class).putExtra("link",editText.getText().toString()));
        });
    }
}