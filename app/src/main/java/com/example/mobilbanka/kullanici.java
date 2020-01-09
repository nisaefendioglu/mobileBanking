package com.example.mobilbanka;

import android.widget.EditText;

public class kullanici {

    private String ad,mail;
    private int kimlik,telefon;

    public kullanici(EditText kimlik, EditText ad, EditText telefon, EditText mail){}

    public kullanici(String ad,String mail){
        this.ad=ad;
        this.mail=mail;
    }

    public String getAd(){return ad;}
    public void setAd(String ad){this.ad=ad;}
    public String getMail(){return mail;}
    public void setMail(String mail){this.mail=mail;}
    public int getKimlik(){return kimlik;}
    public void getKimlik(int kimlik){this.kimlik=kimlik;}
    public int getTelefon(){return telefon;}
    public void setTelefon(int telefon){this.telefon=telefon;}
}
