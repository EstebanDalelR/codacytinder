package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.zzaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    /* renamed from: c */
    static final ThreadLocal<Boolean> f11862c = new cp();
    /* renamed from: a */
    private final Object f11863a;
    /* renamed from: b */
    private C2473a<R> f11864b;
    /* renamed from: d */
    private WeakReference<GoogleApiClient> f11865d;
    /* renamed from: e */
    private final CountDownLatch f11866e;
    /* renamed from: f */
    private final ArrayList<zza> f11867f;
    /* renamed from: g */
    private ResultCallback<? super R> f11868g;
    /* renamed from: h */
    private final AtomicReference<cb> f11869h;
    /* renamed from: i */
    private R f11870i;
    /* renamed from: j */
    private Status f11871j;
    /* renamed from: k */
    private volatile boolean f11872k;
    /* renamed from: l */
    private boolean f11873l;
    /* renamed from: m */
    private boolean f11874m;
    @KeepName
    private C2474b mResultGuardian;
    /* renamed from: n */
    private zzaq f11875n;
    /* renamed from: o */
    private volatile bv<R> f11876o;
    /* renamed from: p */
    private boolean f11877p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C2473a<R extends Result> extends Handler {
        public C2473a() {
            this(Looper.getMainLooper());
        }

        public C2473a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m8915a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    ResultCallback resultCallback = (ResultCallback) pair.first;
                    Result result = (Result) pair.second;
                    try {
                        resultCallback.onResult(result);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m14216b(result);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).m14226b(Status.zzfnl);
                    return;
                default:
                    int i = message.what;
                    StringBuilder stringBuilder = new StringBuilder(45);
                    stringBuilder.append("Don't know how to handle message: ");
                    stringBuilder.append(i);
                    Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    final class C2474b {
        /* renamed from: a */
        private /* synthetic */ BasePendingResult f7452a;

        private C2474b(BasePendingResult basePendingResult) {
            this.f7452a = basePendingResult;
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.m14216b(this.f7452a.f11870i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f11863a = new Object();
        this.f11866e = new CountDownLatch(1);
        this.f11867f = new ArrayList();
        this.f11869h = new AtomicReference();
        this.f11877p = false;
        this.f11864b = new C2473a(Looper.getMainLooper());
        this.f11865d = new WeakReference(null);
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f11863a = new Object();
        this.f11866e = new CountDownLatch(1);
        this.f11867f = new ArrayList();
        this.f11869h = new AtomicReference();
        this.f11877p = false;
        this.f11864b = new C2473a(googleApiClient != null ? googleApiClient.mo2502c() : Looper.getMainLooper());
        this.f11865d = new WeakReference(googleApiClient);
    }

    /* renamed from: b */
    public static void m14216b(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                String valueOf = String.valueOf(result);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }

    /* renamed from: c */
    private final void m14217c(R r) {
        this.f11870i = r;
        this.f11875n = null;
        this.f11866e.countDown();
        this.f11871j = this.f11870i.getStatus();
        if (this.f11873l) {
            this.f11868g = null;
        } else if (this.f11868g != null) {
            this.f11864b.removeMessages(2);
            this.f11864b.m8915a(this.f11868g, mo3575g());
        } else if (this.f11870i instanceof Releasable) {
            this.mResultGuardian = new C2474b();
        }
        ArrayList arrayList = this.f11867f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zza) obj).zzr(this.f11871j);
        }
        this.f11867f.clear();
    }

    /* renamed from: g */
    private final R mo3575g() {
        R r;
        synchronized (this.f11863a) {
            ad.m9051a(this.f11872k ^ true, (Object) "Result has already been consumed.");
            ad.m9051a(m14229d(), (Object) "Result is not ready.");
            r = this.f11870i;
            this.f11870i = null;
            this.f11868g = null;
            this.f11872k = true;
        }
        cb cbVar = (cb) this.f11869h.getAndSet(null);
        if (cbVar != null) {
            cbVar.mo2545a(this);
        }
        return r;
    }

    /* renamed from: a */
    public final R mo2484a(long r4, java.util.concurrent.TimeUnit r6) {
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
        r3 = this;
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x000b;
    L_0x0006:
        r0 = "await must not be called on the UI thread when time is greater than zero.";
        com.google.android.gms.common.internal.ad.m9057c(r0);
    L_0x000b:
        r0 = r3.f11872k;
        r1 = 1;
        r0 = r0 ^ r1;
        r2 = "Result has already been consumed.";
        com.google.android.gms.common.internal.ad.m9051a(r0, r2);
        r0 = r3.f11876o;
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001a;
    L_0x0019:
        r1 = 0;
    L_0x001a:
        r0 = "Cannot await if then() has been called.";
        com.google.android.gms.common.internal.ad.m9051a(r1, r0);
        r0 = r3.f11866e;	 Catch:{ InterruptedException -> 0x002d }
        r4 = r0.await(r4, r6);	 Catch:{ InterruptedException -> 0x002d }
        if (r4 != 0) goto L_0x0032;	 Catch:{ InterruptedException -> 0x002d }
    L_0x0027:
        r4 = com.google.android.gms.common.api.Status.zzfnl;	 Catch:{ InterruptedException -> 0x002d }
        r3.m14226b(r4);	 Catch:{ InterruptedException -> 0x002d }
        goto L_0x0032;
    L_0x002d:
        r4 = com.google.android.gms.common.api.Status.zzfnj;
        r3.m14226b(r4);
    L_0x0032:
        r4 = r3.m14229d();
        r5 = "Result is not ready.";
        com.google.android.gms.common.internal.ad.m9051a(r4, r5);
        r4 = r3.mo3575g();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(long, java.util.concurrent.TimeUnit):R");
    }

    @NonNull
    /* renamed from: a */
    protected abstract R mo3568a(Status status);

    /* renamed from: a */
    public void mo2485a() {
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
        r2 = this;
        r0 = r2.f11863a;
        monitor-enter(r0);
        r1 = r2.f11873l;	 Catch:{ all -> 0x002a }
        if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x002a }
    L_0x0007:
        r1 = r2.f11872k;	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x000c;	 Catch:{ all -> 0x002a }
    L_0x000b:
        goto L_0x0028;	 Catch:{ all -> 0x002a }
    L_0x000c:
        r1 = r2.f11875n;	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        r1 = r2.f11875n;	 Catch:{ RemoteException -> 0x0015 }
        r1.cancel();	 Catch:{ RemoteException -> 0x0015 }
    L_0x0015:
        r1 = r2.f11870i;	 Catch:{ all -> 0x002a }
        m14216b(r1);	 Catch:{ all -> 0x002a }
        r1 = 1;	 Catch:{ all -> 0x002a }
        r2.f11873l = r1;	 Catch:{ all -> 0x002a }
        r1 = com.google.android.gms.common.api.Status.zzfnm;	 Catch:{ all -> 0x002a }
        r1 = r2.mo3568a(r1);	 Catch:{ all -> 0x002a }
        r2.m14217c(r1);	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;	 Catch:{ all -> 0x002a }
    L_0x0028:
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r1 = move-exception;	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a():void");
    }

    /* renamed from: a */
    public final void mo2486a(zza zza) {
        ad.m9055b(zza != null, "Callback cannot be null.");
        synchronized (this.f11863a) {
            if (m14229d()) {
                zza.zzr(this.f11871j);
            } else {
                this.f11867f.add(zza);
            }
        }
    }

    /* renamed from: a */
    public final void m14223a(R r) {
        synchronized (this.f11863a) {
            if (this.f11874m || this.f11873l) {
                m14216b((Result) r);
                return;
            }
            m14229d();
            ad.m9051a(m14229d() ^ 1, (Object) "Results have already been set");
            ad.m9051a(this.f11872k ^ 1, (Object) "Result has already been consumed");
            m14217c(r);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2487a(com.google.android.gms.common.api.ResultCallback<? super R> r5) {
        /*
        r4 = this;
        r0 = r4.f11863a;
        monitor-enter(r0);
        if (r5 != 0) goto L_0x000c;
    L_0x0005:
        r5 = 0;
        r4.f11868g = r5;	 Catch:{ all -> 0x000a }
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x000a:
        r5 = move-exception;
        goto L_0x003c;
    L_0x000c:
        r1 = r4.f11872k;	 Catch:{ all -> 0x000a }
        r2 = 1;
        r1 = r1 ^ r2;
        r3 = "Result has already been consumed.";
        com.google.android.gms.common.internal.ad.m9051a(r1, r3);	 Catch:{ all -> 0x000a }
        r1 = r4.f11876o;	 Catch:{ all -> 0x000a }
        if (r1 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.ad.m9051a(r2, r1);	 Catch:{ all -> 0x000a }
        r1 = r4.mo2488b();	 Catch:{ all -> 0x000a }
        if (r1 == 0) goto L_0x0028;
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x0028:
        r1 = r4.m14229d();	 Catch:{ all -> 0x000a }
        if (r1 == 0) goto L_0x0038;
    L_0x002e:
        r1 = r4.f11864b;	 Catch:{ all -> 0x000a }
        r2 = r4.mo3575g();	 Catch:{ all -> 0x000a }
        r1.m8915a(r5, r2);	 Catch:{ all -> 0x000a }
        goto L_0x003a;
    L_0x0038:
        r4.f11868g = r5;	 Catch:{ all -> 0x000a }
    L_0x003a:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x003c:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* renamed from: a */
    public final void m14225a(cb cbVar) {
        this.f11869h.set(cbVar);
    }

    /* renamed from: b */
    public final void m14226b(Status status) {
        synchronized (this.f11863a) {
            if (!m14229d()) {
                m14223a(mo3568a(status));
                this.f11874m = true;
            }
        }
    }

    /* renamed from: b */
    public boolean mo2488b() {
        boolean z;
        synchronized (this.f11863a) {
            z = this.f11873l;
        }
        return z;
    }

    /* renamed from: c */
    public final Integer mo2489c() {
        return null;
    }

    /* renamed from: d */
    public final boolean m14229d() {
        return this.f11866e.getCount() == 0;
    }

    /* renamed from: e */
    public final boolean m14230e() {
        boolean b;
        synchronized (this.f11863a) {
            if (((GoogleApiClient) this.f11865d.get()) == null || !this.f11877p) {
                mo2485a();
            }
            b = mo2488b();
        }
        return b;
    }

    /* renamed from: f */
    public final void m14231f() {
        boolean z;
        if (!this.f11877p) {
            if (!((Boolean) f11862c.get()).booleanValue()) {
                z = false;
                this.f11877p = z;
            }
        }
        z = true;
        this.f11877p = z;
    }
}
