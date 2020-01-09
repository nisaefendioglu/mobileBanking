package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void bugeri(View view) {
        Intent intent = new Intent(this, varliklar.class);
        startActivity(intent);
    }

    public void buhesap(View view) {
        Intent intent = new Intent(this, hesaplarim.class);
        startActivity(intent);
    }

    public void buodeme(View view) {
        Intent intent = new Intent(this, odemeler.class);
        startActivity(intent);
    }

    public void bubasvuru(View view) {
        Intent intent = new Intent(this, basvurular.class);
        startActivity(intent);
    }

    public void bucikis(View view) {
        Intent intent = new Intent(this, anasayfa.class);
        startActivity(intent);
    }
}
