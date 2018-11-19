package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.util.C2289a;
import java.util.LinkedList;

/* renamed from: com.google.android.exoplayer2.decoder.e */
public abstract class C3601e<I extends DecoderInputBuffer, O extends C3600d, E extends Exception> implements Decoder<I, O, E> {
    /* renamed from: a */
    private final Thread f10835a;
    /* renamed from: b */
    private final Object f10836b = new Object();
    /* renamed from: c */
    private final LinkedList<I> f10837c = new LinkedList();
    /* renamed from: d */
    private final LinkedList<O> f10838d = new LinkedList();
    /* renamed from: e */
    private final I[] f10839e;
    /* renamed from: f */
    private final O[] f10840f;
    /* renamed from: g */
    private int f10841g;
    /* renamed from: h */
    private int f10842h;
    /* renamed from: i */
    private I f10843i;
    /* renamed from: j */
    private E f10844j;
    /* renamed from: k */
    private boolean f10845k;
    /* renamed from: l */
    private boolean f10846l;
    /* renamed from: m */
    private int f10847m;

    /* renamed from: com.google.android.exoplayer2.decoder.e$1 */
    class C20381 extends Thread {
        /* renamed from: a */
        final /* synthetic */ C3601e f5619a;

        C20381(C3601e c3601e) {
            this.f5619a = c3601e;
        }

        public void run() {
            this.f5619a.m13527g();
        }
    }

    /* renamed from: a */
    protected abstract E mo3509a(I i, O o, boolean z);

    /* renamed from: a */
    protected abstract E mo3510a(Throwable th);

    /* renamed from: c */
    protected abstract I mo3512c();

    /* renamed from: d */
    protected abstract O mo3513d();

    public /* synthetic */ Object dequeueInputBuffer() throws Exception {
        return m13530a();
    }

    public /* synthetic */ Object dequeueOutputBuffer() throws Exception {
        return m13536b();
    }

    public /* synthetic */ void queueInputBuffer(Object obj) throws Exception {
        m13534a((DecoderInputBuffer) obj);
    }

    protected C3601e(I[] iArr, O[] oArr) {
        this.f10839e = iArr;
        this.f10841g = iArr.length;
        for (int i = 0; i < this.f10841g; i++) {
            this.f10839e[i] = mo3512c();
        }
        this.f10840f = oArr;
        this.f10842h = oArr.length;
        for (iArr = null; iArr < this.f10842h; iArr++) {
            this.f10840f[iArr] = mo3513d();
        }
        this.f10835a = new C20381(this);
        this.f10835a.start();
    }

    /* renamed from: a */
    protected final void m13533a(int i) {
        C2289a.m8313b(this.f10841g == this.f10839e.length);
        for (DecoderInputBuffer e : this.f10839e) {
            e.m13518e(i);
        }
    }

    /* renamed from: a */
    public final I m13530a() throws Exception {
        I i;
        synchronized (this.f10836b) {
            DecoderInputBuffer decoderInputBuffer;
            mo3514e();
            C2289a.m8313b(this.f10843i == null);
            if (this.f10841g == 0) {
                decoderInputBuffer = null;
            } else {
                DecoderInputBuffer[] decoderInputBufferArr = this.f10839e;
                int i2 = this.f10841g - 1;
                this.f10841g = i2;
                decoderInputBuffer = decoderInputBufferArr[i2];
            }
            this.f10843i = decoderInputBuffer;
            i = this.f10843i;
        }
        return i;
    }

    /* renamed from: a */
    public final void m13534a(I i) throws Exception {
        synchronized (this.f10836b) {
            mo3514e();
            C2289a.m8311a(i == this.f10843i);
            this.f10837c.addLast(i);
            mo3515f();
            this.f10843i = null;
        }
    }

    /* renamed from: b */
    public final O m13536b() throws Exception {
        synchronized (this.f10836b) {
            mo3514e();
            if (this.f10838d.isEmpty()) {
                return null;
            }
            C3600d c3600d = (C3600d) this.f10838d.removeFirst();
            return c3600d;
        }
    }

    /* renamed from: a */
    protected void mo3511a(O o) {
        synchronized (this.f10836b) {
            m13524b((C3600d) o);
            mo3515f();
        }
    }

    public final void flush() {
        synchronized (this.f10836b) {
            this.f10845k = true;
            this.f10847m = 0;
            if (this.f10843i != null) {
                m13523b(this.f10843i);
                this.f10843i = null;
            }
            while (!this.f10837c.isEmpty()) {
                m13523b((DecoderInputBuffer) this.f10837c.removeFirst());
            }
            while (!this.f10838d.isEmpty()) {
                m13524b((C3600d) this.f10838d.removeFirst());
            }
        }
    }

