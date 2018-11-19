package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.evernote.android.job.util.C1150e;
import com.evernote.android.job.util.C3142c;

/* renamed from: com.evernote.android.job.h */
final class C1146h {
    /* renamed from: a */
    private static final C3142c f3012a = new C3142c("WakeLockUtil");
    /* renamed from: b */
    private static final SparseArray<WakeLock> f3013b = new SparseArray();
    /* renamed from: c */
    private static int f3014c = 1;

    @Nullable
    /* renamed from: a */
    static WakeLock m3874a(@NonNull Context context, @NonNull String str, long j) {
        WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        newWakeLock.setReferenceCounted(false);
        return C1146h.m3876a(context, newWakeLock, j) != null ? newWakeLock : null;
    }

    /* renamed from: a */
    static boolean m3876a(@NonNull Context context, @Nullable WakeLock wakeLock, long j) {
        if (!(wakeLock == null || wakeLock.isHeld() || C1150e.m3894b(context) == null)) {
            try {
                wakeLock.acquire(j);
                return true;
            } catch (Throwable e) {
                f3012a.m12117a(e);
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m3875a(@Nullable WakeLock wakeLock) {
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
            } catch (Throwable e) {
                f3012a.m12117a(e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static android.content.ComponentName m3873a(android.content.Context r6, android.content.Intent r7) {
        /*
        r0 = f3013b;
        monitor-enter(r0);
        r1 = f3014c;	 Catch:{ all -> 0x0049 }
        r2 = f3014c;	 Catch:{ all -> 0x0049 }
        r3 = 1;
        r2 = r2 + r3;
        f3014c = r2;	 Catch:{ all -> 0x0049 }
        r2 = f3014c;	 Catch:{ all -> 0x0049 }
        if (r2 > 0) goto L_0x0011;
    L_0x000f:
        f3014c = r3;	 Catch:{ all -> 0x0049 }
    L_0x0011:
        r2 = "com.evernote.android.job.wakelockid";
        r7.putExtra(r2, r1);	 Catch:{ all -> 0x0049 }
        r7 = r6.startService(r7);	 Catch:{ all -> 0x0049 }
        if (r7 != 0) goto L_0x001f;
    L_0x001c:
        r6 = 0;
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        return r6;
    L_0x001f:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r2.<init>();	 Catch:{ all -> 0x0049 }
        r3 = "wake:";
        r2.append(r3);	 Catch:{ all -> 0x0049 }
        r3 = r7.flattenToShortString();	 Catch:{ all -> 0x0049 }
        r2.append(r3);	 Catch:{ all -> 0x0049 }
        r2 = r2.toString();	 Catch:{ all -> 0x0049 }
        r3 = java.util.concurrent.TimeUnit.MINUTES;	 Catch:{ all -> 0x0049 }
        r4 = 3;
        r3 = r3.toMillis(r4);	 Catch:{ all -> 0x0049 }
        r6 = com.evernote.android.job.C1146h.m3874a(r6, r2, r3);	 Catch:{ all -> 0x0049 }
        if (r6 == 0) goto L_0x0047;
    L_0x0042:
        r2 = f3013b;	 Catch:{ all -> 0x0049 }
        r2.put(r1, r6);	 Catch:{ all -> 0x0049 }
    L_0x0047:
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        return r7;
    L_0x0049:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.h.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    public static boolean m3877a(Intent intent) {
        if (intent == null) {
            return false;
        }
        intent = intent.getIntExtra("com.evernote.android.job.wakelockid", 0);
        if (intent == null) {
            return false;
        }
        synchronized (f3013b) {
            C1146h.m3875a((WakeLock) f3013b.get(intent));
            f3013b.remove(intent);
        }
        return true;
    }
}
