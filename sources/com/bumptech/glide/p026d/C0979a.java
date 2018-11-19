package com.bumptech.glide.p026d;

import android.util.Log;
import java.util.Queue;

/* renamed from: com.bumptech.glide.d.a */
public final class C0979a {
    /* renamed from: b */
    private static final C0979a f2665b = new C0979a();
    /* renamed from: a */
    private final Queue<byte[]> f2666a = C0987h.m3410a(0);

    /* renamed from: a */
    public static C0979a m3383a() {
        return f2665b;
    }

    private C0979a() {
    }

    /* renamed from: b */
    public byte[] m3385b() {
        byte[] bArr;
        synchronized (this.f2666a) {
            bArr = (byte[]) this.f2666a.poll();
        }
        if (bArr == null) {
            bArr = new byte[65536];
            if (Log.isLoggable("ByteArrayPool", 3)) {
                Log.d("ByteArrayPool", "Created temp bytes");
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public boolean m3384a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f2666a) {
            if (this.f2666a.size() < 32) {
                z = true;
                this.f2666a.offer(bArr);
            }
        }
        return z;
    }
}
