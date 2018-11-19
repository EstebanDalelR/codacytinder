package com.google.android.m4b.maps.cg;

import android.os.RemoteException;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5544l;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ay implements Runnable {
    /* renamed from: a */
    private static long f19080a = TimeUnit.MINUTES.toMillis(1);
    /* renamed from: b */
    private final ScheduledExecutorService f19081b;
    /* renamed from: c */
    private volatile ScheduledFuture f19082c;
    /* renamed from: d */
    private C4662a f19083d;
    /* renamed from: e */
    private C5142a f19084e;
    /* renamed from: f */
    private final C6413m f19085f;
    /* renamed from: g */
    private final C5544l f19086g;
    /* renamed from: h */
    private final MapsEngineLayerInfo f19087h;
    /* renamed from: i */
    private volatile boolean f19088i;
    /* renamed from: j */
    private volatile String f19089j;
    /* renamed from: k */
    private int f19090k = 0;

    /* renamed from: com.google.android.m4b.maps.cg.ay$a */
    public interface C5142a {
        /* renamed from: a */
        void mo7037a(C4662a c4662a);
    }

    ay(MapsEngineLayerInfo mapsEngineLayerInfo, C5544l c5544l, ScheduledExecutorService scheduledExecutorService, C6413m c6413m) {
        this.f19081b = scheduledExecutorService;
        this.f19087h = mapsEngineLayerInfo;
        this.f19086g = c5544l;
        this.f19085f = c6413m;
    }

    /* renamed from: a */
    public final synchronized void m22907a(C5142a c5142a) {
        this.f19084e = c5142a;
    }

    /* renamed from: a */
    public final void m22905a() {
        this.f19082c = this.f19081b.schedule(this, 0, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void m22908b() {
        if (this.f19082c != null) {
            this.f19082c.cancel(true);
        }
    }

    public final void run() {
        try {
            if (this.f19088i) {
                this.f19086g.mo5794a(this.f19089j);
                this.f19088i = false;
            }
            this.f19089j = this.f19086g.mo5793a();
            if (this.f19089j != null) {
                this.f19085f.m28017c(this.f19089j);
            }
            this.f19085f.mo4893c(new ah(this.f19087h, this));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    final void m22909c() {
        this.f19088i = true;
        long pow = (long) (Math.pow(2.0d, (double) this.f19090k) * 200.0d);
        if (pow < f19080a) {
            this.f19082c = this.f19081b.schedule(this, pow, TimeUnit.MILLISECONDS);
            this.f19090k++;
        }
    }

    /* renamed from: a */
    final void m22906a(C4662a c4662a, long j) {
        this.f19090k = 0;
        synchronized (this) {
            this.f19083d = c4662a;
            if (this.f19084e != null) {
                this.f19084e.mo7037a(c4662a);
            }
        }
        if (j > 0) {
            this.f19082c = this.f19081b.schedule(this, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    final void m22910d() {
        this.f19090k = 0;
    }

    /* renamed from: e */
    public final synchronized C4662a m22911e() {
        return this.f19083d;
    }
}
