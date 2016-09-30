package com.example.jeffersonalmeida.dagger2.modules;

import com.example.jeffersonalmeida.dagger2.Model.Feijao;

import dagger.Module;
import dagger.Provides;

@Module
public class FeijaoModule {

    String tipo;

    public FeijaoModule(String tipo) {
        this.tipo = tipo;
    }

    @Provides
    public Feijao provideFeijao(){
        return new Feijao(tipo);
    }

}
