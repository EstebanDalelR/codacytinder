package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import rx.Subscription;
import rx.exceptions.C19410a;

/* renamed from: rx.internal.util.i */
public final class C19615i implements Subscription {
    /* renamed from: a */
    private List<Subscription> f61297a;
    /* renamed from: b */
    private volatile boolean f61298b;

    public C19615i(Subscription... subscriptionArr) {
        this.f61297a = new LinkedList(Arrays.asList(subscriptionArr));
    }

    public C19615i(Subscription subscription) {
        this.f61297a = new LinkedList();
        this.f61297a.add(subscription);
    }

    public boolean isUnsubscribed() {
        return this.f61298b;
    }

    /* renamed from: a */
    public void m70647a(Subscription subscription) {
        if (!subscription.isUnsubscribed()) {
            if (!this.f61298b) {
                synchronized (this) {
                    if (!this.f61298b) {
                        List list = this.f61297a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f61297a = list;
                        }
                        list.add(subscription);
                        return;
                    }
                }
            }
            subscription.unsubscribe();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void m70648b(rx.Subscription r3) {
        /*
        r2 = this;
        r0 = r2.f61298b;
        if (r0 != 0) goto L_0x001e;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.f61297a;	 Catch:{ all -> 0x001b }
        r1 = r2.f61298b;	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x0019;
    L_0x000b:
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0019;
    L_0x000e:
        r0 = r0.remove(r3);	 Catch:{ all -> 0x001b }
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x0015:
        r3.unsubscribe();
        goto L_0x001e;
    L_0x0019:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        return;
    L_0x001b:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        throw r3;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.i.b(rx.Subscription):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unsubscribe() {
        /*
        r2 = this;
        r0 = r2.f61298b;
        if (r0 != 0) goto L_0x001b;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.f61298b;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        return;
    L_0x000b:
        r0 = 1;
        r2.f61298b = r0;	 Catch:{ all -> 0x0018 }
        r0 = r2.f61297a;	 Catch:{ all -> 0x0018 }
        r1 = 0;
        r2.f61297a = r1;	 Catch:{ all -> 0x0018 }
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        rx.internal.util.C19615i.m70646a(r0);
        goto L_0x001b;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.i.unsubscribe():void");
    }

    /* renamed from: a */
    private static void m70646a(Collection<Subscription> collection) {
        if (collection != null) {
            List list = null;
            for (Subscription unsubscribe : collection) {
                try {
                    unsubscribe.unsubscribe();
                } catch (Throwable th) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(th);
                }
            }
            C19410a.m69873a(list);
        }
    }
}
