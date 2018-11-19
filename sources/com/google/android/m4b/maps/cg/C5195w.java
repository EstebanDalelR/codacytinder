package com.google.android.m4b.maps.cg;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.m4b.maps.cg.w */
public final class C5195w {
    /* renamed from: a */
    private final Handler f19304a;
    /* renamed from: b */
    private final Runnable f19305b;
    /* renamed from: c */
    private volatile boolean f19306c;

    private C5195w(Handler handler, final Runnable runnable) {
        this.f19304a = handler;
        this.f19305b = new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ C5195w f19303b;

            public final void run() {
                this.f19303b.f19306c = false;
                runnable.run();
            }
        };
    }

    public C5195w(Runnable runnable) {
        this(new Handler(Looper.getMainLooper()), runnable);
    }

    /* renamed from: a */
    public final void m23190a() {
        if (!this.f19306c) {
            this.f19306c = true;
            this.f19304a.post(this.f19305b);
        }
    }
}
