package android.support.v4.provider;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.GuardedBy;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.concurrent.Callable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SelfDestructiveThread {
    /* renamed from: a */
    private final Object f1660a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private HandlerThread f1661b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private Handler f1662c;
    @GuardedBy("mLock")
    /* renamed from: d */
    private int f1663d;
    /* renamed from: e */
    private Callback f1664e = new C05351(this);
    /* renamed from: f */
    private final int f1665f;
    /* renamed from: g */
    private final int f1666g;
    /* renamed from: h */
    private final String f1667h;

    /* renamed from: android.support.v4.provider.SelfDestructiveThread$1 */
    class C05351 implements Callback {
        /* renamed from: a */
        final /* synthetic */ SelfDestructiveThread f1647a;

        C05351(SelfDestructiveThread selfDestructiveThread) {
            this.f1647a = selfDestructiveThread;
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.f1647a.m1976a();
                    return true;
                case 1:
                    this.f1647a.m1980b((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    }

    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    public SelfDestructiveThread(String str, int i, int i2) {
        this.f1667h = str;
        this.f1666g = i;
        this.f1665f = i2;
        this.f1663d = null;
    }

    /* renamed from: a */
    private void m1979a(Runnable runnable) {
        synchronized (this.f1660a) {
            if (this.f1661b == null) {
                this.f1661b = new HandlerThread(this.f1667h, this.f1666g);
                this.f1661b.start();
                this.f1662c = new Handler(this.f1661b.getLooper(), this.f1664e);
                this.f1663d++;
            }
            this.f1662c.removeMessages(0);
            this.f1662c.sendMessage(this.f1662c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void m1982a(final Callable<T> callable, final ReplyCallback<T> replyCallback) {
        final Handler handler = new Handler();
        m1979a(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ SelfDestructiveThread f1653d;

            public void run() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = r3;	 Catch:{ Exception -> 0x0007 }
                r0 = r0.call();	 Catch:{ Exception -> 0x0007 }
                goto L_0x0008;
            L_0x0007:
                r0 = 0;
            L_0x0008:
                r1 = r0;
                r2 = new android.support.v4.provider.SelfDestructiveThread$2$1;
                r2.<init>(r3, r0);
                r1.post(r2);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.provider.SelfDestructiveThread.2.run():void");
            }
        });
    }

    /* renamed from: a */
    public <T> T m1981a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
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
        r12 = this;
        r7 = new java.util.concurrent.locks.ReentrantLock;
        r7.<init>();
        r8 = r7.newCondition();
        r9 = new java.util.concurrent.atomic.AtomicReference;
        r9.<init>();
        r10 = new java.util.concurrent.atomic.AtomicBoolean;
        r0 = 1;
        r10.<init>(r0);
        r11 = new android.support.v4.provider.SelfDestructiveThread$3;
        r0 = r11;
        r1 = r12;
        r2 = r9;
        r3 = r13;
        r4 = r7;
        r5 = r10;
        r6 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r12.m1979a(r11);
        r7.lock();
        r13 = r10.get();	 Catch:{ all -> 0x005c }
        if (r13 != 0) goto L_0x0034;	 Catch:{ all -> 0x005c }
    L_0x002c:
        r13 = r9.get();	 Catch:{ all -> 0x005c }
        r7.unlock();
        return r13;
    L_0x0034:
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x005c }
        r0 = (long) r14;	 Catch:{ all -> 0x005c }
        r13 = r13.toNanos(r0);	 Catch:{ all -> 0x005c }
    L_0x003b:
        r0 = r8.awaitNanos(r13);	 Catch:{ InterruptedException -> 0x0040 }
        r13 = r0;
    L_0x0040:
        r0 = r10.get();	 Catch:{ all -> 0x005c }
        if (r0 != 0) goto L_0x004e;	 Catch:{ all -> 0x005c }
    L_0x0046:
        r13 = r9.get();	 Catch:{ all -> 0x005c }
        r7.unlock();
        return r13;
    L_0x004e:
        r0 = 0;
        r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x003b;
    L_0x0054:
        r13 = new java.lang.InterruptedException;	 Catch:{ all -> 0x005c }
        r14 = "timeout";	 Catch:{ all -> 0x005c }
        r13.<init>(r14);	 Catch:{ all -> 0x005c }
        throw r13;	 Catch:{ all -> 0x005c }
    L_0x005c:
        r13 = move-exception;
        r7.unlock();
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.provider.SelfDestructiveThread.a(java.util.concurrent.Callable, int):T");
    }

    /* renamed from: b */
    private void m1980b(Runnable runnable) {
        runnable.run();
        synchronized (this.f1660a) {
            this.f1662c.removeMessages(0);
            this.f1662c.sendMessageDelayed(this.f1662c.obtainMessage(0), (long) this.f1665f);
        }
    }

    /* renamed from: a */
    private void m1976a() {
        synchronized (this.f1660a) {
            if (this.f1662c.hasMessages(1)) {
                return;
            }
            this.f1661b.quit();
            this.f1661b = null;
            this.f1662c = null;
        }
    }
}
