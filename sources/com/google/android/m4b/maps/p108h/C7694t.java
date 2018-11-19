package com.google.android.m4b.maps.p108h;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C5462v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.m4b.maps.h.t */
public final class C7694t extends Fragment implements OnCancelListener, LoaderCallbacks<C6676a> {
    /* renamed from: a */
    private boolean f28158a;
    /* renamed from: b */
    private int f28159b = -1;
    /* renamed from: c */
    private C6676a f28160c;
    /* renamed from: d */
    private final Handler f28161d = new Handler(Looper.getMainLooper());
    /* renamed from: e */
    private final SparseArray<C5432b> f28162e = new SparseArray();

    /* renamed from: com.google.android.m4b.maps.h.t$b */
    static class C5432b {
        /* renamed from: a */
        public final C5414d f20378a;
        /* renamed from: b */
        public final C5411d f20379b;

        private C5432b(C5414d c5414d, C5411d c5411d) {
            this.f20378a = c5414d;
            this.f20379b = c5411d;
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.t$c */
    class C5433c implements Runnable {
        /* renamed from: a */
        private final int f20380a;
        /* renamed from: b */
        private final C6676a f20381b;
        /* renamed from: c */
        private /* synthetic */ C7694t f20382c;

        public C5433c(C7694t c7694t, int i, C6676a c6676a) {
            this.f20382c = c7694t;
            this.f20380a = i;
            this.f20381b = c6676a;
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
            r0 = r5.f20381b;
            r0 = r0.m29745a();
            if (r0 == 0) goto L_0x0034;
        L_0x0008:
            r0 = r5.f20382c;	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0.getActivity();	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0.getSupportFragmentManager();	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0.e();	 Catch:{ SendIntentException -> 0x002e }
            r1 = r5.f20382c;	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0.indexOf(r1);	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0 + 1;	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0 << 16;	 Catch:{ SendIntentException -> 0x002e }
            r0 = r0 + 1;	 Catch:{ SendIntentException -> 0x002e }
            r1 = r5.f20381b;	 Catch:{ SendIntentException -> 0x002e }
            r2 = r5.f20382c;	 Catch:{ SendIntentException -> 0x002e }
            r2 = r2.getActivity();	 Catch:{ SendIntentException -> 0x002e }
            r1.m29744a(r2, r0);	 Catch:{ SendIntentException -> 0x002e }
            return;
        L_0x002e:
            r0 = r5.f20382c;
            r0.m33391a();
            return;
        L_0x0034:
            r0 = r5.f20381b;
            r0 = r0.m29747c();
            r0 = com.google.android.m4b.maps.p107g.C5398g.m23584b(r0);
            if (r0 == 0) goto L_0x0055;
        L_0x0040:
            r0 = r5.f20381b;
            r0 = r0.m29747c();
            r1 = r5.f20382c;
            r1 = r1.getActivity();
            r2 = r5.f20382c;
            r3 = 2;
            r4 = r5.f20382c;
            com.google.android.m4b.maps.p107g.C5398g.m23578a(r0, r1, r2, r3, r4);
            return;
        L_0x0055:
            r0 = r5.f20382c;
            r1 = r5.f20380a;
            r2 = r5.f20381b;
            r0.m33392a(r1, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.t.c.run():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.h.t$a */
    static class C6693a extends Loader<C6676a> implements C5409b, C5411d {
        /* renamed from: a */
        public final C5414d f25055a;
        /* renamed from: b */
        private boolean f25056b;
        /* renamed from: c */
        private C6676a f25057c;

        /* renamed from: a */
        public final void mo5305a(int i) {
        }

        public C6693a(Context context, C5414d c5414d) {
            super(context);
            this.f25055a = c5414d;
        }

        /* renamed from: c */
        public final boolean m29860c() {
            return this.f25056b;
        }

        /* renamed from: l */
        protected final void m29861l() {
            super.l();
            this.f25055a.mo5416a((C5409b) this);
            this.f25055a.mo5417a((C5411d) this);
            if (this.f25057c != null) {
                b(this.f25057c);
            }
            if (!this.f25055a.mo5424d() && !this.f25055a.mo5425e() && !this.f25056b) {
                this.f25055a.mo5420b();
            }
        }

        /* renamed from: p */
        protected final void m29862p() {
            this.f25055a.mo5423c();
        }

        /* renamed from: t */
        protected final void m29863t() {
            this.f25057c = null;
            this.f25056b = false;
            this.f25055a.mo5421b((C5409b) this);
            this.f25055a.mo5422b((C5411d) this);
            this.f25055a.mo5423c();
        }

        /* renamed from: a */
        public final void mo5306a(Bundle bundle) {
            this.f25056b = null;
            m29855b(C6676a.f24965a);
        }

        /* renamed from: a */
        public final void mo5307a(C6676a c6676a) {
            this.f25056b = true;
            m29855b(c6676a);
        }

        /* renamed from: a */
        public final void m29859a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            super.a(str, fileDescriptor, printWriter, strArr);
            this.f25055a.mo5418a(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        private void m29855b(C6676a c6676a) {
            this.f25057c = c6676a;
            if (i() && !j()) {
                b(c6676a);
            }
        }
    }

    public final void onLoaderReset(Loader<C6676a> loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        C6676a c6676a = (C6676a) obj;
        if (!c6676a.m29746b()) {
            loader = loader.h();
            if (!this.f28158a) {
                this.f28158a = true;
                this.f28159b = loader;
                this.f28160c = c6676a;
                this.f28161d.post(new C5433c(this, loader, c6676a));
            }
        }
    }

    /* renamed from: a */
    public static C7694t m33390a(FragmentActivity fragmentActivity) {
        C5462v.m23769a("Must be called from main thread of process");
        fragmentActivity = fragmentActivity.getSupportFragmentManager();
        try {
            C7694t c7694t = (C7694t) fragmentActivity.a("GmsSupportLoaderLifecycleFragment");
            if (c7694t != null && !c7694t.isRemoving()) {
                return c7694t;
            }
            Fragment c7694t2 = new C7694t();
            fragmentActivity.a().a(c7694t2, "GmsSupportLoaderLifecycleFragment").c();
            fragmentActivity.b();
            return c7694t2;
        } catch (FragmentActivity fragmentActivity2) {
            throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentActivity2);
        }
    }

    /* renamed from: a */
    public final void m33396a(int i, C5414d c5414d, C5411d c5411d) {
        C5462v.m23768a((Object) c5414d, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f28162e.indexOfKey(i) < 0;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Already managing a GoogleApiClient with id ");
        stringBuilder.append(i);
        C5462v.m23771a(z, stringBuilder.toString());
        this.f28162e.put(i, new C5432b(c5414d, c5411d));
        if (getActivity() != null) {
            LoaderManager.a(false);
            getLoaderManager().a(i, null, this);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m33392a(this.f28159b, new C6676a(13, null));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        activity = null;
        while (activity < this.f28162e.size()) {
            int keyAt = this.f28162e.keyAt(activity);
            C6693a a = m33395a(keyAt);
            if (a == null || ((C5432b) this.f28162e.valueAt(activity)).f20378a == a.f25055a) {
                getLoaderManager().a(keyAt, null, this);
            } else {
                getLoaderManager().b(keyAt, null, this);
            }
            activity++;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f28158a = bundle.getBoolean("resolving_error", false);
            this.f28159b = bundle.getInt("failed_client_id", -1);
            if (this.f28159b >= 0) {
                this.f28160c = new C6676a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.f28158a);
        if (this.f28159b >= 0) {
            bundle.putInt("failed_client_id", this.f28159b);
            bundle.putInt("failed_status", this.f28160c.m29747c());
            bundle.putParcelable("failed_resolution", this.f28160c.m29748d());
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.f28158a) {
            for (int i = 0; i < this.f28162e.size(); i++) {
                getLoaderManager().a(this.f28162e.keyAt(i), null, this);
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
        r0.m33391a();
        return;
    L_0x001b:
        r1 = r0.f28159b;
        r2 = r0.f28160c;
        r0.m33392a(r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.t.onActivityResult(int, int, android.content.Intent):void");
    }

    public final Loader<C6676a> onCreateLoader(int i, Bundle bundle) {
        return new C6693a(getActivity(), ((C5432b) this.f28162e.get(i)).f20378a);
    }

    /* renamed from: a */
    final C6693a m33395a(int i) {
        try {
            return (C6693a) getLoaderManager().b(i);
        } catch (int i2) {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", i2);
        }
    }

    /* renamed from: a */
    private void m33392a(int i, C6676a c6676a) {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        C5432b c5432b = (C5432b) this.f28162e.get(i);
        if (c5432b != null) {
            this.f28162e.remove(i);
            getLoaderManager().a(i);
            i = c5432b.f20379b;
            if (i != 0) {
                i.mo5307a(c6676a);
            }
        }
        m33391a();
    }

    /* renamed from: a */
    private void m33391a() {
        int i = 0;
        this.f28158a = false;
        this.f28159b = -1;
        this.f28160c = null;
        LoaderManager loaderManager = getLoaderManager();
        while (i < this.f28162e.size()) {
            int keyAt = this.f28162e.keyAt(i);
            C6693a a = m33395a(keyAt);
            if (a != null && a.m29860c()) {
                loaderManager.a(keyAt);
                loaderManager.a(keyAt, null, this);
            }
            i++;
        }
    }
}
