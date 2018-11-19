package com.tinder.spotify.repository;

import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.DefaultObserver;
import com.tinder.model.User;
import com.tinder.spotify.api.AdjustClient;
import com.tinder.spotify.api.SpotifyLogMauApiClient;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.C15052a;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.model.SpotifyConnectResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import retrofit2.Response;
import rx.Observable;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.repository.a */
public class C16860a implements SpotifyDataRepository {
    /* renamed from: a */
    private final TinderApiClient f51948a;
    /* renamed from: b */
    private final ManagerProfile f51949b;
    /* renamed from: c */
    private final AdjustClient f51950c;
    /* renamed from: d */
    private final SpotifyLogMauApiClient f51951d;

    /* renamed from: com.tinder.spotify.repository.a$1 */
    class C181711 extends DefaultObserver<Void> {
        /* renamed from: a */
        final /* synthetic */ C16860a f56364a;

        /* renamed from: a */
        public void m65933a(Void voidR) {
        }

        C181711(C16860a c16860a) {
            this.f56364a = c16860a;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65933a((Void) obj);
        }

        public void onError(Throwable th) {
            super.onError(th);
        }
    }

    @Inject
    public C16860a(TinderApiClient tinderApiClient, ManagerProfile managerProfile, AdjustClient adjustClient, SpotifyLogMauApiClient spotifyLogMauApiClient) {
        this.f51949b = managerProfile;
        this.f51948a = tinderApiClient;
        this.f51950c = adjustClient;
        this.f51951d = spotifyLogMauApiClient;
    }

    public Observable<Response<Map>> saveThemeTrack(SearchTrack searchTrack) {
        Map hashMap = new HashMap();
        hashMap.put("id", searchTrack.getId());
        return this.f51948a.setThemeTrack(hashMap).b(Schedulers.io()).a(C19397a.a()).k(new C18172b(this, searchTrack));
    }

    /* renamed from: a */
    final /* synthetic */ Response m62422a(SearchTrack searchTrack, Response response) {
        User c = this.f51949b.c();
        this.f51949b.a(c.isSpotifyConnected(), new SearchTrack(searchTrack.getId(), searchTrack.getName(), searchTrack.getAlbum(), searchTrack.getArtist(), false, 0, searchTrack.getPreviewUrl(), searchTrack.getSpotifyUri()), c.getSpotifyTopArtists(), c.getSpotifyLastUpdatedAt(), c.getSpotifyUserName(), c.getSpotifyUserType());
        return response;
    }

    public Observable<Void> saveTopArtistsSelection(List<Artist> list) {
        return this.f51948a.updateArtist(m62418a((List) list)).k(new C18173c(this, list));
    }

    /* renamed from: a */
    final /* synthetic */ Void m62420a(List list, Void voidR) {
        User c = this.f51949b.c();
        this.f51949b.a(c.isSpotifyConnected(), c.getSpotifyThemeTrack(), list, c.getSpotifyLastUpdatedAt(), c.getSpotifyUserName(), c.getSpotifyUserType());
        return voidR;
    }

    /* renamed from: a */
    private Map<String, List> m62418a(List<Artist> list) {
        List arrayList = new ArrayList();
        for (Artist artist : list) {
            Map hashMap = new HashMap();
            hashMap.put("id", artist.getId());
            hashMap.put(ManagerWebServices.PARAM_SELECTED, Boolean.valueOf(artist.isSelected()));
            arrayList.add(hashMap);
        }
        list = new HashMap();
        list.put(ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS, arrayList);
        return list;
    }

    public Observable<SpotifyConnectResponse> connectSpotifyToServer(String str) {
        Map hashMap = new HashMap();
        hashMap.put("auth_code", str);
        hashMap.put(QueryParams.REDIRECT_URI, ManagerWebServices.REDIRECT_URI);
        return this.f51948a.spotifyConnect(hashMap).k(new C18174d(this));
    }

    /* renamed from: b */
    final /* synthetic */ SpotifyConnectResponse m62423b(C15052a c15052a) {
        if (c15052a != null) {
            SpotifyConnectResponse spotifyConnectResponse = (SpotifyConnectResponse) c15052a.m56729a();
            this.f51949b.a(true, spotifyConnectResponse.m56718b(), spotifyConnectResponse.m56717a(), spotifyConnectResponse.m56719c(), spotifyConnectResponse.m56721e(), spotifyConnectResponse.m56720d());
        }
        if (c15052a.m56729a() == null) {
            return null;
        }
        return (SpotifyConnectResponse) c15052a.m56729a();
    }

    public Observable<List<Artist>> loadTopArtists() {
        return this.f51949b.e().k(C18175e.f56370a);
    }

    /* renamed from: a */
    static final /* synthetic */ List m62415a(User user) {
        if (user == null) {
            return Collections.emptyList();
        }
        return user.getSpotifyTopArtists();
    }

    public Observable<List<Artist>> reloadTracks() {
        return this.f51948a.reloadTracks().k(new C18176f(this));
    }

    /* renamed from: a */
    final /* synthetic */ List m62421a(C15052a c15052a) {
        SearchTrack searchTrack;
        User c = this.f51949b.c();
        SpotifyConnectResponse spotifyConnectResponse = (SpotifyConnectResponse) c15052a.m56729a();
        ManagerProfile managerProfile = this.f51949b;
        if (c == null) {
            searchTrack = null;
        } else {
            searchTrack = c.getSpotifyThemeTrack();
        }
        managerProfile.a(true, searchTrack, spotifyConnectResponse.m56717a(), spotifyConnectResponse.m56719c(), c.getSpotifyUserName(), spotifyConnectResponse.m56720d());
        return spotifyConnectResponse.m56717a();
    }

    public Observable<List<SearchTrack>> getSpotifyPopularTracks() {
        return this.f51948a.getSpotifyPopularTracks().k(C18177g.f56372a);
    }

    public Observable<List<SearchTrack>> loadTracksForSearch(String str, int i) {
        return this.f51948a.searchTracks(str, "track", 20, i).k(C18178h.f56373a);
    }

    public Observable<Void> disconnectToSpotify() {
        return this.f51948a.disconnectSpotify().k(new C18179i(this));
    }

    /* renamed from: b */
    final /* synthetic */ Void m62424b(Void voidR) {
        this.f51949b.a(false, this.f51949b.c().getSpotifyThemeTrack(), null, null, null, null);
        return voidR;
    }

    public Observable<Void> setNoThemeSong() {
        return this.f51948a.deleteThemeSong().k(new C18180j(this));
    }

    /* renamed from: a */
    final /* synthetic */ Void m62419a(Void voidR) {
        User c = this.f51949b.c();
        this.f51949b.a(c.isSpotifyConnected(), null, c.getSpotifyTopArtists(), c.getSpotifyLastUpdatedAt(), c.getSpotifyUserName(), c.getSpotifyUserType());
        return voidR;
    }

    public Observable<Void> logUserAttribution(String str, String str2) {
        String str3 = "spotify:track:%s";
        Object[] objArr = new Object[1];
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        return this.f51950c.logSpotifyUserAttribution("qcmrr2", str, String.format(str3, objArr));
    }

    public void logSpotifyMauData(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f51951d.logMauToSpotify(str, "b06a803d686e4612bdc074e786e94062", str2, str3, str4, z, str5).b(Schedulers.io()).a(new C181711(this));
    }
}
