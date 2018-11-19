package com.tinder.interactors;

import android.text.TextUtils;
import com.tinder.analytics.C2634g;
import com.tinder.managers.C2652a;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.FacebookManager.FacebookUserFetchListener;
import javax.inject.Inject;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.interactors.a */
public class C9713a {
    /* renamed from: a */
    private final C2652a f32301a;
    /* renamed from: b */
    private final FacebookManager f32302b;
    /* renamed from: c */
    private final C2634g f32303c;
    /* renamed from: d */
    private FacebookUserFetchListener f32304d = new C118691(this);

    /* renamed from: com.tinder.interactors.a$1 */
    class C118691 implements FacebookUserFetchListener {
        /* renamed from: a */
        final /* synthetic */ C9713a f38706a;

        C118691(C9713a c9713a) {
            this.f38706a = c9713a;
        }

        public void onSuccess(String str, String str2, String str3) {
            C0001a.b("onSuccess getFacebookuserInfo", new Object[null]);
            if ((TextUtils.isEmpty(str2) ^ 1) != null) {
                this.f38706a.f32303c.b(str2);
            }
        }

        public void onFailure() {
            C0001a.b("failed to get facebook User Info", new Object[0]);
        }
    }

    @Inject
    public C9713a(C2652a c2652a, FacebookManager facebookManager, C2634g c2634g) {
        this.f32301a = c2652a;
        this.f32302b = facebookManager;
        this.f32303c = c2634g;
    }

    /* renamed from: a */
    public boolean m40204a() {
        return this.f32301a.c();
    }

    /* renamed from: b */
    public void m40205b() {
        this.f32302b.m40472a(this.f32304d);
    }

    /* renamed from: a */
    public void m40203a(boolean z) {
        this.f32301a.a(z);
    }
}
