package dev.kuldip.budget.manager.di.module;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import dev.kuldip.budget.manager.data.network.model.BlogResponse;
import dev.kuldip.budget.manager.data.network.model.OpenSourceResponse;
import dev.kuldip.budget.manager.di.ActivityContext;
import dev.kuldip.budget.manager.di.PerActivity;
import dev.kuldip.budget.manager.ui.about.AboutMvpPresenter;
import dev.kuldip.budget.manager.ui.about.AboutMvpView;
import dev.kuldip.budget.manager.ui.about.AboutPresenter;
import dev.kuldip.budget.manager.ui.feed.FeedMvpPresenter;
import dev.kuldip.budget.manager.ui.feed.FeedMvpView;
import dev.kuldip.budget.manager.ui.feed.FeedPagerAdapter;
import dev.kuldip.budget.manager.ui.feed.FeedPresenter;
import dev.kuldip.budget.manager.ui.feed.blogs.BlogAdapter;
import dev.kuldip.budget.manager.ui.feed.blogs.BlogMvpPresenter;
import dev.kuldip.budget.manager.ui.feed.blogs.BlogMvpView;
import dev.kuldip.budget.manager.ui.feed.blogs.BlogPresenter;
import dev.kuldip.budget.manager.ui.feed.opensource.OpenSourceAdapter;
import dev.kuldip.budget.manager.ui.feed.opensource.OpenSourceMvpPresenter;
import dev.kuldip.budget.manager.ui.feed.opensource.OpenSourceMvpView;
import dev.kuldip.budget.manager.ui.feed.opensource.OpenSourcePresenter;
import dev.kuldip.budget.manager.ui.login.LoginMvpPresenter;
import dev.kuldip.budget.manager.ui.login.LoginMvpView;
import dev.kuldip.budget.manager.ui.login.LoginPresenter;
import dev.kuldip.budget.manager.ui.main.MainMvpPresenter;
import dev.kuldip.budget.manager.ui.main.MainMvpView;
import dev.kuldip.budget.manager.ui.main.MainPresenter;
import dev.kuldip.budget.manager.ui.main.rating.RatingDialogMvpPresenter;
import dev.kuldip.budget.manager.ui.main.rating.RatingDialogMvpView;
import dev.kuldip.budget.manager.ui.main.rating.RatingDialogPresenter;
import dev.kuldip.budget.manager.ui.splash.SplashMvpPresenter;
import dev.kuldip.budget.manager.ui.splash.SplashMvpView;
import dev.kuldip.budget.manager.ui.splash.SplashPresenter;
import dev.kuldip.budget.manager.utils.rx.AppSchedulerProvider;
import dev.kuldip.budget.manager.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Kuldip on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
