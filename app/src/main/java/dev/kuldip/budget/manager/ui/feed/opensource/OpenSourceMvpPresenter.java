package dev.kuldip.budget.manager.ui.feed.opensource;

import dev.kuldip.budget.manager.ui.base.MvpPresenter;

/**
 * Created by Kuldip on 25/05/17.
 */

public interface OpenSourceMvpPresenter<V extends OpenSourceMvpView>
        extends MvpPresenter<V> {

    void onViewPrepared();
}
