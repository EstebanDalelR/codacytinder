package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.m4b.maps.aj.d */
public final class C4633d {
    /* renamed from: a */
    private static Logger f17059a = Logger.getLogger(C4633d.class.getName());
    /* renamed from: b */
    private C4632a f17060b;
    /* renamed from: c */
    private boolean f17061c;

    /* renamed from: com.google.android.m4b.maps.aj.d$a */
    static final class C4632a {
        /* renamed from: a */
        final Runnable f17056a;
        /* renamed from: b */
        final Executor f17057b;
        /* renamed from: c */
        C4632a f17058c;

        C4632a(Runnable runnable, Executor executor, C4632a c4632a) {
            this.f17056a = runnable;
            this.f17057b = executor;
            this.f17058c = c4632a;
        }
    }

    /* renamed from: a */
    public final void m20755a(Runnable runnable, Executor executor) {
        C5571j.m24293a((Object) runnable, (Object) "Runnable was null.");
        C5571j.m24293a((Object) executor, (Object) "Executor was null.");
        synchronized (this) {
            if (this.f17061c) {
                C4633d.m20753b(runnable, executor);
                return;
            }
            this.f17060b = new C4632a(runnable, executor, this.f17060b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m20754a() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f17061c;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0007:
        r0 = 1;
        r4.f17061c = r0;	 Catch:{ all -> 0x0029 }
        r0 = r4.f17060b;	 Catch:{ all -> 0x0029 }
        r1 = 0;
        r4.f17060b = r1;	 Catch:{ all -> 0x0029 }
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x0013:
        if (r1 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r1.f17058c;
        r1.f17058c = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0013;
    L_0x001c:
        if (r0 == 0) goto L_0x0028;
    L_0x001e:
        r1 = r0.f17056a;
        r2 = r0.f17057b;
        com.google.android.m4b.maps.aj.C4633d.m20753b(r1, r2);
        r0 = r0.f17058c;
        goto L_0x001c;
    L_0x0028:
        return;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aj.d.a():void");
    }

    /* renamed from: b */
    private static void m20753b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = f17059a;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append(runnable);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            logger.log(level, stringBuilder.toString(), e);
        }
    }
}
