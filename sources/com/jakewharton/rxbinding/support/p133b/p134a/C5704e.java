package com.jakewharton.rxbinding.support.p133b.p134a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.support.b.a.e */
public final class C5704e {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static <T extends Adapter<? extends ViewHolder>> Observable<T> m24980a(@NonNull T t) {
        C5701a.m24977a(t, "adapter == null");
        return Observable.a(new C8216a(t));
    }
}
