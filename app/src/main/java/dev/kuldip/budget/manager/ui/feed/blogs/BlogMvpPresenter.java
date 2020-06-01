package dev.kuldip.budget.manager.ui.feed.blogs;

import dev.kuldip.budget.manager.ui.base.MvpPresenter;

/**
 * Created by Kuldip on 25/05/17.
 */

public interface BlogMvpPresenter<V extends BlogMvpView>
        extends MvpPresenter<V> {

    void onViewPrepared();
}


