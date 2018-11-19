package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@zzzv
public final class dn {
    /* renamed from: a */
    private final dq f16005a;
    /* renamed from: b */
    private final LinkedList<C4468do> f16006b;
    /* renamed from: c */
    private final Object f16007c;
    /* renamed from: d */
    private final String f16008d;
    /* renamed from: e */
    private final String f16009e;
    /* renamed from: f */
    private long f16010f;
    /* renamed from: g */
    private long f16011g;
    /* renamed from: h */
    private boolean f16012h;
    /* renamed from: i */
    private long f16013i;
    /* renamed from: j */
    private long f16014j;
    /* renamed from: k */
    private long f16015k;
    /* renamed from: l */
    private long f16016l;

    private dn(dq dqVar, String str, String str2) {
        this.f16007c = new Object();
        this.f16010f = -1;
        this.f16011g = -1;
        this.f16012h = false;
        this.f16013i = -1;
        this.f16014j = 0;
        this.f16015k = -1;
        this.f16016l = -1;
        this.f16005a = dqVar;
        this.f16008d = str;
        this.f16009e = str2;
        this.f16006b = new LinkedList();
    }

    public dn(String str, String str2) {
        this(ar.i(), str, str2);
    }

    /* renamed from: a */
    public final void m19616a() {
        synchronized (this.f16007c) {
            if (this.f16016l != -1 && this.f16011g == -1) {
                this.f16011g = SystemClock.elapsedRealtime();
                this.f16005a.m27293a(this);
            }
            this.f16005a.m27306d().m19646b();
        }
    }

    /* renamed from: a */
    public final void m19617a(long j) {
        synchronized (this.f16007c) {
            this.f16016l = j;
            if (this.f16016l != -1) {
                this.f16005a.m27293a(this);
            }
        }
    }

    /* renamed from: a */
    public final void m19618a(zzjj zzjj) {
        synchronized (this.f16007c) {
            this.f16015k = SystemClock.elapsedRealtime();
            this.f16005a.m27306d().m19645a(zzjj, this.f16015k);
        }
    }

    /* renamed from: a */
    public final void m19619a(boolean z) {
        synchronized (this.f16007c) {
            if (this.f16016l != -1) {
                this.f16013i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f16011g = this.f16013i;
                    this.f16005a.m27293a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m19620b() {
        synchronized (this.f16007c) {
            if (this.f16016l != -1) {
                C4468do c4468do = new C4468do();
                c4468do.m19627c();
                this.f16006b.add(c4468do);
                this.f16014j++;
                this.f16005a.m27306d().m19644a();
                this.f16005a.m27293a(this);
            }
        }
    }

    /* renamed from: b */
    public final void m19621b(long j) {
        synchronized (this.f16007c) {
            if (this.f16016l != -1) {
                this.f16010f = j;
                this.f16005a.m27293a(this);
            }
        }
    }

    /* renamed from: b */
    public final void m19622b(boolean z) {
        synchronized (this.f16007c) {
            if (this.f16016l != -1) {
                this.f16012h = z;
                this.f16005a.m27293a(this);
            }
        }
    }

    /* renamed from: c */
    public final void m19623c() {
        synchronized (this.f16007c) {
            if (!(this.f16016l == -1 || this.f16006b.isEmpty())) {
                C4468do c4468do = (C4468do) this.f16006b.getLast();
                if (c4468do.m19625a() == -1) {
                    c4468do.m19626b();
                    this.f16005a.m27293a(this);
                }
            }
        }
    }

    /* renamed from: d */
    public final Bundle m19624d() {
        Bundle bundle;
        synchronized (this.f16007c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f16008d);
            bundle.putString("slotid", this.f16009e);
            bundle.putBoolean("ismediation", this.f16012h);
            bundle.putLong("treq", this.f16015k);
            bundle.putLong("tresponse", this.f16016l);
            bundle.putLong("timp", this.f16011g);
            bundle.putLong("tload", this.f16013i);
            bundle.putLong("pcc", this.f16014j);
            bundle.putLong("tfetch", this.f16010f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f16006b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4468do) it.next()).m19628d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
