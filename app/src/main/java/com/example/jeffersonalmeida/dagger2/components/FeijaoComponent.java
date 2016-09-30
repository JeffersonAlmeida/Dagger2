package com.example.jeffersonalmeida.dagger2.components;

import com.example.jeffersonalmeida.dagger2.Model.Feijao;
import com.example.jeffersonalmeida.dagger2.activity.ForthActivity;
import com.example.jeffersonalmeida.dagger2.modules.FeijaoModule;

import dagger.Component;

@Component( dependencies = FeijaoModule.class )
public interface FeijaoComponent {

    Feijao provideFeijao();

    void inject (ForthActivity forthActivity);

}
