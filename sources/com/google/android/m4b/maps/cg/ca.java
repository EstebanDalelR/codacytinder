package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.bd.C5147a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.TileOverlayOptions;
import com.google.android.m4b.maps.model.TileProvider;
import com.google.android.m4b.maps.model.internal.ITileOverlayDelegate;
import com.google.android.m4b.maps.model.internal.ITileOverlayDelegate.Stub;
import com.google.android.m4b.maps.p125y.C5569h;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.concurrent.atomic.AtomicInteger;

public final class ca extends Stub implements C5147a {
    /* renamed from: a */
    private static final TileOverlayOptions f28007a = new TileOverlayOptions();
    /* renamed from: b */
    private static AtomicInteger f28008b = new AtomicInteger(0);
    /* renamed from: c */
    private final bd f28009c;
    /* renamed from: d */
    private final cb f28010d;
    /* renamed from: e */
    private final String f28011e = String.format("to%d", new Object[]{Integer.valueOf(f28008b.getAndIncrement())});
    /* renamed from: f */
    private C5163a f28012f;
    /* renamed from: g */
    private final TileProvider f28013g;
    /* renamed from: h */
    private final aa f28014h;
    /* renamed from: i */
    private boolean f28015i;
    /* renamed from: j */
    private float f28016j;
    /* renamed from: k */
    private boolean f28017k;
    /* renamed from: l */
    private boolean f28018l;

    /* renamed from: com.google.android.m4b.maps.cg.ca$a */
    public interface C5163a {
        /* renamed from: a */
        void mo5001a();

        /* renamed from: a */
        void mo5002a(int i);

        /* renamed from: g */
        void mo5004g();
    }

    public ca(TileOverlayOptions tileOverlayOptions, bd bdVar, cb cbVar, aa aaVar) {
        this.f28009c = bdVar;
        this.f28010d = cbVar;
        this.f28014h = aaVar;
        this.f28013g = tileOverlayOptions.getTileProvider();
        this.f28015i = tileOverlayOptions.isVisible();
        this.f28016j = tileOverlayOptions.getZIndex();
        this.f28017k = tileOverlayOptions.getFadeIn();
        this.f28018l = false;
        if (tileOverlayOptions.isVisible() != f28007a.isVisible()) {
            this.f28010d.mo5310b(C5164a.TILE_OVERLAY_VISIBILITY);
        }
        if (tileOverlayOptions.getZIndex() != f28007a.getZIndex()) {
            this.f28010d.mo5310b(C5164a.TILE_OVERLAY_Z_INDEX);
        }
        if (tileOverlayOptions.getFadeIn() != f28007a.getFadeIn()) {
            this.f28010d.mo5310b(C5164a.TILE_OVERLAY_FADE);
        }
    }

    /* renamed from: a */
    public final void m33005a(C5163a c5163a) {
        this.f28012f = c5163a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m33003a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f28018l;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        return;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        r0 = r1.f28012f;
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r1.f28012f;
        r0.mo5002a(r2);
    L_0x0011:
        return;
    L_0x0012:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ca.a(int):void");
    }

    public final String getId() {
        return this.f28011e;
    }

    public final void remove() {
        this.f28014h.mo4875a();
        this.f28010d.mo5310b(C5164a.POLYLINE_REMOVE);
        mo7180a();
        this.f28009c.m22949b(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo7180a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f28018l;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        return;
    L_0x0007:
        r0 = 1;
        r1.f28018l = r0;	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        r0 = r1.f28012f;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r1.f28012f;
        r0.mo5001a();
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ca.a():void");
    }

    /* renamed from: b */
    public final TileProvider m33006b() {
        return this.f28013g;
    }

    public final void clearTileCache() {
        this.f28014h.mo4875a();
        this.f28010d.mo5310b(C5164a.TILE_OVERLAY_CLEAR_CACHE);
        if (this.f28012f != null) {
            this.f28012f.mo5004g();
        }
    }

    public final void setZIndex(float f) {
        this.f28014h.mo4875a();
        this.f28010d.mo5310b(C5164a.TILE_OVERLAY_Z_INDEX);
        synchronized (this) {
            this.f28016j = f;
        }
        m33003a((int) 2.8E-45f);
    }

    public final synchronized float getZIndex() {
        this.f28014h.mo4875a();
        return m33007c();
    }

    /* renamed from: c */
    public final synchronized float m33007c() {
        return this.f28016j;
    }

    public final void setVisible(boolean z) {
        this.f28014h.mo4875a();
        this.f28010d.mo5310b(C5164a.TILE_OVERLAY_VISIBILITY);
        synchronized (this) {
            this.f28015i = z;
        }
        m33003a((int) true);
    }

    public final synchronized boolean isVisible() {
        this.f28014h.mo4875a();
        return m33008d();
    }

    /* renamed from: d */
    public final synchronized boolean m33008d() {
        return this.f28015i;
    }

    public final void setFadeIn(boolean z) {
        this.f28014h.mo4875a();
        this.f28010d.mo5310b(C5164a.TILE_OVERLAY_FADE);
        synchronized (this) {
            this.f28017k = z;
        }
        m33003a((int) true);
    }

    public final synchronized boolean getFadeIn() {
        this.f28014h.mo4875a();
        return m33009e();
    }

    /* renamed from: e */
    public final synchronized boolean m33009e() {
        return this.f28017k;
    }

    public final synchronized String toString() {
        return C5569h.m24283a(this).m24281a("id", this.f28011e).m24282a(Property.VISIBLE, this.f28015i).m24278a("zIndex", this.f28016j).m24282a("fadeIn", this.f28017k).toString();
    }

    public final boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) {
        return equals(iTileOverlayDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
