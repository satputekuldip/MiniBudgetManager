package dev.kuldip.budget.manager.ui.main.rating;

import dev.kuldip.budget.manager.ui.base.MvpPresenter;

/**
 * Created by Kuldip on 22/03/17.
 */

public interface RatingDialogMvpPresenter<V extends RatingDialogMvpView> extends MvpPresenter<V> {

    void onRatingSubmitted(float rating, String message);

    void onCancelClicked();

    void onLaterClicked();

    void onPlayStoreRatingClicked();
}
