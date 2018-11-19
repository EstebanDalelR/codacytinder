package com.facebook.ads.internal.p043j.p045b;

import android.text.TextUtils;
import com.facebook.ads.internal.p043j.p045b.p046a.C3304b;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: com.facebook.ads.internal.j.b.e */
class C3307e extends C1466k {
    /* renamed from: a */
    private final C3309h f10086a;
    /* renamed from: b */
    private final C3304b f10087b;
    /* renamed from: c */
    private C1452b f10088c;

    public C3307e(C3309h c3309h, C3304b c3304b) {
        super(c3309h, c3304b);
        this.f10087b = c3304b;
        this.f10086a = c3309h;
    }

    /* renamed from: a */
    private void m12758a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = m5131a(bArr, j, bArr.length);
            if (a != -1) {
                outputStream.write(bArr, 0, a);
                j += (long) a;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: a */
    private boolean m12759a(C1454d c1454d) {
        int a = this.f10086a.mo1777a();
        return (a > 0 ? 1 : null) == null || !c1454d.f3997c || ((float) c1454d.f3996b) <= ((float) this.f10087b.mo1767a()) + (((float) a) * 0.2f);
    }

    /* renamed from: b */
    private String m12760b(C1454d c1454d) {
        int isEmpty = TextUtils.isEmpty(this.f10086a.m12773c()) ^ 1;
        int a = this.f10087b.mo1772d() ? this.f10087b.mo1767a() : this.f10086a.mo1777a();
        Object obj = a >= 0 ? 1 : null;
        long j = c1454d.f3997c ? ((long) a) - c1454d.f3996b : (long) a;
        Object obj2 = (obj == null || !c1454d.f3997c) ? null : 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c1454d.f3997c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        stringBuilder.append("Accept-Ranges: bytes\n");
        stringBuilder.append(obj != null ? String.format("Content-Length: %d\n", new Object[]{Long.valueOf(j)}) : "");
        stringBuilder.append(obj2 != null ? String.format("Content-Range: bytes %d-%d/%d\n", new Object[]{Long.valueOf(c1454d.f3996b), Integer.valueOf(a - 1), Integer.valueOf(a)}) : "");
        stringBuilder.append(isEmpty != 0 ? String.format("Content-Type: %s\n", new Object[]{r0}) : "");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private void m12761b(OutputStream outputStream, long j) {
        try {
            C3309h c3309h = new C3309h(this.f10086a);
            c3309h.mo1779a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a = c3309h.mo1778a(bArr);
                if (a == -1) {
                    break;
                }
                outputStream.write(bArr, 0, a);
            }
            outputStream.flush();
        } finally {
            this.f10086a.mo1780b();
        }
    }

    /* renamed from: a */
    protected void mo1775a(int i) {
        if (this.f10088c != null) {
            this.f10088c.mo1776a(this.f10087b.f10082a, this.f10086a.f10091a, i);
        }
    }

    /* renamed from: a */
    public void m12763a(C1452b c1452b) {
        this.f10088c = c1452b;
    }

    /* renamed from: a */
    public void m12764a(C1454d c1454d, Socket socket) {
        OutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(m12760b(c1454d).getBytes("UTF-8"));
        long j = c1454d.f3996b;
        if (m12759a(c1454d)) {
            m12758a(bufferedOutputStream, j);
        } else {
            m12761b(bufferedOutputStream, j);
        }
    }
}
