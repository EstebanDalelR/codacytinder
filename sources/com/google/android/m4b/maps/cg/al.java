package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5414d;
import com.google.android.m4b.maps.p108h.C5414d.C5408a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p115o.C5497o;
import com.google.android.m4b.maps.p115o.C5500t;
import com.google.android.m4b.maps.p115o.C6745p;
import com.google.android.m4b.maps.p124x.C5541i.C6812a;
import com.google.android.m4b.maps.p124x.C5548p;
import com.google.android.m4b.maps.p125y.C5571j;

public final class al extends C6812a implements ak, C5409b, C5411d, C5497o, Runnable {
    /* renamed from: a */
    private static final String f27842a = "al";
    /* renamed from: h */
    private static C6745p f27843h = C6745p.m30054a().m30057a(5000).m30059b(16);
    /* renamed from: b */
    private final Handler f27844b;
    /* renamed from: c */
    private boolean f27845c;
    /* renamed from: d */
    private boolean f27846d;
    /* renamed from: e */
    private C5548p f27847e;
    /* renamed from: f */
    private C5414d f27848f;
    /* renamed from: g */
    private Location f27849g;

    /* renamed from: a */
    public final void mo5305a(int i) {
    }

    /* renamed from: a */
    public final void mo5307a(C6676a c6676a) {
    }

    private al(Handler handler) {
        this.f27844b = handler;
    }

    /* renamed from: a */
    public static al m32796a(Context context) {
        C5411d alVar = new al(new Handler(Looper.getMainLooper()));
        alVar.f27848f = new C5408a(context.getApplicationContext()).m23606a(C5500t.f20508a).m23607a((C5409b) alVar).m23608a(alVar).m23610b();
        if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == null) {
            f27843h.m30056a(100);
        } else {
            f27843h.m30056a(102);
        }
        return alVar;
    }

    /* renamed from: f */
    private void m32797f() {
        this.f27848f.mo5420b();
    }

    /* renamed from: g */
    private void m32798g() {
        this.f27848f.mo5423c();
        this.f27844b.removeCallbacks(this);
        this.f27849g = null;
    }

    /* renamed from: a */
    public final void mo5306a(android.os.Bundle r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = com.google.android.m4b.maps.p115o.C5500t.f20509b;	 Catch:{ SecurityException -> 0x000a }
        r0 = r2.f27848f;	 Catch:{ SecurityException -> 0x000a }
        r1 = f27843h;	 Catch:{ SecurityException -> 0x000a }
        r3.mo5643a(r0, r1, r2);	 Catch:{ SecurityException -> 0x000a }
        return;
    L_0x000a:
        r3 = f27842a;
        r0 = 4;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r0);
        if (r3 == 0) goto L_0x001a;
    L_0x0013:
        r3 = f27842a;
        r0 = "Location unable to be retrieved.";
        android.util.Log.i(r3, r0);
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.al.a(android.os.Bundle):void");
    }

    /* renamed from: b */
    public final void mo7151b() {
        this.f27845c = true;
        if (!this.f27846d && this.f27847e != null) {
            m32797f();
        }
    }

    /* renamed from: c */
    public final void mo7152c() {
        if (!(this.f27846d || this.f27847e == null)) {
            m32798g();
        }
        this.f27845c = false;
    }

    /* renamed from: d */
    public final void mo7153d() {
        this.f27846d = true;
        if (this.f27845c && this.f27847e != null) {
            m32798g();
        }
    }

    /* renamed from: e */
    public final void mo7154e() {
        if (this.f27845c && this.f27847e != null) {
            m32797f();
        }
        this.f27846d = false;
    }

    /* renamed from: a */
    public final void mo5792a(C5548p c5548p) {
        boolean z = false;
        C5571j.m24302b(this.f27847e == null, (Object) "already activated");
        if (c5548p != null) {
            z = true;
        }
        C5571j.m24298a(z, (Object) "listener cannot be null");
        this.f27847e = c5548p;
        if (this.f27845c != null && this.f27846d == null) {
            m32797f();
        }
    }

    /* renamed from: a */
    public final void mo5791a() {
        C5571j.m24302b(this.f27847e != null, (Object) "already activated");
        this.f27847e = null;
        if (this.f27845c && !this.f27846d) {
            m32798g();
        }
    }

    /* renamed from: a */
    public final void mo7150a(Location location) {
        this.f27849g = location;
        this.f27844b.post(this);
    }

    public final void run() {
        try {
            if (this.f27847e != null) {
                this.f27847e.mo5799a(C7701d.m33407a(this.f27849g));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
