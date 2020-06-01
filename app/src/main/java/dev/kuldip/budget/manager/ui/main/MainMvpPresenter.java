package dev.kuldip.budget.manager.ui.main;


import dev.kuldip.budget.manager.di.PerActivity;
import dev.kuldip.budget.manager.ui.base.MvpPresenter;

/**
 * Created by Kuldip on 27/01/17.
 */

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void onDrawerOptionAboutClick();

    void onDrawerOptionLogoutClick();

    void onDrawerRateUsClick();

    void onDrawerMyFeedClick();

    void onNavMenuCreated();
}
