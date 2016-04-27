package com.example.jeffersonalmeida.dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.jeffersonalmeida.dagger2.modules.MyApp;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ((MyApp) getApplication()).getNetComponent().inject(this);

        sharedPreferences.edit().putString("dagger", "Dagger works fine").apply();
        String string = sharedPreferences.getString("dagger", "?");

        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(string);

    }

}
