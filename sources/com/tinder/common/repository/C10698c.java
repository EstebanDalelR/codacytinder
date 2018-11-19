package com.tinder.common.repository;

import android.support.annotation.Nullable;
import com.facebook.AccessToken;
import com.tinder.api.retrofit.AuthTokenProvider;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.OnboardingTokenProvider;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import com.tinder.managers.bk;
import com.tinder.utils.Tinteg;

/* renamed from: com.tinder.common.repository.c */
public class C10698c implements AuthTokenProvider, OnboardingTokenProvider, AuthStatusProvider {
    /* renamed from: a */
    private static String f35041a;
    /* renamed from: b */
    private final bk f35042b;

    public C10698c(bk bkVar) {
        this.f35042b = bkVar;
        f35041a = this.f35042b.I();
    }

    /* renamed from: a */
    public static String m43017a() {
        return f35041a;
    }

    /* renamed from: a */
    public void m43018a(String str) {
        f35041a = str;
        this.f35042b.b(str);
        String str2 = null;
        if (str == null) {
            Tinteg.alt = null;
            Tinteg.ali = null;
            return;
        }
        str = AccessToken.getCurrentAccessToken();
        Tinteg.alt = str != null ? str.getToken() : null;
        if (str != null) {
            str2 = str.getUserId();
        }
        Tinteg.ali = str2;
    }

    @Nullable
    public String getOnboardingToken() {
        return this.f35042b.J();
    }

    /* renamed from: b */
    public void m43019b(String str) {
        this.f35042b.c(str);
    }

    @Nullable
    public String getAuthToken() {
        return C10698c.m43017a();
    }

    public void updateAuthToken(@Nullable String str) {
        m43018a(str);
    }

    public boolean hasAuthToken() {
        return C8578a.m36596a(f35041a) ^ 1;
    }
}
