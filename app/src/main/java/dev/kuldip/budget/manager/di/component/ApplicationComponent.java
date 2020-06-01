package dev.kuldip.budget.manager.di.component;

import android.app.Application;
import android.content.Context;

import dev.kuldip.budget.manager.BudgetApp;
import dev.kuldip.budget.manager.data.DataManager;
import dev.kuldip.budget.manager.di.ApplicationContext;
import dev.kuldip.budget.manager.di.module.ApplicationModule;
import dev.kuldip.budget.manager.service.SyncService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Kuldip on 27/01/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BudgetApp app);

    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}