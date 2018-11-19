package com.jakewharton.rxbinding.p130a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.widget.RatingBar;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.a.b */
public final class C5697b {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static Observable<Float> m24974a(@NonNull RatingBar ratingBar) {
        C5701a.m24977a(ratingBar, "view == null");
        return Observable.a(new C8212a(ratingBar));
    }
}
