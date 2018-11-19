package com.tinder.smsauth.data.api;

import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/tinder/smsauth/data/api/SmsAuthService;", "", "requestOneTimePassword", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse;", "authType", "", "body", "Lcom/tinder/smsauth/data/api/RequestOneTimePasswordBody;", "verifyOneTimePassword", "Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse;", "Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordBody;", "data"}, k = 1, mv = {1, 1, 10})
public interface SmsAuthService {
    @NotNull
    @POST("v2/auth/sms/send")
    C3960g<Response<RequestOneTimePasswordResponse>> requestOneTimePassword(@NotNull @Query("auth_type") String str, @NotNull @Body RequestOneTimePasswordBody requestOneTimePasswordBody);

    @NotNull
    @POST("v2/auth/sms/validate")
    C3960g<Response<VerifyOneTimePasswordResponse>> verifyOneTimePassword(@NotNull @Query("auth_type") String str, @NotNull @Body VerifyOneTimePasswordBody verifyOneTimePasswordBody);
}
