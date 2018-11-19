package rx.internal.util;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;

public final class BackpressureDrainManager extends AtomicLong implements Producer {
    private static final long serialVersionUID = 2826241102729529449L;
    /* renamed from: a */
    boolean f61275a;
    /* renamed from: b */
    volatile boolean f61276b;
    /* renamed from: c */
    Throwable f61277c;
    /* renamed from: d */
    final BackpressureQueueCallback f61278d;

    public interface BackpressureQueueCallback {
        boolean accept(Object obj);

        void complete(Throwable th);

        Object peek();

        Object poll();
    }

    public BackpressureDrainManager(BackpressureQueueCallback backpressureQueueCallback) {
        this.f61278d = backpressureQueueCallback;
    }

    /* renamed from: a */
    public void m70621a() {
        this.f61276b = true;
        m70623b();
    }

    /* renamed from: a */
    public void m70622a(Throwable th) {
        if (!this.f61276b) {
            this.f61277c = th;
            this.f61276b = true;
            m70623b();
        }
    }

    public void request(long j) {
        if (j != 0) {
            Object obj;
            long j2;
            long j3;
            do {
                j2 = get();
                obj = j2 == 0 ? 1 : null;
                if (j2 == Format.OFFSET_SAMPLE_RELATIVE) {
                    break;
                } else if (j == Format.OFFSET_SAMPLE_RELATIVE) {
                    j3 = j;
                    obj = 1;
                } else {
                    j3 = j2 > Format.OFFSET_SAMPLE_RELATIVE - j ? Format.OFFSET_SAMPLE_RELATIVE : j2 + j;
                }
            } while (!compareAndSet(j2, j3));
            if (obj != null) {
                m70623b();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void m70623b() {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.f61275a;	 Catch:{ all -> 0x0095 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r13);	 Catch:{ all -> 0x0095 }
        return;
    L_0x0007:
        r0 = 1;
        r13.f61275a = r0;	 Catch:{ all -> 0x0095 }
        r1 = r13.f61276b;	 Catch:{ all -> 0x0095 }
        monitor-exit(r13);	 Catch:{ all -> 0x0095 }
        r2 = r13.get();
        r4 = 0;
        r5 = r13.f61278d;	 Catch:{ all -> 0x0088 }
    L_0x0014:
        r6 = 0;
    L_0x0015:
        r7 = 0;
        r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x001d;
    L_0x001b:
        if (r1 == 0) goto L_0x0038;
    L_0x001d:
        if (r1 == 0) goto L_0x0032;
    L_0x001f:
        r9 = r5.peek();	 Catch:{ all -> 0x0088 }
        if (r9 != 0) goto L_0x002d;
    L_0x0025:
        r1 = r13.f61277c;	 Catch:{ all -> 0x002b }
        r5.complete(r1);	 Catch:{ all -> 0x002b }
        return;
    L_0x002b:
        r1 = move-exception;
        goto L_0x008a;
    L_0x002d:
        r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0038;
    L_0x0032:
        r9 = r5.poll();	 Catch:{ all -> 0x0088 }
        if (r9 != 0) goto L_0x0079;
    L_0x0038:
        monitor-enter(r13);	 Catch:{ all -> 0x0088 }
        r1 = r13.f61276b;	 Catch:{ all -> 0x0073 }
        r2 = r5.peek();	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x0043;
    L_0x0041:
        r2 = 1;
        goto L_0x0044;
    L_0x0043:
        r2 = 0;
    L_0x0044:
        r9 = r13.get();	 Catch:{ all -> 0x0073 }
        r11 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r3 != 0) goto L_0x005b;
    L_0x0051:
        if (r2 != 0) goto L_0x0059;
    L_0x0053:
        if (r1 != 0) goto L_0x0059;
    L_0x0055:
        r13.f61275a = r4;	 Catch:{ all -> 0x0077 }
        monitor-exit(r13);	 Catch:{ all -> 0x0077 }
        return;
    L_0x0059:
        r2 = r11;
        goto L_0x006d;
    L_0x005b:
        r3 = -r6;
        r9 = (long) r3;
        r9 = r13.addAndGet(r9);	 Catch:{ all -> 0x0073 }
        r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x0067;
    L_0x0065:
        if (r2 != 0) goto L_0x006c;
    L_0x0067:
        if (r1 == 0) goto L_0x006f;
    L_0x0069:
        if (r2 == 0) goto L_0x006c;
    L_0x006b:
        goto L_0x006f;
    L_0x006c:
        r2 = r9;
    L_0x006d:
        monitor-exit(r13);	 Catch:{ all -> 0x0073 }
        goto L_0x0014;
    L_0x006f:
        r13.f61275a = r4;	 Catch:{ all -> 0x0077 }
        monitor-exit(r13);	 Catch:{ all -> 0x0077 }
        return;
    L_0x0073:
        r1 = move-exception;
        r0 = 0;
    L_0x0075:
        monitor-exit(r13);	 Catch:{ all -> 0x0077 }
        throw r1;	 Catch:{ all -> 0x002b }
    L_0x0077:
        r1 = move-exception;
        goto L_0x0075;
    L_0x0079:
        r7 = r5.accept(r9);	 Catch:{ all -> 0x0088 }
        if (r7 == 0) goto L_0x0080;
    L_0x007f:
        return;
    L_0x0080:
        r7 = 1;
        r9 = r2 - r7;
        r6 = r6 + 1;
        r2 = r9;
        goto L_0x0015;
    L_0x0088:
        r1 = move-exception;
        r0 = 0;
    L_0x008a:
        if (r0 != 0) goto L_0x0094;
    L_0x008c:
        monitor-enter(r13);
        r13.f61275a = r4;	 Catch:{ all -> 0x0091 }
        monitor-exit(r13);	 Catch:{ all -> 0x0091 }
        goto L_0x0094;
    L_0x0091:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0091 }
        throw r0;
    L_0x0094:
        throw r1;
    L_0x0095:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0095 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.BackpressureDrainManager.b():void");
    }
}