    public void release() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f10836b;
        monitor-enter(r0);
        r1 = 1;
        r2.f10846l = r1;	 Catch:{ all -> 0x001a }
        r1 = r2.f10836b;	 Catch:{ all -> 0x001a }
        r1.notify();	 Catch:{ all -> 0x001a }
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        r0 = r2.f10835a;	 Catch:{ InterruptedException -> 0x0012 }
        r0.join();	 Catch:{ InterruptedException -> 0x0012 }
        goto L_0x0019;
    L_0x0012:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0019:
        return;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.e.release():void");
    }

    /* renamed from: e */
    private void mo3514e() throws Exception {
        if (this.f10844j != null) {
            throw this.f10844j;
        }
    }

    /* renamed from: f */
    private void mo3515f() {
        if (m13529i()) {
            this.f10836b.notify();
        }
    }

    /* renamed from: g */
    private void m13527g() {
        while (m13528h()) {
            try {
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    private boolean m13528h() throws java.lang.InterruptedException {
        /*
        r6 = this;
        r0 = r6.f10836b;
        monitor-enter(r0);
    L_0x0003:
        r1 = r6.f10846l;	 Catch:{ all -> 0x0096 }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = r6.m13529i();	 Catch:{ all -> 0x0096 }
        if (r1 != 0) goto L_0x0013;
    L_0x000d:
        r1 = r6.f10836b;	 Catch:{ all -> 0x0096 }
        r1.wait();	 Catch:{ all -> 0x0096 }
        goto L_0x0003;
    L_0x0013:
        r1 = r6.f10846l;	 Catch:{ all -> 0x0096 }
        r2 = 0;
        if (r1 == 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        return r2;
    L_0x001a:
        r1 = r6.f10837c;	 Catch:{ all -> 0x0096 }
        r1 = r1.removeFirst();	 Catch:{ all -> 0x0096 }
        r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1;	 Catch:{ all -> 0x0096 }
        r3 = r6.f10840f;	 Catch:{ all -> 0x0096 }
        r4 = r6.f10842h;	 Catch:{ all -> 0x0096 }
        r5 = 1;
        r4 = r4 - r5;
        r6.f10842h = r4;	 Catch:{ all -> 0x0096 }
        r3 = r3[r4];	 Catch:{ all -> 0x0096 }
        r4 = r6.f10845k;	 Catch:{ all -> 0x0096 }
        r6.f10845k = r2;	 Catch:{ all -> 0x0096 }
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        r0 = r1.m7344c();
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = 4;
        r3.m7341b(r0);
        goto L_0x0069;
    L_0x003c:
        r0 = r1.m7342b();
        if (r0 == 0) goto L_0x0047;
    L_0x0042:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3.m7341b(r0);
    L_0x0047:
        r0 = r6.mo3509a(r1, r3, r4);	 Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
        r6.f10844j = r0;	 Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
        goto L_0x005d;
    L_0x004e:
        r0 = move-exception;
        r0 = r6.mo3510a(r0);
        r6.f10844j = r0;
        goto L_0x005d;
    L_0x0056:
        r0 = move-exception;
        r0 = r6.mo3510a(r0);
        r6.f10844j = r0;
    L_0x005d:
        r0 = r6.f10844j;
        if (r0 == 0) goto L_0x0069;
    L_0x0061:
        r0 = r6.f10836b;
        monitor-enter(r0);
        monitor-exit(r0);	 Catch:{ all -> 0x0066 }
        return r2;
    L_0x0066:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0066 }
        throw r1;
    L_0x0069:
        r4 = r6.f10836b;
        monitor-enter(r4);
        r0 = r6.f10845k;	 Catch:{ all -> 0x0093 }
        if (r0 == 0) goto L_0x0074;
    L_0x0070:
        r6.m13524b(r3);	 Catch:{ all -> 0x0093 }
        goto L_0x008e;
    L_0x0074:
        r0 = r3.m7342b();	 Catch:{ all -> 0x0093 }
        if (r0 == 0) goto L_0x0083;
    L_0x007a:
        r0 = r6.f10847m;	 Catch:{ all -> 0x0093 }
        r0 = r0 + r5;
        r6.f10847m = r0;	 Catch:{ all -> 0x0093 }
        r6.m13524b(r3);	 Catch:{ all -> 0x0093 }
        goto L_0x008e;
    L_0x0083:
        r0 = r6.f10847m;	 Catch:{ all -> 0x0093 }
        r3.f10834b = r0;	 Catch:{ all -> 0x0093 }
        r6.f10847m = r2;	 Catch:{ all -> 0x0093 }
        r0 = r6.f10838d;	 Catch:{ all -> 0x0093 }
        r0.addLast(r3);	 Catch:{ all -> 0x0093 }
    L_0x008e:
        r6.m13523b(r1);	 Catch:{ all -> 0x0093 }
        monitor-exit(r4);	 Catch:{ all -> 0x0093 }
        return r5;
    L_0x0093:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0093 }
        throw r0;
    L_0x0096:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.e.h():boolean");
    }

    /* renamed from: i */
    private boolean m13529i() {
        return !this.f10837c.isEmpty() && this.f10842h > 0;
    }

    /* renamed from: b */
    private void m13523b(I i) {
        i.mo2221a();
        DecoderInputBuffer[] decoderInputBufferArr = this.f10839e;
        int i2 = this.f10841g;
        this.f10841g = i2 + 1;
        decoderInputBufferArr[i2] = i;
    }

    /* renamed from: b */
    private void m13524b(O o) {
        o.mo2221a();
        C3600d[] c3600dArr = this.f10840f;
        int i = this.f10842h;
        this.f10842h = i + 1;
        c3600dArr[i] = o;
    }
}
