package com.jakewharton.rxbinding2.p141c;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.widget.TextView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.c.d */
public abstract class C5718d {
    @NonNull
    /* renamed from: a */
    public abstract TextView mo6187a();

    @Nullable
    /* renamed from: b */
    public abstract Editable mo6188b();

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C5718d m25002a(@NonNull TextView textView, @Nullable Editable editable) {
        return new C7025a(textView, editable);
    }

    C5718d() {
    }
}
