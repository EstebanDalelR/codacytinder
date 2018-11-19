package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.ay.C5142a;
import com.google.android.m4b.maps.cg.bd.C5147a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;
import com.google.android.m4b.maps.model.MapsEngineLayerOptions;
import com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate;
import com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate.Stub;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class ax extends Stub implements C5142a, C5147a {
    /* renamed from: a */
    private static final MapsEngineLayerOptions f27888a = new MapsEngineLayerOptions();
    /* renamed from: b */
    private static AtomicInteger f27889b = new AtomicInteger(0);
    /* renamed from: c */
    private final bd f27890c;
    /* renamed from: d */
    private final aa f27891d;
    /* renamed from: e */
    private final cb f27892e;
    /* renamed from: f */
    private final ay f27893f;
    /* renamed from: g */
    private C6602a f27894g;
    /* renamed from: h */
    private final String f27895h = String.format("me%d", new Object[]{Integer.valueOf(f27889b.getAndIncrement())});
    /* renamed from: i */
    private final MapsEngineLayerInfo f27896i;
    /* renamed from: j */
    private boolean f27897j;
    /* renamed from: k */
    private float f27898k;
    /* renamed from: l */
    private boolean f27899l;
    /* renamed from: m */
    private boolean f27900m;

    /* renamed from: com.google.android.m4b.maps.cg.ax$a */
    public interface C6602a extends C5142a {
        /* renamed from: a */
        void mo7035a();

        /* renamed from: a */
        void mo7036a(int i);
    }

    /* renamed from: a */
    static ax m32854a(MapsEngineLayerOptions mapsEngineLayerOptions, C7518t c7518t, ScheduledExecutorService scheduledExecutorService, C6413m c6413m, bd bdVar, cb cbVar, aa aaVar) {
        return new ax(mapsEngineLayerOptions, bdVar, cbVar, new ay(mapsEngineLayerOptions.getLayerInfo(), c7518t, scheduledExecutorService, c6413m), aaVar);
    }

    private ax(MapsEngineLayerOptions mapsEngineLayerOptions, bd bdVar, cb cbVar, ay ayVar, aa aaVar) {
        this.f27890c = bdVar;
        this.f27892e = cbVar;
        this.f27891d = aaVar;
        this.f27896i = mapsEngineLayerOptions.getLayerInfo();
        this.f27897j = mapsEngineLayerOptions.isVisible();
        this.f27898k = mapsEngineLayerOptions.getZIndex();
        this.f27899l = mapsEngineLayerOptions.isDefaultUiEnabled();
        this.f27893f = ayVar;
        this.f27893f.m22907a(this);
        this.f27893f.m22905a();
        if (mapsEngineLayerOptions.isVisible() != f27888a.isVisible()) {
            this.f27892e.mo5310b(C5164a.MAPS_ENGINE_OVERLAY_VISIBILITY);
        }
        if (mapsEngineLayerOptions.getZIndex() != f27888a.getZIndex()) {
            this.f27892e.mo5310b(C5164a.MAPS_ENGINE_OVERLAY_Z_INDEX);
        }
        if (mapsEngineLayerOptions.isDefaultUiEnabled() != f27888a.isDefaultUiEnabled()) {
            this.f27892e.mo5310b(C5164a.MAPS_ENGINE_OVERLAY_DEFAULT_UI);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m32855a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f27900m;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        return;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        r0 = r1.f27894g;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r1.f27894g;
        r0.mo7036a(r2);
    L_0x0011:
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ax.a(int):void");
    }

    /* renamed from: a */
    public final void m32858a(C6602a c6602a) {
        this.f27894g = c6602a;
    }

    /* renamed from: b */
    public final C4662a m32859b() {
        return this.f27893f.m22911e();
    }

    /* renamed from: a */
    public final void mo7037a(C4662a c4662a) {
        this.f27894g.mo7037a(c4662a);
    }

    public final void remove() {
        this.f27891d.mo4875a();
        this.f27892e.mo5310b(C5164a.POLYLINE_REMOVE);
        mo7180a();
        this.f27890c.m22949b(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo7180a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f27900m;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        return;
    L_0x0007:
        r0 = 1;
        r1.f27900m = r0;	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        r0 = r1.f27894g;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r1.f27894g;
        r0.mo7035a();
    L_0x0014:
        r0 = r1.f27893f;
        r0.m22908b();
        return;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ax.a():void");
    }

    public final MapsEngineLayerInfo getLayerInfo() {
        this.f27891d.mo4875a();
        return this.f27896i;
    }

    /* renamed from: c */
    public final String m32860c() {
        return this.f27895h;
    }

    public final void setZIndex(float f) {
        this.f27891d.mo4875a();
        this.f27892e.mo5310b(C5164a.TILE_OVERLAY_Z_INDEX);
        synchronized (this) {
            this.f27898k = f;
        }
        m32855a((int) 2.8E-45f);
    }

    public final float getZIndex() {
        this.f27891d.mo4875a();
        return m32861d();
    }

    /* renamed from: d */
    public final synchronized float m32861d() {
        return this.f27898k;
    }

    public final void setVisible(boolean z) {
        this.f27891d.mo4875a();
        this.f27892e.mo5310b(C5164a.TILE_OVERLAY_VISIBILITY);
        synchronized (this) {
            this.f27897j = z;
        }
        m32855a((int) true);
    }

    public final boolean isVisible() {
        this.f27891d.mo4875a();
        return m32862e();
    }

    /* renamed from: e */
    public final synchronized boolean m32862e() {
        return this.f27897j;
    }

    public final void setDefaultUiEnabled(boolean z) {
        this.f27891d.mo4875a();
        this.f27892e.mo5310b(C5164a.MAPS_ENGINE_OVERLAY_DEFAULT_UI);
        this.f27899l = z;
        m32855a((int) true);
    }

    public final boolean isDefaultUiEnabled() {
        this.f27891d.mo4875a();
        return m32863f();
    }

    /* renamed from: f */
    public final synchronized boolean m32863f() {
        return this.f27899l;
    }

    public final boolean equalsRemote(IMapsEngineLayerDelegate iMapsEngineLayerDelegate) {
        return equals(iMapsEngineLayerDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
