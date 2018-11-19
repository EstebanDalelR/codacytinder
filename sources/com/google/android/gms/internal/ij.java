package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class ij implements Runnable {
    /* renamed from: a */
    private final iw f16181a;
    /* renamed from: b */
    private final zzakv f16182b;
    /* renamed from: c */
    private final Class f16183c;
    /* renamed from: d */
    private final zzakg f16184d;
    /* renamed from: e */
    private final Executor f16185e;

    ij(iw iwVar, zzakv zzakv, Class cls, zzakg zzakg, Executor executor) {
        this.f16181a = iwVar;
        this.f16182b = zzakv;
        this.f16183c = cls;
        this.f16184d = zzakg;
        this.f16185e = executor;
    }

    public final void run() {
        id.m19928a(this.f16181a, this.f16182b, this.f16183c, this.f16184d, this.f16185e);
    }
}
