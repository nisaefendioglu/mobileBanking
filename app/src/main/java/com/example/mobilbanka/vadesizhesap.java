package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vadesizhesap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vadesizhesap);
    }

    public void buhesapdetay(View view) {
        Intent intent = new Intent(this,hesapdetay.class);
        startActivity(intent);
    }
}
