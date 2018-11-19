package com.google.android.m4b.maps.p110j;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.j.l */
public final class C5449l implements Callback {
    /* renamed from: a */
    private final C5448a f20423a;
    /* renamed from: b */
    private final ArrayList<C5409b> f20424b = new ArrayList();
    /* renamed from: c */
    private ArrayList<C5409b> f20425c = new ArrayList();
    /* renamed from: d */
    private final ArrayList<C5411d> f20426d = new ArrayList();
    /* renamed from: e */
    private volatile boolean f20427e = false;
    /* renamed from: f */
    private final AtomicInteger f20428f = new AtomicInteger(0);
    /* renamed from: g */
    private boolean f20429g = false;
    /* renamed from: h */
    private final Handler f20430h;
    /* renamed from: i */
    private final Object f20431i = new Object();

    /* renamed from: com.google.android.m4b.maps.j.l$a */
    public interface C5448a {
        /* renamed from: e */
        boolean mo5413e();
    }

    public C5449l(Looper looper, C5448a c5448a) {
        this.f20423a = c5448a;
        this.f20430h = new Handler(looper, this);
    }

    /* renamed from: a */
    public final void m23684a() {
        this.f20427e = false;
        this.f20428f.incrementAndGet();
    }

    /* renamed from: b */
    public final void m23690b() {
        this.f20427e = true;
    }

    /* renamed from: a */
    public final void m23686a(Bundle bundle) {
        synchronized (this.f20431i) {
            boolean z = true;
            C5462v.m23770a(this.f20429g ^ true);
            this.f20430h.removeMessages(1);
            this.f20429g = true;
            if (this.f20425c.size() != 0) {
                z = false;
            }
            C5462v.m23770a(z);
            ArrayList arrayList = new ArrayList(this.f20424b);
            int i = this.f20428f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5409b c5409b = (C5409b) it.next();
                if (!this.f20427e || !this.f20423a.mo5413e() || this.f20428f.get() != i) {
                    break;
                } else if (!this.f20425c.contains(c5409b)) {
                    c5409b.mo5306a(bundle);
                }
            }
            this.f20425c.clear();
            this.f20429g = false;
        }
    }

    /* renamed from: a */
    public final void m23685a(int i) {
        this.f20430h.removeMessages(1);
        synchronized (this.f20431i) {
            this.f20429g = true;
            ArrayList arrayList = new ArrayList(this.f20424b);
            int i2 = this.f20428f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5409b c5409b = (C5409b) it.next();
                if (!this.f20427e || this.f20428f.get() != i2) {
                    break;
                } else if (this.f20424b.contains(c5409b)) {
                    c5409b.mo5305a(i);
                }
            }
            this.f20425c.clear();
            this.f20429g = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m23687a(com.google.android.m4b.maps.p107g.C6676a r6) {
        /*
        r5 = this;
        r0 = r5.f20430h;
        r1 = 1;
        r0.removeMessages(r1);
        r0 = r5.f20431i;
        monitor-enter(r0);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0043 }
        r2 = r5.f20426d;	 Catch:{ all -> 0x0043 }
        r1.<init>(r2);	 Catch:{ all -> 0x0043 }
        r2 = r5.f20428f;	 Catch:{ all -> 0x0043 }
        r2 = r2.get();	 Catch:{ all -> 0x0043 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0043 }
    L_0x001a:
        r3 = r1.hasNext();	 Catch:{ all -> 0x0043 }
        if (r3 == 0) goto L_0x0041;
    L_0x0020:
        r3 = r1.next();	 Catch:{ all -> 0x0043 }
        r3 = (com.google.android.m4b.maps.p108h.C5414d.C5411d) r3;	 Catch:{ all -> 0x0043 }
        r4 = r5.f20427e;	 Catch:{ all -> 0x0043 }
        if (r4 == 0) goto L_0x003f;
    L_0x002a:
        r4 = r5.f20428f;	 Catch:{ all -> 0x0043 }
        r4 = r4.get();	 Catch:{ all -> 0x0043 }
        if (r4 == r2) goto L_0x0033;
    L_0x0032:
        goto L_0x003f;
    L_0x0033:
        r4 = r5.f20426d;	 Catch:{ all -> 0x0043 }
        r4 = r4.contains(r3);	 Catch:{ all -> 0x0043 }
        if (r4 == 0) goto L_0x001a;
    L_0x003b:
        r3.mo5307a(r6);	 Catch:{ all -> 0x0043 }
        goto L_0x001a;
    L_0x003f:
        monitor-exit(r0);	 Catch:{ all -> 0x0043 }
        return;
    L_0x0041:
        monitor-exit(r0);	 Catch:{ all -> 0x0043 }
        return;
    L_0x0043:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0043 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.j.l.a(com.google.android.m4b.maps.g.a):void");
    }

    /* renamed from: a */
    public final void m23688a(C5409b c5409b) {
        C5462v.m23767a((Object) c5409b);
        synchronized (this.f20431i) {
            if (this.f20424b.contains(c5409b)) {
                String valueOf = String.valueOf(c5409b);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder.append("registerConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f20424b.add(c5409b);
            }
        }
        if (this.f20423a.mo5413e()) {
            this.f20430h.sendMessage(this.f20430h.obtainMessage(1, c5409b));
        }
    }

    /* renamed from: b */
    public final void m23691b(C5409b c5409b) {
        C5462v.m23767a((Object) c5409b);
        synchronized (this.f20431i) {
            if (!this.f20424b.remove(c5409b)) {
                c5409b = String.valueOf(c5409b);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(c5409b).length() + 52);
                stringBuilder.append("unregisterConnectionCallbacks(): listener ");
                stringBuilder.append(c5409b);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else if (this.f20429g) {
                this.f20425c.add(c5409b);
            }
        }
    }

    /* renamed from: a */
    public final void m23689a(C5411d c5411d) {
        C5462v.m23767a((Object) c5411d);
        synchronized (this.f20431i) {
            if (this.f20426d.contains(c5411d)) {
                c5411d = String.valueOf(c5411d);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(c5411d).length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(c5411d);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f20426d.add(c5411d);
            }
        }
    }

    /* renamed from: b */
    public final void m23692b(C5411d c5411d) {
        C5462v.m23767a((Object) c5411d);
        synchronized (this.f20431i) {
            if (!this.f20426d.remove(c5411d)) {
                c5411d = String.valueOf(c5411d);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(c5411d).length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(c5411d);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C5409b c5409b = (C5409b) message.obj;
            synchronized (this.f20431i) {
                if (this.f20427e && this.f20423a.mo5413e() && this.f20424b.contains(c5409b)) {
                    c5409b.mo5306a(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        return null;
    }
}
