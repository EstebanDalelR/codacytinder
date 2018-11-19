package com.tinder.spotify.p416b;

import android.content.Intent;
import android.text.TextUtils;
import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationRequest.Builder;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Type;
import com.tinder.model.DefaultObserver;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.model.SpotifyConnectResponse;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyAuthTarget;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.b.a */
public class C18157a extends PresenterBase<SpotifyAuthTarget> {
    /* renamed from: a */
    private final C15035a f56332a;
    /* renamed from: b */
    private final Builder f56333b;
    /* renamed from: c */
    private int f56334c;
    /* renamed from: d */
    private Subscription f56335d;

    /* renamed from: com.tinder.spotify.b.a$2 */
    static /* synthetic */ class C150452 {
        /* renamed from: a */
        static final /* synthetic */ int[] f46854a = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            f46854a = r0;
            r0 = f46854a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.CODE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f46854a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.ERROR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f46854a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.EMPTY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.spotify.b.a.2.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.spotify.b.a$1 */
    class C181561 extends DefaultObserver<SpotifyConnectResponse> {
        /* renamed from: a */
        final /* synthetic */ C18157a f56331a;

        C181561(C18157a c18157a) {
            this.f56331a = c18157a;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65857a((SpotifyConnectResponse) obj);
        }

        /* renamed from: a */
        public void m65857a(SpotifyConnectResponse spotifyConnectResponse) {
            this.f56331a.f56332a.m56662a(this.f56331a.f56334c, true, spotifyConnectResponse);
            ((SpotifyAuthTarget) this.f56331a.H()).finish();
        }

        public void onError(Throwable th) {
            super.onError(th);
            this.f56331a.f56332a.m56685l();
            this.f56331a.f56332a.m56662a(this.f56331a.f56334c, false, null);
            ((SpotifyAuthTarget) this.f56331a.H()).toastError();
        }
    }

    @Inject
    public C18157a(C15035a c15035a, Builder builder) {
        this.f56332a = c15035a;
        this.f56333b = builder;
    }

    /* renamed from: b */
    public AuthenticationRequest m65865b() {
        return this.f56333b.setScopes(new String[]{"playlist-read-private", "playlist-read-collaborative", "streaming", "user-library-read", "user-read-private", "user-top-read"}).build();
    }

    /* renamed from: a */
    public void m65862a(int i, int i2, Intent intent) {
        if (i == 1337) {
            i = AuthenticationClient.getResponse(i2, intent);
            switch (C150452.f46854a[i.getType().ordinal()]) {
                case 1:
                    m65864a(i.getCode());
                    return;
                case 2:
                    ad.c("Error when getting spotify user auth code");
                    this.f56332a.m56685l();
                    this.f56332a.m56673b(false);
                    if (H() != 0) {
                        ((SpotifyAuthTarget) H()).finish();
                        return;
                    }
                    return;
                case 3:
                    this.f56332a.m56685l();
                    if (H() != 0) {
                        ((SpotifyAuthTarget) H()).finish();
                        return;
                    }
                    return;
                default:
                    this.f56332a.m56685l();
                    this.f56332a.m56673b(false);
                    if (H() != 0) {
                        ((SpotifyAuthTarget) H()).finish();
                        return;
                    }
                    return;
            }
        }
    }

    /* renamed from: a */
    public void m65863a(Intent intent) {
        if (intent != null) {
            if (intent.getData() != null) {
                String queryParameter = intent.getData().getQueryParameter("code");
                if (!TextUtils.isEmpty(queryParameter)) {
                    m65864a(queryParameter);
                }
            }
        }
    }

    /* renamed from: a */
    public void m65864a(String str) {
        this.f56335d = this.f56332a.m56658a(str).b(Schedulers.io()).a(C19397a.a()).a(new C181561(this));
        this.f56332a.m56673b(true);
    }

    /* renamed from: a */
    public void m65860a() {
        super.a();
        if (this.f56335d != null) {
            this.f56335d.unsubscribe();
        }
    }

    /* renamed from: a */
    public void m65861a(int i) {
        this.f56334c = i;
    }
}
