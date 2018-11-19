package com.tinder.auth.repository;

import com.tinder.model.auth.network.AccountKitValidateRequest;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthResponse2;
import com.tinder.model.auth.network.ValidateResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

public interface AuthService {
    @POST("v2/auth/login/{authType}")
    Observable<Response<AuthResponse2>> authenticate(@Header("app-session") String str, @Header("install-id") String str2, @Path("authType") String str3, @Body AuthRequest authRequest);

    @POST("v2/auth/validate")
    Observable<Response<ValidateResponse>> validateSMSWithAccountKit(@Body AccountKitValidateRequest accountKitValidateRequest);
}
