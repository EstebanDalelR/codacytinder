package com.tinder.spotify.p416b;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.tinder.model.DefaultObserver;
import com.tinder.presenters.PresenterBase;
import com.tinder.profile.p363b.C16080m;
import com.tinder.profile.p363b.C16080m.C14387a;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyThemeTrackTarget;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.b.v */
public class C18165v extends PresenterBase<SpotifyThemeTrackTarget> {
    /* renamed from: a */
    private final C15035a f56353a;
    /* renamed from: b */
    private final C16080m f56354b;

    /* renamed from: com.tinder.spotify.b.v$1 */
    class C181641 extends DefaultObserver<Void> {
        /* renamed from: a */
        final /* synthetic */ C18165v f56352a;

        C181641(C18165v c18165v) {
            this.f56352a = c18165v;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65908a((Void) obj);
        }

        /* renamed from: a */
        public void m65908a(Void voidR) {
            ad.d("Sent Spotify User Attribution");
        }
    }

    @Inject
    public C18165v(C15035a c15035a, C16080m c16080m) {
        this.f56353a = c15035a;
        this.f56354b = c16080m;
    }

    /* renamed from: a */
    public void m65909a(SearchTrack searchTrack) {
        if (searchTrack != null) {
            searchTrack = this.f56353a.m56669b(searchTrack);
            if (H() != null) {
                ((SpotifyThemeTrackTarget) H()).setPlayFullSongTextOnPlayStart(searchTrack);
            }
        }
    }

    /* renamed from: b */
    public void m65911b(@NonNull SearchTrack searchTrack) {
        this.f56354b.m60851a(C14387a.m54806a(searchTrack.getName(), ((Artist) searchTrack.getArtist().get(0)).getName())).b(Schedulers.io()).b(RxUtils.b());
    }

    /* renamed from: c */
    public void m65912c(SearchTrack searchTrack) {
        if (searchTrack != null && searchTrack.getArtist() != null && !searchTrack.getArtist().isEmpty()) {
            ((SpotifyThemeTrackTarget) H()).setArtistName(((Artist) searchTrack.getArtist().get(0)).getName());
        }
    }

    /* renamed from: d */
    public void m65913d(com.tinder.spotify.model.SearchTrack r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.H();
        r0 = (com.tinder.spotify.target.SpotifyThemeTrackTarget) r0;
        r0.stopTrack();
        r0 = r2.H();	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r0 = (com.tinder.spotify.target.SpotifyThemeTrackTarget) r0;	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r1 = r3.getId();	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r0.startSpotifyActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0017 }
        goto L_0x0043;
    L_0x0017:
        r0 = r2.H();
        r0 = (com.tinder.spotify.target.SpotifyThemeTrackTarget) r0;
        r0.showMustFirstInstallSpotifyMessage();
        r0 = r2.H();
        r0 = (com.tinder.spotify.target.SpotifyThemeTrackTarget) r0;
        r0.startSpotifyInstallActivity();
        r0 = r2.f56353a;
        r3 = r3.getId();
        r3 = r0.m56672b(r3);
        r0 = rx.schedulers.Schedulers.io();
        r3 = r3.b(r0);
        r0 = new com.tinder.spotify.b.v$1;
        r0.<init>(r2);
        r3.a(r0);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.spotify.b.v.d(com.tinder.spotify.model.SearchTrack):void");
    }

    /* renamed from: a */
    public boolean m65910a(Intent intent) {
        return this.f56353a.m56668a(intent);
    }
}
