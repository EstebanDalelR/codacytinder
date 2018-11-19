package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.tg;
import com.google.android.gms.internal.zzcxd;

public final class cv<O extends ApiOptions> extends C2467b<O> {
    /* renamed from: b */
    private final zze f11990b;
    /* renamed from: c */
    private final cq f11991c;
    /* renamed from: d */
    private final av f11992d;
    /* renamed from: e */
    private final C3787a<? extends zzcxd, tg> f11993e;

    public cv(@NonNull Context context, Api<O> api, Looper looper, @NonNull zze zze, @NonNull cq cqVar, av avVar, C3787a<? extends zzcxd, tg> c3787a) {
        super(context, api, looper);
        this.f11990b = zze;
        this.f11991c = cqVar;
        this.f11992d = avVar;
        this.f11993e = c3787a;
        this.a.m8956a((C2467b) this);
    }

    /* renamed from: a */
    public final zze mo2552a(Looper looper, an<O> anVar) {
        this.f11991c.m14343a(anVar);
        return this.f11990b;
    }

    /* renamed from: a */
    public final bl mo2553a(Context context, Handler handler) {
        return new bl(context, handler, this.f11992d, this.f11993e);
    }

    /* renamed from: g */
    public final zze mo2554g() {
        return this.f11990b;
    }
}
