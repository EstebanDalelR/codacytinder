package com.tinder.profile.presenter;

import android.content.Intent;
import android.text.TextUtils;
import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationRequest.Builder;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Type;
import com.tinder.model.DefaultObserver;
import com.tinder.presenters.PresenterBase;
import com.tinder.profile.target.ProfileSpotifyAuthTarget;
import com.tinder.spotify.model.SpotifyConnectResponse;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Deprecated
public class bd extends PresenterBase<ProfileSpotifyAuthTarget> {
    /* renamed from: a */
    private final C15035a f55427a;
    /* renamed from: b */
    private final Builder f55428b;
    /* renamed from: c */
    private int f55429c;
    /* renamed from: d */
    private Subscription f55430d;

    /* renamed from: com.tinder.profile.presenter.bd$2 */
    static /* synthetic */ class C144232 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45669a = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45669a = r0;
            r0 = f45669a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.CODE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f45669a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.ERROR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f45669a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.spotify.sdk.android.authentication.AuthenticationResponse.Type.EMPTY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.profile.presenter.bd.2.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.profile.presenter.bd$1 */
    class C177641 extends DefaultObserver<SpotifyConnectResponse> {
        /* renamed from: a */
        final /* synthetic */ bd f55426a;

        C177641(bd bdVar) {
            this.f55426a = bdVar;
        }

        public /* synthetic */ void onNext(Object obj) {
            m64941a((SpotifyConnectResponse) obj);
        }

        /* renamed from: a */
        public void m64941a(SpotifyConnectResponse spotifyConnectResponse) {
            this.f55426a.f55427a.m56662a(this.f55426a.f55429c, true, spotifyConnectResponse);
            ((ProfileSpotifyAuthTarget) this.f55426a.H()).finishWithResultCode();
        }

        public void onError(Throwable th) {
            super.onError(th);
            this.f55426a.f55427a.m56685l();
            this.f55426a.f55427a.m56662a(this.f55426a.f55429c, false, null);
            ((ProfileSpotifyAuthTarget) this.f55426a.H()).showError();
        }
    }

    @Inject
    public bd(C15035a c15035a, Builder builder) {
        this.f55427a = c15035a;
        this.f55428b = builder;
    }

    /* renamed from: b */
    public AuthenticationRequest m64949b() {
        return this.f55428b.setScopes(new String[]{"playlist-read-private", "playlist-read-collaborative", "streaming", "user-library-read", "user-read-private", "user-top-read"}).build();
    }

    /* renamed from: a */
    public void m64946a(int i, int i2, Intent intent) {
        if (i == 1337) {
            i = AuthenticationClient.getResponse(i2, intent);
            switch (C144232.f45669a[i.getType().ordinal()]) {
                case 1:
                    m64948a(i.getCode());
                    return;
                case 2:
                    ad.c("Error when getting spotify user auth code");
                    this.f55427a.m56685l();
                    ((ProfileSpotifyAuthTarget) H()).showError();
                    return;
                case 3:
                    this.f55427a.m56685l();
                    return;
                default:
                    this.f55427a.m56685l();
                    ((ProfileSpotifyAuthTarget) H()).finish();
                    return;
            }
        }
    }

    /* renamed from: a */
    public void m64947a(Intent intent) {
        if (intent != null) {
            if (intent.getData() != null) {
                String queryParameter = intent.getData().getQueryParameter("code");
                if (!TextUtils.isEmpty(queryParameter)) {
                    m64948a(queryParameter);
                }
            }
        }
    }

    /* renamed from: a */
    public void m64948a(String str) {
        this.f55430d = this.f55427a.m56658a(str).b(Schedulers.io()).a(C19397a.a()).a(new C177641(this));
    }

    /* renamed from: a */
    public void m64944a() {
        super.a();
        if (this.f55430d != null) {
            this.f55430d.unsubscribe();
        }
    }

    /* renamed from: a */
    public void m64945a(int i) {
        this.f55429c = i;
    }
}
