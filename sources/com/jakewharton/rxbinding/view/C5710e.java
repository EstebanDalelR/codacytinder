package com.jakewharton.rxbinding.view;

import android.support.annotation.NonNull;
import android.view.View;
import com.jakewharton.rxbinding.internal.C5701a;

/* renamed from: com.jakewharton.rxbinding.view.e */
public abstract class C5710e<T extends View> {
    /* renamed from: a */
    private final T f21117a;

    protected C5710e(@NonNull T t) {
        this.f21117a = (View) C5701a.m24977a(t, "view == null");
    }

    @NonNull
    /* renamed from: c */
    public T m24986c() {
        return this.f21117a;
    }
}
