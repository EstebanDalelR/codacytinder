package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.api.Result;

public final class av<O extends ApiOptions> extends C3799j {
    /* renamed from: a */
    private final C2467b<O> f13971a;

    public av(C2467b<O> c2467b) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f13971a = c2467b;
    }

    /* renamed from: a */
    public final <A extends zzb, R extends Result, T extends ck<R, A>> T mo2491a(@NonNull T t) {
        return this.f13971a.m8897a((ck) t);
    }

    /* renamed from: a */
    public final void mo2494a(bv bvVar) {
    }

    /* renamed from: b */
    public final Context mo2498b() {
        return this.f13971a.m8907f();
    }

    /* renamed from: b */
    public final <A extends zzb, T extends ck<? extends Result, A>> T mo2499b(@NonNull T t) {
        return this.f13971a.m8902b((ck) t);
    }

    /* renamed from: b */
    public final void mo2501b(bv bvVar) {
    }

    /* renamed from: c */
    public final Looper mo2502c() {
        return this.f13971a.m8906e();
    }
}
