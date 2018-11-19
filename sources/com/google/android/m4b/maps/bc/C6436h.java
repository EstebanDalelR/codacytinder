package com.google.android.m4b.maps.bc;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bx.af;
import com.google.android.m4b.maps.cg.an;

/* renamed from: com.google.android.m4b.maps.bc.h */
public class C6436h extends af {
    /* renamed from: a */
    private static final String f23886a = "h";
    /* renamed from: b */
    private final an f23887b;
    /* renamed from: c */
    private boolean f23888c = false;
    /* renamed from: d */
    private boolean f23889d = false;
    /* renamed from: e */
    private boolean f23890e = false;
    /* renamed from: f */
    private boolean f23891f = false;
    /* renamed from: g */
    private boolean f23892g = false;

    private C6436h(an anVar) {
        this.f23887b = anVar;
    }

    /* renamed from: a */
    public static C6436h m28181a(C6450v c6450v, an anVar) {
        af c6436h = new C6436h(anVar);
        c6450v.m28292a(c6436h);
        return c6436h;
    }

    /* renamed from: f */
    private synchronized boolean m28182f() {
        boolean z;
        z = (this.f23888c || this.f23889d || this.f23890e || this.f23891f || !this.f23892g) ? false : true;
        return z;
    }

    /* renamed from: a */
    public final void m28183a() {
        if (C4728u.m21050a(f23886a, 2)) {
            Log.v(f23886a, "onRepaintLater");
        }
        synchronized (this) {
            this.f23888c = true;
        }
        this.f23887b.m22861a(false);
    }

    /* renamed from: b */
    public final void mo4977b() {
        if (C4728u.m21050a(f23886a, 2)) {
            Log.v(f23886a, "onSetPendingRequest");
        }
        synchronized (this) {
            this.f23888c = false;
            this.f23889d = true;
        }
        this.f23887b.m22861a(false);
    }

    /* renamed from: c */
    public final void mo4978c() {
        if (C4728u.m21050a(f23886a, 2)) {
            Log.v(f23886a, "onRequestRender");
        }
        synchronized (this) {
            this.f23889d = false;
            this.f23890e = true;
        }
        this.f23887b.m22861a(false);
    }

    /* renamed from: d */
    protected final void mo4979d() {
        if (C4728u.m21050a(f23886a, 2)) {
            Log.v(f23886a, "onStartFrame");
        }
        synchronized (this) {
            this.f23890e = false;
            this.f23891f = true;
        }
        this.f23887b.m22861a(false);
    }

    /* renamed from: a */
    protected final boolean mo4976a(boolean z) {
        if (C4728u.m21050a(f23886a, 2)) {
            String str = f23886a;
            StringBuilder stringBuilder = new StringBuilder(29);
            stringBuilder.append("onEndFrame, isMapReady: ");
            stringBuilder.append(z);
            Log.v(str, stringBuilder.toString());
        }
        synchronized (this) {
            this.f23891f = false;
            this.f23892g = z;
        }
        this.f23887b.m22861a(m28182f());
        return false;
    }
}
