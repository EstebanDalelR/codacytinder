package com.google.android.m4b.maps.p108h;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C5462v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.m4b.maps.h.s */
public final class C7693s extends Fragment implements OnCancelListener {
    /* renamed from: a */
    private boolean f28152a;
    /* renamed from: b */
    private boolean f28153b;
    /* renamed from: c */
    private int f28154c = -1;
    /* renamed from: d */
    private C6676a f28155d;
    /* renamed from: e */
    private final Handler f28156e = new Handler(Looper.getMainLooper());
    /* renamed from: f */
    private final SparseArray<C6692a> f28157f = new SparseArray();

    /* renamed from: com.google.android.m4b.maps.h.s$b */
    class C5431b implements Runnable {
        /* renamed from: a */
        private final int f20375a;
        /* renamed from: b */
        private final C6676a f20376b;
        /* renamed from: c */
        private /* synthetic */ C7693s f20377c;

        public C5431b(C7693s c7693s, int i, C6676a c6676a) {
            this.f20377c = c7693s;
            this.f20375a = i;
            this.f20376b = c6676a;
        }

        public final void run() {
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
            r5 = this;
            r0 = r5.f20377c;
            r0 = r0.f28152a;
            if (r0 == 0) goto L_0x0082;
        L_0x0008:
            r0 = r5.f20377c;
            r0 = r0.f28153b;
            if (r0 == 0) goto L_0x0011;
        L_0x0010:
            goto L_0x0082;
        L_0x0011:
            r0 = r5.f20377c;
            r1 = 1;
            r0.f28153b = true;
            r0 = r5.f20377c;
            r2 = r5.f20375a;
            r0.f28154c = r2;
            r0 = r5.f20377c;
            r2 = r5.f20376b;
            r0.f28155d = r2;
            r0 = r5.f20376b;
            r0 = r0.m29745a();
            if (r0 == 0) goto L_0x0057;
        L_0x002d:
            r0 = r5.f20377c;	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0.getActivity();	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0.getSupportFragmentManager();	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0.e();	 Catch:{ SendIntentException -> 0x0051 }
            r2 = r5.f20377c;	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0.indexOf(r2);	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0 + r1;	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0 << 16;	 Catch:{ SendIntentException -> 0x0051 }
            r0 = r0 + r1;	 Catch:{ SendIntentException -> 0x0051 }
            r1 = r5.f20376b;	 Catch:{ SendIntentException -> 0x0051 }
            r2 = r5.f20377c;	 Catch:{ SendIntentException -> 0x0051 }
            r2 = r2.getActivity();	 Catch:{ SendIntentException -> 0x0051 }
            r1.m29744a(r2, r0);	 Catch:{ SendIntentException -> 0x0051 }
            return;
        L_0x0051:
            r0 = r5.f20377c;
            r0.m33381a();
            return;
        L_0x0057:
            r0 = r5.f20376b;
            r0 = r0.m29747c();
            r0 = com.google.android.m4b.maps.p107g.C5398g.m23584b(r0);
            if (r0 == 0) goto L_0x0078;
        L_0x0063:
            r0 = r5.f20376b;
            r0 = r0.m29747c();
            r1 = r5.f20377c;
            r1 = r1.getActivity();
            r2 = r5.f20377c;
            r3 = 2;
            r4 = r5.f20377c;
            com.google.android.m4b.maps.p107g.C5398g.m23578a(r0, r1, r2, r3, r4);
            return;
        L_0x0078:
            r0 = r5.f20377c;
            r1 = r5.f20375a;
            r2 = r5.f20376b;
            r0.m33382a(r1, r2);
            return;
        L_0x0082:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.s.b.run():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.s$a */
    class C6692a implements C5411d {
        /* renamed from: a */
        public final int f25051a;
        /* renamed from: b */
        public final C5414d f25052b;
        /* renamed from: c */
        public final C5411d f25053c;
        /* renamed from: d */
        private /* synthetic */ C7693s f25054d;

        public C6692a(C7693s c7693s, int i, C5414d c5414d, C5411d c5411d) {
            this.f25054d = c7693s;
            this.f25051a = i;
            this.f25052b = c5414d;
            this.f25053c = c5411d;
            c5414d.mo5417a((C5411d) this);
        }

        /* renamed from: a */
        public final void mo5307a(C6676a c6676a) {
            this.f25054d.f28156e.post(new C5431b(this.f25054d, this.f25051a, c6676a));
        }
    }

    /* renamed from: a */
    public static C7693s m33380a(FragmentActivity fragmentActivity) {
        C5462v.m23769a("Must be called from main thread of process");
        fragmentActivity = fragmentActivity.getSupportFragmentManager();
        try {
            C7693s c7693s = (C7693s) fragmentActivity.a("GmsSupportLifecycleFragment");
            if (c7693s != null && !c7693s.isRemoving()) {
                return c7693s;
            }
            Fragment c7693s2 = new C7693s();
            fragmentActivity.a().a(c7693s2, "GmsSupportLifecycleFragment").c();
            fragmentActivity.b();
            return c7693s2;
        } catch (FragmentActivity fragmentActivity2) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentActivity2);
        }
    }

