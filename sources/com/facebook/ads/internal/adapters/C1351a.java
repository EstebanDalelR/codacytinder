package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p049l.C1517a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.a */
public abstract class C1351a {
    /* renamed from: a */
    protected final C1352b f3620a;
    /* renamed from: b */
    protected final C1517a f3621b;
    /* renamed from: c */
    private final Context f3622c;
    /* renamed from: d */
    private boolean f3623d;

    public C1351a(Context context, C1352b c1352b, C1517a c1517a) {
        this.f3622c = context;
        this.f3620a = c1352b;
        this.f3621b = c1517a;
    }

    /* renamed from: a */
    public final void m4716a() {
        if (!this.f3623d) {
            if (this.f3620a != null) {
                this.f3620a.mo1683d();
            }
            Map hashMap = new HashMap();
            if (this.f3621b != null) {
                this.f3621b.m5350a(hashMap);
            }
            mo1731a(hashMap);
            this.f3623d = true;
            C1490h.m5250a(this.f3622c, "Impression logged");
            if (this.f3620a != null) {
                this.f3620a.mo1684e();
            }
        }
    }

    /* renamed from: a */
    protected abstract void mo1731a(Map<String, String> map);
}
