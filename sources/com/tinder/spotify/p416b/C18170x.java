package com.tinder.spotify.p416b;

import com.tinder.R;
import com.tinder.common.utils.C8578a;
import com.tinder.model.DefaultObserver;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.model.SpotifyMauEventType;
import com.tinder.spotify.model.SpotifyMauType;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyTrackSearchTarget;
import java.util.List;
import javax.inject.Inject;
import retrofit2.Response;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.b.x */
public class C18170x extends PresenterBase<SpotifyTrackSearchTarget> {
    /* renamed from: a */
    private final C15035a f56359a;
    /* renamed from: b */
    private final C19573b f56360b = new C19573b();
    /* renamed from: c */
    private int f56361c;
    /* renamed from: d */
    private boolean f56362d;
    /* renamed from: e */
    private boolean f56363e;

    /* renamed from: com.tinder.spotify.b.x$1 */
    class C181681 extends DefaultObserver<List<SearchTrack>> {
        /* renamed from: a */
        final /* synthetic */ C18170x f56357a;

        C181681(C18170x c18170x) {
            this.f56357a = c18170x;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65917a((List) obj);
        }

        /* renamed from: a */
        public void m65917a(List<SearchTrack> list) {
            SpotifyTrackSearchTarget spotifyTrackSearchTarget = (SpotifyTrackSearchTarget) this.f56357a.H();
            if (spotifyTrackSearchTarget != null) {
                spotifyTrackSearchTarget.addTracks(list);
            }
        }

        public void onError(Throwable th) {
            super.onError(th);
            SpotifyTrackSearchTarget spotifyTrackSearchTarget = (SpotifyTrackSearchTarget) this.f56357a.H();
            if (spotifyTrackSearchTarget != null) {
                spotifyTrackSearchTarget.showSearchError();
            }
        }
    }

    /* renamed from: com.tinder.spotify.b.x$2 */
    class C181692 extends DefaultObserver<List<SearchTrack>> {
        /* renamed from: a */
        final /* synthetic */ C18170x f56358a;

        C181692(C18170x c18170x) {
            this.f56358a = c18170x;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65918a((List) obj);
        }

        /* renamed from: a */
        public void m65918a(List<SearchTrack> list) {
            SpotifyTrackSearchTarget spotifyTrackSearchTarget = (SpotifyTrackSearchTarget) this.f56358a.H();
            if (spotifyTrackSearchTarget != null) {
                this.f56358a.f56363e = true;
                spotifyTrackSearchTarget.addTracks(list);
                this.f56358a.f56361c = this.f56358a.f56361c + 1;
            }
        }

        public void onError(Throwable th) {
            super.onError(th);
            if (((SpotifyTrackSearchTarget) this.f56358a.H()) != null) {
                ((SpotifyTrackSearchTarget) this.f56358a.H()).showSearchError();
            }
        }
    }

    @Inject
    public C18170x(C15035a c15035a) {
        boolean z = false;
        this.f56361c = 0;
        this.f56363e = false;
        this.f56359a = c15035a;
        if (c15035a.m56684k() != null) {
            z = true;
        }
        this.f56362d = z;
    }

    /* renamed from: a */
    public void m65922a() {
        super.a();
        this.f56360b.unsubscribe();
    }

    /* renamed from: b */
    public void m65928b() {
        this.f56360b.a(this.f56359a.m56680g().b(Schedulers.io()).a(C19397a.a()).a(new C181681(this)));
    }

    /* renamed from: a */
    public void m65925a(String str) {
        if (C8578a.a(str)) {
            m65928b();
            return;
        }
        this.f56360b.a(this.f56359a.m56659a(str, this.f56361c * 100).b(Schedulers.io()).a(C19397a.a()).a(new C181692(this)));
    }

    /* renamed from: c */
    public void m65930c() {
        this.f56361c = 0;
    }

    /* renamed from: d */
    public boolean m65931d() {
        return this.f56359a.m56683j();
    }

    /* renamed from: a */
    public void m65923a(SearchTrack searchTrack) {
        this.f56359a.m56675c(searchTrack);
        this.f56359a.m56657a(searchTrack).b(Schedulers.io()).a(C19397a.a()).a(new C18925y(this, searchTrack), new C18926z(this));
        ((SpotifyTrackSearchTarget) H()).closeView();
    }

    /* renamed from: a */
    final /* synthetic */ void m65924a(SearchTrack searchTrack, Response response) {
        if (C8578a.a(searchTrack.getName()) == null) {
            m65921b(searchTrack);
        }
        this.f56359a.m56665a(searchTrack, this.f56363e, this.f56362d);
    }

    /* renamed from: b */
    final /* synthetic */ void m65929b(Throwable th) {
        if (H() != null) {
            ((SpotifyTrackSearchTarget) H()).toastError(R.string.spotify_connection_error);
        }
    }

    /* renamed from: e */
    public void m65932e() {
        if (this.f56359a.m56684k() != null) {
            this.f56360b.a(this.f56359a.m56679f().b(Schedulers.io()).a(C19397a.a()).a(new aa(this), new ab(this)));
        }
        this.f56359a.m56675c(null);
        ((SpotifyTrackSearchTarget) H()).closeView();
    }

    /* renamed from: a */
    final /* synthetic */ void m65927a(Void voidR) {
        this.f56359a.m56689p();
    }

    /* renamed from: a */
    final /* synthetic */ void m65926a(Throwable th) {
        if (H() != null) {
            ((SpotifyTrackSearchTarget) H()).toastError(R.string.spotify_connection_error);
        }
    }

    /* renamed from: b */
    private void m65921b(SearchTrack searchTrack) {
        if (searchTrack != null) {
            this.f56359a.m56664a(searchTrack, SpotifyMauType.SET_ANTHEM.toString(), SpotifyMauEventType.EXTERNAL_ENGAGEMENT.toString());
        }
    }
}
