package dev.kuldip.budget.manager.ui.feed.blogs;

import dev.kuldip.budget.manager.data.network.model.BlogResponse;
import dev.kuldip.budget.manager.ui.base.MvpView;

import java.util.List;

/**
 * Created by Kuldip on 25/05/17.
 */

public interface BlogMvpView extends MvpView {

    void updateBlog(List<BlogResponse.Blog> blogList);
}
