package com.jakewharton.rxbinding.support.design.widget;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import com.jakewharton.rxbinding.internal.C5701a;
import rx.Observable;

/* renamed from: com.jakewharton.rxbinding.support.design.widget.a */
public final class C5705a {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static Observable<TabLayoutSelectionEvent> m24981a(@NonNull TabLayout tabLayout) {
        C5701a.m24977a(tabLayout, "view == null");
        return Observable.a(new C8218b(tabLayout));
    }
}
