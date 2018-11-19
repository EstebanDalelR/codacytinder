package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class ak {
    /* renamed from: a */
    public static void m9060a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    /* renamed from: a */
    public static void m9061a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length());
            stringBuilder.append("checkMainThread: current thread ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" IS NOT the main thread ");
            stringBuilder.append(valueOf2);
            stringBuilder.append("!");
            Log.e("Asserts", stringBuilder.toString());
            throw new IllegalStateException(str);
        }
    }
}
