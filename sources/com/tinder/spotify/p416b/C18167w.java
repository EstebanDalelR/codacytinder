package com.tinder.spotify.p416b;

import android.content.Intent;
import com.tinder.model.DefaultObserver;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyTopTrackItemViewTarget;
import com.tinder.utils.ad;
import javax.inject.Inject;

/* renamed from: com.tinder.spotify.b.w */
public class C18167w extends PresenterBase<SpotifyTopTrackItemViewTarget> {
    /* renamed from: a */
    private final C15035a f56356a;

    /* renamed from: com.tinder.spotify.b.w$1 */
    class C181661 extends DefaultObserver<Void> {
        /* renamed from: a */
        final /* synthetic */ C18167w f56355a;

        C181661(C18167w c18167w) {
            this.f56355a = c18167w;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65914a((Void) obj);
        }

        /* renamed from: a */
        public void m65914a(Void voidR) {
            ad.d("Sent Spotify User Attribution");
        }
    }

    @Inject
    public C18167w(C15035a c15035a) {
        this.f56356a = c15035a;
    }

    /* renamed from: a */
    public void m65915a(com.tinder.spotify.model.SearchTrack r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.H();
        r0 = (com.tinder.spotify.target.SpotifyTopTrackItemViewTarget) r0;
        r0.stopTrack();
        r0 = r2.H();	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r0 = (com.tinder.spotify.target.SpotifyTopTrackItemViewTarget) r0;	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r1 = r3.getId();	 Catch:{ ActivityNotFoundException -> 0x0017 }
        r0.startSpotifyActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0017 }
        goto L_0x0043;
    L_0x0017:
        r0 = r2.H();
        r0 = (com.tinder.spotify.target.SpotifyTopTrackItemViewTarget) r0;
        r0.showMustFirstInstallSpotifyMessage();
        r0 = r2.H();
        r0 = (com.tinder.spotify.target.SpotifyTopTrackItemViewTarget) r0;
        r0.startSpotifyInstallActivity();
        r0 = r2.f56356a;
        r3 = r3.getId();
        r3 = r0.m56672b(r3);
        r0 = rx.schedulers.Schedulers.io();
        r3 = r3.b(r0);
        r0 = new com.tinder.spotify.b.w$1;
        r0.<init>(r2);
        r3.a(r0);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.spotify.b.w.a(com.tinder.spotify.model.SearchTrack):void");
    }

    /* renamed from: a */
    public boolean m65916a(Intent intent) {
        return this.f56356a.m56668a(intent);
    }
}
