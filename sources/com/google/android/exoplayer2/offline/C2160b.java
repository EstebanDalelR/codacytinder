package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.offline.b */
public abstract class C2160b {
    /* renamed from: a */
    public final String f6191a;
    /* renamed from: b */
    public final int f6192b;
    /* renamed from: c */
    public final Uri f6193c;
    /* renamed from: d */
    public final boolean f6194d;
    /* renamed from: e */
    public final byte[] f6195e;

    /* renamed from: a */
    protected abstract Downloader m7767a(C2161c c2161c);

    /* renamed from: a */
    protected abstract void m7768a(DataOutputStream dataOutputStream) throws IOException;

    /* renamed from: a */
    public static void m7766a(C2160b c2160b, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(c2160b.f6191a);
        dataOutputStream.writeInt(c2160b.f6192b);
        c2160b.m7768a(dataOutputStream);
        dataOutputStream.flush();
    }

    /* renamed from: a */
    public boolean m7769a(C2160b c2160b) {
        return this.f6193c.equals(c2160b.f6193c);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = false;
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2160b c2160b = (C2160b) obj;
                if (this.f6191a.equals(c2160b.f6191a) && this.f6192b == c2160b.f6192b && this.f6193c.equals(c2160b.f6193c) && this.f6194d == c2160b.f6194d && Arrays.equals(this.f6195e, c2160b.f6195e) != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6193c.hashCode() * 31) + this.f6194d) * 31) + Arrays.hashCode(this.f6195e);
    }
}