    /* renamed from: a */
    public final void m33389a(int i, C5414d c5414d, C5411d c5411d) {
        C5462v.m23768a((Object) c5414d, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f28157f.indexOfKey(i) < 0;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Already managing a GoogleApiClient with id ");
        stringBuilder.append(i);
        C5462v.m23771a(z, stringBuilder.toString());
        this.f28157f.put(i, new C6692a(this, i, c5414d, c5411d));
        if (this.f28152a != 0 && this.f28153b == 0) {
            c5414d.mo5420b();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m33382a(this.f28154c, new C6676a(13, null));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f28153b = bundle.getBoolean("resolving_error", false);
            this.f28154c = bundle.getInt("failed_client_id", -1);
            if (this.f28154c >= 0) {
                this.f28155d = new C6676a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.f28153b);
        if (this.f28154c >= 0) {
            bundle.putInt("failed_client_id", this.f28154c);
            bundle.putInt("failed_status", this.f28155d.m29747c());
            bundle.putParcelable("failed_resolution", this.f28155d.m29748d());
        }
    }

    public final void onStart() {
        super.onStart();
        this.f28152a = true;
        if (!this.f28153b) {
            for (int i = 0; i < this.f28157f.size(); i++) {
                ((C6692a) this.f28157f.valueAt(i)).f25052b.mo5420b();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r1, int r2, android.content.Intent r3) {
        /*
        r0 = this;
        r3 = 1;
        switch(r1) {
            case 1: goto L_0x0010;
            case 2: goto L_0x0005;
            default: goto L_0x0004;
        };
    L_0x0004:
        goto L_0x0014;
    L_0x0005:
        r1 = r0.getActivity();
        r1 = com.google.android.m4b.maps.p107g.C5398g.m23576a(r1);
        if (r1 != 0) goto L_0x0014;
    L_0x000f:
        goto L_0x0015;
    L_0x0010:
        r1 = -1;
        if (r2 != r1) goto L_0x0014;
    L_0x0013:
        goto L_0x0015;
    L_0x0014:
        r3 = 0;
    L_0x0015:
        if (r3 == 0) goto L_0x001b;
    L_0x0017:
        r0.m33381a();
        return;
    L_0x001b:
        r1 = r0.f28154c;
        r2 = r0.f28155d;
        r0.m33382a(r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.s.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onStop() {
        super.onStop();
        int i = 0;
        this.f28152a = false;
        while (i < this.f28157f.size()) {
            ((C6692a) this.f28157f.valueAt(i)).f25052b.mo5423c();
            i++;
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (int i = 0; i < this.f28157f.size(); i++) {
            C6692a c6692a = (C6692a) this.f28157f.valueAt(i);
            printWriter.append(str).append("GoogleApiClient #").print(c6692a.f25051a);
            printWriter.println(":");
            c6692a.f25052b.mo5418a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    private void m33382a(int i, C6676a c6676a) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        C6692a c6692a = (C6692a) this.f28157f.get(i);
        if (c6692a != null) {
            C5411d c5411d = (C6692a) this.f28157f.get(i);
            this.f28157f.remove(i);
            if (c5411d != null) {
                c5411d.f25052b.mo5422b(c5411d);
                c5411d.f25052b.mo5423c();
            }
            i = c6692a.f25053c;
            if (i != 0) {
                i.mo5307a(c6676a);
            }
        }
        m33381a();
    }

    /* renamed from: a */
    private void m33381a() {
        int i = 0;
        this.f28153b = false;
        this.f28154c = -1;
        this.f28155d = null;
        while (i < this.f28157f.size()) {
            ((C6692a) this.f28157f.valueAt(i)).f25052b.mo5420b();
            i++;
        }
    }
}
