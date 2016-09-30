package com.example.jeffersonalmeida.dagger2.modules;

import com.example.jeffersonalmeida.dagger2.Model.Arroz;

import dagger.Module;
import dagger.Provides;

@Module
public class ArrozModule {

    String tipo;

    public ArrozModule(String tipo) {
        this.tipo = tipo;
    }

    @Provides
    public Arroz providesArroz(){
        return new Arroz(tipo);
    }

}
