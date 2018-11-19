package com.google.android.m4b.maps.ay;

import android.util.Log;
import com.facebook.ads.AdError;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ay.q */
public class C4726q {
    /* renamed from: a */
    private static final String f17355a = "q";
    /* renamed from: b */
    private static final long f17356b = TimeUnit.MINUTES.toMillis(1);
    /* renamed from: d */
    private static int f17357d;
    /* renamed from: c */
    private volatile int f17358c = -1;
    /* renamed from: e */
    private StringBuilder f17359e;
    /* renamed from: f */
    private C4712d f17360f;
    /* renamed from: g */
    private long f17361g;
    /* renamed from: h */
    private long f17362h;

    public C4726q(Vector<C4718l> vector, C4712d c4712d) {
        this.f17360f = c4712d;
        this.f17359e = new StringBuilder("DRD");
        c4712d = this.f17359e;
        c4712d.append("(");
        int i = f17357d;
        f17357d = i + 1;
        c4712d.append(i);
        c4712d.append("): ");
        c4712d = "";
        vector = vector.iterator();
        while (vector.hasNext()) {
            C4718l c4718l = (C4718l) vector.next();
            this.f17359e.append(c4712d);
            c4712d = "|";
            this.f17359e.append(c4718l.mo7034g());
        }
        this.f17361g = C4712d.m20957c();
    }

    /* renamed from: a */
    public final void m21038a() {
        this.f17362h = C4712d.m20957c() - this.f17361g;
        this.f17359e.append(", ");
        if (this.f17362h < 1000) {
            this.f17359e.append("<1s");
            return;
        }
        StringBuilder stringBuilder = this.f17359e;
        stringBuilder.append(this.f17362h / 1000);
        stringBuilder.append("s");
    }

    /* renamed from: a */
    public final void m21039a(int i, int i2) {
        int c = (int) (C4712d.m20957c() - this.f17361g);
        if (i2 >= 8192) {
            long j = (long) c;
            if (j <= f17356b) {
                this.f17358c = (int) (TimeUnit.SECONDS.toMillis((long) i2) / j);
                if (C4728u.m21050a(f17355a, 3)) {
                    String str = f17355a;
                    int i3 = this.f17358c;
                    StringBuilder stringBuilder = new StringBuilder(67);
                    stringBuilder.append("Sent ");
                    stringBuilder.append(i);
                    stringBuilder.append(", Loaded ");
                    stringBuilder.append(i2);
                    stringBuilder.append(" bytes.  Byte/Sec = ");
                    stringBuilder.append(i3);
                    Log.d(str, stringBuilder.toString());
                }
            }
        }
        this.f17359e.append(", ");
        if (i2 < AdError.NETWORK_ERROR_CODE) {
            this.f17359e.append("<1kb");
        } else {
            StringBuilder stringBuilder2 = this.f17359e;
            stringBuilder2.append(i2 / AdError.NETWORK_ERROR_CODE);
            stringBuilder2.append("kb");
        }
        if (C4728u.m21050a(f17355a, 3) != 0) {
            Log.d(f17355a, this.f17359e.toString());
        }
    }
}
