package dev.kuldip.budget.manager.di.module;

import android.app.Application;
import android.content.Context;

import dev.kuldip.budget.manager.BuildConfig;
import dev.kuldip.budget.manager.R;
import dev.kuldip.budget.manager.data.AppDataManager;
import dev.kuldip.budget.manager.data.DataManager;
import dev.kuldip.budget.manager.data.db.AppDbHelper;
import dev.kuldip.budget.manager.data.db.DbHelper;
import dev.kuldip.budget.manager.data.network.ApiHeader;
import dev.kuldip.budget.manager.data.network.ApiHelper;
import dev.kuldip.budget.manager.data.network.AppApiHelper;
import dev.kuldip.budget.manager.data.prefs.AppPreferencesHelper;
import dev.kuldip.budget.manager.data.prefs.PreferencesHelper;
import dev.kuldip.budget.manager.di.ApiInfo;
import dev.kuldip.budget.manager.di.ApplicationContext;
import dev.kuldip.budget.manager.di.DatabaseInfo;
import dev.kuldip.budget.manager.di.PreferenceInfo;
import dev.kuldip.budget.manager.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by amitshekhar on 03/02/17.
 */
@Module
public class ApplicationTestModule {

    private final Application mApplication;

    public ApplicationTestModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    // TODO : Mock all below for UI testing

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}
