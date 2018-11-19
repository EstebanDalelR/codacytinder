package com.leanplum.p069a;

import java.io.OutputStream;

/* renamed from: com.leanplum.a.bu */
final class bu implements Runnable {
    /* renamed from: a */
    private /* synthetic */ byte[] f21228a;
    /* renamed from: b */
    private /* synthetic */ ak f21229b;

    bu(ak akVar, byte[] bArr) {
        this.f21229b = akVar;
        this.f21228a = bArr;
    }

    public final void run() {
        try {
            synchronized (this.f21229b.f21165x) {
                if (this.f21229b.f21159r != null) {
                    OutputStream outputStream = this.f21229b.f21159r.getOutputStream();
                    outputStream.write(this.f21228a);
                    outputStream.flush();
                }
            }
        } catch (Exception e) {
            this.f21229b.f21158q.mo6206a(e);
        }
    }
}
