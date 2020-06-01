package dev.kuldip.budget.manager.ui.feed;

import dev.kuldip.budget.manager.data.DataManager;
import dev.kuldip.budget.manager.ui.base.BasePresenter;
import dev.kuldip.budget.manager.ui.base.MvpView;
import dev.kuldip.budget.manager.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Kuldip on 25/05/17.
 */

public class FeedPresenter<V extends MvpView> extends BasePresenter<V> implements
        FeedMvpPresenter<V> {

    private static final String TAG = "FeedPresenter";

    @Inject
    public FeedPresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
