package com.example.mobilbanka;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class anasayfa extends AppCompatActivity {

    EditText username;
    EditText password;
    TextView error;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        error=(TextView)findViewById(R.id.error);
        checkBox=(CheckBox)findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

    }

    String usernames = "nisa";
    String passwords = "1234";

    public void bugiris(View view) {

        if (usernames.equals(username.getText().toString()) &&
                passwords.equals(password.getText().toString())) {
            Intent intent = new Intent(this, varliklar.class);
            intent.putExtra("nisa", usernames);
            startActivity(intent);

        }
        else {
            error.setText("Hatalı Giriş Yaptınız.");
        }
    }
    public void bukayit(View view) {

        Intent intentkayit=new Intent(this,kayit.class);
        startActivity(intentkayit);
    }
}
