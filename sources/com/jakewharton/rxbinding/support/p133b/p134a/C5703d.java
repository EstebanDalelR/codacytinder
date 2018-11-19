package com.jakewharton.rxbinding.support.p133b.p134a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.support.b.a.d */
public final class C5703d {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static Observable<C7016b> m24979a(@NonNull RecyclerView recyclerView) {
        C5701a.m24977a(recyclerView, "view == null");
        return Observable.a(new C8217c(recyclerView));
    }
}
