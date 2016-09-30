package com.example.jeffersonalmeida.dagger2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jeffersonalmeida.dagger2.Model.Feijao;
import com.example.jeffersonalmeida.dagger2.MyApp;
import com.example.jeffersonalmeida.dagger2.R;

import javax.inject.Inject;

public class ForthActivity extends AppCompatActivity {

    @Inject
    Feijao feijao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        MyApp.get().getFeijaoComponent().inject(this);
    }
}
