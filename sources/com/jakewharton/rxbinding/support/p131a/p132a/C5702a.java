package com.jakewharton.rxbinding.support.p131a.p132a;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.support.a.a.a */
public final class C5702a {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static Observable<Integer> m24978a(@NonNull ViewPager viewPager) {
        C5701a.m24977a(viewPager, "view == null");
        return Observable.a(new C8215b(viewPager));
    }
}
