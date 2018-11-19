package com.google.android.m4b.maps.ay;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: com.google.android.m4b.maps.ay.y */
public class C7441y extends C6409f {
    /* renamed from: a */
    private final int f27250a;
    /* renamed from: b */
    private final byte[] f27251b;
    /* renamed from: c */
    private final boolean f27252c;
    /* renamed from: d */
    private final Object f27253d;

    public C7441y(int i, byte[] bArr, boolean z, Object obj) {
        this.f27250a = i;
        this.f27251b = bArr;
        this.f27252c = z;
        this.f27253d = obj;
    }

    /* renamed from: g */
    public final int mo7034g() {
        return this.f27250a;
    }

    /* renamed from: a */
    public final boolean mo4878a() {
        return this.f27252c;
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        dataOutput.write(this.f27251b);
        if (this.f27253d != null) {
            synchronized (this.f27253d) {
                this.f27253d.notifyAll();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        if (this.f27253d != null) {
            synchronized (this.f27253d) {
                this.f27253d.notifyAll();
            }
        }
        return true;
    }
}
