package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.C0436c;
import android.util.Log;
import com.facebook.internal.C1749x;

/* renamed from: com.facebook.c */
public abstract class C1665c {
    /* renamed from: a */
    private static final String f4588a = "c";
    /* renamed from: b */
    private final BroadcastReceiver f4589b;
    /* renamed from: c */
    private final C0436c f4590c;
    /* renamed from: d */
    private boolean f4591d = false;

    /* renamed from: com.facebook.c$a */
    private class C1664a extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C1665c f4587a;

        private C1664a(C1665c c1665c) {
            this.f4587a = c1665c;
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) != null) {
                Log.d(C1665c.f4588a, "AccessTokenChanged");
                this.f4587a.mo1873a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    /* renamed from: a */
    protected abstract void mo1873a(AccessToken accessToken, AccessToken accessToken2);

    public C1665c() {
        C1749x.m6061a();
        this.f4589b = new C1664a();
        this.f4590c = C0436c.m1648a(FacebookSdk.m3994e());
        m5648a();
    }

    /* renamed from: a */
    public void m5648a() {
        if (!this.f4591d) {
            m5647e();
            this.f4591d = true;
        }
    }

    /* renamed from: b */
    public void m5650b() {
        if (this.f4591d) {
            this.f4590c.m1651a(this.f4589b);
            this.f4591d = false;
        }
    }

    /* renamed from: c */
    public boolean m5651c() {
        return this.f4591d;
    }

    /* renamed from: e */
    private void m5647e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f4590c.m1652a(this.f4589b, intentFilter);
    }
}
