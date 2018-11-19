package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class aiw extends C4466a<zzpu> {
    /* renamed from: a */
    private /* synthetic */ FrameLayout f22978a;
    /* renamed from: b */
    private /* synthetic */ FrameLayout f22979b;
    /* renamed from: c */
    private /* synthetic */ Context f22980c;
    /* renamed from: d */
    private /* synthetic */ aiq f22981d;

    aiw(aiq aiq, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f22981d = aiq;
        this.f22978a = frameLayout;
        this.f22979b = frameLayout2;
        this.f22980c = context;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzpu a = this.f22981d.f15315f.m27173a(this.f22980c, this.f22978a, this.f22979b);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22980c, "native_ad_view_delegate");
        return new aku();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createNativeAdViewDelegate(C4296b.a(this.f22978a), C4296b.a(this.f22979b));
    }
}
