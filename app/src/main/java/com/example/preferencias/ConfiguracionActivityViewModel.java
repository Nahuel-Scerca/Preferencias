package com.example.preferencias;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;



public class ConfiguracionActivityViewModel extends AndroidViewModel {
    private Context context;

    public ConfiguracionActivityViewModel(@NonNull Application application) {
        super(application);
        context= application.getApplicationContext();
    }

}
