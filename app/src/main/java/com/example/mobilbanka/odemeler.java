package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class odemeler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.odemeler);
    }

    public void bugeri3(View view) {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }

    public void bufaturaodeme(View view) {
        Intent intentfa = new Intent(this, faturaodeme.class);
        startActivity(intentfa);

    }

    public void buotomatik(View view) {
        Intent intentot = new Intent(this, otomatikodeme.class);
        startActivity(intentot);
    }

    public void buakillirehber(View view) {
        Intent intentak = new Intent(this, akillirehber.class);
        startActivity(intentak);
    }

    public void buparatransfer(View view) {
        Intent intenttr = new Intent(this, borcodeme.class);
        startActivity(intenttr);
    }
}
