package com.google.android.gms.common.api.internal;

import android.support.annotation.Nullable;
import android.support.v4.util.C2880a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;
import java.util.Map;
import java.util.Set;

public final class ci {
    /* renamed from: a */
    private final C2880a<cg<?>, ConnectionResult> f7520a = new C2880a();
    /* renamed from: b */
    private final C2880a<cg<?>, String> f7521b = new C2880a();
    /* renamed from: c */
    private final C4501b<Map<cg<?>, String>> f7522c = new C4501b();
    /* renamed from: d */
    private int f7523d;
    /* renamed from: e */
    private boolean f7524e = false;

    public ci(Iterable<? extends C2467b<?>> iterable) {
        for (C2467b b : iterable) {
            this.f7520a.put(b.m8901b(), null);
        }
        this.f7523d = this.f7520a.keySet().size();
    }

    /* renamed from: a */
    public final Set<cg<?>> m8994a() {
        return this.f7520a.keySet();
    }

    /* renamed from: a */
    public final void m8995a(cg<?> cgVar, ConnectionResult connectionResult, @Nullable String str) {
        this.f7520a.put(cgVar, connectionResult);
        this.f7521b.put(cgVar, str);
        this.f7523d--;
        if (!connectionResult.isSuccess()) {
            this.f7524e = true;
        }
        if (this.f7523d == 0) {
            if (this.f7524e) {
                this.f7522c.a(new AvailabilityException(this.f7520a));
                return;
            }
            this.f7522c.a(this.f7521b);
        }
    }

    /* renamed from: b */
    public final C4500a<Map<cg<?>, String>> m8996b() {
        return this.f7522c.a();
    }
}
