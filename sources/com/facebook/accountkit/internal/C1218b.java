package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.AccessToken;

/* renamed from: com.facebook.accountkit.internal.b */
final class C1218b {
    /* renamed from: a */
    private final C1217a f3257a;
    /* renamed from: b */
    private AccessToken f3258b;
    /* renamed from: c */
    private final C0436c f3259c;

    C1218b(Context context, C0436c c0436c) {
        this(new C1217a(context), c0436c);
    }

    C1218b(@NonNull C1217a c1217a, @NonNull C0436c c0436c) {
        this.f3257a = c1217a;
        this.f3259c = c0436c;
    }

    /* renamed from: a */
    AccessToken m4254a() {
        return this.f3258b;
    }

    /* renamed from: b */
    boolean m4256b() {
        AccessToken b = this.f3257a.m4251b();
        if (b == null) {
            return false;
        }
        m4253a(b, false);
        return true;
    }

    /* renamed from: a */
    void m4255a(AccessToken accessToken) {
        m4253a(accessToken, true);
    }

    /* renamed from: a */
    private void m4253a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f3258b;
        this.f3258b = accessToken;
        if (z) {
            if (accessToken != null) {
                this.f3257a.m4250a(accessToken);
            } else {
                this.f3257a.m4249a();
            }
        }
        if (!C1251w.m4505b((Object) accessToken2, (Object) accessToken)) {
            m4252a(accessToken2, accessToken);
        }
    }

    /* renamed from: a */
    private void m4252a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent("com.facebook.accountkit.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.accountkit.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.accountkit.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f3259c.m1653a(intent);
    }
}
