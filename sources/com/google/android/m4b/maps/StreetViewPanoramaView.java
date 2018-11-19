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
import com.google.android.m4b.maps.p124x.ae.C6791a;
import com.google.android.m4b.maps.p124x.ah;
import com.google.android.m4b.maps.p124x.aj;
import com.google.android.m4b.maps.p124x.ao;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    /* renamed from: a */
    private final C6298b f16767a;
    /* renamed from: b */
    private StreetViewPanorama f16768b;

    /* renamed from: com.google.android.m4b.maps.StreetViewPanoramaView$b */
    static class C6298b extends C5483a<C7389a> {
        /* renamed from: a */
        private final ViewGroup f23609a;
        /* renamed from: b */
        private final Context f23610b;
        /* renamed from: c */
        private C5486e<C7389a> f23611c;
        /* renamed from: d */
        private final StreetViewPanoramaOptions f23612d;
        /* renamed from: e */
        private final List<OnStreetViewPanoramaReadyCallback> f23613e;

        /* renamed from: a */
        protected final void mo4768a(C5486e<C7389a> c5486e) {
            this.f23611c = c5486e;
            m27659a();
        }

        /* renamed from: a */
        public final void m27659a() {
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
            r0 = r4.f23611c;
            if (r0 == 0) goto L_0x0051;
        L_0x0004:
            r0 = r4.m23943b();
            if (r0 != 0) goto L_0x0051;
        L_0x000a:
            r0 = r4.f23610b;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r0 = com.google.android.m4b.maps.p124x.an.m24121a(r0);	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r1 = r4.f23610b;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r1 = com.google.android.m4b.maps.p114n.C7701d.m33407a(r1);	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r2 = r4.f23612d;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r0 = r0.mo7246a(r1, r2);	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r1 = r4.f23611c;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r2 = new com.google.android.m4b.maps.StreetViewPanoramaView$a;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r3 = r4.f23609a;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r1.mo5635a(r2);	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r0 = r4.f23613e;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
        L_0x002e:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            if (r1 == 0) goto L_0x0044;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
        L_0x0034:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r1 = (com.google.android.m4b.maps.OnStreetViewPanoramaReadyCallback) r1;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r2 = r4.m23943b();	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r2 = (com.google.android.m4b.maps.StreetViewPanoramaView.C7389a) r2;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r2.m31787a(r1);	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            goto L_0x002e;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
        L_0x0044:
            r0 = r4.f23613e;	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            r0.clear();	 Catch:{ RemoteException -> 0x004a, f -> 0x0051 }
            return;
        L_0x004a:
            r0 = move-exception;
            r1 = new com.google.android.m4b.maps.model.RuntimeRemoteException;
            r1.<init>(r0);
            throw r1;
        L_0x0051:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.StreetViewPanoramaView.b.a():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.StreetViewPanoramaView$a */
    static class C7389a implements ao {
        /* renamed from: a */
        private final ViewGroup f27124a;
        /* renamed from: b */
        private final aj f27125b;
        /* renamed from: c */
        private View f27126c;

        public C7389a(ViewGroup viewGroup, aj ajVar) {
            this.f27125b = (aj) C5462v.m23767a((Object) ajVar);
            this.f27124a = (ViewGroup) C5462v.m23767a((Object) viewGroup);
        }

        /* renamed from: a */
        public final void mo6970a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        /* renamed from: a */
        public final void mo6971a(Bundle bundle) {
            try {
                this.f27125b.mo7201a(bundle);
                this.f27126c = (View) C7701d.m33408a(this.f27125b.mo7208f());
                this.f27124a.removeAllViews();
                this.f27124a.addView(this.f27126c);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: a */
        public final View mo6968a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        /* renamed from: a */
        public final void mo6969a() {
            try {
                this.f27125b.mo7203b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6972b() {
            try {
                this.f27125b.mo7205c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo6974c() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        /* renamed from: d */
        public final void mo6975d() {
            try {
                this.f27125b.mo7206d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo6976e() {
            try {
                this.f27125b.mo7207e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6973b(Bundle bundle) {
            try {
                this.f27125b.mo7204b(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: f */
        public final aj m31793f() {
            return this.f27125b;
        }

        /* renamed from: a */
        public final void m31787a(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f27125b.mo7202a(new C6791a(this) {
                    /* renamed from: b */
                    private /* synthetic */ C7389a f27123b;

                    /* renamed from: a */
                    public final void mo5691a(ah ahVar) {
                        onStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(new StreetViewPanorama(ahVar));
                    }
                });
            } catch (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback2) {
                throw new RuntimeRemoteException(onStreetViewPanoramaReadyCallback2);
            }
        }
    }

    @Deprecated
    public final StreetViewPanorama getStreetViewPanorama() {
        if (this.f16768b != null) {
            return this.f16768b;
        }
        this.f16767a.m27659a();
        if (this.f16767a.m23943b() == null) {
            return null;
        }
        try {
            this.f16768b = new StreetViewPanorama(((C7389a) this.f16767a.m23943b()).m31793f().mo7200a());
            return this.f16768b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
