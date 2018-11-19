package com.jakewharton.rxbinding.view;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.view.View;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.view.b */
public final class C5707b {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static Observable<Void> m24983a(@NonNull View view) {
        C5701a.m24977a(view, "view == null");
        return Observable.a(new C8219c(view, false));
    }

    @CheckResult
    @NonNull
    /* renamed from: b */
    public static Observable<Void> m24984b(@NonNull View view) {
        C5701a.m24977a(view, "view == null");
        return Observable.a(new C8220d(view));
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public static Observable<Void> m24985c(@NonNull View view) {
        C5701a.m24977a(view, "view == null");
        return Observable.a(new C8221f(view));
    }
}
