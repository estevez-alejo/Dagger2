package com.alejoestevez.dagger2;

import android.app.Application;

import com.alejoestevez.dagger2.di.component.AppComponent;
import com.alejoestevez.dagger2.di.component.DaggerAppComponent;
import com.alejoestevez.dagger2.di.module.AppModule;

//Clase Aplicación acesible por Dagger para construir el grafo de dependencias.
// Extiende de Aplication.
public class App extends Application
{
    private AppComponent appComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();

        //Inicializamos el componente de la aplicación,
        // creando una instancia del módulo que utiliza la aplicación,
        // el cual requiere por parametro el contexto de la aplicación, en nuestro caso this
        appComponent= DaggerAppComponent
                      .builder()
                      .appModule(new AppModule(this))
                      .build();
    }

    //Método getter del componente utilizado por la acplicación
    // para ser llamado desde la activity a la hora de inyectar.
    public AppComponent getAppComponent(){ return this.appComponent; }
}
