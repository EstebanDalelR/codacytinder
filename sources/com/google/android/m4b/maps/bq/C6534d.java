package com.google.android.m4b.maps.bq;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4724o;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.bo.C6525q;
import com.google.android.m4b.maps.br.C4874b;
import com.google.android.m4b.maps.br.C7468c;
import com.google.android.m4b.maps.bs.C4893h;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.File;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.bq.d */
public class C6534d extends Thread implements C4724o {
    /* renamed from: a */
    private static final String f24248a = "d";
    /* renamed from: b */
    private static C6534d f24249b;
    /* renamed from: c */
    private final C4712d f24250c;
    /* renamed from: d */
    private final C6413m f24251d;
    /* renamed from: e */
    private final C4893h f24252e;
    /* renamed from: f */
    private final File f24253f;
    /* renamed from: g */
    private boolean f24254g;
    /* renamed from: h */
    private Handler f24255h;
    /* renamed from: i */
    private final C5203e f24256i;
    /* renamed from: j */
    private final Map<C7436c, C7468c> f24257j = ax.m20627c();
    /* renamed from: k */
    private boolean f24258k;

    /* renamed from: com.google.android.m4b.maps.bq.d$1 */
    class C48641 extends Handler {
        /* renamed from: a */
        private /* synthetic */ C6534d f17869a;

        C48641(C6534d c6534d) {
            this.f17869a = c6534d;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C6534d.m28805a(this.f17869a, (C4865a) message.obj);
                    return;
                case 1:
                    C6534d.m28804a(this.f17869a);
                    return;
                case 2:
                    C6534d.m28806a(this.f17869a, (C7468c) message.obj);
                    return;
                case 3:
                    C6534d.m28807b(this.f17869a, (C7468c) message.obj);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.d$a */
    static class C4865a {
        /* renamed from: a */
        public final C7436c f17870a;
        /* renamed from: b */
        public final C4874b f17871b;

        public C4865a(C7436c c7436c, C4874b c4874b) {
            this.f17870a = c7436c;
            this.f17871b = c4874b;
        }
    }

    private C6534d(C6413m c6413m, File file, Locale locale, C4712d c4712d, C5203e c5203e) {
        super("ibs");
        this.f24251d = c6413m;
        this.f24250c = c4712d;
        this.f24252e = new C4893h(locale, this.f24250c);
        this.f24253f = file;
        this.f24256i = c5203e;
    }

    /* renamed from: a */
    public static C6534d m28803a(C6413m c6413m, File file, Locale locale, C4712d c4712d, C5203e c5203e) {
        if (f24249b == null) {
            f24249b = new C6534d(c6413m, file, locale, c4712d, c5203e);
        }
        return f24249b;
    }

    /* renamed from: a */
    public static C6534d m28802a() {
        return f24249b;
    }

    /* renamed from: b */
    public final void m28813b() {
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
        r1 = this;
        r1.start();
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0011 }
    L_0x0004:
        r0 = r1.f24255h;	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x000c;	 Catch:{ all -> 0x000e }
    L_0x0008:
        r1.wait();	 Catch:{ all -> 0x000e }
        goto L_0x0004;	 Catch:{ all -> 0x000e }
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0018;	 Catch:{ all -> 0x000e }
    L_0x000e:
        r0 = move-exception;	 Catch:{ all -> 0x000e }
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        throw r0;	 Catch:{ InterruptedException -> 0x0011 }
    L_0x0011:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0018:
        r0 = r1.f24251d;
        r0.mo4892a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.d.b():void");
    }

    public void run() {
        try {
            Process.setThreadPriority(ao.m22336c());
        } catch (SecurityException e) {
            if (C4728u.m21050a(f24248a, 6)) {
                String str = f24248a;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                stringBuilder.append("Could not set thread priority: ");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
            }
        }
        Looper.prepare();
        this.f24255h = new C48641(this);
        synchronized (this) {
            notifyAll();
        }
        if (C4733b.m21066a()) {
            this.f24252e.m21950a(this.f24253f, this.f24256i);
        }
        synchronized (this) {
            this.f24254g = true;
            notifyAll();
        }
        Looper.loop();
    }

    /* renamed from: a */
    public final void m28811a(C7436c c7436c, C4874b c4874b) {
        this.f24255h.sendMessage(this.f24255h.obtainMessage(null, new C4865a(c7436c, c4874b)));
    }

    /* renamed from: a */
    public final C6524p m28809a(C7436c c7436c) {
        C6524p b = this.f24252e.m21951b(c7436c);
        return C4893h.m21945a(b) ? null : b;
    }

    /* renamed from: b */
    public final boolean m28815b(C7436c c7436c) {
        return C4893h.m21945a(this.f24252e.m21951b(c7436c));
    }

    /* renamed from: c */
    public final C6525q m28816c(C7436c c7436c) {
        C6524p a = m28809a(c7436c);
        return a != null ? a.m28744a(c7436c) : null;
    }

