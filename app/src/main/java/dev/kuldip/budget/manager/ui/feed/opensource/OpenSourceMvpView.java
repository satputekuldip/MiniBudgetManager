package dev.kuldip.budget.manager.ui.feed.opensource;

import dev.kuldip.budget.manager.data.network.model.OpenSourceResponse;
import dev.kuldip.budget.manager.ui.base.MvpView;

import java.util.List;

/**
 * Created by Kuldip on 25/05/17.
 */

public interface OpenSourceMvpView extends MvpView {

    void updateRepo(List<OpenSourceResponse.Repo> repoList);
}
