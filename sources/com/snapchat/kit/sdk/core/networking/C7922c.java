package com.snapchat.kit.sdk.core.networking;

import android.util.Log;
import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.Interceptor.Chain;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: com.snapchat.kit.sdk.core.networking.c */
public class C7922c extends C7154e {
    /* renamed from: a */
    private final Fingerprint f28503a;

    @Inject
    C7922c(OAuth2Manager oAuth2Manager, C7136a c7136a, @Named("client_id") String str, Fingerprint fingerprint) {
        super(oAuth2Manager, c7136a, str);
        this.f28503a = fingerprint;
    }

    /* renamed from: a */
    protected C6070a mo7411a(Chain chain) {
        chain = super.mo7411a(chain);
        String a = this.f28503a.m25548a();
        if (a == null) {
            Log.e("FingerprintInterceptor", "Could not generate fingerprint");
        } else {
            chain.m26334a("X-Snap-SDK-Client-Auth-Token", a);
        }
        return chain;
    }
}
