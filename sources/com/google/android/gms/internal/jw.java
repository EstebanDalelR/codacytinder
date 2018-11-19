package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@zzzv
@TargetApi(14)
public final class jw {
    /* renamed from: a */
    private final long f16229a = TimeUnit.MILLISECONDS.toNanos(((Long) aja.m19221f().m19334a(alo.f15469t)).longValue());
    /* renamed from: b */
    private long f16230b;
    /* renamed from: c */
    private boolean f16231c = true;

    jw() {
    }

    /* renamed from: a */
    public final void m19951a() {
        this.f16231c = true;
    }

    /* renamed from: a */
    public final void m19952a(SurfaceTexture surfaceTexture, zzama zzama) {
        if (zzama != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f16231c || Math.abs(timestamp - this.f16230b) >= this.f16229a) {
                this.f16231c = false;
                this.f16230b = timestamp;
                fk.f16060a.post(new jx(this, zzama));
            }
        }
    }
}
