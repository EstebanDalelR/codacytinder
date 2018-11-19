package java8.util;

import com.tinder.api.ManagerWebServices;
import java.util.Comparator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class LBQSpliterator<E> implements Spliterator<E> {
    /* renamed from: h */
    private static final Unsafe f54249h = UnsafeAccess.f48790a;
    /* renamed from: i */
    private static final long f54250i;
    /* renamed from: j */
    private static final long f54251j;
    /* renamed from: k */
    private static final long f54252k;
    /* renamed from: l */
    private static final long f54253l;
    /* renamed from: m */
    private static final long f54254m;
    /* renamed from: a */
    private final LinkedBlockingQueue<E> f54255a;
    /* renamed from: b */
    private final ReentrantLock f54256b;
    /* renamed from: c */
    private final ReentrantLock f54257c;
    /* renamed from: d */
    private Object f54258d;
    /* renamed from: e */
    private int f54259e;
    /* renamed from: f */
    private boolean f54260f;
    /* renamed from: g */
    private long f54261g;

    public int characteristics() {
        return 4368;
    }

    private LBQSpliterator(LinkedBlockingQueue<E> linkedBlockingQueue) {
        this.f54255a = linkedBlockingQueue;
        this.f54261g = (long) linkedBlockingQueue.size();
        this.f54256b = m63841b((LinkedBlockingQueue) linkedBlockingQueue);
        this.f54257c = m63844c((LinkedBlockingQueue) linkedBlockingQueue);
    }

    /* renamed from: a */
    static <T> Spliterator<T> m63838a(LinkedBlockingQueue<T> linkedBlockingQueue) {
        return new LBQSpliterator(linkedBlockingQueue);
    }

    /* renamed from: a */
    Object m63846a(Object obj) {
        Object b = m63840b(obj);
        return obj == b ? m63845d(this.f54255a) : b;
    }

    public long estimateSize() {
        return this.f54261g;
    }

    public void forEachRemaining(Consumer<? super E> consumer) {
        Objects.m59115b(consumer);
        if (!this.f54260f) {
            this.f54260f = true;
            Object obj = this.f54258d;
            this.f54258d = null;
            m63847a(consumer, obj);
        }
    }

    public Comparator<? super E> getComparator() {
        return Spliterators.m59174b((Spliterator) this);
    }

    public long getExactSizeIfKnown() {
        return Spliterators.m59152a((Spliterator) this);
    }

    public boolean hasCharacteristics(int i) {
        return Spliterators.m59173a((Spliterator) this, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean tryAdvance(java8.util.function.Consumer<? super E> r4) {
        /*
        r3 = this;
        java8.util.Objects.m59115b(r4);
        r0 = r3.f54260f;
        if (r0 != 0) goto L_0x0038;
    L_0x0007:
        r0 = 0;
        r3.m63839a();
        r1 = r3.f54258d;	 Catch:{ all -> 0x0033 }
        if (r1 != 0) goto L_0x0017;
    L_0x000f:
        r1 = r3.f54255a;	 Catch:{ all -> 0x0033 }
        r1 = m63845d(r1);	 Catch:{ all -> 0x0033 }
        if (r1 == 0) goto L_0x0023;
    L_0x0017:
        r0 = m63843c(r1);	 Catch:{ all -> 0x0033 }
        r1 = r3.m63846a(r1);	 Catch:{ all -> 0x0033 }
        if (r0 != 0) goto L_0x0023;
    L_0x0021:
        if (r1 != 0) goto L_0x0017;
    L_0x0023:
        r3.f54258d = r1;	 Catch:{ all -> 0x0033 }
        r2 = 1;
        if (r1 != 0) goto L_0x002a;
    L_0x0028:
        r3.f54260f = r2;	 Catch:{ all -> 0x0033 }
    L_0x002a:
        r3.m63842b();
        if (r0 == 0) goto L_0x0038;
    L_0x002f:
        r4.accept(r0);
        return r2;
    L_0x0033:
        r4 = move-exception;
        r3.m63842b();
        throw r4;
    L_0x0038:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.LBQSpliterator.tryAdvance(java8.util.function.Consumer):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java8.util.Spliterator<E> trySplit() {
        /*
        r12 = this;
        r0 = r12.f54255a;
        r1 = r12.f54260f;
        if (r1 != 0) goto L_0x0073;
    L_0x0006:
        r1 = r12.f54258d;
        if (r1 != 0) goto L_0x0010;
    L_0x000a:
        r1 = m63845d(r0);
        if (r1 == 0) goto L_0x0073;
    L_0x0010:
        r1 = m63840b(r1);
        if (r1 == 0) goto L_0x0073;
    L_0x0016:
        r1 = r12.f54259e;
        r2 = 1;
        r1 = r1 + r2;
        r3 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r1 = java.lang.Math.min(r1, r3);
        r12.f54259e = r1;
        r3 = new java.lang.Object[r1];
        r4 = r12.f54258d;
        r12.m63839a();
        r5 = 0;
        if (r4 != 0) goto L_0x0037;
    L_0x002c:
        r4 = m63845d(r0);	 Catch:{ all -> 0x0035 }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0037;
    L_0x0033:
        r0 = 0;
        goto L_0x004f;
    L_0x0035:
        r0 = move-exception;
        goto L_0x004b;
    L_0x0037:
        r0 = 0;
    L_0x0038:
        if (r4 == 0) goto L_0x004f;
    L_0x003a:
        if (r0 >= r1) goto L_0x004f;
    L_0x003c:
        r6 = m63843c(r4);	 Catch:{ all -> 0x0035 }
        r3[r0] = r6;	 Catch:{ all -> 0x0035 }
        if (r6 == 0) goto L_0x0046;
    L_0x0044:
        r0 = r0 + 1;
    L_0x0046:
        r4 = r12.m63846a(r4);	 Catch:{ all -> 0x0035 }
        goto L_0x0038;
    L_0x004b:
        r12.m63842b();
        throw r0;
    L_0x004f:
        r12.m63842b();
        r12.f54258d = r4;
        r6 = 0;
        if (r4 != 0) goto L_0x005d;
    L_0x0058:
        r12.f54261g = r6;
        r12.f54260f = r2;
        goto L_0x006a;
    L_0x005d:
        r1 = r12.f54261g;
        r8 = (long) r0;
        r10 = r1 - r8;
        r12.f54261g = r10;
        r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r1 >= 0) goto L_0x006a;
    L_0x0068:
        r12.f54261g = r6;
    L_0x006a:
        if (r0 <= 0) goto L_0x0073;
    L_0x006c:
        r1 = 4368; // 0x1110 float:6.121E-42 double:2.158E-320;
        r0 = java8.util.Spliterators.m59167a(r3, r5, r0, r1);
        return r0;
    L_0x0073:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.LBQSpliterator.trySplit():java8.util.Spliterator<E>");
    }

    /* renamed from: a */
    void m63847a(Consumer<? super E> consumer, Object obj) {
        Object[] objArr = null;
        int i = 0;
        do {
            m63839a();
            if (objArr == null) {
                if (obj == null) {
                    try {
                        obj = m63845d(this.f54255a);
                    } catch (Throwable th) {
                        m63842b();
                    }
                }
                Object obj2 = obj;
                while (obj2 != null) {
                    if (m63843c(obj2) != null) {
                        i++;
                        if (i == 64) {
                            break;
                        }
                    }
                    obj2 = m63846a(obj2);
                }
                objArr = new Object[i];
            }
            int i2 = 0;
            while (obj != null && i2 < r2) {
                Object c = m63843c(obj);
                objArr[i2] = c;
                if (c != null) {
                    i2++;
                }
                obj = m63846a(obj);
            }
            m63842b();
            for (int i3 = 0; i3 < i2; i3++) {
                consumer.accept(objArr[i3]);
            }
            if (i2 <= 0) {
                return;
            }
        } while (obj != null);
    }

    /* renamed from: a */
    private void m63839a() {
        this.f54256b.lock();
        this.f54257c.lock();
    }

    /* renamed from: b */
    private void m63842b() {
        this.f54257c.unlock();
        this.f54256b.unlock();
    }

    /* renamed from: b */
    private static ReentrantLock m63841b(LinkedBlockingQueue<?> linkedBlockingQueue) {
        return (ReentrantLock) f54249h.getObject(linkedBlockingQueue, f54253l);
    }

    /* renamed from: c */
    private static ReentrantLock m63844c(LinkedBlockingQueue<?> linkedBlockingQueue) {
        return (ReentrantLock) f54249h.getObject(linkedBlockingQueue, f54254m);
    }

    /* renamed from: d */
    private static <T> Object m63845d(LinkedBlockingQueue<T> linkedBlockingQueue) {
        return m63840b(f54249h.getObject(linkedBlockingQueue, f54250i));
    }

    /* renamed from: b */
    private static Object m63840b(Object obj) {
        return f54249h.getObject(obj, f54252k);
    }

    /* renamed from: c */
    private static <T> T m63843c(Object obj) {
        return f54249h.getObject(obj, f54251j);
    }

    static {
        try {
            Class cls = Class.forName("java.util.concurrent.LinkedBlockingQueue$Node");
            f54250i = f54249h.objectFieldOffset(LinkedBlockingQueue.class.getDeclaredField("head"));
            f54251j = f54249h.objectFieldOffset(cls.getDeclaredField("item"));
            f54252k = f54249h.objectFieldOffset(cls.getDeclaredField(ManagerWebServices.FB_PARAM_NEXT));
            f54253l = f54249h.objectFieldOffset(LinkedBlockingQueue.class.getDeclaredField("putLock"));
            f54254m = f54249h.objectFieldOffset(LinkedBlockingQueue.class.getDeclaredField("takeLock"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
