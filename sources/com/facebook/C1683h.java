package com.facebook;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;

/* renamed from: com.facebook.h */
public final class C1683h {
    /* renamed from: a */
    private static volatile C1683h f4614a;
    /* renamed from: b */
    private final C0436c f4615b;
    /* renamed from: c */
    private final C1682g f4616c;
    /* renamed from: d */
    private Profile f4617d;

    C1683h(C0436c c0436c, C1682g c1682g) {
        C1749x.m6064a((Object) c0436c, "localBroadcastManager");
        C1749x.m6064a((Object) c1682g, "profileCache");
        this.f4615b = c0436c;
        this.f4616c = c1682g;
    }

    /* renamed from: a */
    static C1683h m5700a() {
        if (f4614a == null) {
            synchronized (C1683h.class) {
                if (f4614a == null) {
                    f4614a = new C1683h(C0436c.m1648a(FacebookSdk.m3994e()), new C1682g());
                }
            }
        }
        return f4614a;
    }

    /* renamed from: b */
    Profile m5704b() {
        return this.f4617d;
    }

    /* renamed from: c */
    boolean m5705c() {
        Profile a = this.f4616c.m5697a();
        if (a == null) {
            return false;
        }
        m5702a(a, false);
        return true;
    }

    /* renamed from: a */
    void m5703a(@Nullable Profile profile) {
        m5702a(profile, true);
    }

    /* renamed from: a */
    private void m5702a(@Nullable Profile profile, boolean z) {
        Profile profile2 = this.f4617d;
        this.f4617d = profile;
        if (z) {
            if (profile != null) {
                this.f4616c.m5698a(profile);
            } else {
                this.f4616c.m5699b();
            }
        }
        if (!Utility.m5784a((Object) profile2, (Object) profile)) {
            m5701a(profile2, profile);
        }
    }

    /* renamed from: a */
    private void m5701a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f4615b.m1653a(intent);
    }
}
