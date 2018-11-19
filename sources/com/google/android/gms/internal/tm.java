package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.av;

public final class tm extends C4295c<zzcxl> implements zzcxd {
    /* renamed from: d */
    private final boolean f28818d;
    /* renamed from: e */
    private final av f28819e;
    /* renamed from: f */
    private final Bundle f28820f;
    /* renamed from: g */
    private Integer f28821g;

    private tm(Context context, Looper looper, boolean z, av avVar, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, avVar, connectionCallbacks, onConnectionFailedListener);
        this.f28818d = true;
        this.f28819e = avVar;
        this.f28820f = bundle;
        this.f28821g = avVar.j();
    }

    public tm(Context context, Looper looper, boolean z, av avVar, tg tgVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, avVar, m34056a(avVar), connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    public static Bundle m34056a(av avVar) {
        tg i = avVar.i();
        Integer j = avVar.j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", avVar.b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.m34048a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.m34049b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.m34050c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.m34051d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.m34052e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.m34053f());
            if (i.m34054g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.m34054g().longValue());
            }
            if (i.m34055h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.m34055h().longValue());
            }
        }
        return bundle;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m34057a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zzcxl ? (zzcxl) queryLocalInterface : new tl(iBinder);
    }

    /* renamed from: a */
    protected final String m34058a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: b */
    protected final String m34059b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void connect() {
        zza(new ar(this));
    }

    /* renamed from: k */
    protected final Bundle m34060k() {
        if (!j().getPackageName().equals(this.f28819e.g())) {
            this.f28820f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f28819e.g());
        }
        return this.f28820f;
    }

    public final void zza(com.google.android.gms.common.internal.zzan r3, boolean r4) {
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
        r0 = r2.m();	 Catch:{ RemoteException -> 0x0010 }
        r0 = (com.google.android.gms.internal.zzcxl) r0;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r2.f28821g;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r0.zza(r3, r1, r4);	 Catch:{ RemoteException -> 0x0010 }
        return;
    L_0x0010:
        r3 = "SignInClientImpl";
        r4 = "Remote service probably died when saveDefaultAccount is called";
        android.util.Log.w(r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tm.zza(com.google.android.gms.common.internal.zzan, boolean):void");
    }

    public final void zza(com.google.android.gms.internal.zzcxj r5) {
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
        r0 = "Expecting a valid ISignInCallbacks";
        com.google.android.gms.common.internal.ad.a(r5, r0);
        r0 = r4.f28819e;	 Catch:{ RemoteException -> 0x003c }
        r0 = r0.c();	 Catch:{ RemoteException -> 0x003c }
        r1 = 0;	 Catch:{ RemoteException -> 0x003c }
        r2 = "<<default account>>";	 Catch:{ RemoteException -> 0x003c }
        r3 = r0.name;	 Catch:{ RemoteException -> 0x003c }
        r2 = r2.equals(r3);	 Catch:{ RemoteException -> 0x003c }
        if (r2 == 0) goto L_0x0022;	 Catch:{ RemoteException -> 0x003c }
    L_0x0016:
        r1 = r4.j();	 Catch:{ RemoteException -> 0x003c }
        r1 = com.google.android.gms.auth.api.signin.internal.C2457v.a(r1);	 Catch:{ RemoteException -> 0x003c }
        r1 = r1.a();	 Catch:{ RemoteException -> 0x003c }
    L_0x0022:
        r2 = new com.google.android.gms.common.internal.zzbr;	 Catch:{ RemoteException -> 0x003c }
        r3 = r4.f28821g;	 Catch:{ RemoteException -> 0x003c }
        r3 = r3.intValue();	 Catch:{ RemoteException -> 0x003c }
        r2.<init>(r0, r3, r1);	 Catch:{ RemoteException -> 0x003c }
        r0 = r4.m();	 Catch:{ RemoteException -> 0x003c }
        r0 = (com.google.android.gms.internal.zzcxl) r0;	 Catch:{ RemoteException -> 0x003c }
        r1 = new com.google.android.gms.internal.zzcxo;	 Catch:{ RemoteException -> 0x003c }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x003c }
        r0.zza(r1, r5);	 Catch:{ RemoteException -> 0x003c }
        return;
    L_0x003c:
        r0 = move-exception;
        r1 = "SignInClientImpl";
        r2 = "Remote service probably died when signIn is called";
        android.util.Log.w(r1, r2);
        r1 = new com.google.android.gms.internal.zzcxq;	 Catch:{ RemoteException -> 0x004f }
        r2 = 8;	 Catch:{ RemoteException -> 0x004f }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x004f }
        r5.zzb(r1);	 Catch:{ RemoteException -> 0x004f }
        return;
    L_0x004f:
        r5 = "SignInClientImpl";
        r1 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r5, r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tm.zza(com.google.android.gms.internal.zzcxj):void");
    }

    public final boolean zzaay() {
        return this.f28818d;
    }

    public final void zzbdb() {
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
        r0 = r2.m();	 Catch:{ RemoteException -> 0x0010 }
        r0 = (com.google.android.gms.internal.zzcxl) r0;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r2.f28821g;	 Catch:{ RemoteException -> 0x0010 }
        r1 = r1.intValue();	 Catch:{ RemoteException -> 0x0010 }
        r0.zzeh(r1);	 Catch:{ RemoteException -> 0x0010 }
        return;
    L_0x0010:
        r0 = "SignInClientImpl";
        r1 = "Remote service probably died when clearAccountFromSessionStore is called";
        android.util.Log.w(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tm.zzbdb():void");
    }
}
