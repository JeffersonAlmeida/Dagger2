package com.example.jeffersonalmeida.dagger2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jeffersonalmeida.dagger2.Model.Arroz;
import com.example.jeffersonalmeida.dagger2.Model.Feijao;
import com.example.jeffersonalmeida.dagger2.MyApp;
import com.example.jeffersonalmeida.dagger2.R;

import javax.inject.Inject;

public class ThirdActivity extends AppCompatActivity {

    @Inject
    Arroz arroz;

    @Inject
    Feijao feijao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        MyApp.get().getAllComponents().inject(this);
    }
}
