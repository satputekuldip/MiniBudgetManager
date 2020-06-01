package dev.kuldip.budget.manager.di.component;

import dev.kuldip.budget.manager.di.PerService;
import dev.kuldip.budget.manager.di.module.ServiceModule;
import dev.kuldip.budget.manager.service.SyncService;

import dagger.Component;

/**
 * Created by Kuldip on 01/02/17.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

    void inject(SyncService service);

}
