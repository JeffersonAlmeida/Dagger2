package com.example.jeffersonalmeida.dagger2.components;

import com.example.jeffersonalmeida.dagger2.activity.SecondActivity;
import com.example.jeffersonalmeida.dagger2.activity.ThirdActivity;

import dagger.Component;

@Component( dependencies = { ArrozComponent.class, FeijaoComponent.class })
public interface AllComponents {

    void inject(SecondActivity secondActivity);
    void inject(ThirdActivity thirdActivity);

}
