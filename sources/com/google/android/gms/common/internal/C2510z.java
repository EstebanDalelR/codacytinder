package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;

/* renamed from: com.google.android.gms.common.internal.z */
public final class C2510z {
    /* renamed from: a */
    private static final zzbp f7667a = new aa();

    /* renamed from: a */
    public static <R extends Result> C4500a<Void> m9175a(PendingResult<R> pendingResult) {
        return C2510z.m9176a(pendingResult, new ac());
    }

    /* renamed from: a */
    public static <R extends Result, T> C4500a<T> m9176a(PendingResult<R> pendingResult, zzbo<R, T> zzbo) {
        zzbp zzbp = f7667a;
        C4501b c4501b = new C4501b();
        pendingResult.mo2486a(new ab(pendingResult, c4501b, zzbo, zzbp));
        return c4501b.a();
    }
}
