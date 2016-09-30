package com.example.jeffersonalmeida.dagger2.components;

import com.example.jeffersonalmeida.dagger2.activity.MainActivity;
import com.example.jeffersonalmeida.dagger2.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = NetModule.class )
public interface NetComponent {

    void inject (MainActivity mainActivity);

}
