package com.tinder.api;

import com.tinder.boost.model.C10428i;
import com.tinder.model.DiscountPaywallViewResponse;
import com.tinder.model.ProfileResponse;
import com.tinder.model.network.DataResponse;
import com.tinder.passport.model.C10043a;
import com.tinder.settings.model.C14894a;
import com.tinder.spotify.model.C15052a;
import com.tinder.spotify.model.SpotifyConnectResponse;
import com.tinder.spotify.model.SpotifyPopularResponse;
import com.tinder.spotify.model.SpotifySearchResponse;
import java.util.List;
import java.util.Map;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.Observable;

public interface TinderApiClient {
    @POST("boost")
    Observable<Response<C10428i>> activateBoost();

    @DELETE("/v2/profile/spotify/theme")
    Observable<Void> deleteThemeSong();

    @DELETE("/v2/profile/spotify")
    Observable<Void> disconnectSpotify();

    @POST("purchase/discount/view")
    Observable<DiscountPaywallViewResponse> discountPaywallViewed(@Body Map<String, String> map);

    @GET("boost/result")
    Observable<Void> getBoostResult();

    @GET("/location/popular")
    Observable<Response<C10043a>> getPopularLocations(@Query("locale") String str);

    @GET("/v2/profile/spotify/popular")
    Observable<SpotifyPopularResponse> getSpotifyPopularTracks();

    @GET("/v2/profile")
    Observable<Response<ProfileResponse>> loadUserProfileIncluding(@Query("include") String str);

    @POST("/v2/profile/spotify/resync")
    Observable<C15052a<SpotifyConnectResponse>> reloadTracks();

    @POST("/profile")
    Observable<Response<Void>> saveGender(@Body C14894a c14894a);

    @GET("/location/search")
    Observable<C10043a> searchLocation(@Query("locale") String str, @Query("s") String str2);

    @GET("/v2/profile/spotify/search")
    Observable<DataResponse<SpotifySearchResponse>> searchTracks(@Query("q") String str, @Query("type") String str2, @Query("limit") int i, @Query("offset") int i2);

    @PUT("/v2/profile/spotify/theme")
    Observable<Response<Map>> setThemeTrack(@Body Map map);

    @POST("/v2/profile/spotify/sync")
    Observable<C15052a<SpotifyConnectResponse>> spotifyConnect(@Body Map<String, String> map);

    @POST("/v2/profile/spotify/artists")
    Observable<Void> updateArtist(@Body Map<String, List> map);
}
