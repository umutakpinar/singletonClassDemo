package com.umutakpinar.singletonclassesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String veri = "Lorem ipsum dolor sit amet.";
        /* Singleton singleton = new Singleton() diyemezsin çünkü cosntructor private */
        Singleton singleton = Singleton.getInstance(); //Diyerek 1 kere newlenmesini sağlıyoruz bunu tekrar yazsam da newlenemez!
        singleton.setTasinacakVeri(veri);
        /*Aynı işlemi başka classta da yaparak bu sefer getTasinacakVeri'yi kullanarak alabilrim...*/
    }
}