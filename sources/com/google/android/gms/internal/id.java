package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@zzzv
public final class id {
    /* renamed from: a */
    public static <T> im<T> m19920a(T t) {
        return new im(t);
    }

    /* renamed from: a */
    public static <V> zzakv<V> m19921a(zzakv<V> zzakv, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        iw iwVar = new iw();
        m19931a((zzakv) iwVar, (Future) zzakv);
        Future schedule = scheduledExecutorService.schedule(new ih(iwVar), j, timeUnit);
        m19929a((zzakv) zzakv, iwVar);
        iwVar.zza(new ii(schedule), ir.f16196b);
        return iwVar;
    }

    /* renamed from: a */
    public static <A, B> zzakv<B> m19922a(zzakv<A> zzakv, zzakg<? super A, ? extends B> zzakg, Executor executor) {
        zzakv iwVar = new iw();
        zzakv.zza(new ig(iwVar, zzakg, zzakv), executor);
        m19931a(iwVar, (Future) zzakv);
        return iwVar;
    }

    /* renamed from: a */
    public static <A, B> zzakv<B> m19923a(zzakv<A> zzakv, zzakh<A, B> zzakh, Executor executor) {
        zzakv iwVar = new iw();
        zzakv.zza(new C4472if(iwVar, zzakh, zzakv), executor);
        m19931a(iwVar, (Future) zzakv);
        return iwVar;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> zzakv<V> m19924a(zzakv<? extends V> zzakv, Class<X> cls, zzakg<? super X, ? extends V> zzakg, Executor executor) {
        zzakv iwVar = new iw();
        m19931a(iwVar, (Future) zzakv);
        zzakv.zza(new ij(iwVar, zzakv, cls, zzakg, executor), ir.f16196b);
        return iwVar;
    }

    /* renamed from: a */
    public static <T> T m19925a(Future<T> future, T t) {
        Throwable e;
        try {
            return future.get(((Long) aja.m19221f().m19334a(alo.bl)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            future.cancel(true);
            hx.m19914c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            ar.i().m27296a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e3) {
            e = e3;
            future.cancel(true);
            hx.m19912b("Error waiting for future.", e);
            ar.i().m27296a(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m19926a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        Throwable e;
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e2) {
            e = e2;
            future.cancel(true);
            hx.m19914c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            ar.i().m27296a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e3) {
            e = e3;
            future.cancel(true);
            hx.m19912b("Error waiting for future.", e);
            ar.i().m27296a(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19927a(com.google.android.gms.internal.iw r1, com.google.android.gms.internal.zzakg r2, com.google.android.gms.internal.zzakv r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r1.isCancelled();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r3 = r3.get();	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        r2 = r2.zzc(r3);	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        m19929a(r2, r1);	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        return;
    L_0x0013:
        r2 = move-exception;
        r1.m27363a(r2);
        return;
    L_0x0018:
        r2 = move-exception;
        r3 = java.lang.Thread.currentThread();
        r3.interrupt();
        r1.m27363a(r2);
        return;
    L_0x0024:
        r2 = move-exception;
        r2 = r2.getCause();
        r1.m27363a(r2);
        return;
    L_0x002d:
        r2 = 1;
        r1.cancel(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.id.a(com.google.android.gms.internal.iw, com.google.android.gms.internal.zzakg, com.google.android.gms.internal.zzakv):void");
    }

    /* renamed from: a */
    static final /* synthetic */ void m19928a(iw iwVar, zzakv zzakv, Class cls, zzakg zzakg, Executor executor) {
        Throwable cause;
        try {
            iwVar.m27364b(zzakv.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            if (cls.isInstance(cause)) {
                m19929a(m19922a(m19920a(cause), zzakg, executor), iwVar);
            } else {
                iwVar.m27363a(cause);
            }
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            if (cls.isInstance(cause)) {
                iwVar.m27363a(cause);
            } else {
                m19929a(m19922a(m19920a(cause), zzakg, executor), iwVar);
            }
        } catch (Exception e3) {
            cause = e3;
            if (cls.isInstance(cause)) {
                m19929a(m19922a(m19920a(cause), zzakg, executor), iwVar);
            } else {
                iwVar.m27363a(cause);
            }
        }
    }

    /* renamed from: a */
    private static <V> void m19929a(zzakv<? extends V> zzakv, iw<V> iwVar) {
        m19931a((zzakv) iwVar, (Future) zzakv);
        zzakv.zza(new ik(iwVar, zzakv), ir.f16196b);
    }

    /* renamed from: a */
    public static <V> void m19930a(zzakv<V> zzakv, zzaki<V> zzaki, Executor executor) {
        zzakv.zza(new ie(zzaki, zzakv), executor);
    }

    /* renamed from: a */
    private static <A, B> void m19931a(zzakv<A> zzakv, Future<B> future) {
        zzakv.zza(new il(zzakv, future), ir.f16196b);
    }
}
