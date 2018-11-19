package com.google.android.m4b.maps.bg;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.m4b.maps.bg.a */
public class C4783a {
    /* renamed from: a */
    private RandomAccessFile f17474a;

    /* renamed from: com.google.android.m4b.maps.bg.a$a */
    public interface C4782a {
        /* renamed from: a */
        private File f17473a;

        /* renamed from: a */
        C4783a m21177a(String str, boolean z) {
            File file = this.f17473a;
            String str2 = "cache_";
            str = String.valueOf(str);
            return new C4783a(new File(file, str.length() != 0 ? str2.concat(str) : new String(str2)), "rw");
        }

        /* renamed from: a */
        void m21178a(String str) {
            File file = this.f17473a;
            String str2 = "cache_";
            str = String.valueOf(str);
            File file2 = new File(file, str.length() != 0 ? str2.concat(str) : new String(str2));
            if (file2.exists() != null) {
                file2.delete();
            }
        }

        C4782a(File file) {
            this.f17473a = file;
        }
    }

    /* renamed from: a */
    public void m21179a() {
        this.f17474a.close();
    }

    /* renamed from: b */
    public void m21183b() {
        this.f17474a.getFD().sync();
    }

    /* renamed from: a */
    public void m21180a(long j) {
        this.f17474a.seek(j);
    }

    /* renamed from: a */
    public void m21181a(byte[] bArr) {
        this.f17474a.write(bArr);
    }

    /* renamed from: b */
    public void m21184b(byte[] bArr) {
        this.f17474a.readFully(bArr);
    }

    /* renamed from: a */
    public void m21182a(byte[] bArr, int i, int i2) {
        this.f17474a.read(bArr, 0, i2);
    }

    /* renamed from: b */
    public void m21185b(byte[] bArr, int i, int i2) {
        this.f17474a.write(bArr, i, i2);
    }

    public C4783a(File file, String str) {
        this.f17474a = new RandomAccessFile(file, str);
    }
}
