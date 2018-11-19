package com.google.android.m4b.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p114n.C5483a;
import com.google.android.m4b.maps.p114n.C5486e;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.ae.C6791a;
import com.google.android.m4b.maps.p124x.ah;
import com.google.android.m4b.maps.p124x.ai;
import com.google.android.m4b.maps.p124x.am;
import com.google.android.m4b.maps.p124x.ao;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
public class StreetViewPanoramaFragment extends Fragment {
    /* renamed from: a */
    private final C6297b f16766a = new C6297b(this);

    /* renamed from: com.google.android.m4b.maps.StreetViewPanoramaFragment$b */
    static class C6297b extends C5483a<C7387a> {
        /* renamed from: a */
        private final Fragment f23595a;
        /* renamed from: b */
        private C5486e<C7387a> f23596b;
        /* renamed from: c */
        private Activity f23597c;
        /* renamed from: d */
        private final List<OnStreetViewPanoramaReadyCallback> f23598d = new ArrayList();

        C6297b(Fragment fragment) {
            this.f23595a = fragment;
        }

        /* renamed from: a */
        protected final void mo4768a(C5486e<C7387a> c5486e) {
            this.f23596b = c5486e;
            m27651a();
        }

        /* renamed from: a */
        public final void m27651a() {
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
            r0 = r4.f23597c;
            if (r0 == 0) goto L_0x0058;
        L_0x0004:
            r0 = r4.f23596b;
            if (r0 == 0) goto L_0x0058;
        L_0x0008:
            r0 = r4.m23943b();
            if (r0 != 0) goto L_0x0058;
        L_0x000e:
            r0 = r4.f23597c;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            com.google.android.m4b.maps.MapsInitializer.m20402a(r0);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r4.f23597c;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = com.google.android.m4b.maps.p124x.an.m24121a(r0);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = r4.f23597c;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = com.google.android.m4b.maps.p114n.C7701d.m33407a(r1);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r0.mo7253c(r1);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = r4.f23596b;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2 = new com.google.android.m4b.maps.StreetViewPanoramaFragment$a;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r3 = r4.f23595a;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1.mo5635a(r2);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r4.f23598d;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
        L_0x0035:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            if (r1 == 0) goto L_0x004b;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
        L_0x003b:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = (com.google.android.m4b.maps.OnStreetViewPanoramaReadyCallback) r1;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2 = r4.m23943b();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2 = (com.google.android.m4b.maps.StreetViewPanoramaFragment.C7387a) r2;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2.m31776a(r1);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            goto L_0x0035;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
        L_0x004b:
            r0 = r4.f23598d;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0.clear();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            return;
        L_0x0051:
            r0 = move-exception;
            r1 = new com.google.android.m4b.maps.model.RuntimeRemoteException;
            r1.<init>(r0);
            throw r1;
        L_0x0058:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.StreetViewPanoramaFragment.b.a():void");
        }

        /* renamed from: a */
        static /* synthetic */ void m27650a(C6297b c6297b, Activity activity) {
            c6297b.f23597c = activity;
            c6297b.m27651a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.StreetViewPanoramaFragment$a */
    static class C7387a implements ao {
        /* renamed from: a */
        private final Fragment f27120a;
        /* renamed from: b */
        private final ai f27121b;

        public C7387a(Fragment fragment, ai aiVar) {
            this.f27121b = (ai) C5462v.m23767a((Object) aiVar);
            this.f27120a = (Fragment) C5462v.m23767a((Object) fragment);
        }

        /* renamed from: a */
        public final void mo6970a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27121b.mo7191a(C7701d.m33407a((Object) activity), null, bundle2);
            } catch (Activity activity2) {
                throw new RuntimeRemoteException(activity2);
            }
        }

        /* renamed from: a */
        public final void mo6971a(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Bundle bundle2) {
                    throw new RuntimeRemoteException(bundle2);
                }
            }
            Bundle arguments = this.f27120a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                am.m24120a(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f27121b.mo7190a(bundle2);
        }

        /* renamed from: a */
        public final View mo6968a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C7701d.m33408a(this.f27121b.mo7188a(C7701d.m33407a((Object) layoutInflater), C7701d.m33407a((Object) viewGroup), bundle));
            } catch (LayoutInflater layoutInflater2) {
                throw new RuntimeRemoteException(layoutInflater2);
            }
        }

        /* renamed from: a */
        public final void mo6969a() {
            try {
                this.f27121b.mo7193b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6972b() {
            try {
                this.f27121b.mo7195c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo6974c() {
            try {
                this.f27121b.mo7196d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo6975d() {
            try {
                this.f27121b.mo7197e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo6976e() {
            try {
                this.f27121b.mo7198f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6973b(Bundle bundle) {
            try {
                this.f27121b.mo7194b(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: a */
        public final void m31776a(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f27121b.mo7192a(new C6791a(this) {
                    /* renamed from: b */
                    private /* synthetic */ C7387a f27119b;

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

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C6297b.m27650a(this.f16766a, activity);
    }

    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        C6297b.m27650a(this.f16766a, activity);
        this.f16766a.m23940a(activity, (Bundle) new Bundle(), bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16766a.m23941a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f16766a.m23939a(layoutInflater, viewGroup, bundle);
    }

    public void onResume() {
        super.onResume();
        this.f16766a.m23945c();
    }

    public void onPause() {
        this.f16766a.m23946d();
        super.onPause();
    }

    public void onDestroyView() {
        this.f16766a.m23947e();
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f16766a.m23948f();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f16766a.m23949g();
        super.onLowMemory();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f16766a.m23944b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
