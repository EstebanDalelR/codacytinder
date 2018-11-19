package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import android.support.annotation.NonNull;
import android.util.Log;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.c */
public class C5891c {
    /* renamed from: a */
    private final C5890a f21595a;
    /* renamed from: b */
    private final String f21596b;
    /* renamed from: c */
    private long f21597c = -1;

    C5891c(C5890a c5890a, @NonNull String str) {
        this.f21595a = c5890a;
        this.f21596b = str;
    }

    /* renamed from: a */
    public void m25428a() {
        this.f21597c = System.currentTimeMillis();
    }

    /* renamed from: b */
    public void m25429b() {
        if (this.f21597c == -1) {
            Log.d("OpStopwatch", String.format("Stopping stopwatch for %s, but it is not running", new Object[]{this.f21596b}));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f21597c;
        m25430c();
        this.f21595a.m25427b(this.f21596b, currentTimeMillis);
    }

    /* renamed from: c */
    public void m25430c() {
        this.f21597c = -1;
    }

    /* renamed from: d */
    public boolean m25431d() {
        return this.f21597c != -1;
    }
}
