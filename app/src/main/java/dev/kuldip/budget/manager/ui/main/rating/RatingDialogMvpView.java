package dev.kuldip.budget.manager.ui.main.rating;

import dev.kuldip.budget.manager.ui.base.DialogMvpView;

/**
 * Created by Kuldip on 24/05/17.
 */

public interface RatingDialogMvpView extends DialogMvpView {

    void openPlayStoreForRating();

    void showPlayStoreRatingView();

    void showRatingMessageView();

    void hideSubmitButton();

    void disableRatingStars();

    void dismissDialog();
}
