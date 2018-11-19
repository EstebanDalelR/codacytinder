package com.tinder.spotify.p415a;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.enums.UserType;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.model.SpotifyConnectResponse;
import com.tinder.spotify.repository.SpotifyDataRepository;
import com.tinder.utils.C15354a;
import com.tinder.utils.C15376y;
import com.tinder.utils.C15377z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import retrofit2.Response;
import rx.Observable;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

@Singleton
/* renamed from: com.tinder.spotify.a.a */
public class C15035a {
    @NonNull
    /* renamed from: a */
    private final PublishSubject<Boolean> f46822a = PublishSubject.w();
    /* renamed from: b */
    private final SpotifyDataRepository f46823b;
    /* renamed from: c */
    private final ManagerProfile f46824c;
    /* renamed from: d */
    private final AbTestUtility f46825d;
    /* renamed from: e */
    private final ManagerAnalytics f46826e;
    /* renamed from: f */
    private final C15354a f46827f;
    /* renamed from: g */
    private final C15377z f46828g;
    /* renamed from: h */
    private String f46829h;
    /* renamed from: i */
    private UserType f46830i;
    /* renamed from: j */
    private boolean f46831j;

    @Inject
    public C15035a(SpotifyDataRepository spotifyDataRepository, ManagerProfile managerProfile, AbTestUtility abTestUtility, ManagerAnalytics managerAnalytics, C15354a c15354a, C15377z c15377z) {
        this.f46823b = spotifyDataRepository;
        this.f46824c = managerProfile;
        this.f46825d = abTestUtility;
        this.f46826e = managerAnalytics;
        this.f46827f = c15354a;
        this.f46828g = c15377z;
    }

    /* renamed from: a */
    public boolean m56667a() {
        return this.f46825d.isSpotifyEnabled();
    }

    /* renamed from: b */
    public Observable<Void> m56671b() {
        return this.f46823b.disconnectToSpotify();
    }

    /* renamed from: a */
    public Observable<SpotifyConnectResponse> m56658a(String str) {
        return this.f46823b.connectSpotifyToServer(str);
    }

    /* renamed from: c */
    public Observable<List<Artist>> m56674c() {
        return this.f46823b.loadTopArtists();
    }

    /* renamed from: a */
    public Observable<Void> m56661a(List<Artist> list) {
        return this.f46823b.saveTopArtistsSelection(list);
    }

    /* renamed from: d */
    public Observable<String> m56677d() {
        return this.f46824c.d().k(C18151b.f56318a);
    }

    /* renamed from: e */
    public Observable<List<Artist>> m56678e() {
        return this.f46823b.reloadTracks();
    }

    /* renamed from: a */
    public Observable<List<SearchTrack>> m56659a(String str, int i) {
        return this.f46823b.loadTracksForSearch(str, i);
    }

    /* renamed from: a */
    public Observable<Response<Map>> m56657a(SearchTrack searchTrack) {
        return this.f46823b.saveThemeTrack(searchTrack);
    }

    /* renamed from: f */
    public Observable<Void> m56679f() {
        return this.f46823b.setNoThemeSong();
    }

