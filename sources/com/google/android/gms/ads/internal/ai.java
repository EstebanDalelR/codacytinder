package com.google.android.gms.ads.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzzv;
import java.lang.ref.WeakReference;

@zzzv
public final class ai {
    /* renamed from: a */
    private final ak f7096a;
    /* renamed from: b */
    private final Runnable f7097b;
    @Nullable
    /* renamed from: c */
    private zzjj f7098c;
    /* renamed from: d */
    private boolean f7099d;
    /* renamed from: e */
    private boolean f7100e;
    /* renamed from: f */
    private long f7101f;

    public ai(C4269a c4269a) {
        this(c4269a, new ak(fk.f16060a));
    }

    private ai(C4269a c4269a, ak akVar) {
        this.f7099d = false;
        this.f7100e = false;
        this.f7101f = 0;
        this.f7096a = akVar;
        this.f7097b = new aj(this, new WeakReference(c4269a));
    }

    /* renamed from: a */
    public final void m8625a() {
        this.f7099d = false;
        this.f7096a.m8632a(this.f7097b);
    }

    /* renamed from: a */
    public final void m8626a(zzjj zzjj) {
        this.f7098c = zzjj;
    }

    /* renamed from: a */
    public final void m8627a(zzjj zzjj, long j) {
        if (this.f7099d) {
            ec.e("An ad refresh is already scheduled.");
            return;
        }
        this.f7098c = zzjj;
        this.f7099d = true;
        this.f7101f = j;
        if (!this.f7100e) {
            StringBuilder stringBuilder = new StringBuilder(65);
            stringBuilder.append("Scheduling ad refresh ");
            stringBuilder.append(j);
            stringBuilder.append(" milliseconds from now.");
            ec.d(stringBuilder.toString());
            this.f7096a.m8633a(this.f7097b, j);
        }
    }

    /* renamed from: b */
    public final void m8628b() {
        this.f7100e = true;
        if (this.f7099d) {
            this.f7096a.m8632a(this.f7097b);
        }
    }

    /* renamed from: b */
    public final void m8629b(zzjj zzjj) {
        m8627a(zzjj, 60000);
    }

    /* renamed from: c */
    public final void m8630c() {
        this.f7100e = false;
        if (this.f7099d) {
            this.f7099d = false;
            m8627a(this.f7098c, this.f7101f);
        }
    }

    /* renamed from: d */
    public final boolean m8631d() {
        return this.f7099d;
    }
}
