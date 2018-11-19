package com.tinder.spotify.api;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface AdjustClient {
    @GET("{android_tracker_id}")
    @Headers({"User-Agent: TinderAndroid"})
    Observable<Void> logSpotifyUserAttribution(@Path("android_tracker_id") String str, @Query("gps_adid") String str2, @Query("deep_link") String str3);
}
