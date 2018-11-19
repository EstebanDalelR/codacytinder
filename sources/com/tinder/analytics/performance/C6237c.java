package com.tinder.analytics.performance;

import java.util.concurrent.Callable;

/* renamed from: com.tinder.analytics.performance.c */
final /* synthetic */ class C6237c implements Callable {
    /* renamed from: a */
    private final C8146b f22809a;
    /* renamed from: b */
    private final String f22810b;
    /* renamed from: c */
    private final int f22811c;
    /* renamed from: d */
    private final String f22812d;
    /* renamed from: e */
    private final String f22813e;

    C6237c(C8146b c8146b, String str, int i, String str2, String str3) {
        this.f22809a = c8146b;
        this.f22810b = str;
        this.f22811c = i;
        this.f22812d = str2;
        this.f22813e = str3;
    }

    public Object call() {
        return this.f22809a.m34550a(this.f22810b, this.f22811c, this.f22812d, this.f22813e);
    }
}
