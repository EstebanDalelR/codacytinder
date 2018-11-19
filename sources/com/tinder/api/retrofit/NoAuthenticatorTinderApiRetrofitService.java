package com.tinder.api.retrofit;

import com.tinder.api.model.auth.AccountKitValidateRequest;
import com.tinder.api.model.auth.LogoutRequestBody;
import io.reactivex.C3956a;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface NoAuthenticatorTinderApiRetrofitService {
    @POST("/v2/auth/logout")
    C3956a logout(@Body LogoutRequestBody logoutRequestBody);

    @POST("v2/auth/validate")
    C3956a validateSMSWithAccountKit(@Body AccountKitValidateRequest accountKitValidateRequest);
}
