package com.example.mobilbanka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class tumhesaplar extends AppCompatActivity {


    TextView tumhesap1;
    TextView vadesiz;
    TextView play;
    TextView hesapno;
    TextView acilistarihi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tumhesaplar);

        tumhesap1=(TextView) findViewById(R.id.tumhesap1);
        vadesiz=(TextView) findViewById(R.id.vadesiz);
        play=(TextView)findViewById(R.id.play);
        hesapno=(TextView)findViewById(R.id.hesapno);
        acilistarihi=(TextView)findViewById(R.id.acilistarihi);

    }

    public void buhesapdetay(View view) {
        Intent intent = new Intent(this,hesapdetay.class);
        startActivity(intent);

    }
}
