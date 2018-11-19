package com.facebook.ads.internal.p047k;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.k.ae */
public class ae {
    /* renamed from: a */
    static final int f4055a = Runtime.getRuntime().availableProcessors();
    /* renamed from: b */
    static final ExecutorService f4056b = Executors.newFixedThreadPool(f4055a);
    /* renamed from: c */
    private static volatile boolean f4057c = true;
    /* renamed from: d */
    private final Bitmap f4058d;
    /* renamed from: e */
    private Bitmap f4059e;
    /* renamed from: f */
    private final C1496l f4060f = new C3320x();

    public ae(Bitmap bitmap) {
        this.f4058d = bitmap;
    }

    /* renamed from: a */
    public Bitmap m5175a() {
        return this.f4059e;
    }

    /* renamed from: a */
    public Bitmap m5176a(int i) {
        this.f4059e = this.f4060f.mo1781a(this.f4058d, (float) i);
        return this.f4059e;
    }
}
