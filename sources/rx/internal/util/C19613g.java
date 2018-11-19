package rx.internal.util;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.PrintStream;
import java.util.Queue;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;
import rx.internal.util.atomic.C19611d;
import rx.internal.util.unsafe.C19924r;
import rx.internal.util.unsafe.C19925j;
import rx.internal.util.unsafe.af;

/* renamed from: rx.internal.util.g */
public class C19613g implements Subscription {
    /* renamed from: b */
    public static final int f61292b;
    /* renamed from: a */
    public volatile Object f61293a;
    /* renamed from: c */
    private Queue<Object> f61294c;
    /* renamed from: d */
    private final int f61295d;

    static {
        int i = C19445f.m69980a() ? 16 : ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to set 'rx.buffer.size' with value ");
                stringBuilder.append(property);
                stringBuilder.append(" => ");
                stringBuilder.append(e.getMessage());
                printStream.println(stringBuilder.toString());
            }
        }
        f61292b = i;
    }

    /* renamed from: a */
    public static C19613g m70633a() {
        if (af.m69984a()) {
            return new C19613g(false, f61292b);
        }
        return new C19613g();
    }

    /* renamed from: b */
    public static C19613g m70634b() {
        if (af.m69984a()) {
            return new C19613g(true, f61292b);
        }
        return new C19613g();
    }

    private C19613g(Queue<Object> queue, int i) {
        this.f61294c = queue;
        this.f61295d = i;
    }

    private C19613g(boolean z, int i) {
        this.f61294c = z ? new C19925j(i) : new C19924r(i);
        this.f61295d = i;
    }

    /* renamed from: c */
    public synchronized void m70638c() {
    }

    public void unsubscribe() {
        m70638c();
    }

    C19613g() {
        this(new C19611d(f61292b), f61292b);
    }

    /* renamed from: a */
    public void m70635a(Object obj) throws MissingBackpressureException {
        synchronized (this) {
            Queue queue = this.f61294c;
            int i = 1;
            if (queue != null) {
                obj = queue.offer(NotificationLite.m69885a(obj)) ^ 1;
                i = 0;
            } else {
                obj = null;
            }
        }
        if (i != 0) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (obj != null) {
            throw new MissingBackpressureException();
        }
    }

    /* renamed from: d */
    public void m70639d() {
        if (this.f61293a == null) {
            this.f61293a = NotificationLite.m69884a();
        }
    }

    /* renamed from: e */
    public boolean m70640e() {
        Queue queue = this.f61294c;
        if (queue != null) {
            if (!queue.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public java.lang.Object m70641f() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f61294c;	 Catch:{ all -> 0x001d }
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r4);	 Catch:{ all -> 0x001d }
        return r1;
    L_0x0008:
        r2 = r0.poll();	 Catch:{ all -> 0x001d }
        r3 = r4.f61293a;	 Catch:{ all -> 0x001d }
        if (r2 != 0) goto L_0x001b;
    L_0x0010:
        if (r3 == 0) goto L_0x001b;
    L_0x0012:
        r0 = r0.peek();	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x001b;
    L_0x0018:
        r4.f61293a = r1;	 Catch:{ all -> 0x001d }
        r2 = r3;
    L_0x001b:
        monitor-exit(r4);	 Catch:{ all -> 0x001d }
        return r2;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.g.f():java.lang.Object");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    public java.lang.Object m70642g() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f61294c;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x0008;
    L_0x0005:
        r0 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x001b }
        return r0;
    L_0x0008:
        r1 = r0.peek();	 Catch:{ all -> 0x001b }
        r2 = r3.f61293a;	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x0019;
    L_0x0010:
        if (r2 == 0) goto L_0x0019;
    L_0x0012:
        r0 = r0.peek();	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        r1 = r2;
    L_0x0019:
        monitor-exit(r3);	 Catch:{ all -> 0x001b }
        return r1;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.g.g():java.lang.Object");
    }

    /* renamed from: b */
    public boolean m70636b(Object obj) {
        return NotificationLite.m69888b(obj);
    }

    /* renamed from: c */
    public Object m70637c(Object obj) {
        return NotificationLite.m69891e(obj);
    }

    public boolean isUnsubscribed() {
        return this.f61294c == null;
    }
}
