package com.alejoestevez.dagger2.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//Esta clase define variables y métodos que proveen dependencias.
@Module
public class AppModule {

    private Application application;

    //Constructor de la clase, que se le inyecta la aplicación.
    public AppModule(Application application) {
        this.application = application;
    }

    //Método proveedor de dependencias
    @Provides
    @Singleton
    public Application provideApplication(){ return this.application; }

}
