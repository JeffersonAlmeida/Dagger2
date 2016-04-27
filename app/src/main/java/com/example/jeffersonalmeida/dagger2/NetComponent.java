package com.example.jeffersonalmeida.dagger2;

import com.example.jeffersonalmeida.dagger2.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jeffersonalmeida on 3/1/16.
 */

@Singleton
@Component( modules = NetModule.class )
public interface NetComponent {

    public void inject (MainActivity mainActivity);

}
