package rx.p500e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import rx.Subscription;
import rx.exceptions.C19410a;

/* renamed from: rx.e.b */
public final class C19573b implements Subscription {
    /* renamed from: a */
    private Set<Subscription> f61119a;
    /* renamed from: b */
    private volatile boolean f61120b;

    public boolean isUnsubscribed() {
        return this.f61120b;
    }

    /* renamed from: a */
    public void m70548a(Subscription subscription) {
        if (!subscription.isUnsubscribed()) {
            if (!this.f61120b) {
                synchronized (this) {
                    if (!this.f61120b) {
                        if (this.f61119a == null) {
                            this.f61119a = new HashSet(4);
                        }
                        this.f61119a.add(subscription);
                        return;
                    }
                }
            }
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    public void m70549a(Subscription... subscriptionArr) {
        int length;
        int i = 0;
        if (!this.f61120b) {
            synchronized (this) {
                if (!this.f61120b) {
                    if (this.f61119a == null) {
                        this.f61119a = new HashSet(subscriptionArr.length);
                    }
                    length = subscriptionArr.length;
                    while (i < length) {
                        Subscription subscription = subscriptionArr[i];
                        if (!subscription.isUnsubscribed()) {
                            this.f61119a.add(subscription);
                        }
                        i++;
                    }
                    return;
                }
            }
        }
        length = subscriptionArr.length;
        while (i < length) {
            subscriptionArr[i].unsubscribe();
            i++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void m70550b(rx.Subscription r2) {
        /*
        r1 = this;
        r0 = r1.f61120b;
        if (r0 != 0) goto L_0x0020;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.f61120b;	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x001b;
    L_0x0009:
        r0 = r1.f61119a;	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x001b;
    L_0x000e:
        r0 = r1.f61119a;	 Catch:{ all -> 0x001d }
        r0 = r0.remove(r2);	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0020;
    L_0x0017:
        r2.unsubscribe();
        goto L_0x0020;
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r2;
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.e.b.b(rx.Subscription):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m70547a() {
        /*
        r2 = this;
        r0 = r2.f61120b;
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.f61120b;	 Catch:{ all -> 0x001a }
        if (r0 != 0) goto L_0x0018;
    L_0x0009:
        r0 = r2.f61119a;	 Catch:{ all -> 0x001a }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0018;
    L_0x000e:
        r0 = r2.f61119a;	 Catch:{ all -> 0x001a }
        r1 = 0;
        r2.f61119a = r1;	 Catch:{ all -> 0x001a }
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        rx.p500e.C19573b.m70546a(r0);
        goto L_0x001d;
    L_0x0018:
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        return;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.e.b.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unsubscribe() {
        /*
        r2 = this;
        r0 = r2.f61120b;
        if (r0 != 0) goto L_0x001b;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.f61120b;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        return;
    L_0x000b:
        r0 = 1;
        r2.f61120b = r0;	 Catch:{ all -> 0x0018 }
        r0 = r2.f61119a;	 Catch:{ all -> 0x0018 }
        r1 = 0;
        r2.f61119a = r1;	 Catch:{ all -> 0x0018 }
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        rx.p500e.C19573b.m70546a(r0);
        goto L_0x001b;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.e.b.unsubscribe():void");
    }

    /* renamed from: a */
    private static void m70546a(Collection<Subscription> collection) {
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

    /* renamed from: b */
    public boolean m70551b() {
        boolean z = false;
        if (this.f61120b) {
            return false;
        }
        synchronized (this) {
            if (!(this.f61120b || this.f61119a == null || this.f61119a.isEmpty())) {
                z = true;
            }
        }
        return z;
    }
}
