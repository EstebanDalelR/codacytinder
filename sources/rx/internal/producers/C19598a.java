package rx.internal.producers;

import rx.Producer;

/* renamed from: rx.internal.producers.a */
public final class C19598a implements Producer {
    /* renamed from: g */
    static final Producer f61235g = new C195971();
    /* renamed from: a */
    long f61236a;
    /* renamed from: b */
    Producer f61237b;
    /* renamed from: c */
    boolean f61238c;
    /* renamed from: d */
    long f61239d;
    /* renamed from: e */
    long f61240e;
    /* renamed from: f */
    Producer f61241f;

    /* renamed from: rx.internal.producers.a$1 */
    static class C195971 implements Producer {
        public void request(long j) {
        }

        C195971() {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request(long r7) {
        /*
        r6 = this;
        r0 = 0;
        r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x000e;
    L_0x0006:
        r7 = new java.lang.IllegalArgumentException;
        r8 = "n >= 0 required";
        r7.<init>(r8);
        throw r7;
    L_0x000e:
        r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        monitor-enter(r6);
        r2 = r6.f61238c;	 Catch:{ all -> 0x004b }
        if (r2 == 0) goto L_0x0021;
    L_0x0018:
        r0 = r6.f61239d;	 Catch:{ all -> 0x004b }
        r2 = 0;
        r2 = r0 + r7;
        r6.f61239d = r2;	 Catch:{ all -> 0x004b }
        monitor-exit(r6);	 Catch:{ all -> 0x004b }
        return;
    L_0x0021:
        r2 = 1;
        r6.f61238c = r2;	 Catch:{ all -> 0x004b }
        monitor-exit(r6);	 Catch:{ all -> 0x004b }
        r2 = r6.f61236a;	 Catch:{ all -> 0x0040 }
        r4 = 0;
        r4 = r2 + r7;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0033;
    L_0x002e:
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0033:
        r6.f61236a = r4;	 Catch:{ all -> 0x0040 }
        r0 = r6.f61237b;	 Catch:{ all -> 0x0040 }
        if (r0 == 0) goto L_0x003c;
    L_0x0039:
        r0.request(r7);	 Catch:{ all -> 0x0040 }
    L_0x003c:
        r6.m70605a();	 Catch:{ all -> 0x0040 }
        return;
    L_0x0040:
        r7 = move-exception;
        monitor-enter(r6);
        r8 = 0;
        r6.f61238c = r8;	 Catch:{ all -> 0x0047 }
        monitor-exit(r6);	 Catch:{ all -> 0x0047 }
        goto L_0x004a;
    L_0x0047:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0047 }
        throw r7;
    L_0x004a:
        throw r7;
    L_0x004b:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x004b }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.a.request(long):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m70606a(long r8) {
        /*
        r7 = this;
        r0 = 0;
        r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x000e;
    L_0x0006:
        r8 = new java.lang.IllegalArgumentException;
        r9 = "n > 0 required";
        r8.<init>(r9);
        throw r8;
    L_0x000e:
        monitor-enter(r7);
        r2 = r7.f61238c;	 Catch:{ all -> 0x004a }
        if (r2 == 0) goto L_0x001c;
    L_0x0013:
        r0 = r7.f61240e;	 Catch:{ all -> 0x004a }
        r2 = 0;
        r2 = r0 + r8;
        r7.f61240e = r2;	 Catch:{ all -> 0x004a }
        monitor-exit(r7);	 Catch:{ all -> 0x004a }
        return;
    L_0x001c:
        r2 = 1;
        r7.f61238c = r2;	 Catch:{ all -> 0x004a }
        monitor-exit(r7);	 Catch:{ all -> 0x004a }
        r2 = r7.f61236a;	 Catch:{ all -> 0x003f }
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x003b;
    L_0x002b:
        r4 = r2 - r8;
        r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r8 >= 0) goto L_0x0039;
    L_0x0031:
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003f }
        r9 = "more items arrived than were requested";
        r8.<init>(r9);	 Catch:{ all -> 0x003f }
        throw r8;	 Catch:{ all -> 0x003f }
    L_0x0039:
        r7.f61236a = r4;	 Catch:{ all -> 0x003f }
    L_0x003b:
        r7.m70605a();	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r8 = move-exception;
        monitor-enter(r7);
        r9 = 0;
        r7.f61238c = r9;	 Catch:{ all -> 0x0046 }
        monitor-exit(r7);	 Catch:{ all -> 0x0046 }
        goto L_0x0049;
    L_0x0046:
        r8 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0046 }
        throw r8;
    L_0x0049:
        throw r8;
    L_0x004a:
        r8 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x004a }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.a.a(long):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m70607a(rx.Producer r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f61238c;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000d;
    L_0x0005:
        if (r3 != 0) goto L_0x0009;
    L_0x0007:
        r3 = f61235g;	 Catch:{ all -> 0x0029 }
    L_0x0009:
        r2.f61241f = r3;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        return;
    L_0x000d:
        r0 = 1;
        r2.f61238c = r0;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        r2.f61237b = r3;	 Catch:{ all -> 0x001e }
        if (r3 == 0) goto L_0x001a;
    L_0x0015:
        r0 = r2.f61236a;	 Catch:{ all -> 0x001e }
        r3.request(r0);	 Catch:{ all -> 0x001e }
    L_0x001a:
        r2.m70605a();	 Catch:{ all -> 0x001e }
        return;
    L_0x001e:
        r3 = move-exception;
        monitor-enter(r2);
        r0 = 0;
        r2.f61238c = r0;	 Catch:{ all -> 0x0025 }
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        goto L_0x0028;
    L_0x0025:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0025 }
        throw r3;
    L_0x0028:
        throw r3;
    L_0x0029:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.a.a(rx.Producer):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m70605a() {
        /*
        r14 = this;
    L_0x0000:
        monitor-enter(r14);
        r0 = r14.f61239d;	 Catch:{ all -> 0x0066 }
        r2 = r14.f61240e;	 Catch:{ all -> 0x0066 }
        r4 = r14.f61241f;	 Catch:{ all -> 0x0066 }
        r5 = 0;
        r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r7 != 0) goto L_0x0018;
    L_0x000d:
        r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r7 != 0) goto L_0x0018;
    L_0x0011:
        if (r4 != 0) goto L_0x0018;
    L_0x0013:
        r0 = 0;
        r14.f61238c = r0;	 Catch:{ all -> 0x0066 }
        monitor-exit(r14);	 Catch:{ all -> 0x0066 }
        return;
    L_0x0018:
        r14.f61239d = r5;	 Catch:{ all -> 0x0066 }
        r14.f61240e = r5;	 Catch:{ all -> 0x0066 }
        r7 = 0;
        r14.f61241f = r7;	 Catch:{ all -> 0x0066 }
        monitor-exit(r14);	 Catch:{ all -> 0x0066 }
        r8 = r14.f61236a;
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r12 == 0) goto L_0x004b;
    L_0x002b:
        r12 = r8 + r0;
        r8 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1));
        if (r8 < 0) goto L_0x0048;
    L_0x0031:
        r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0048;
    L_0x0036:
        r8 = 0;
        r8 = r12 - r2;
        r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r2 >= 0) goto L_0x0045;
    L_0x003d:
        r0 = new java.lang.IllegalStateException;
        r1 = "more produced than requested";
        r0.<init>(r1);
        throw r0;
    L_0x0045:
        r14.f61236a = r8;
        goto L_0x004b;
    L_0x0048:
        r14.f61236a = r10;
        r8 = r10;
    L_0x004b:
        if (r4 == 0) goto L_0x005a;
    L_0x004d:
        r0 = f61235g;
        if (r4 != r0) goto L_0x0054;
    L_0x0051:
        r14.f61237b = r7;
        goto L_0x0000;
    L_0x0054:
        r14.f61237b = r4;
        r4.request(r8);
        goto L_0x0000;
    L_0x005a:
        r2 = r14.f61237b;
        if (r2 == 0) goto L_0x0000;
    L_0x005e:
        r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r3 == 0) goto L_0x0000;
    L_0x0062:
        r2.request(r0);
        goto L_0x0000;
    L_0x0066:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0066 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.producers.a.a():void");
    }
}
