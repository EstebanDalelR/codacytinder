package com.tinder.auth.repository;

import com.tinder.auth.model.p169a.C8284a;
import com.tinder.auth.model.p169a.C8285b;
import com.tinder.model.network.DataResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface AccountService {
    @POST("v2/auth/email")
    Observable<Response<DataResponse<Void>>> updateEmail(@Body C8284a c8284a);

    @POST("v2/auth/password")
    Observable<Response<DataResponse<Void>>> updatePassword(@Body C8285b c8285b);
}
