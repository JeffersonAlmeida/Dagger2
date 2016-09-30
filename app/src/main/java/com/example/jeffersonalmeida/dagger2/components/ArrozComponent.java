package com.example.jeffersonalmeida.dagger2.components;

import com.example.jeffersonalmeida.dagger2.Model.Arroz;
import com.example.jeffersonalmeida.dagger2.modules.ArrozModule;

import dagger.Component;

@Component( dependencies = ArrozModule.class )
public interface ArrozComponent {

    Arroz providesArroz();

//    void inject (ForthActivity forthActivity);

}
