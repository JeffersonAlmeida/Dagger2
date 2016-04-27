package com.example.jeffersonalmeida.dagger2;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jeffersonalmeida.dagger2.modules.MyApp;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ( (MyApp) getApplication() ).getNetComponent().inject(this);

        sharedPreferences.edit().putString("a", "a").apply();
        String string = sharedPreferences.getString("a", "default");

        Log.d("string", string);

    }

}
