package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.aa.bc;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C6849f;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.m4b.maps.aj.e */
public final class C4635e {
    /* renamed from: a */
    private static final C4630b<C4636f<Object>, Object> f17064a = new C63952();
    /* renamed from: b */
    private static final bc<Constructor<?>> f17065b = bc.m20643b().m20646a(new C74303()).mo4827a();

    /* renamed from: com.google.android.m4b.maps.aj.e$2 */
    static class C63952 implements C4630b<C4636f<Object>, Object> {
        C63952() {
        }

        /* renamed from: a */
        public final /* synthetic */ C4636f mo4861a(Object obj) {
            return (C4636f) obj;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aj.e$c */
    static abstract class C6396c<V> implements C4636f<V> {
        /* renamed from: a */
        private static final Logger f23725a = Logger.getLogger(C6396c.class.getName());

        public boolean cancel(boolean z) {
            return false;
        }

        public abstract V get();

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return true;
        }

        private C6396c() {
        }

        /* renamed from: a */
        public final void mo4860a(Runnable runnable, Executor executor) {
            C5571j.m24293a((Object) runnable, (Object) "Runnable was null.");
            C5571j.m24293a((Object) executor, (Object) "Executor was null.");
            try {
                executor.execute(runnable);
            } catch (Throwable e) {
                Logger logger = f23725a;
                Level level = Level.SEVERE;
                StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
                stringBuilder.append(runnable);
                stringBuilder.append(" with executor ");
                stringBuilder.append(executor);
                logger.log(level, stringBuilder.toString(), e);
            }
        }

        public V get(long j, TimeUnit timeUnit) {
            C5571j.m24292a((Object) timeUnit);
            return get();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aj.e$3 */
    static class C74303 implements C6849f<Constructor<?>, Boolean> {
        C74303() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo7022a(Object obj) {
            return Boolean.valueOf(Arrays.asList(((Constructor) obj).getParameterTypes()).contains(String.class));
        }
    }

    /* renamed from: com.google.android.m4b.maps.aj.e$a */
    static class C7431a<I, O> extends C6393a<O> implements Runnable {
        /* renamed from: a */
        private C4630b<? super I, ? extends O> f27236a;
        /* renamed from: b */
        private C4636f<? extends I> f27237b;
        /* renamed from: c */
        private volatile C4636f<? extends O> f27238c;
        /* renamed from: d */
        private final CountDownLatch f27239d;

        private C7431a(C4630b<? super I, ? extends O> c4630b, C4636f<? extends I> c4636f) {
            this.f27239d = new CountDownLatch(1);
            this.f27236a = (C4630b) C5571j.m24292a((Object) c4630b);
            this.f27237b = (C4636f) C5571j.m24292a((Object) c4636f);
        }

        public final boolean cancel(boolean z) {
            if (!super.cancel(z)) {
                return false;
            }
            C7431a.m32008a(this.f27237b, z);
            C7431a.m32008a(this.f27238c, z);
            return true;
        }

        /* renamed from: a */
        private static void m32008a(Future<?> future, boolean z) {
            if (future != null) {
                future.cancel(z);
            }
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = 0;
            r1 = r4.f27237b;	 Catch:{ CancellationException -> 0x0055, ExecutionException -> 0x004c }
            r1 = com.google.android.m4b.maps.aj.C4641l.m20766a(r1);	 Catch:{ CancellationException -> 0x0055, ExecutionException -> 0x004c }
            r2 = r4.f27236a;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r1 = r2.mo4861a(r1);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r2 = "AsyncFunction may not return null.";	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r1 = com.google.android.m4b.maps.p125y.C5571j.m24293a(r1, r2);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r1 = (com.google.android.m4b.maps.aj.C4636f) r1;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r4.f27238c = r1;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r2 = r4.isCancelled();	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            if (r2 == 0) goto L_0x0030;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
        L_0x001d:
            r2 = r4.m27908a();	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r1.cancel(r2);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r4.f27238c = r0;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
        L_0x0026:
            r4.f27236a = r0;
            r4.f27237b = r0;
            r0 = r4.f27239d;
            r0.countDown();
            return;
        L_0x0030:
            r2 = new com.google.android.m4b.maps.aj.e$a$1;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r2.<init>(r4, r1);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r3 = com.google.android.m4b.maps.aj.C4639i.m20764a();	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r1.mo4860a(r2, r3);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
        L_0x003c:
            r4.f27236a = r0;
            r4.f27237b = r0;
            r0 = r4.f27239d;
            r0.countDown();
            return;
        L_0x0046:
            r1 = move-exception;
            goto L_0x0066;
        L_0x0048:
            r1 = move-exception;
            goto L_0x005a;
        L_0x004a:
            r1 = move-exception;
            goto L_0x005e;
        L_0x004c:
            r1 = move-exception;
            r1 = r1.getCause();	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r4.mo7026a(r1);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            goto L_0x0026;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
        L_0x0055:
            r1 = 0;	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            r4.cancel(r1);	 Catch:{ UndeclaredThrowableException -> 0x004a, Throwable -> 0x0048 }
            goto L_0x0026;
        L_0x005a:
            r4.mo7026a(r1);	 Catch:{ all -> 0x0046 }
            goto L_0x003c;	 Catch:{ all -> 0x0046 }
        L_0x005e:
            r1 = r1.getCause();	 Catch:{ all -> 0x0046 }
            r4.mo7026a(r1);	 Catch:{ all -> 0x0046 }
            goto L_0x003c;
        L_0x0066:
            r4.f27236a = r0;
            r4.f27237b = r0;
            r0 = r4.f27239d;
            r0.countDown();
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aj.e.a.run():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.aj.e$b */
    static class C7432b<V> extends C6396c<V> {
        /* renamed from: a */
        private final Throwable f27240a;

        C7432b(Throwable th) {
            super();
            this.f27240a = th;
        }

        public final V get() {
            throw new ExecutionException(this.f27240a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aj.e$d */
    static class C7433d<V> extends C6396c<V> {
        /* renamed from: a */
        private final V f27241a;

        C7433d(V v) {
            super();
            this.f27241a = v;
        }

        public final V get() {
            return this.f27241a;
        }
    }

    /* renamed from: a */
    public static <V> C4636f<V> m20757a(V v) {
        return new C7433d(v);
    }

    /* renamed from: a */
    public static <V> C4636f<V> m20758a(Throwable th) {
        C5571j.m24292a((Object) th);
        return new C7432b(th);
    }

    /* renamed from: a */
    public static <I, O> C4636f<O> m20756a(C4636f<I> c4636f, final C6849f<? super I, ? extends O> c6849f) {
        Executor a = C4639i.m20764a();
        C5571j.m24292a((Object) c6849f);
        c6849f = new C7431a(new C4630b<I, O>() {
            /* renamed from: a */
            public final C4636f<O> mo4861a(I i) {
                return C4635e.m20757a(c6849f.mo7022a(i));
            }
        }, c4636f);
        c4636f.mo4860a(c6849f, a);
        return c6849f;
    }
}
