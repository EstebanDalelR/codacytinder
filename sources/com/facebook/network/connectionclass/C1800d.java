package com.facebook.network.connectionclass;

import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.facebook.network.connectionclass.d */
class C1800d {
    /* renamed from: a */
    private byte[] f4923a = new byte[512];
    /* renamed from: b */
    private FileInputStream f4924b;
    /* renamed from: c */
    private int f4925c;
    /* renamed from: d */
    private int f4926d;

    /* renamed from: a */
    public void m6210a(FileInputStream fileInputStream) {
        this.f4924b = fileInputStream;
        this.f4926d = 0;
        this.f4925c = 0;
    }

    /* renamed from: a */
    public int m6208a(byte[] bArr) throws IOException {
        if (this.f4925c >= this.f4926d) {
            this.f4926d = this.f4924b.read(this.f4923a);
            this.f4925c = 0;
        }
        int i = 0;
        while (this.f4926d != -1 && i < bArr.length && this.f4923a[this.f4925c] != (byte) 10) {
            bArr[i] = this.f4923a[this.f4925c];
            this.f4925c++;
            if (this.f4925c >= this.f4926d) {
                this.f4926d = this.f4924b.read(this.f4923a);
                this.f4925c = 0;
            }
            i++;
        }
        this.f4925c++;
        if (this.f4926d == -1) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public void m6209a() throws IOException {
        if (this.f4925c >= this.f4926d) {
            this.f4926d = this.f4924b.read(this.f4923a);
            this.f4925c = 0;
        }
        while (this.f4926d != -1 && this.f4923a[this.f4925c] != (byte) 10) {
            this.f4925c++;
            if (this.f4925c >= this.f4926d) {
                this.f4926d = this.f4924b.read(this.f4923a);
                this.f4925c = 0;
            }
        }
        this.f4925c++;
    }
}
