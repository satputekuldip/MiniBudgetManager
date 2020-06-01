package dev.kuldip.budget.manager.ui.about;

import dev.kuldip.budget.manager.data.DataManager;
import dev.kuldip.budget.manager.ui.base.BasePresenter;
import dev.kuldip.budget.manager.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Kuldip on 27/01/17.
 */

public class AboutPresenter<V extends AboutMvpView> extends BasePresenter<V>
        implements AboutMvpPresenter<V> {

    @Inject
    public AboutPresenter(DataManager dataManager,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
