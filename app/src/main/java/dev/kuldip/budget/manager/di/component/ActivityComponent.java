package dev.kuldip.budget.manager.di.component;

import dev.kuldip.budget.manager.di.PerActivity;
import dev.kuldip.budget.manager.di.module.ActivityModule;
import dev.kuldip.budget.manager.ui.about.AboutFragment;
import dev.kuldip.budget.manager.ui.feed.FeedActivity;
import dev.kuldip.budget.manager.ui.feed.blogs.BlogFragment;
import dev.kuldip.budget.manager.ui.feed.opensource.OpenSourceFragment;
import dev.kuldip.budget.manager.ui.login.LoginActivity;
import dev.kuldip.budget.manager.ui.main.MainActivity;
import dev.kuldip.budget.manager.ui.main.rating.RateUsDialog;
import dev.kuldip.budget.manager.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by Kuldip on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

}
