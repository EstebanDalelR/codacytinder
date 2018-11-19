package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.C2507w;
import java.util.Arrays;

public final class cg<O extends ApiOptions> {
    /* renamed from: a */
    private final boolean f7516a = true;
    /* renamed from: b */
    private final int f7517b;
    /* renamed from: c */
    private final Api<O> f7518c;
    /* renamed from: d */
    private final O f7519d;

    private cg(Api<O> api) {
        this.f7518c = api;
        this.f7519d = null;
        this.f7517b = System.identityHashCode(this);
    }

    private cg(Api<O> api, O o) {
        this.f7518c = api;
        this.f7519d = o;
        this.f7517b = Arrays.hashCode(new Object[]{this.f7518c, this.f7519d});
    }

    /* renamed from: a */
    public static <O extends ApiOptions> cg<O> m8991a(Api<O> api) {
        return new cg(api);
    }

    /* renamed from: a */
    public static <O extends ApiOptions> cg<O> m8992a(Api<O> api, O o) {
        return new cg(api, o);
    }

    /* renamed from: a */
    public final String m8993a() {
        return this.f7518c.m8847d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return !this.f7516a && !cgVar.f7516a && C2507w.m9173a(this.f7518c, cgVar.f7518c) && C2507w.m9173a(this.f7519d, cgVar.f7519d);
    }

    public final int hashCode() {
        return this.f7517b;
    }
}
