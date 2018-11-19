package com.jakewharton.rxbinding2.p141c;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.widget.TextView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.c.f */
public abstract class C5719f {
    @NonNull
    /* renamed from: a */
    public abstract TextView mo6189a();

    @NonNull
    /* renamed from: b */
    public abstract CharSequence mo6190b();

    /* renamed from: c */
    public abstract int mo6191c();

    /* renamed from: d */
    public abstract int mo6192d();

    /* renamed from: e */
    public abstract int mo6193e();

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C5719f m25005a(@NonNull TextView textView, @NonNull CharSequence charSequence, int i, int i2, int i3) {
        return new C7026b(textView, charSequence, i, i2, i3);
    }

    C5719f() {
    }
}
