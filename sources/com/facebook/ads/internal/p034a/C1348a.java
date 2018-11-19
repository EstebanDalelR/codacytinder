package com.facebook.ads.internal.p034a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1490h;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.a */
public abstract class C1348a {
    /* renamed from: a */
    protected final Context f3616a;
    /* renamed from: b */
    protected final C1425f f3617b;
    /* renamed from: c */
    protected final String f3618c;

    public C1348a(Context context, C1425f c1425f, String str) {
        this.f3616a = context;
        this.f3617b = c1425f;
        this.f3618c = str;
    }

    /* renamed from: a */
    public abstract C1479a mo1717a();

    /* renamed from: a */
    protected void m4699a(Map<String, String> map) {
        if (!TextUtils.isEmpty(this.f3618c)) {
            if (this instanceof C3249c) {
                this.f3617b.mo1752f(this.f3618c, map);
            } else {
                this.f3617b.mo1748c(this.f3618c, map);
            }
        }
        C1490h.m5250a(this.f3616a, "Click logged");
    }

    /* renamed from: b */
    public abstract void mo1718b();
}
