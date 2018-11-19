package com.tinder.api.buckets;

import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/buckets/BucketsService;", "", "loadExperiments", "Lio/reactivex/Single;", "Lcom/tinder/api/buckets/BucketsResponse;", "bucketsRequestBody", "Lcom/tinder/api/buckets/BucketsRequestBody;", "api_release"}, k = 1, mv = {1, 1, 10})
public interface BucketsService {
    @NotNull
    @POST("/v2/buckets")
    @Headers({"platform: android"})
    C3960g<BucketsResponse> loadExperiments(@NotNull @Body BucketsRequestBody bucketsRequestBody);
}
