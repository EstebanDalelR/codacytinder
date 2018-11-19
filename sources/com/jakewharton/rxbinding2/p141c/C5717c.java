package com.jakewharton.rxbinding2.p141c;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.widget.TextView;
import com.jakewharton.rxbinding2.C7833a;
import com.jakewharton.rxbinding2.internal.C5720a;

/* renamed from: com.jakewharton.rxbinding2.c.c */
public final class C5717c {
    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C7833a<CharSequence> m24999a(@NonNull TextView textView) {
        C5720a.m25011a(textView, "view == null");
        return new C8105h(textView);
    }

    @CheckResult
    @NonNull
    /* renamed from: b */
    public static C7833a<C5719f> m25000b(@NonNull TextView textView) {
        C5720a.m25011a(textView, "view == null");
        return new C8104g(textView);
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public static C7833a<C5718d> m25001c(@NonNull TextView textView) {
        C5720a.m25011a(textView, "view == null");
        return new C8103e(textView);
    }
}
