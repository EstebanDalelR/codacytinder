package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

@zzzv
public abstract class auj extends dy {
    /* renamed from: a */
    protected final zzyb f26811a;
    /* renamed from: b */
    protected final Context f26812b;
    /* renamed from: c */
    protected final Object f26813c = new Object();
    /* renamed from: d */
    protected final Object f26814d = new Object();
    /* renamed from: e */
    protected final dm f26815e;
    /* renamed from: f */
    protected zzaax f26816f;

    protected auj(Context context, dm dmVar, zzyb zzyb) {
        super(true);
        this.f26812b = context;
        this.f26815e = dmVar;
        this.f26816f = dmVar.f15996b;
        this.f26811a = zzyb;
    }

    /* renamed from: a */
    protected abstract dl mo7432a(int i);

    /* renamed from: a */
    public final void mo6837a() {
        int a;
        synchronized (this.f26813c) {
            hx.m19911b("AdRendererBackgroundTask started.");
            int i = this.f26815e.f15999e;
            try {
                mo7433a(SystemClock.elapsedRealtime());
            } catch (zzxz e) {
                a = e.m20337a();
                if (a != 3) {
                    if (a != -1) {
                        hx.m19916e(e.getMessage());
                        this.f26816f = this.f26816f != null ? new zzaax(a) : new zzaax(a, this.f26816f.zzcdq);
                        fk.f16060a.post(new auk(this));
                        i = a;
                    }
                }
                hx.m19915d(e.getMessage());
                if (this.f26816f != null) {
                }
                this.f26816f = this.f26816f != null ? new zzaax(a) : new zzaax(a, this.f26816f.zzcdq);
                fk.f16060a.post(new auk(this));
                i = a;
            }
            fk.f16060a.post(new aul(this, mo7432a(i)));
        }
    }

    /* renamed from: a */
    protected abstract void mo7433a(long j) throws zzxz;

    /* renamed from: b */
    public void mo6838b() {
    }
}
