package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

public abstract class PlatformServiceClient implements ServiceConnection {
    /* renamed from: a */
    private final Context f4633a;
    /* renamed from: b */
    private final Handler f4634b;
    /* renamed from: c */
    private CompletedListener f4635c;
    /* renamed from: d */
    private boolean f4636d;
    /* renamed from: e */
    private Messenger f4637e;
    /* renamed from: f */
    private int f4638f;
    /* renamed from: g */
    private int f4639g;
    /* renamed from: h */
    private final String f4640h;
    /* renamed from: i */
    private final int f4641i;

    /* renamed from: com.facebook.internal.PlatformServiceClient$1 */
    class C16861 extends Handler {
        /* renamed from: a */
        final /* synthetic */ PlatformServiceClient f4632a;

        C16861(PlatformServiceClient platformServiceClient) {
            this.f4632a = platformServiceClient;
        }

        public void handleMessage(Message message) {
            this.f4632a.m5741a(message);
        }
    }

    public interface CompletedListener {
        void completed(Bundle bundle);
    }

    /* renamed from: a */
    protected abstract void mo1867a(Bundle bundle);

    public PlatformServiceClient(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f4633a = context;
        this.f4638f = i;
        this.f4639g = i2;
        this.f4640h = str;
        this.f4641i = i3;
        this.f4634b = new C16861(this);
    }

    /* renamed from: a */
    public void m5742a(CompletedListener completedListener) {
        this.f4635c = completedListener;
    }

    /* renamed from: a */
    public boolean m5743a() {
        if (this.f4636d || C1745t.m6034b(this.f4641i) == -1) {
            return false;
        }
        Intent a = C1745t.m6021a(this.f4633a);
        if (a == null) {
            return false;
        }
        this.f4636d = true;
        this.f4633a.bindService(a, this, 1);
        return true;
    }

    /* renamed from: b */
    public void m5744b() {
        this.f4636d = false;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4637e = new Messenger(iBinder);
        m5739c();
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
        r1.f4637e = r2;
        r0 = r1.f4633a;	 Catch:{ IllegalArgumentException -> 0x0008 }
        r0.unbindService(r1);	 Catch:{ IllegalArgumentException -> 0x0008 }
    L_0x0008:
        r1.m5738b(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.PlatformServiceClient.onServiceDisconnected(android.content.ComponentName):void");
    }

    /* renamed from: c */
    private void m5739c() {
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
        r2 = r4.f4640h;
        r0.putString(r1, r2);
        r4.mo1867a(r0);
        r1 = r4.f4638f;
        r2 = 0;
        r1 = android.os.Message.obtain(r2, r1);
        r3 = r4.f4641i;
        r1.arg1 = r3;
        r1.setData(r0);
        r0 = new android.os.Messenger;
        r3 = r4.f4634b;
        r0.<init>(r3);
        r1.replyTo = r0;
        r0 = r4.f4637e;	 Catch:{ RemoteException -> 0x002c }
        r0.send(r1);	 Catch:{ RemoteException -> 0x002c }
        goto L_0x002f;
    L_0x002c:
        r4.m5738b(r2);
    L_0x002f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.PlatformServiceClient.c():void");
    }

    /* renamed from: a */
    protected void m5741a(android.os.Message r3) {
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
        r1 = r2.f4639g;
        if (r0 != r1) goto L_0x001f;
    L_0x0006:
        r3 = r3.getData();
        r0 = "com.facebook.platform.status.ERROR_TYPE";
        r0 = r3.getString(r0);
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r3 = 0;
        r2.m5738b(r3);
        goto L_0x001a;
    L_0x0017:
        r2.m5738b(r3);
    L_0x001a:
        r3 = r2.f4633a;	 Catch:{ IllegalArgumentException -> 0x001f }
        r3.unbindService(r2);	 Catch:{ IllegalArgumentException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.PlatformServiceClient.a(android.os.Message):void");
    }

    /* renamed from: b */
    private void m5738b(Bundle bundle) {
        if (this.f4636d) {
            this.f4636d = false;
            CompletedListener completedListener = this.f4635c;
            if (completedListener != null) {
                completedListener.completed(bundle);
            }
        }
    }
}
