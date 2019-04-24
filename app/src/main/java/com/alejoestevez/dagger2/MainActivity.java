package com.alejoestevez.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Debemos inyectar la activity principal que usa el componente, para ello,
        // obtenemos el componente utilizado y le inyectamos la activity.
        ((App)getApplication()).getAppComponent().inject(this);
    }
}
