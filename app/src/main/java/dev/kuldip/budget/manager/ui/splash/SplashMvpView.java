package dev.kuldip.budget.manager.ui.splash;

import dev.kuldip.budget.manager.ui.base.MvpView;

/**
 * Created by Kuldip on 27/01/17.
 */

public interface SplashMvpView extends MvpView {

    void openLoginActivity();

    void openMainActivity();

    void startSyncService();
}