    /* renamed from: g */
    public Observable<List<SearchTrack>> m56680g() {
        return this.f46824c.e().h(new C18152c(this));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m56656a(User user) {
        if (m56654c(user)) {
            return Observable.a(new C15036e(this, user));
        }
        return this.f46823b.getSpotifyPopularTracks();
    }

    /* renamed from: b */
    final /* synthetic */ List m56670b(User user) throws Exception {
        return m56653a(user.getSpotifyTopArtists(), false);
    }

    /* renamed from: c */
    private boolean m56654c(User user) {
        return (user.isSpotifyConnected() && user.getSpotifyTopArtists() != null && user.getSpotifyTopArtists().isEmpty() == null) ? true : null;
    }

    @NonNull
    /* renamed from: a */
    private List<SearchTrack> m56653a(List<Artist> list, boolean z) {
        if (list != null) {
            if (!list.isEmpty()) {
                List<SearchTrack> arrayList = new ArrayList(list.size());
                for (Artist artist : list) {
                    SearchTrack topTrack = artist.getTopTrack();
                    if (!z) {
                        arrayList.add(topTrack);
                    } else if (artist.isSelected()) {
                        arrayList.add(topTrack);
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: h */
    public Observable<User> m56681h() {
        return this.f46824c.d();
    }

    @Nullable
    /* renamed from: i */
    public User m56682i() {
        return this.f46824c.c();
    }

    /* renamed from: j */
    public boolean m56683j() {
        User i = m56682i();
        return i != null && i.isSpotifyConnected();
    }

    /* renamed from: q */
    private List<Artist> m56655q() {
        if (m56682i() == null) {
            return Collections.emptyList();
        }
        List<Artist> spotifyTopArtists = m56682i().getSpotifyTopArtists();
        if (spotifyTopArtists == null) {
            spotifyTopArtists = Collections.emptyList();
        }
        return spotifyTopArtists;
    }

    @Nullable
    /* renamed from: k */
    public SearchTrack m56684k() {
        User i = m56682i();
        if (i == null) {
            return null;
        }
        return i.getSpotifyThemeTrack();
    }

    /* renamed from: l */
    public void m56685l() {
        User c = this.f46824c.c();
        if (c != null) {
            this.f46824c.a(c.isSpotifyConnected(), c.getSpotifyThemeTrack(), c.getSpotifyTopArtists(), c.getSpotifyLastUpdatedAt(), c.getSpotifyUserName(), c.getSpotifyUserType());
        }
    }

    /* renamed from: b */
    public String m56669b(SearchTrack searchTrack) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        if (searchTrack == null || searchTrack.getArtist() == null || searchTrack.getArtist().isEmpty()) {
            searchTrack = str;
        } else {
            searchTrack = ((Artist) searchTrack.getArtist().get(0)).getName();
            if (searchTrack.length() > 18) {
                stringBuilder.append(searchTrack.substring(0, 18));
                stringBuilder.append("...");
                return stringBuilder.toString();
            }
        }
        return searchTrack;
    }

    /* renamed from: b */
    public Observable<Void> m56672b(String str) {
        return this.f46827f.m57605a().b(Schedulers.io()).h(new C18153d(this, str));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m56660a(String str, Info info) {
        return this.f46823b.logUserAttribution(info.getId(), str);
    }

    /* renamed from: a */
    public void m56662a(int i, boolean z, SpotifyConnectResponse spotifyConnectResponse) {
        i = new SparksEvent("Profile.ConnectSpotify").put("source", i);
        if (z) {
            i.put("connectSuccess", 1);
            i.put("premium", spotifyConnectResponse.m56723g());
        } else {
            i.put("connectSuccess", null);
        }
        this.f46826e.a(i);
    }

    /* renamed from: a */
    public boolean m56668a(Intent intent) {
        return this.f46828g.m57711a(intent);
    }

    /* renamed from: a */
    public void m56664a(SearchTrack searchTrack, String str, String str2) {
        if (searchTrack != null) {
            User i = m56682i();
            if (i != null) {
                String id = i.getId();
                if (id == null) {
                    id = "";
                }
                String c = C15376y.m57710c(id);
                String previewUrl = searchTrack.getPreviewUrl() == null ? " " : searchTrack.getPreviewUrl();
                SearchTrack id2 = searchTrack.getId() == null ? " " : searchTrack.getId();
                boolean isSpotifyConnected = i.isSpotifyConnected();
                SpotifyDataRepository spotifyDataRepository = this.f46823b;
                if (str == null) {
                    str = "";
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = "";
                }
                spotifyDataRepository.logSpotifyMauData(str3, c, previewUrl, id2, isSpotifyConnected, str2);
            }
        }
    }

    /* renamed from: m */
    public String m56686m() {
        return this.f46829h;
    }

    /* renamed from: n */
    public UserType m56687n() {
        return this.f46830i;
    }

    /* renamed from: c */
    public void m56676c(String str) {
        this.f46829h = str;
    }

    /* renamed from: a */
    public void m56663a(UserType userType) {
        this.f46830i = userType;
    }

    /* renamed from: o */
    public boolean m56688o() {
        return this.f46831j;
    }

    /* renamed from: a */
    public void m56666a(boolean z) {
        this.f46831j = z;
    }

    /* renamed from: a */
    public void m56665a(SearchTrack searchTrack, boolean z, boolean z2) {
        SparksEvent sparksEvent = new SparksEvent(z2 ? "Profile.ChooseAnthem" : "Profile.ConnectAnthem");
        if (searchTrack != null) {
            sparksEvent.put("songName", searchTrack.getName());
            z2 = new ArrayList();
            for (Artist name : searchTrack.getArtist()) {
                z2.add(name.getName());
            }
            sparksEvent.put("artistName", z2.toString());
        }
        sparksEvent.put("fromSearch", z);
        this.f46826e.a(sparksEvent);
    }

    /* renamed from: p */
    public void m56689p() {
        this.f46826e.a(new SparksEvent("Profile.DisconnectAnthem"));
    }

    /* renamed from: c */
    public void m56675c(SearchTrack searchTrack) {
        SparksEvent put = new SparksEvent("Profile.Spotify").put("spotifyConnected", m56683j());
        if (searchTrack != null) {
            put.put("optedInThemeSong", 1);
            put.put("trackName", searchTrack.getName());
            List arrayList = new ArrayList();
            for (Artist name : searchTrack.getArtist()) {
                arrayList.add(name.getName());
            }
            put.put("trackArtists", arrayList.toString());
        } else {
            put.put("optedInThemeSong", 0);
        }
        searchTrack = m56655q();
        if (searchTrack.size() != 0) {
            put.put("topArtistsCount", searchTrack.size());
        }
        this.f46826e.a(put);
    }

    /* renamed from: b */
    public void m56673b(boolean z) {
        this.f46822a.onNext(Boolean.valueOf(z));
    }
}
