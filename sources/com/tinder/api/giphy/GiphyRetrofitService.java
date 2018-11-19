package com.tinder.api.giphy;

import io.reactivex.C3960g;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface GiphyRetrofitService {
    @GET("v1/gifs/search")
    C3960g<GiphyApiResponse> search(@Query("q") String str, @Query("rating") String str2, @Query("api_key") String str3, @Query("lang") String str4);

    @GET("v1/gifs/search?q=flirting")
    C3960g<GiphyApiResponse> trending(@Query("rating") String str, @Query("api_key") String str2, @Query("lang") String str3);
}
