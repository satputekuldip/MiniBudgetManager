package dev.kuldip.budget.manager.ui.main;

import dev.kuldip.budget.manager.data.db.model.Question;
import dev.kuldip.budget.manager.ui.base.MvpView;

import java.util.List;

/**
 * Created by Kuldip on 27/01/17.
 */

public interface MainMvpView extends MvpView {

    void openLoginActivity();

    void showAboutFragment();

    void updateUserName(String currentUserName);

    void updateUserEmail(String currentUserEmail);

    void updateUserProfilePic(String currentUserProfilePicUrl);

    void updateAppVersion();

    void showRateUsDialog();

    void openMyFeedActivity();

    void closeNavigationDrawer();

    void lockDrawer();

    void unlockDrawer();
}
