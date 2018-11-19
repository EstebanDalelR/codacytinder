package com.jakewharton.rxbinding2.p140b;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.view.View;
import com.jakewharton.rxbinding2.internal.C5720a;
import io.reactivex.C3959e;

/* renamed from: com.jakewharton.rxbinding2.b.a */
public final class C5716a {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C3959e<Object> m24996a(@NonNull View view) {
        C5720a.m25011a(view, "view == null");
        return new C7835b(view, false);
    }

    @CheckResult
    @NonNull
    /* renamed from: b */
    public static C3959e<Object> m24997b(@NonNull View view) {
        C5720a.m25011a(view, "view == null");
        return new C7837c(view);
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public static C3959e<Object> m24998c(@NonNull View view) {
        C5720a.m25011a(view, "view == null");
        return new C7839d(view);
    }
}
