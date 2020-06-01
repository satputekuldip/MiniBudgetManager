package dev.kuldip.budget.manager.ui.login;


import dev.kuldip.budget.manager.di.PerActivity;
import dev.kuldip.budget.manager.ui.base.MvpPresenter;

/**
 * Created by Kuldip on 27/01/17.
 */

@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void onServerLoginClick(String email, String password);

    void onGoogleLoginClick();

    void onFacebookLoginClick();

}
