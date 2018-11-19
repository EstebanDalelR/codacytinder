package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.support.customtabs.ICustomTabsService.C2743a;
import android.support.v4.util.C2880a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public abstract class CustomTabsService extends Service {
    /* renamed from: a */
    private final Map<IBinder, DeathRecipient> f564a = new C2880a();
    /* renamed from: b */
    private C2743a f565b = new C39881(this);

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    /* renamed from: android.support.customtabs.CustomTabsService$1 */
    class C39881 extends C2743a {
        /* renamed from: a */
        final /* synthetic */ CustomTabsService f12666a;

        C39881(CustomTabsService customTabsService) {
            this.f12666a = customTabsService;
        }

        public boolean warmup(long j) {
            return this.f12666a.m581a(j);
        }

        public boolean newSession(android.support.customtabs.ICustomTabsCallback r6) {
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
            r5 = this;
            r0 = new android.support.customtabs.f;
            r0.<init>(r6);
            r1 = 0;
            r2 = new android.support.customtabs.CustomTabsService$1$1;	 Catch:{ RemoteException -> 0x0031 }
            r2.<init>(r5, r0);	 Catch:{ RemoteException -> 0x0031 }
            r3 = r5.f12666a;	 Catch:{ RemoteException -> 0x0031 }
            r3 = r3.f564a;	 Catch:{ RemoteException -> 0x0031 }
            monitor-enter(r3);	 Catch:{ RemoteException -> 0x0031 }
            r4 = r6.asBinder();	 Catch:{ all -> 0x002e }
            r4.linkToDeath(r2, r1);	 Catch:{ all -> 0x002e }
            r4 = r5.f12666a;	 Catch:{ all -> 0x002e }
            r4 = r4.f564a;	 Catch:{ all -> 0x002e }
            r6 = r6.asBinder();	 Catch:{ all -> 0x002e }
            r4.put(r6, r2);	 Catch:{ all -> 0x002e }
            monitor-exit(r3);	 Catch:{ all -> 0x002e }
            r6 = r5.f12666a;	 Catch:{ RemoteException -> 0x0031 }
            r6 = r6.m587b(r0);	 Catch:{ RemoteException -> 0x0031 }
            return r6;
        L_0x002e:
            r6 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x002e }
            throw r6;	 Catch:{ RemoteException -> 0x0031 }
        L_0x0031:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.CustomTabsService.1.newSession(android.support.customtabs.ICustomTabsCallback):boolean");
        }

        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
            return this.f12666a.m585a(new C0167f(iCustomTabsCallback), uri, bundle, (List) list);
        }

        public Bundle extraCommand(String str, Bundle bundle) {
            return this.f12666a.m580a(str, bundle);
        }

        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return this.f12666a.m586a(new C0167f(iCustomTabsCallback), bundle);
        }

        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return this.f12666a.m584a(new C0167f(iCustomTabsCallback), uri);
        }

        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return this.f12666a.m579a(new C0167f(iCustomTabsCallback), str, bundle);
        }

        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return this.f12666a.m583a(new C0167f(iCustomTabsCallback), i, uri, bundle);
        }
    }

    /* renamed from: a */
    protected abstract int m579a(C0167f c0167f, String str, Bundle bundle);

    /* renamed from: a */
    protected abstract Bundle m580a(String str, Bundle bundle);

    /* renamed from: a */
    protected abstract boolean m581a(long j);

    /* renamed from: a */
    protected abstract boolean m583a(C0167f c0167f, int i, Uri uri, Bundle bundle);

    /* renamed from: a */
    protected abstract boolean m584a(C0167f c0167f, Uri uri);

    /* renamed from: a */
    protected abstract boolean m585a(C0167f c0167f, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: a */
    protected abstract boolean m586a(C0167f c0167f, Bundle bundle);

    /* renamed from: b */
    protected abstract boolean m587b(C0167f c0167f);

    /* renamed from: a */
    protected boolean m582a(android.support.customtabs.C0167f r4) {
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
        r3 = this;
        r0 = 0;
        r1 = r3.f564a;	 Catch:{ NoSuchElementException -> 0x001e }
        monitor-enter(r1);	 Catch:{ NoSuchElementException -> 0x001e }
        r4 = r4.m607a();	 Catch:{ all -> 0x001b }
        r2 = r3.f564a;	 Catch:{ all -> 0x001b }
        r2 = r2.get(r4);	 Catch:{ all -> 0x001b }
        r2 = (android.os.IBinder.DeathRecipient) r2;	 Catch:{ all -> 0x001b }
        r4.unlinkToDeath(r2, r0);	 Catch:{ all -> 0x001b }
        r2 = r3.f564a;	 Catch:{ all -> 0x001b }
        r2.remove(r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        r4 = 1;	 Catch:{ all -> 0x001b }
        return r4;	 Catch:{ all -> 0x001b }
    L_0x001b:
        r4 = move-exception;	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r4;	 Catch:{ NoSuchElementException -> 0x001e }
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.CustomTabsService.a(android.support.customtabs.f):boolean");
    }
}
