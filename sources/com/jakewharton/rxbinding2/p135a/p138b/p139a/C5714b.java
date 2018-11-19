package com.jakewharton.rxbinding2.p135a.p138b.p139a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.a.b.a.b */
public abstract class C5714b {
    @NonNull
    /* renamed from: a */
    public abstract RecyclerView mo6184a();

    /* renamed from: b */
    public abstract int mo6185b();

    /* renamed from: c */
    public abstract int mo6186c();

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C5714b m24990a(@NonNull RecyclerView recyclerView, int i, int i2) {
        return new C7022a(recyclerView, i, i2);
    }

    C5714b() {
    }
}
