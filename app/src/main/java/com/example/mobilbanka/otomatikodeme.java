package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class otomatikodeme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otomatikodeme);
    }

    public void buotomatik(View view) {
        Intent intent=new Intent(this,faturaodeme.class);
        startActivity(intent);
    }
}
