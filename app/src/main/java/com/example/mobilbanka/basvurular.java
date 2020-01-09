package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class basvurular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basvurular);
    }

    public void bugeri4(View view) {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }

    public void krediac(View view) {
        Intent intentk=new Intent(this,kredihesapac.class);
        startActivity(intentk);
    }

    public void bankahesap(View view) {
        Intent intentb=new Intent(this,bankahesapac.class);
        startActivity(intentb);
    }

    public void bireyselh(View view) {
        Intent intentbi=new Intent(this,bireyselhesapac.class);
        startActivity(intentbi);

    }
}
