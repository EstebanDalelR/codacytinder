package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.core.models.UserDataResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface LoginClient {
    @GET("/v1/me")
    void fetchUserData(@Query("query") String str, @Query("variables") String str2, Callback<UserDataResponse> callback);
}
