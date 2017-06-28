package com.alextavella.fiap_android_metrosp;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by alextavella on 26/06/17.
 */

public class MetroApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
