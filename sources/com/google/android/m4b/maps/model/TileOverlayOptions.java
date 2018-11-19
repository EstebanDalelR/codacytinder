package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.ITileProviderDelegate;
import com.google.android.m4b.maps.model.internal.ITileProviderDelegate.Stub;
import com.google.android.m4b.maps.p111k.C5468c;

public final class TileOverlayOptions implements C5468c {
    public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();
    /* renamed from: a */
    private final int f25201a;
    /* renamed from: b */
    private ITileProviderDelegate f25202b;
    /* renamed from: c */
    private TileProvider f25203c;
    /* renamed from: d */
    private boolean f25204d;
    /* renamed from: e */
    private float f25205e;
    /* renamed from: f */
    private boolean f25206f;

    /* renamed from: com.google.android.m4b.maps.model.TileOverlayOptions$1 */
    class C67161 implements TileProvider {
        /* renamed from: b */
        private final ITileProviderDelegate f25199b = this.f25200c.f25202b;
        /* renamed from: c */
        private /* synthetic */ TileOverlayOptions f25200c;

        C67161(TileOverlayOptions tileOverlayOptions) {
            this.f25200c = tileOverlayOptions;
        }

        public final com.google.android.m4b.maps.model.Tile getTile(int r2, int r3, int r4) {
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
            r1 = this;
            r0 = r1.f25199b;	 Catch:{ RemoteException -> 0x0007 }
            r2 = r0.getTile(r2, r3, r4);	 Catch:{ RemoteException -> 0x0007 }
            return r2;
        L_0x0007:
            r2 = 0;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.model.TileOverlayOptions.1.getTile(int, int, int):com.google.android.m4b.maps.model.Tile");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public TileOverlayOptions() {
        this.f25204d = true;
        this.f25206f = true;
        this.f25201a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2) {
        this.f25204d = true;
        this.f25206f = true;
        this.f25201a = i;
        this.f25202b = Stub.m30028a(iBinder);
        this.f25203c = this.f25202b == 0 ? 0 : new C67161(this);
        this.f25204d = z;
        this.f25205e = f;
        this.f25206f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TileOverlayOptionsCreator.m23912a(this, parcel);
    }

    /* renamed from: a */
    final int m30014a() {
        return this.f25201a;
    }

    /* renamed from: b */
    final IBinder m30015b() {
        return this.f25202b.asBinder();
    }

    public final TileOverlayOptions tileProvider(final TileProvider tileProvider) {
        this.f25203c = tileProvider;
        this.f25202b = this.f25203c == null ? null : new Stub(this) {
            /* renamed from: b */
            private /* synthetic */ TileOverlayOptions f28171b;

            public final Tile getTile(int i, int i2, int i3) {
                return tileProvider.getTile(i, i2, i3);
            }
        };
        return this;
    }

    public final TileOverlayOptions zIndex(float f) {
        this.f25205e = f;
        return this;
    }

    public final TileOverlayOptions visible(boolean z) {
        this.f25204d = z;
        return this;
    }

    public final TileOverlayOptions fadeIn(boolean z) {
        this.f25206f = z;
        return this;
    }

    public final TileProvider getTileProvider() {
        return this.f25203c;
    }

    public final float getZIndex() {
        return this.f25205e;
    }

    public final boolean isVisible() {
        return this.f25204d;
    }

    public final boolean getFadeIn() {
        return this.f25206f;
    }
}
