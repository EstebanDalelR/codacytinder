package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.de.ab;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

public final class ah extends C6409f {
    /* renamed from: a */
    private boolean f27439a = false;
    /* renamed from: b */
    private boolean f27440b = false;
    /* renamed from: c */
    private final C4919a f27441c = new C4919a(0);
    /* renamed from: d */
    private final C4919a f27442d = new C4919a(1);
    /* renamed from: e */
    private final C6413m f27443e;

    /* renamed from: com.google.android.m4b.maps.bv.ah$a */
    static class C4919a {
        /* renamed from: a */
        int f18100a;
        /* renamed from: b */
        int f18101b;
        /* renamed from: c */
        int f18102c;
        /* renamed from: d */
        private int f18103d;

        C4919a(int i) {
            this.f18103d = i;
        }

        /* renamed from: a */
        final boolean m22042a() {
            return this.f18100a <= 0 && this.f18101b <= 0 && this.f18102c <= 0;
        }

        /* renamed from: a */
        private static void m22040a(int i, C4662a c4662a, int i2) {
            if (i > 0) {
                c4662a.m20841f(i2, i);
            }
        }

        /* renamed from: a */
        final void m22041a(C4662a c4662a) {
            if (!m22042a()) {
                c4662a = C4665c.m20863c(c4662a, 4);
                C4919a.m22040a(this.f18103d, c4662a, 1);
                C4919a.m22040a(this.f18100a, c4662a, 2);
                C4919a.m22040a(this.f18101b, c4662a, 3);
                C4919a.m22040a(this.f18102c, c4662a, 4);
            }
        }
    }

    /* renamed from: g */
    public final int mo7034g() {
        return 45;
    }

    public ah(C6413m c6413m) {
        this.f27443e = c6413m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean m32380a(int r5, int r6, int r7, int r8) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f27440b;	 Catch:{ all -> 0x0057 }
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r4);	 Catch:{ all -> 0x0057 }
        return r1;
    L_0x0008:
        r0 = 1;
        if (r5 != r0) goto L_0x000e;
    L_0x000b:
        r5 = r4.f27442d;	 Catch:{ all -> 0x0057 }
        goto L_0x0010;
    L_0x000e:
        r5 = r4.f27441c;	 Catch:{ all -> 0x0057 }
    L_0x0010:
        r2 = r4.mo4878a();	 Catch:{ all -> 0x0057 }
        if (r2 != 0) goto L_0x001a;
    L_0x0016:
        if (r8 <= 0) goto L_0x001a;
    L_0x0018:
        r2 = 1;
        goto L_0x001b;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r3 = r5.f18100a;	 Catch:{ all -> 0x0057 }
        r3 = r3 + r6;
        r5.f18100a = r3;	 Catch:{ all -> 0x0057 }
        r6 = r5.f18101b;	 Catch:{ all -> 0x0057 }
        r6 = r6 + r7;
        r5.f18101b = r6;	 Catch:{ all -> 0x0057 }
        r6 = r5.f18102c;	 Catch:{ all -> 0x0057 }
        r6 = r6 + r8;
        r5.f18102c = r6;	 Catch:{ all -> 0x0057 }
        r5 = r4.f27439a;	 Catch:{ all -> 0x0057 }
        if (r5 != 0) goto L_0x0041;
    L_0x002e:
        r5 = r4.f27442d;	 Catch:{ all -> 0x0057 }
        r5 = r5.m22042a();	 Catch:{ all -> 0x0057 }
        if (r5 == 0) goto L_0x003e;
    L_0x0036:
        r5 = r4.f27441c;	 Catch:{ all -> 0x0057 }
        r5 = r5.m22042a();	 Catch:{ all -> 0x0057 }
        if (r5 != 0) goto L_0x0041;
    L_0x003e:
        r4.f27439a = r0;	 Catch:{ all -> 0x0057 }
        r1 = 1;
    L_0x0041:
        monitor-exit(r4);	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x004a;
    L_0x0044:
        r5 = r4.f27443e;
        r5.mo4893c(r4);
        goto L_0x0056;
    L_0x004a:
        if (r2 == 0) goto L_0x0056;
    L_0x004c:
        r5 = r4.f27443e;
        r5.m28010b();
        r5 = r4.f27443e;
        r5.m28015c();
    L_0x0056:
        return r0;
    L_0x0057:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0057 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.ah.a(int, int, int, int):boolean");
    }

    /* renamed from: a */
    public final synchronized boolean mo4878a() {
        boolean z;
        if (this.f27441c.f18102c <= 0) {
            if (this.f27442d.f18102c <= 0) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        C4665c.m20858a(ab.f19827e, dataInput);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo7032a(DataOutput dataOutput) {
        this.f27440b = true;
        C4662a c4662a = new C4662a(ab.f19826d);
        this.f27441c.m22041a(c4662a);
        this.f27442d.m22041a(c4662a);
        c4662a.m20824a((OutputStream) dataOutput);
    }
}
