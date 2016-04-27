package com.example.jeffersonalmeida.dagger2.modules;

import android.app.Application;

import com.example.jeffersonalmeida.dagger2.DaggerNetComponent;
import com.example.jeffersonalmeida.dagger2.NetComponent;

/**
 * Created by jeffersonalmeida on 3/1/16.
 */
public class MyApp extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent
                .builder()
                .netModule(new NetModule(this))
                .build();

    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
