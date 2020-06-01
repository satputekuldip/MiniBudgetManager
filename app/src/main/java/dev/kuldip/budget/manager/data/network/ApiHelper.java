package dev.kuldip.budget.manager.data.network;

import dev.kuldip.budget.manager.data.network.model.BlogResponse;
import dev.kuldip.budget.manager.data.network.model.LoginRequest;
import dev.kuldip.budget.manager.data.network.model.LoginResponse;
import dev.kuldip.budget.manager.data.network.model.LogoutResponse;
import dev.kuldip.budget.manager.data.network.model.OpenSourceResponse;

import io.reactivex.Single;

/**
 * Created by Kuldip on 27/01/17.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}
