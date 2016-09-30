package com.example.jeffersonalmeida.dagger2;

import android.app.Application;

import com.example.jeffersonalmeida.dagger2.components.AllComponents;
import com.example.jeffersonalmeida.dagger2.components.ArrozComponent;
import com.example.jeffersonalmeida.dagger2.components.DaggerAllComponents;
import com.example.jeffersonalmeida.dagger2.components.DaggerArrozComponent;
import com.example.jeffersonalmeida.dagger2.components.DaggerFeijaoComponent;
import com.example.jeffersonalmeida.dagger2.components.DaggerNetComponent;
import com.example.jeffersonalmeida.dagger2.components.FeijaoComponent;
import com.example.jeffersonalmeida.dagger2.components.NetComponent;
import com.example.jeffersonalmeida.dagger2.modules.ArrozModule;
import com.example.jeffersonalmeida.dagger2.modules.FeijaoModule;
import com.example.jeffersonalmeida.dagger2.modules.NetModule;

public class MyApp extends Application {

    private static MyApp application;

    private NetComponent netComponent;
    private ArrozComponent arrozComponent;
    private FeijaoComponent feijaoComponent;
    private AllComponents allComponents;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent
                .builder()
                .netModule(new NetModule(this))
                .build();

        feijaoComponent = DaggerFeijaoComponent.builder()
                .feijaoModule(new FeijaoModule("TIPO 1"))
                .build();

        arrozComponent = DaggerArrozComponent.builder()
                .arrozModule(new ArrozModule("Tio João"))
                .build();

        allComponents = DaggerAllComponents.builder()
                .arrozComponent(arrozComponent)
                .feijaoComponent(feijaoComponent)
                .build();

        application = this;

    }

    public static synchronized MyApp get(){
        return application;
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }

    public ArrozComponent getArrozComponent() {
        return arrozComponent;
    }

    public FeijaoComponent getFeijaoComponent() {
        return feijaoComponent;
    }

    public AllComponents getAllComponents() {
        return allComponents;
    }
}