    /* renamed from: a */
    public final void mo4873a(C4718l c4718l) {
        if (c4718l.mo7034g() == 118) {
            this.f24255h.sendMessage(this.f24255h.obtainMessage(2, c4718l));
        }
    }

    /* renamed from: a */
    public final void mo4872a(int i, String str) {
        if (C4728u.m21050a(f24248a, 3) != 0) {
            i = f24248a;
            String str2 = "NetworkError: ";
            str = String.valueOf(str);
            Log.d(i, str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }

    /* renamed from: b */
    public final void mo4874b(C4718l c4718l) {
        if (c4718l.mo7034g() == 118) {
            this.f24255h.sendMessage(this.f24255h.obtainMessage(3, c4718l));
        }
    }

    /* renamed from: e */
    private void m28808e() {
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
        r1 = this;
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x000e }
    L_0x0001:
        r0 = r1.f24254g;	 Catch:{ all -> 0x000b }
        if (r0 != 0) goto L_0x0009;	 Catch:{ all -> 0x000b }
    L_0x0005:
        r1.wait();	 Catch:{ all -> 0x000b }
        goto L_0x0001;	 Catch:{ all -> 0x000b }
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x000b }
        goto L_0x0015;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r0 = move-exception;	 Catch:{ all -> 0x000b }
        monitor-exit(r1);	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ InterruptedException -> 0x000e }
    L_0x000e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.d.e():void");
    }

    /* renamed from: c */
    public final void m28817c() {
        m28808e();
        this.f24252e.m21949a();
    }

    /* renamed from: d */
    public final void m28818d() {
        m28808e();
        this.f24252e.m21952b();
    }

    /* renamed from: a */
    static /* synthetic */ void m28805a(C6534d c6534d, C4865a c4865a) {
        C7436c c7436c = c4865a.f17870a;
        C4874b c4874b = c4865a.f17871b;
        C6524p a = c6534d.f24252e.m21947a(c7436c);
        if (a != null) {
            if (C4728u.m21050a(f24248a, 3)) {
                String str = f24248a;
                String valueOf = String.valueOf(c7436c);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length());
                stringBuilder.append("fetch: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" -> ");
                stringBuilder.append(valueOf2);
                Log.d(str, stringBuilder.toString());
            }
            if (c4874b != null) {
                if (C4893h.m21945a(a)) {
                    c4874b.mo5078a(c7436c, 2, null);
                } else {
                    c4874b.mo5078a(c7436c, 0, a);
                }
            }
            if (!a.m28746a(c6534d.f24250c)) {
                return;
            }
        }
        C7468c c7468c = (C7468c) c6534d.f24257j.get(c7436c);
        if (c7468c == null) {
            c7468c = new C7468c(c7436c);
            c6534d.f24257j.put(c7436c, c7468c);
        }
        if (c4874b != null) {
            c7468c.m32333a(c4874b);
        }
        if (c7468c.m32339j() == null && c6534d.f24258k == null) {
            c6534d.f24255h.sendEmptyMessageDelayed(1, 50);
            c6534d.f24258k = true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m28804a(C6534d c6534d) {
        c6534d.f24258k = false;
        c6534d.f24251d.m28010b();
        try {
            for (C4718l c4718l : c6534d.f24257j.values()) {
                if (!c4718l.m32339j()) {
                    c6534d.f24251d.mo4893c(c4718l);
                    c4718l.m32338i();
                }
            }
        } finally {
            c6534d.f24251d.m28015c();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m28806a(C6534d c6534d, C7468c c7468c) {
        if (c6534d.f24257j.remove(c7468c.mo7075h()) == null && C4728u.m21050a(f24248a, 3)) {
            String str = f24248a;
            String valueOf = String.valueOf(c7468c.mo7075h());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
            stringBuilder.append("handleResponse: Received unexpected response for ");
            stringBuilder.append(valueOf);
            Log.d(str, stringBuilder.toString());
        }
        C6524p c6524p = null;
        if (c7468c.m32341l()) {
            c6534d.f24252e.m21953c(c7468c.mo7075h());
        } else {
            C4662a k = c7468c.m32340k();
            if (k != null) {
                c6524p = c6534d.f24252e.m21948a(c7468c.mo7075h(), k);
            }
        }
        c7468c.m32332a(c6524p);
    }

    /* renamed from: b */
    static /* synthetic */ void m28807b(C6534d c6534d, C7468c c7468c) {
        if (c6534d.f24257j.remove(c7468c.mo7075h()) == null && C4728u.m21050a(f24248a, 3) != null) {
            c6534d = f24248a;
            String valueOf = String.valueOf(c7468c.mo7075h());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder.append("handleError: Received unexpected response for ");
            stringBuilder.append(valueOf);
            Log.d(c6534d, stringBuilder.toString());
        }
        c7468c.m32332a((C6524p) null);
    }
}
