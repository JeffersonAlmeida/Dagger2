package com.example.jeffersonalmeida.dagger2;

import android.app.Application;

import com.example.jeffersonalmeida.dagger2.components.DaggerNetComponent;
import com.example.jeffersonalmeida.dagger2.components.NetComponent;
import com.example.jeffersonalmeida.dagger2.modules.NetModule;

public class MyApp extends Application {

    private static MyApp application;

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent
                .builder()
                .netModule(new NetModule(this))
                .build();

        application = this;

    }

    public static synchronized MyApp get(){
        return application;
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
