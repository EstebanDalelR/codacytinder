package com.google.android.gms.internal;

import java.io.PrintWriter;
import java.util.List;

final class zt extends zq {
    /* renamed from: a */
    private final zr f23534a = new zr();

    zt() {
    }

    /* renamed from: a */
    public final void mo4727a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f23534a.m20294a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
