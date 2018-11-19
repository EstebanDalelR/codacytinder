package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class nv implements ProxyResult {
    /* renamed from: a */
    private Status f26949a;
    /* renamed from: b */
    private ProxyResponse f26950b;

    public nv(ProxyResponse proxyResponse) {
        this.f26950b = proxyResponse;
        this.f26949a = Status.zzfni;
    }

    public nv(Status status) {
        this.f26949a = status;
    }

    public final ProxyResponse getResponse() {
        return this.f26950b;
    }

    public final Status getStatus() {
        return this.f26949a;
    }
}
