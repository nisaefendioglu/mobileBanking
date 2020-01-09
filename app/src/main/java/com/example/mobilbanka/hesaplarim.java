package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hesaplarim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hesaplarim);
    }

    public void bugeri2(View view) {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }

    public void butumhesap(View view) {
        Intent intenthessp=new Intent(this,tumhesaplar.class);
        startActivity(intenthessp);
    }

    public void buvadesiz(View view) {
        Intent intentvadesiz = new Intent(this,vadesizhesap.class);
        startActivity(intentvadesiz);
    }

    public void buvadeli(View view) {
        Intent intentvadeli=new Intent(this,vadelihesap.class);
        startActivity(intentvadeli);
    }

    public void bukredi(View view) {
        Intent intentkredi=new Intent(this,kredihesap.class);
        startActivity(intentkredi);
    }

    public void buyeni(View view) {
        Intent intentyeni=new Intent(this,basvurular.class);
        startActivity(intentyeni);
    }
}
