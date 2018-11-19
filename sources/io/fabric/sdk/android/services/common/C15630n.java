package io.fabric.sdk.android.services.common;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: io.fabric.sdk.android.services.common.n */
public class C15630n {
    /* renamed from: a */
    private final String f48376a;
    /* renamed from: b */
    private final String f48377b;
    /* renamed from: c */
    private final boolean f48378c;
    /* renamed from: d */
    private long f48379d;
    /* renamed from: e */
    private long f48380e;

    public C15630n(String str, String str2) {
        this.f48376a = str;
        this.f48377b = str2;
        this.f48378c = Log.isLoggable(str2, 2) ^ 1;
    }

    /* renamed from: a */
    public synchronized void m58707a() {
        if (!this.f48378c) {
            this.f48379d = SystemClock.elapsedRealtime();
            this.f48380e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void m58708b() {
        if (!this.f48378c) {
            if (this.f48380e == 0) {
                this.f48380e = SystemClock.elapsedRealtime() - this.f48379d;
                m58706c();
            }
        }
    }

    /* renamed from: c */
    private void m58706c() {
        String str = this.f48377b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f48376a);
        stringBuilder.append(": ");
        stringBuilder.append(this.f48380e);
        stringBuilder.append("ms");
        Log.v(str, stringBuilder.toString());
    }
}
