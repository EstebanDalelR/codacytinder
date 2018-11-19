package com.tinder.spotify.api;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

public interface SpotifyLogMauApiClient {
    @GET("/v1/track")
    @Headers({"User-Agent: TinderAndroid"})
    Observable<Void> logMauToSpotify(@Query("type") String str, @Query("client-id") String str2, @Query("external-user-id") String str3, @Query("preview-url") String str4, @Query("track-id") String str5, @Query("spotify-user") boolean z, @Query("event-type") String str6);
}
