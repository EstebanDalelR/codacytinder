package com.google.android.m4b.maps.ac;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.m4b.maps.ac.b */
public final class C4593b {
    /* renamed from: a */
    private static final OutputStream f16999a = new C45921();

    /* renamed from: com.google.android.m4b.maps.ac.b$1 */
    static class C45921 extends OutputStream {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public final void write(int i) {
        }

        C45921() {
        }

        public final void write(byte[] bArr) {
            C5571j.m24292a((Object) bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            C5571j.m24292a((Object) bArr);
        }
    }

    /* renamed from: a */
    private static long m20686a(InputStream inputStream, OutputStream outputStream) {
        C5571j.m24292a((Object) inputStream);
        C5571j.m24292a((Object) outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static byte[] m20687a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4593b.m20686a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
