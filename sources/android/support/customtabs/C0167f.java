package android.support.customtabs;

import android.os.IBinder;

/* renamed from: android.support.customtabs.f */
public class C0167f {
    /* renamed from: a */
    private final ICustomTabsCallback f596a;
    /* renamed from: b */
    private final C0155a f597b = new C27461(this);

    /* renamed from: android.support.customtabs.f$1 */
    class C27461 extends C0155a {
        /* renamed from: a */
        final /* synthetic */ C0167f f8616a;

        C27461(C0167f c0167f) {
            this.f8616a = c0167f;
        }

        /* renamed from: a */
        public void mo178a(int r2, android.os.Bundle r3) {
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
            r1 = this;
            r0 = r1.f8616a;	 Catch:{ RemoteException -> 0x000a }
            r0 = r0.f596a;	 Catch:{ RemoteException -> 0x000a }
            r0.onNavigationEvent(r2, r3);	 Catch:{ RemoteException -> 0x000a }
            goto L_0x0011;
        L_0x000a:
            r2 = "CustomTabsSessionToken";
            r3 = "RemoteException during ICustomTabsCallback transaction";
            android.util.Log.e(r2, r3);
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.f.1.a(int, android.os.Bundle):void");
        }

        /* renamed from: a */
        public void mo180a(java.lang.String r2, android.os.Bundle r3) {
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
            r1 = this;
            r0 = r1.f8616a;	 Catch:{ RemoteException -> 0x000a }
            r0 = r0.f596a;	 Catch:{ RemoteException -> 0x000a }
            r0.extraCallback(r2, r3);	 Catch:{ RemoteException -> 0x000a }
            goto L_0x0011;
        L_0x000a:
            r2 = "CustomTabsSessionToken";
            r3 = "RemoteException during ICustomTabsCallback transaction";
            android.util.Log.e(r2, r3);
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.f.1.a(java.lang.String, android.os.Bundle):void");
        }

        /* renamed from: a */
        public void mo179a(android.os.Bundle r2) {
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
            r1 = this;
            r0 = r1.f8616a;	 Catch:{ RemoteException -> 0x000a }
            r0 = r0.f596a;	 Catch:{ RemoteException -> 0x000a }
            r0.onMessageChannelReady(r2);	 Catch:{ RemoteException -> 0x000a }
            goto L_0x0011;
        L_0x000a:
            r2 = "CustomTabsSessionToken";
            r0 = "RemoteException during ICustomTabsCallback transaction";
            android.util.Log.e(r2, r0);
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.f.1.a(android.os.Bundle):void");
        }

        /* renamed from: b */
        public void mo181b(java.lang.String r2, android.os.Bundle r3) {
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
            r1 = this;
            r0 = r1.f8616a;	 Catch:{ RemoteException -> 0x000a }
            r0 = r0.f596a;	 Catch:{ RemoteException -> 0x000a }
            r0.onPostMessage(r2, r3);	 Catch:{ RemoteException -> 0x000a }
            goto L_0x0011;
        L_0x000a:
            r2 = "CustomTabsSessionToken";
            r3 = "RemoteException during ICustomTabsCallback transaction";
            android.util.Log.e(r2, r3);
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.f.1.b(java.lang.String, android.os.Bundle):void");
        }

        /* renamed from: a */
        public void mo177a(int r2, android.net.Uri r3, boolean r4, android.os.Bundle r5) {
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
            r1 = this;
            r0 = r1.f8616a;	 Catch:{ RemoteException -> 0x000a }
            r0 = r0.f596a;	 Catch:{ RemoteException -> 0x000a }
            r0.onRelationshipValidationResult(r2, r3, r4, r5);	 Catch:{ RemoteException -> 0x000a }
            goto L_0x0011;
        L_0x000a:
            r2 = "CustomTabsSessionToken";
            r3 = "RemoteException during ICustomTabsCallback transaction";
            android.util.Log.e(r2, r3);
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.f.1.a(int, android.net.Uri, boolean, android.os.Bundle):void");
        }
    }

    C0167f(ICustomTabsCallback iCustomTabsCallback) {
        this.f596a = iCustomTabsCallback;
    }

    /* renamed from: a */
    IBinder m607a() {
        return this.f596a.asBinder();
    }

    public int hashCode() {
        return m607a().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0167f) {
            return ((C0167f) obj).m607a().equals(this.f596a.asBinder());
        }
        return null;
    }
}
