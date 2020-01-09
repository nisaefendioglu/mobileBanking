package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bankahesapac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bankahesapac);
    }
    public void bukayitoll(View view) {
        Intent intent =new Intent(this,onay.class);
        startActivity(intent);
    }
}
