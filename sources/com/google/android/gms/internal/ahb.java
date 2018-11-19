package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class ahb {
    /* renamed from: a */
    private ByteArrayOutputStream f15260a = new ByteArrayOutputStream(4096);
    /* renamed from: b */
    private Base64OutputStream f15261b = new Base64OutputStream(this.f15260a, 10);

    /* renamed from: a */
    public final void m19164a(byte[] bArr) throws IOException {
        this.f15261b.write(bArr);
    }

    public final String toString() {
        String byteArrayOutputStream;
        try {
            this.f15261b.close();
        } catch (Throwable e) {
            hx.m19912b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f15260a.close();
            byteArrayOutputStream = this.f15260a.toString();
        } catch (Throwable e2) {
            hx.m19912b("HashManager: Unable to convert to Base64.", e2);
            byteArrayOutputStream = "";
        } catch (Throwable th) {
            this.f15260a = null;
            this.f15261b = null;
        }
        this.f15260a = null;
        this.f15261b = null;
        return byteArrayOutputStream;
    }
}
