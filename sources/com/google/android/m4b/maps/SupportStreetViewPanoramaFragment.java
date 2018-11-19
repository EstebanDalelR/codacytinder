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
import com.google.android.m4b.maps.p124x.ae.C6791a;
import com.google.android.m4b.maps.p124x.ah;
import com.google.android.m4b.maps.p124x.ai;
import com.google.android.m4b.maps.p124x.am;
import com.google.android.m4b.maps.p124x.ao;
import java.util.ArrayList;
import java.util.List;

public class SupportStreetViewPanoramaFragment extends Fragment {
    /* renamed from: a */
    private final C6300b f27137a = new C6300b(this);

    /* renamed from: com.google.android.m4b.maps.SupportStreetViewPanoramaFragment$b */
    static class C6300b extends C5483a<C7393a> {
        /* renamed from: a */
        private final Fragment f23618a;
        /* renamed from: b */
        private C5486e<C7393a> f23619b;
        /* renamed from: c */
        private Activity f23620c;
        /* renamed from: d */
        private final List<OnStreetViewPanoramaReadyCallback> f23621d = new ArrayList();

        C6300b(Fragment fragment) {
            this.f23618a = fragment;
        }

        /* renamed from: a */
        protected final void mo4768a(C5486e<C7393a> c5486e) {
            this.f23619b = c5486e;
            m27665a();
        }

        /* renamed from: a */
        public final void m27665a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r4.f23620c;
            if (r0 == 0) goto L_0x0058;
        L_0x0004:
            r0 = r4.f23619b;
            if (r0 == 0) goto L_0x0058;
        L_0x0008:
            r0 = r4.m23943b();
            if (r0 != 0) goto L_0x0058;
        L_0x000e:
            r0 = r4.f23620c;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            com.google.android.m4b.maps.MapsInitializer.m20402a(r0);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r4.f23620c;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = com.google.android.m4b.maps.p124x.an.m24121a(r0);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = r4.f23620c;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = com.google.android.m4b.maps.p114n.C7701d.m33407a(r1);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r0.mo7253c(r1);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = r4.f23619b;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2 = new com.google.android.m4b.maps.SupportStreetViewPanoramaFragment$a;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r3 = r4.f23618a;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2.<init>(r3, r0);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1.mo5635a(r2);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r4.f23621d;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r0 = r0.iterator();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
        L_0x0035:
            r1 = r0.hasNext();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            if (r1 == 0) goto L_0x004b;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
        L_0x003b:
            r1 = r0.next();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r1 = (com.google.android.m4b.maps.OnStreetViewPanoramaReadyCallback) r1;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2 = r4.m23943b();	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2 = (com.google.android.m4b.maps.SupportStreetViewPanoramaFragment.C7393a) r2;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            r2.m31812a(r1);	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
            goto L_0x0035;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
        L_0x004b:
            r0 = r4.f23621d;	 Catch:{ RemoteException -> 0x0051, f -> 0x0058 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.SupportStreetViewPanoramaFragment.b.a():void");
        }

        /* renamed from: a */
        static /* synthetic */ void m27664a(C6300b c6300b, Activity activity) {
            c6300b.f23620c = activity;
            c6300b.m27665a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.SupportStreetViewPanoramaFragment$a */
    static class C7393a implements ao {
        /* renamed from: a */
        private final Fragment f27135a;
        /* renamed from: b */
        private final ai f27136b;

        public C7393a(Fragment fragment, ai aiVar) {
            this.f27136b = (ai) C5462v.m23767a((Object) aiVar);
            this.f27135a = (Fragment) C5462v.m23767a((Object) fragment);
        }

        /* renamed from: a */
        public final void mo6970a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27136b.mo7191a(C7701d.m33407a((Object) activity), null, bundle2);
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
            Bundle arguments = this.f27135a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                am.m24120a(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f27136b.mo7190a(bundle2);
        }

        /* renamed from: a */
        public final View mo6968a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) C7701d.m33408a(this.f27136b.mo7188a(C7701d.m33407a((Object) layoutInflater), C7701d.m33407a((Object) viewGroup), bundle));
            } catch (LayoutInflater layoutInflater2) {
                throw new RuntimeRemoteException(layoutInflater2);
            }
        }

        /* renamed from: a */
        public final void mo6969a() {
            try {
                this.f27136b.mo7193b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6972b() {
            try {
                this.f27136b.mo7195c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo6974c() {
            try {
                this.f27136b.mo7196d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo6975d() {
            try {
                this.f27136b.mo7197e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo6976e() {
            try {
                this.f27136b.mo7198f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo6973b(Bundle bundle) {
            try {
                this.f27136b.mo7194b(bundle);
            } catch (Bundle bundle2) {
                throw new RuntimeRemoteException(bundle2);
            }
        }

        /* renamed from: a */
        public final void m31812a(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f27136b.mo7192a(new C6791a(this) {
                    /* renamed from: b */
                    private /* synthetic */ C7393a f27134b;

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
        C6300b.m27664a(this.f27137a, activity);
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        C6300b.m27664a(this.f27137a, activity);
        this.f27137a.m23940a(activity, (Bundle) new Bundle(), bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27137a.m23941a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f27137a.m23939a(layoutInflater, viewGroup, bundle);
    }

    public void onResume() {
        super.onResume();
        this.f27137a.m23945c();
    }

    public void onPause() {
        this.f27137a.m23946d();
        super.onPause();
    }

    public void onDestroyView() {
        this.f27137a.m23947e();
        super.onDestroyView();
    }

    public void onDestroy() {
        this.f27137a.m23948f();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f27137a.m23949g();
        super.onLowMemory();
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f27137a.m23944b(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
