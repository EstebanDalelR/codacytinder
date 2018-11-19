package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.zzaiq;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.js.t */
public final class C2388t {
    /* renamed from: a */
    private final Object f7287a;
    /* renamed from: b */
    private final Context f7288b;
    /* renamed from: c */
    private final String f7289c;
    /* renamed from: d */
    private final zzakd f7290d;
    /* renamed from: e */
    private zzaiq<zzc> f7291e;
    /* renamed from: f */
    private zzaiq<zzc> f7292f;
    @Nullable
    /* renamed from: g */
    private C4273e f7293g;
    /* renamed from: h */
    private int f7294h;

    public C2388t(Context context, zzakd zzakd, String str) {
        this.f7287a = new Object();
        this.f7294h = 1;
        this.f7289c = str;
        this.f7288b = context.getApplicationContext();
        this.f7290d = zzakd;
        this.f7291e = new af();
        this.f7292f = new af();
    }

    public C2388t(Context context, zzakd zzakd, String str, zzaiq<zzc> zzaiq, zzaiq<zzc> zzaiq2) {
        this(context, zzakd, str);
        this.f7291e = zzaiq;
        this.f7292f = zzaiq2;
    }

    /* renamed from: a */
    protected final C4273e m8727a(@Nullable tb tbVar) {
        iz c4273e = new C4273e(this.f7292f);
        ar.m8648e();
        fk.a(new C2389u(this, tbVar, c4273e));
        c4273e.zza(new ac(this, c4273e), new ad(this, c4273e));
        return c4273e;
    }

    /* renamed from: b */
    public final C4272a m8728b(@Nullable tb tbVar) {
        synchronized (this.f7287a) {
            C4272a a;
            if (this.f7293g != null) {
                if (this.f7293g.e() != -1) {
                    if (this.f7294h == 0) {
                        a = this.f7293g.m17133a();
                        return a;
                    } else if (this.f7294h == 1) {
                        this.f7294h = 2;
                        m8727a(null);
                        a = this.f7293g.m17133a();
                        return a;
                    } else if (this.f7294h == 2) {
                        a = this.f7293g.m17133a();
                        return a;
                    } else {
                        a = this.f7293g.m17133a();
                        return a;
                    }
                }
            }
            this.f7294h = 2;
            this.f7293g = m8727a(null);
            a = this.f7293g.m17133a();
            return a;
        }
    }
}
