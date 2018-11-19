package com.google.android.m4b.maps.p122v;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p108h.C5414d.C5413e;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p110j.C5438d;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C6702k;
import com.google.android.m4b.maps.p110j.C6702k.C6701f;
import com.google.android.m4b.maps.p121u.C5524d;
import com.google.android.m4b.maps.p121u.C6773c;
import com.google.android.m4b.maps.p122v.C5527f.C6776a;
import com.google.android.m4b.maps.p122v.C5529h.C6780a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.m4b.maps.v.i */
public final class C7707i extends C6702k<C5529h> implements C6773c {
    /* renamed from: c */
    private final boolean f28178c;
    /* renamed from: d */
    private final C5441f f28179d;
    /* renamed from: e */
    private final C5524d f28180e;
    /* renamed from: f */
    private Integer f28181f;
    /* renamed from: g */
    private final ExecutorService f28182g;

    /* renamed from: com.google.android.m4b.maps.v.i$a */
    static class C7706a extends C6776a {
        /* renamed from: a */
        private final C5524d f28176a;
        /* renamed from: b */
        private final ExecutorService f28177b;

        public C7706a(C5524d c5524d, ExecutorService executorService) {
            this.f28176a = c5524d;
            this.f28177b = executorService;
        }

        /* renamed from: a */
        public final void mo7240a(final String str, final List<C6690o> list, final C5529h c5529h) {
            this.f28177b.submit(new Runnable(this) {
                /* renamed from: d */
                private /* synthetic */ C7706a f20542d;

                public final void run() {
                    try {
                        C5413e a = this.f20542d.f28176a.m24033d();
                        Collections.unmodifiableSet(new HashSet(list));
                        a.m23616a();
                        c5529h.mo5685a(new C6775d(false, null));
                    } catch (Throwable e) {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", e);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo7239a(final String str, final String str2, final C5529h c5529h) {
            this.f28177b.submit(new Runnable(this) {
                /* renamed from: d */
                private /* synthetic */ C7706a f20546d;

                public final void run() {
                    try {
                        c5529h.mo5686a(this.f20546d.f28176a.m24033d().m23617b());
                    } catch (Throwable e) {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", e);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    protected final String mo7228a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: b */
    protected final String mo7229b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public C7707i(Context context, Looper looper, boolean z, C5441f c5441f, C5524d c5524d, C5409b c5409b, C5411d c5411d, ExecutorService executorService) {
        super(context, looper, 44, c5409b, c5411d, c5441f);
        this.f28178c = z;
        this.f28179d = c5441f;
        this.f28180e = c5524d;
        this.f28181f = c5441f.m23673j();
        this.f28182g = executorService;
    }

    /* renamed from: f */
    public final boolean mo5433f() {
        return this.f28178c;
    }

    /* renamed from: a */
    public final void mo7243a(com.google.android.m4b.maps.p110j.C5459t r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = "Expecting a valid IResolveAccountCallbacks";
        com.google.android.m4b.maps.p110j.C5462v.m23768a(r5, r0);
        r0 = r4.f28179d;	 Catch:{ RemoteException -> 0x0020 }
        r0 = r0.m23666c();	 Catch:{ RemoteException -> 0x0020 }
        r1 = r4.m29906n();	 Catch:{ RemoteException -> 0x0020 }
        r1 = (com.google.android.m4b.maps.p122v.C5529h) r1;	 Catch:{ RemoteException -> 0x0020 }
        r2 = new com.google.android.m4b.maps.j.w;	 Catch:{ RemoteException -> 0x0020 }
        r3 = r4.f28181f;	 Catch:{ RemoteException -> 0x0020 }
        r3 = r3.intValue();	 Catch:{ RemoteException -> 0x0020 }
        r2.<init>(r0, r3);	 Catch:{ RemoteException -> 0x0020 }
        r1.mo5684a(r2, r5);	 Catch:{ RemoteException -> 0x0020 }
        return;
    L_0x0020:
        r0 = "SignInClientImpl";
        r1 = "Remote service probably died when resolveAccount is called";
        android.util.Log.w(r0, r1);
        r0 = new com.google.android.m4b.maps.j.y;	 Catch:{ RemoteException -> 0x0032 }
        r1 = 8;	 Catch:{ RemoteException -> 0x0032 }
        r0.<init>(r1);	 Catch:{ RemoteException -> 0x0032 }
        r5.mo5484a(r0);	 Catch:{ RemoteException -> 0x0032 }
        return;
    L_0x0032:
        r5 = "SignInClientImpl";
        r0 = "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r5, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.v.i.a(com.google.android.m4b.maps.j.t):void");
    }

    /* renamed from: a */
    public final void mo7242a(com.google.android.m4b.maps.p110j.C5455p r3, boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.m29906n();	 Catch:{ RemoteException -> 0x0010 }
        r0 = (com.google.android.m4b.maps.p122v.C5529h) r0;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r2.f28181f;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r0.mo5683a(r3, r1, r4);	 Catch:{ RemoteException -> 0x0010 }
        return;
    L_0x0010:
        r3 = "SignInClientImpl";
        r4 = "Remote service probably died when saveDefaultAccount is called";
        android.util.Log.w(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.v.i.a(com.google.android.m4b.maps.j.p, boolean):void");
    }

    /* renamed from: c */
    public final void mo7244c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.m29906n();	 Catch:{ RemoteException -> 0x0010 }
        r0 = (com.google.android.m4b.maps.p122v.C5529h) r0;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r2.f28181f;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r0.mo5680a(r1);	 Catch:{ RemoteException -> 0x0010 }
        return;
    L_0x0010:
        r0 = "SignInClientImpl";
        r1 = "Remote service probably died when clearAccountFromSessionStore is called";
        android.util.Log.w(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.v.i.c():void");
    }

    /* renamed from: a */
    public final void mo7241a(com.google.android.m4b.maps.p110j.C5455p r3, java.util.Set<com.google.android.m4b.maps.p108h.C6690o> r4, com.google.android.m4b.maps.p122v.C5528g r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = "Expecting a valid ISignInCallbacks";
        com.google.android.m4b.maps.p110j.C5462v.m23768a(r5, r0);
        r0 = r2.m29906n();	 Catch:{ RemoteException -> 0x0014 }
        r0 = (com.google.android.m4b.maps.p122v.C5529h) r0;	 Catch:{ RemoteException -> 0x0014 }
        r1 = new com.google.android.m4b.maps.j.b;	 Catch:{ RemoteException -> 0x0014 }
        r1.<init>(r3, r4);	 Catch:{ RemoteException -> 0x0014 }
        r0.mo5682a(r1, r5);	 Catch:{ RemoteException -> 0x0014 }
        return;
    L_0x0014:
        r3 = "SignInClientImpl";
        r4 = "Remote service probably died when authAccount is called";
        android.util.Log.w(r3, r4);
        r3 = new com.google.android.m4b.maps.g.a;	 Catch:{ RemoteException -> 0x002c }
        r4 = 8;	 Catch:{ RemoteException -> 0x002c }
        r0 = 0;	 Catch:{ RemoteException -> 0x002c }
        r3.<init>(r4, r0);	 Catch:{ RemoteException -> 0x002c }
        r4 = new com.google.android.m4b.maps.v.a;	 Catch:{ RemoteException -> 0x002c }
        r4.<init>();	 Catch:{ RemoteException -> 0x002c }
        r5.mo5678a(r3, r4);	 Catch:{ RemoteException -> 0x002c }
        return;
    L_0x002c:
        r3 = "SignInClientImpl";
        r4 = "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.v.i.a(com.google.android.m4b.maps.j.p, java.util.Set, com.google.android.m4b.maps.v.g):void");
    }

    /* renamed from: l */
    protected final Bundle mo7238l() {
        C5524d c5524d = this.f28180e;
        Integer j = this.f28179d.m23673j();
        ExecutorService executorService = this.f28182g;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", c5524d.m24030a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", c5524d.m24031b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", c5524d.m24032c());
        if (c5524d.m24033d() != null) {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new C5438d(new C7706a(c5524d, executorService).asBinder()));
        }
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        if (!m29903k().getPackageName().equals(this.f28179d.m23670g())) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f28179d.m23670g());
        }
        return bundle;
    }

    /* renamed from: g */
    public final void mo7245g() {
        mo5428a(new C6701f(this));
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo7227a(IBinder iBinder) {
        return C6780a.m30155a(iBinder);
    }
}
