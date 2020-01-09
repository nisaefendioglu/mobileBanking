package com.example.mobilbanka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

public class kayit extends AppCompatActivity {

  EditText kimlik;
  EditText telefon;
  EditText mail;
  EditText ad;

    FirebaseDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kayit);

        db=FirebaseDatabase.getInstance();
        kimlik=(EditText)findViewById(R.id.kimlik);
        telefon=(EditText)findViewById(R.id.telefon);
        mail=(EditText)findViewById(R.id.mail);
        ad=(EditText)findViewById(R.id.ad);
    }


    public void bukayitolbutonu(View view) {
        Intent intent =new Intent(this,onay.class);
        startActivity(intent);
    }
}

