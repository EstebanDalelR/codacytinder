package com.facebook.accountkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

final class SeamlessLoginClient implements ServiceConnection {
    /* renamed from: a */
    private final Context f3247a;
    /* renamed from: b */
    private final Handler f3248b = new C12161(this);
    /* renamed from: c */
    private final String f3249c;
    /* renamed from: d */
    private final C1237m f3250d;
    /* renamed from: e */
    private CompletedListener f3251e;
    /* renamed from: f */
    private boolean f3252f;
    /* renamed from: g */
    private Messenger f3253g;

    /* renamed from: com.facebook.accountkit.internal.SeamlessLoginClient$1 */
    class C12161 extends Handler {
        /* renamed from: a */
        final /* synthetic */ SeamlessLoginClient f3246a;

        C12161(SeamlessLoginClient seamlessLoginClient) {
            this.f3246a = seamlessLoginClient;
        }

        public void handleMessage(Message message) {
            this.f3246a.m4234a(message);
        }
    }

    public interface CompletedListener {
        void completed(Bundle bundle);
    }

    public SeamlessLoginClient(Context context, String str, C1237m c1237m) {
        this.f3247a = context;
        this.f3249c = str;
        this.f3250d = c1237m;
    }

    /* renamed from: a */
    public void m4237a(CompletedListener completedListener) {
        this.f3251e = completedListener;
    }

    /* renamed from: a */
    public boolean m4238a() {
        if (this.f3252f) {
            return false;
        }
        if (!C1244r.m4445a()) {
            this.f3250d.m4374a("ak_fetch_seamless_login_token", InternalAccountKitError.NO_NATIVE_APP_INSTALLED);
            return false;
        } else if (C1244r.m4446a(20161017)) {
            Intent a = C1244r.m4443a(this.f3247a);
            if (a == null) {
                return false;
            }
            this.f3252f = true;
            this.f3247a.bindService(a, this, 1);
            return true;
        } else {
            this.f3250d.m4374a("ak_fetch_seamless_login_token", InternalAccountKitError.UNSUPPORTED_NATIVE_APP_VERSION);
            return false;
        }
    }

    /* renamed from: b */
    public boolean m4239b() {
        return this.f3252f;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3253g = new Messenger(iBinder);
        m4236c();
    }

    public void onServiceDisconnected(android.content.ComponentName r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r2 = 0;
        r1.f3253g = r2;
        r0 = r1.f3247a;	 Catch:{ IllegalArgumentException -> 0x0008 }
        r0.unbindService(r1);	 Catch:{ IllegalArgumentException -> 0x0008 }
    L_0x0008:
        r1.m4233a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SeamlessLoginClient.onServiceDisconnected(android.content.ComponentName):void");
    }

    /* renamed from: c */
    private void m4236c() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = "com.facebook.platform.extra.APPLICATION_ID";
        r2 = r4.f3249c;
        r0.putString(r1, r2);
        r1 = 0;
        r2 = 65544; // 0x10008 float:9.1847E-41 double:3.2383E-319;
        r2 = android.os.Message.obtain(r1, r2);
        r3 = 20161017; // 0x133a1f9 float:3.2993317E-38 double:9.960866E-317;
        r2.arg1 = r3;
        r2.setData(r0);
        r0 = new android.os.Messenger;
        r3 = r4.f3248b;
        r0.<init>(r3);
        r2.replyTo = r0;
        r0 = r4.f3253g;	 Catch:{ RemoteException -> 0x002b }
        r0.send(r2);	 Catch:{ RemoteException -> 0x002b }
        goto L_0x002e;
    L_0x002b:
        r4.m4233a(r1);
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SeamlessLoginClient.c():void");
    }

    /* renamed from: a */
    private void m4234a(android.os.Message r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r3.what;
        r1 = 65545; // 0x10009 float:9.1848E-41 double:3.23835E-319;
        if (r0 != r1) goto L_0x0020;
    L_0x0007:
        r3 = r3.getData();
        r0 = "com.facebook.platform.status.ERROR_TYPE";
        r0 = r3.getString(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r3 = 0;
        r2.m4233a(r3);
        goto L_0x001b;
    L_0x0018:
        r2.m4233a(r3);
    L_0x001b:
        r3 = r2.f3247a;	 Catch:{ IllegalArgumentException -> 0x0020 }
        r3.unbindService(r2);	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.SeamlessLoginClient.a(android.os.Message):void");
    }

    /* renamed from: a */
    private void m4233a(Bundle bundle) {
        if (this.f3252f) {
            this.f3252f = false;
            if (this.f3251e != null) {
                this.f3251e.completed(bundle);
            }
        }
    }
}
