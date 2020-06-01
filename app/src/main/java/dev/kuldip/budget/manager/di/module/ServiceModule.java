package dev.kuldip.budget.manager.di.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by Kuldip on 01/02/17.
 */

@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}
