package com.alejoestevez.dagger2.di.component;

import com.alejoestevez.dagger2.MainActivity;
import com.alejoestevez.dagger2.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    //Las Activity que utilicen el Componente, deberán ser añadidas en esta interfaz
    void inject (MainActivity mainActivity);

}
