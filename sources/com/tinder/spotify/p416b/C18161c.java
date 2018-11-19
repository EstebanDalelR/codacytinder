package com.tinder.spotify.p416b;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.tinder.R;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.DefaultObserver;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyPickArtistsTarget;
import com.tinder.spotify.views.SpotifyPickArtistView;
import com.tinder.utils.ad;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.joda.time.DateTime;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.b.c */
public class C18161c extends PresenterBase<SpotifyPickArtistsTarget> {
    /* renamed from: a */
    private final C15035a f56342a;
    /* renamed from: b */
    private final ManagerAnalytics f56343b;

    /* renamed from: b */
    static final /* synthetic */ void m65874b(Void voidR) {
    }

    @Inject
    public C18161c(C15035a c15035a, ManagerAnalytics managerAnalytics) {
        this.f56342a = c15035a;
        this.f56343b = managerAnalytics;
    }

    /* renamed from: b */
    public void m65883b() {
        this.f56342a.m56674c().b(Schedulers.io()).a(C19397a.a()).h().a(new C18911d(this), new C18912e(this));
        this.f56342a.m56677d().b(Schedulers.io()).a(C19397a.a()).a(new C18913f(this), C18914g.f58566a);
    }

    /* renamed from: c */
    final /* synthetic */ void m65889c(List list) {
        if (list != null) {
            ((SpotifyPickArtistsTarget) H()).setTrackList(list);
        } else {
            ad.d("The artist list is null.");
        }
    }

    /* renamed from: e */
    final /* synthetic */ void m65891e(Throwable th) {
        if (H() != null) {
            ((SpotifyPickArtistsTarget) H()).showErrorMessage(R.string.spotify_connection_error);
        }
        ad.a("Something wrong when load the top artists: ", th);
    }

    /* renamed from: b */
    final /* synthetic */ void m65884b(String str) {
        if (!TextUtils.isEmpty(str) && H() != null) {
            ((SpotifyPickArtistsTarget) H()).setLastUpdateAt(m65879a(str));
        }
    }

    /* renamed from: a */
    String m65879a(String str) {
        return new SimpleDateFormat("d MMMM, yyyy, h:mm a").format(new DateTime(str).g());
    }

    /* renamed from: d */
    private void m65876d(List<Artist> list) {
        this.f56342a.m56661a((List) list).b(Schedulers.io()).a(C19397a.a()).a(C18915h.f58567a, new C18916i(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m65888c(Throwable th) {
        if (H() != null) {
            ((SpotifyPickArtistsTarget) H()).showErrorMessage(R.string.spotify_connection_error);
        }
    }

    /* renamed from: c */
    public void m65887c() {
        this.f56342a.m56671b().b(Schedulers.io()).a(C19397a.a()).a(new C18917j(this), new C18918k(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m65881a(Void voidR) {
        m65877e();
    }

    /* renamed from: b */
    final /* synthetic */ void m65885b(Throwable th) {
        if (H() != null) {
            ((SpotifyPickArtistsTarget) H()).showErrorMessage(R.string.spotify_connection_error);
        }
    }

    /* renamed from: d */
    public void m65890d() {
        this.f56342a.m56678e().b(Schedulers.io()).a(C19397a.a()).a(new C18919l(this), new C18920m(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m65886b(List list) {
        if (list == null || H() == null) {
            ad.d("The artist list is null.");
        } else {
            ((SpotifyPickArtistsTarget) H()).setTrackList(list);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m65880a(Throwable th) {
        SpotifyPickArtistView spotifyPickArtistView = (SpotifyPickArtistView) H();
        if (spotifyPickArtistView != null) {
            spotifyPickArtistView.setTrackList(null);
            spotifyPickArtistView.setLastUpdateAt(null);
            spotifyPickArtistView.showErrorMessage(R.string.spotify_connection_error);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Something wrong when load the top artists: ");
        stringBuilder.append(th.getMessage());
        ad.c(stringBuilder.toString());
    }

    /* renamed from: a */
    public void m65882a(@NonNull final List<Artist> list) {
        this.f56342a.m56681h().b(Schedulers.io()).a(C19397a.a()).h().a(new DefaultObserver<User>(this) {
            /* renamed from: b */
            final /* synthetic */ C18161c f56341b;

            public /* synthetic */ void onNext(Object obj) {
                m65871a((User) obj);
            }

            /* renamed from: a */
            public void m65871a(User user) {
                user = user.getSpotifyTopArtists();
                if (user != null) {
                    if (user.size() != list.size()) {
                        this.f56341b.m65876d(list);
                        this.f56341b.m65878e(list);
                        return;
                    }
                    for (int i = 0; i < user.size(); i++) {
                        if (((Artist) user.get(i)).isSelected() != ((Artist) list.get(i)).isSelected()) {
                            this.f56341b.m65876d(list);
                            this.f56341b.m65878e(list);
                            break;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: e */
    private void m65878e(@NonNull List<Artist> list) {
        SparksEvent put = new SparksEvent("Profile.Spotify").put("spotifyConnected", this.f56342a.m56683j());
        SearchTrack k = this.f56342a.m56684k();
        if (k != null) {
            put.put("optedInThemeSong", 1);
            put.put("songName", k.getName());
            List arrayList = new ArrayList();
            for (Artist name : k.getArtist()) {
                arrayList.add(name.getName());
            }
            put.put("artistName", arrayList.toString());
        } else {
            put.put("optedInThemeSong", 0);
        }
        if (!list.isEmpty()) {
            put.put("topArtistsCount", list.size());
        }
        this.f56343b.a(put);
    }

    /* renamed from: e */
    private void m65877e() {
        this.f56343b.a(new SparksEvent("Profile.DisconnectSpotify"));
    }
}
