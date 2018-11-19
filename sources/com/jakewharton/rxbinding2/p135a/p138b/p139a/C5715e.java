package com.jakewharton.rxbinding2.p135a.p138b.p139a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.jakewharton.rxbinding2.internal.C5720a;
import io.reactivex.C3959e;

/* renamed from: com.jakewharton.rxbinding2.a.b.a.e */
public final class C5715e {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C3959e<C5714b> m24994a(@NonNull RecyclerView recyclerView) {
        C5720a.m25011a(recyclerView, "view == null");
        return new C7830c(recyclerView);
    }

    @CheckResult
    @NonNull
    /* renamed from: b */
    public static C3959e<Integer> m24995b(@NonNull RecyclerView recyclerView) {
        C5720a.m25011a(recyclerView, "view == null");
        return new C7832d(recyclerView);
    }
}
