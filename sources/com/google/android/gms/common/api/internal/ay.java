package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;

public final class ay {
    /* renamed from: a */
    private final Object f7483a;

    /* renamed from: a */
    public final boolean m8967a() {
        return this.f7483a instanceof FragmentActivity;
    }

    /* renamed from: b */
    public final boolean m8968b() {
        return this.f7483a instanceof Activity;
    }

    /* renamed from: c */
    public final Activity m8969c() {
        return (Activity) this.f7483a;
    }

    /* renamed from: d */
    public final FragmentActivity m8970d() {
        return (FragmentActivity) this.f7483a;
    }
}
