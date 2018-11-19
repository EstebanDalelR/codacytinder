package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.network.DataResponse;
import com.tinder.onboarding.model.network.FieldsResponse;
import com.tinder.onboarding.model.network.UpdateFieldsRequest;
import java.util.List;
import okhttp3.C17690n.C15960b;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import rx.Observable;

public interface OnboardingService {
    @POST("v2/onboarding/complete")
    Observable<Response<DataResponse<Void>>> completeUser(@Header("token") String str, @Header("install-id") String str2);

    @DELETE("v2/onboarding/user")
    Observable<Response<DataResponse<Void>>> deleteUser(@Header("token") String str);

    @GET("v2/onboarding/fields")
    Observable<Response<FieldsResponse>> getUserFields(@Header("token") String str, @Query("requested") List<String> list);

    @POST("v2/onboarding/fields")
    Observable<Response<FieldsResponse>> updateUserFields(@Header("token") String str, @Query("requested") List<String> list, @Body UpdateFieldsRequest updateFieldsRequest);

    @POST("v2/onboarding/photo")
    @Multipart
    Observable<Response<FieldsResponse>> updateUserPhoto(@Header("token") String str, @Query("requested") List<String> list, @Part C15960b c15960b);
}
