package com.google.android.m4b.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
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

public class SupportMapFragment extends Fragment {
    /* renamed from: a */
    private final C6299b f27131a = new C6299b(this);
    /* renamed from: b */
    private GoogleMap f27132b;

    /* renamed from: com.google.android.m4b.maps.SupportMapFragment$b */
    static class C6299b extends C5483a<C7391a> {
        /* renamed from: a */
        private final Fragment f23614a;
        /* renamed from: b */
        private C5486e<C7391a> f23615b;
        /* renamed from: c */
        private Activity f23616c;
        /* renamed from: d */
        private final List<OnMapReadyCallback> f23617d = new ArrayList();

        C6299b(Fragment fragment) {
            this.f23614a = fragment;
        }

        /* renamed from: a */
        protected final void mo4768a(C5486e<C7391a> c5486e) {
            this.f23615b = c5486e;
            m27662a();
        }

        /* renamed from: a */
        public final void m27662a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r4.f23616c;
            if (r0 == 0) goto L_0x005b;
        L_0x0004:
            r0 = r4.f23615b;
            if (r0 == 0) goto L_0x005b;
        L_0x0008:
            r0 = r4.m23943b();
            if (r0 != 0) goto L_0x005b;
        L_0x000e:
            r0 = r4.f23616c;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            com.google.android.m4b.maps.MapsInitializer.m20402a(r0);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r4.f23616c;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = com.google.android.m4b.maps.p124x.an.m24121a(r0);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1 = r4.f23616c;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1 = com.google.android.m4b.maps.p114n.C7701d.m33407a(r1);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r0.mo7252b(r1);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            if (r0 != 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x0025:
            return;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x0026:
            r1 = r4.f23615b;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2 = new com.google.android.m4b.maps.SupportMapFragment$a;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r3 = r4.f23614a;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1.mo5635a(r2);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r4.f23617d;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x0038:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            if (r1 == 0) goto L_0x004e;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x003e:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r1 = (com.google.android.m4b.maps.OnMapReadyCallback) r1;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2 = r4.m23943b();	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2 = (com.google.android.m4b.maps.SupportMapFragment.C7391a) r2;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            r2.m31799a(r1);	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
            goto L_0x0038;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
        L_0x004e:
            r0 = r4.f23617d;	 Catch:{ RemoteException -> 0x0054, f -> 0x005b }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.SupportMapFragment.b.a():void");
        }

        /* renamed from: a */
        static /* synthetic */ void m27661a(C6299b c6299b, Activity activity) {
            c6299b.f23616c = activity;
            c6299b.m27662a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.SupportMapFragment$a */
    static class C7391a implements al {
        /* renamed from: a */
        private final Fragment f27129a;
        /* renamed from: b */
        private final C5542j f27130b;

        public C7391a(Fragment fragment, C5542j c5542j) {
            this.f27130b = (C5542j) C5462v.m23767a((Object) c5542j);
            this.f27129a = (Fragment) C5462v.m23767a((Object) fragment);
        }

        /* renamed from: a */
        public final void mo6970a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27130b.mo7158a(C7701d.m33407a((Object) activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
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
            Bundle arguments = this.f27129a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                am.m24120a(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f27130b.mo7157a(bundle2);
        }

        /* renamed from: a */
        public final View mo6968a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C7701d.m33408a(this.f27130b.mo7155a(C7701d.m33407a((Object) layoutInflater), C7701d.m33407a((Object) viewGroup), bundle));
            } catch (LayoutInflater layoutInflater2) {
                throw new RuntimeRemoteException(layoutInflater2);
            }
        }

        /* renamed from: a */
        public final void mo6969a() {
            try {
                this.f27130b.mo7160b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6972b() {
            try {
                this.f27130b.mo7162c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo6974c() {
            try {
                this.f27130b.mo7164d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo6975d() {
            try {
                this.f27130b.mo7165e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo6976e() {
            try {
                this.f27130b.mo7166f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6973b(Bundle bundle) {
            try {
                this.f27130b.mo7161b(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: f */
        public final C5542j m31805f() {
            return this.f27130b;
        }

        /* renamed from: a */
        public final void m31799a(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f27130b.mo7159a(new C6832a(this) {
                    /* renamed from: b */
                    private /* synthetic */ C7391a f27128b;

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
        C6299b.m27661a(this.f27131a, activity);
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        C6299b.m27661a(this.f27131a, activity);
        attributeSet = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", attributeSet);
        this.f27131a.m23940a(activity, bundle2, bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27131a.m23941a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = this.f27131a.m23939a(layoutInflater, viewGroup, bundle);
        layoutInflater.setClickable(true);
        return layoutInflater;
    }

    public void onResume() {
        super.onResume();
        this.f27131a.m23945c();
    }

    public void onPause() {
        this.f27131a.m23946d();
        super.onPause();
    }

    public void onDestroyView() {
        this.f27131a.m23947e();
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f27131a.m23948f();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f27131a.m23949g();
        super.onLowMemory();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f27131a.m23944b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Deprecated
    /* renamed from: a */
    public final GoogleMap m31806a() {
        C5542j c5542j;
        this.f27131a.m27662a();
        if (this.f27131a.m23943b() == null) {
            c5542j = null;
        } else {
            c5542j = ((C7391a) this.f27131a.m23943b()).m31805f();
        }
        if (c5542j == null) {
            return null;
        }
        try {
            C5538f a = c5542j.mo7156a();
            if (a == null) {
                return null;
            }
            if (this.f27132b == null || this.f27132b.m20389a().asBinder() != a.asBinder()) {
                this.f27132b = new GoogleMap(a);
            }
            return this.f27132b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
