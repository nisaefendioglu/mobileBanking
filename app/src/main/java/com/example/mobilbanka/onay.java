package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onay);
    }

    public void buanasayfadonus(View view) {
        Intent intent = new Intent(this,varliklar.class);
        startActivity(intent);
    }
}
