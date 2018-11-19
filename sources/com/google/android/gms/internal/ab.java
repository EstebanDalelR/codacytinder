package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2523h;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class ab implements Runnable {
    /* renamed from: a */
    private /* synthetic */ OutputStream f14977a;
    /* renamed from: b */
    private /* synthetic */ byte[] f14978b;

    ab(zzabj zzabj, OutputStream outputStream, byte[] bArr) {
        this.f14977a = outputStream;
        this.f14978b = bArr;
    }

    public final void run() {
        Throwable e;
        Throwable th;
        Closeable dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(this.f14977a);
            try {
                dataOutputStream.writeInt(this.f14978b.length);
                dataOutputStream.write(this.f14978b);
                C2523h.a(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    hx.m19912b("Error transporting the ad response", e);
                    ar.i().m27296a(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream != null) {
                        C2523h.a(this.f14977a);
                    } else {
                        C2523h.a(dataOutputStream);
                    }
                } catch (Throwable th2) {
                    e = th2;
                    if (dataOutputStream == null) {
                        dataOutputStream = this.f14977a;
                    }
                    C2523h.a(dataOutputStream);
                    throw e;
                }
            }
        } catch (Throwable e3) {
            th = e3;
            dataOutputStream = null;
            e = th;
            hx.m19912b("Error transporting the ad response", e);
            ar.i().m27296a(e, "LargeParcelTeleporter.pipeData.1");
            if (dataOutputStream != null) {
                C2523h.a(dataOutputStream);
            } else {
                C2523h.a(this.f14977a);
            }
        } catch (Throwable e32) {
            th = e32;
            dataOutputStream = null;
            e = th;
            if (dataOutputStream == null) {
                dataOutputStream = this.f14977a;
            }
            C2523h.a(dataOutputStream);
            throw e;
        }
    }
}
