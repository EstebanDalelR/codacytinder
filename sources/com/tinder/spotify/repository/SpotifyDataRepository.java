package com.tinder.spotify.repository;

import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.model.SpotifyConnectResponse;
import java.util.List;
import java.util.Map;
import retrofit2.Response;
import rx.Observable;

public interface SpotifyDataRepository {
    Observable<SpotifyConnectResponse> connectSpotifyToServer(String str);

    Observable<Void> disconnectToSpotify();

    Observable<List<SearchTrack>> getSpotifyPopularTracks();

    Observable<List<Artist>> loadTopArtists();

    Observable<List<SearchTrack>> loadTracksForSearch(String str, int i);

    void logSpotifyMauData(String str, String str2, String str3, String str4, boolean z, String str5);

    Observable<Void> logUserAttribution(String str, String str2);

    Observable<List<Artist>> reloadTracks();

    Observable<Response<Map>> saveThemeTrack(SearchTrack searchTrack);

    Observable<Void> saveTopArtistsSelection(List<Artist> list);

    Observable<Void> setNoThemeSong();
}
