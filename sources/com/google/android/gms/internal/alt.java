package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;

@zzzv
public final class alt {
    @Nullable
    /* renamed from: a */
    public static alr m19351a(@Nullable alq alq) {
        if (!alq.m19340a()) {
            ec.m27332a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (alq.m19342c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(alq.m19343d())) {
            return new alr(alq.m19342c(), alq.m19343d(), alq.m19341b(), alq.m19344e());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
