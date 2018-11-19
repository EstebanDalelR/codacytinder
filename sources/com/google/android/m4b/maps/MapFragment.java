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
import com.google.android.m4b.maps.p124x.C5538f;
import com.google.android.m4b.maps.p124x.C5542j;
import com.google.android.m4b.maps.p124x.C5552t.C6832a;
import com.google.android.m4b.maps.p124x.al;
import com.google.android.m4b.maps.p124x.am;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
public class MapFragment extends Fragment {
    /* renamed from: a */
    private final C6295b f16760a = new C6295b(this);

    /* renamed from: com.google.android.m4b.maps.MapFragment$b */
    static class C6295b extends C5483a<C7379a> {
        /* renamed from: a */
        private final Fragment f23586a;
        /* renamed from: b */
        private C5486e<C7379a> f23587b;
        /* renamed from: c */
        private Activity f23588c;
        /* renamed from: d */
        private final List<OnMapReadyCallback> f23589d = new ArrayList();

        C6295b(Fragment fragment) {
            this.f23586a = fragment;
        }

        /* renamed from: a */
        protected final void mo4768a(C5486e<C7379a> c5486e) {
            this.f23587b = c5486e;
            m27646a();
        }

        /* renamed from: a */
        public final void m27646a() {
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
            r0 = r4.f23588c;
            if (r0 == 0) goto L_0x005b;
        L_0x0004:
            r0 = r4.f23587b;
            if (r0 == 0) goto L_0x005b;
        L_0x0008:
            r0 = r4.m23943b();
            if (r0 != 0) goto L_0x005b;
        L_0x000e:
            r0 = r4.f23588c;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            com.google.android.m4b.maps.MapsInitializer.m20402a(r0);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r4.f23588c;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = com.google.android.m4b.maps.p124x.an.m24121a(r0);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1 = r4.f23588c;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1 = com.google.android.m4b.maps.p114n.C7701d.m33407a(r1);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r0.mo7252b(r1);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            if (r0 != 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x0025:
            return;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x0026:
            r1 = r4.f23587b;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2 = new com.google.android.m4b.maps.MapFragment$a;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r3 = r4.f23586a;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1.mo5635a(r2);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r4.f23589d;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x0038:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            if (r1 == 0) goto L_0x004e;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x003e:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1 = (com.google.android.m4b.maps.OnMapReadyCallback) r1;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2 = r4.m23943b();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2 = (com.google.android.m4b.maps.MapFragment.C7379a) r2;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2.m31749a(r1);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            goto L_0x0038;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x004e:
            r0 = r4.f23589d;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0.clear();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            return;
        L_0x0054:
            r0 = move-exception;
            r1 = new com.google.android.m4b.maps.model.RuntimeRemoteException;
            r1.<init>(r0);
            throw r1;
        L_0x005b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.MapFragment.b.a():void");
        }

        /* renamed from: a */
        static /* synthetic */ void m27645a(C6295b c6295b, Activity activity) {
            c6295b.f23588c = activity;
            c6295b.m27646a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.MapFragment$a */
    static class C7379a implements al {
        /* renamed from: a */
        private final Fragment f27107a;
        /* renamed from: b */
        private final C5542j f27108b;

        public C7379a(Fragment fragment, C5542j c5542j) {
            this.f27108b = (C5542j) C5462v.m23767a((Object) c5542j);
            this.f27107a = (Fragment) C5462v.m23767a((Object) fragment);
        }

        /* renamed from: a */
        public final void mo6970a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27108b.mo7158a(C7701d.m33407a((Object) activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
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
            Bundle arguments = this.f27107a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                am.m24120a(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f27108b.mo7157a(bundle2);
        }

        /* renamed from: a */
        public final View mo6968a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C7701d.m33408a(this.f27108b.mo7155a(C7701d.m33407a((Object) layoutInflater), C7701d.m33407a((Object) viewGroup), bundle));
            } catch (LayoutInflater layoutInflater2) {
                throw new RuntimeRemoteException(layoutInflater2);
            }
        }

        /* renamed from: a */
        public final void mo6969a() {
            try {
                this.f27108b.mo7160b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6972b() {
            try {
                this.f27108b.mo7162c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo6974c() {
            try {
                this.f27108b.mo7164d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo6975d() {
            try {
                this.f27108b.mo7165e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo6976e() {
            try {
                this.f27108b.mo7166f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6973b(Bundle bundle) {
            try {
                this.f27108b.mo7161b(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: a */
        public final void m31749a(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f27108b.mo7159a(new C6832a(this) {
                    /* renamed from: b */
                    private /* synthetic */ C7379a f27106b;

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

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C6295b.m27645a(this.f16760a, activity);
    }

    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        C6295b.m27645a(this.f16760a, activity);
        attributeSet = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", attributeSet);
        this.f16760a.m23940a(activity, bundle2, bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16760a.m23941a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = this.f16760a.m23939a(layoutInflater, viewGroup, bundle);
        layoutInflater.setClickable(true);
        return layoutInflater;
    }

    public void onResume() {
        super.onResume();
        this.f16760a.m23945c();
    }

    public void onPause() {
        this.f16760a.m23946d();
        super.onPause();
    }

    public void onDestroyView() {
        this.f16760a.m23947e();
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f16760a.m23948f();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f16760a.m23949g();
        super.onLowMemory();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f16760a.m23944b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
