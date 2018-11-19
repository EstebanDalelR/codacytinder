package com.google.android.gms.internal;

import android.webkit.ValueCallback;

final class agv implements ValueCallback<String> {
    /* renamed from: a */
    private /* synthetic */ agu f15246a;

    agv(agu agu) {
        this.f15246a = agu;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.f15246a.f15244d.m19151a(this.f15246a.f15241a, this.f15246a.f15242b, (String) obj, this.f15246a.f15243c);
    }
}
