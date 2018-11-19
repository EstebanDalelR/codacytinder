package com.google.android.m4b.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p114n.C5483a;
import com.google.android.m4b.maps.p114n.C5486e;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5538f;
import com.google.android.m4b.maps.p124x.C5543k;
import com.google.android.m4b.maps.p124x.C5552t.C6832a;
import com.google.android.m4b.maps.p124x.al;
import java.util.List;

public class MapView extends FrameLayout {
    /* renamed from: a */
    private final C6296b f16761a;
    /* renamed from: b */
    private GoogleMap f16762b;

    /* renamed from: com.google.android.m4b.maps.MapView$b */
    static class C6296b extends C5483a<C7381a> {
        /* renamed from: a */
        private final ViewGroup f23590a;
        /* renamed from: b */
        private final Context f23591b;
        /* renamed from: c */
        private C5486e<C7381a> f23592c;
        /* renamed from: d */
        private final GoogleMapOptions f23593d;
        /* renamed from: e */
        private final List<OnMapReadyCallback> f23594e;

        /* renamed from: a */
        protected final void mo4768a(C5486e<C7381a> c5486e) {
            this.f23592c = c5486e;
            m27648a();
        }

        /* renamed from: a */
        public final void m27648a() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.f23592c;
            if (r0 == 0) goto L_0x0059;
        L_0x0004:
            r0 = r4.m23943b();
            if (r0 != 0) goto L_0x0059;
        L_0x000a:
            r0 = r4.f23591b;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            com.google.android.m4b.maps.MapsInitializer.m20402a(r0);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r0 = r4.f23591b;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r0 = com.google.android.m4b.maps.p124x.an.m24121a(r0);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r1 = r4.f23591b;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r1 = com.google.android.m4b.maps.p114n.C7701d.m33407a(r1);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r2 = r4.f23593d;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r0 = r0.mo7248a(r1, r2);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            if (r0 != 0) goto L_0x0024;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
        L_0x0023:
            return;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
        L_0x0024:
            r1 = r4.f23592c;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r2 = new com.google.android.m4b.maps.MapView$a;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r3 = r4.f23590a;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r1.mo5635a(r2);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r0 = r4.f23594e;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
        L_0x0036:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            if (r1 == 0) goto L_0x004c;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
        L_0x003c:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r1 = (com.google.android.m4b.maps.OnMapReadyCallback) r1;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r2 = r4.m23943b();	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r2 = (com.google.android.m4b.maps.MapView.C7381a) r2;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r2.m31760a(r1);	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            goto L_0x0036;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
        L_0x004c:
            r0 = r4.f23594e;	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            r0.clear();	 Catch:{ RemoteException -> 0x0052, f -> 0x0059 }
            return;
        L_0x0052:
            r0 = move-exception;
            r1 = new com.google.android.m4b.maps.model.RuntimeRemoteException;
            r1.<init>(r0);
            throw r1;
        L_0x0059:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.MapView.b.a():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.MapView$a */
    static class C7381a implements al {
        /* renamed from: a */
        private final ViewGroup f27111a;
        /* renamed from: b */
        private final C5543k f27112b;
        /* renamed from: c */
        private View f27113c;

        public C7381a(ViewGroup viewGroup, C5543k c5543k) {
            this.f27112b = (C5543k) C5462v.m23767a((Object) c5543k);
            this.f27111a = (ViewGroup) C5462v.m23767a((Object) viewGroup);
        }

        /* renamed from: a */
        public final void mo6970a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        /* renamed from: a */
        public final void mo6971a(Bundle bundle) {
            try {
                this.f27112b.mo7170a(bundle);
                this.f27113c = (View) C7701d.m33408a(this.f27112b.mo7178f());
                this.f27111a.removeAllViews();
                this.f27111a.addView(this.f27113c);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: a */
        public final View mo6968a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        /* renamed from: a */
        public final void mo6969a() {
            try {
                this.f27112b.mo7172b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6972b() {
            try {
                this.f27112b.mo7174c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo6974c() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        /* renamed from: d */
        public final void mo6975d() {
            try {
                this.f27112b.mo7176d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo6976e() {
            try {
                this.f27112b.mo7177e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6973b(Bundle bundle) {
            try {
                this.f27112b.mo7173b(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: f */
        public final C5543k m31766f() {
            return this.f27112b;
        }

        /* renamed from: a */
        public final void m31760a(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f27112b.mo7171a(new C6832a(this) {
                    /* renamed from: b */
                    private /* synthetic */ C7381a f27110b;

                    /* renamed from: a */
                    public final void mo5803a(C5538f c5538f) {
                        onMapReadyCallback.onMapReady(new GoogleMap(c5538f));
                    }
                });
            } catch (OnMapReadyCallback onMapReadyCallback2) {
                throw new RuntimeRemoteException(onMapReadyCallback2);
            }
        }
    }

    @Deprecated
    public final GoogleMap getMap() {
        if (this.f16762b != null) {
            return this.f16762b;
        }
        this.f16761a.m27648a();
        if (this.f16761a.m23943b() == null) {
            return null;
        }
        try {
            this.f16762b = new GoogleMap(((C7381a) this.f16761a.m23943b()).m31766f().mo7169a());
            return this.f16762b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
