package com.facebook.accountkit.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.AccountKit.InitializeCallback;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class Initializer {
    /* renamed from: a */
    private final ArrayList<InitializeCallback> f3243a = new ArrayList();
    /* renamed from: b */
    private volatile C1212a f3244b = null;
    /* renamed from: c */
    private volatile State f3245c = State.UNINITIALIZED;

    private enum State {
        UNINITIALIZED,
        INITIALIZED,
        FAILED
    }

    /* renamed from: com.facebook.accountkit.internal.Initializer$a */
    private static final class C1212a {
        /* renamed from: a */
        final C1218b f3235a;
        /* renamed from: b */
        final Context f3236b;
        /* renamed from: c */
        final String f3237c;
        /* renamed from: d */
        final String f3238d;
        /* renamed from: e */
        final String f3239e;
        /* renamed from: f */
        final C0436c f3240f;
        /* renamed from: g */
        final C1241p f3241g;
        /* renamed from: h */
        final C1249v f3242h;

        C1212a(Context context, String str, String str2, String str3, C1218b c1218b, C0436c c0436c, C1241p c1241p, C1249v c1249v) {
            this.f3236b = context;
            this.f3237c = str;
            this.f3238d = str2;
            this.f3239e = str3;
            this.f3235a = c1218b;
            this.f3240f = c0436c;
            this.f3241g = c1241p;
            this.f3242h = c1249v;
        }
    }

    /* renamed from: a */
    public synchronized void m4217a(@android.support.annotation.NonNull android.content.Context r12, com.facebook.accountkit.AccountKit.InitializeCallback r13) throws com.facebook.accountkit.AccountKitException {
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
        r11 = this;
        monitor-enter(r11);
        r0 = r11.m4225i();	 Catch:{ all -> 0x00b7 }
        if (r0 == 0) goto L_0x000e;	 Catch:{ all -> 0x00b7 }
    L_0x0007:
        if (r13 == 0) goto L_0x000c;	 Catch:{ all -> 0x00b7 }
    L_0x0009:
        r13.onInitialized();	 Catch:{ all -> 0x00b7 }
    L_0x000c:
        monitor-exit(r11);
        return;
    L_0x000e:
        if (r13 == 0) goto L_0x0015;
    L_0x0010:
        r0 = r11.f3243a;	 Catch:{ all -> 0x00b7 }
        r0.add(r13);	 Catch:{ all -> 0x00b7 }
    L_0x0015:
        com.facebook.accountkit.internal.C1252x.m4526a(r12);	 Catch:{ all -> 0x00b7 }
        r1 = r12.getApplicationContext();	 Catch:{ all -> 0x00b7 }
        m4212a(r1);	 Catch:{ all -> 0x00b7 }
        r13 = 0;
        r0 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x002f }
        r2 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x002f }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x002f }
        r0 = r0.getApplicationInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x002f }
        goto L_0x0030;
    L_0x002f:
        r0 = r13;
    L_0x0030:
        if (r0 == 0) goto L_0x00b1;
    L_0x0032:
        r2 = r0.metaData;	 Catch:{ all -> 0x00b7 }
        if (r2 != 0) goto L_0x0038;	 Catch:{ all -> 0x00b7 }
    L_0x0036:
        goto L_0x00b1;	 Catch:{ all -> 0x00b7 }
    L_0x0038:
        r0 = r0.metaData;	 Catch:{ all -> 0x00b7 }
        r2 = "com.facebook.sdk.ApplicationId";	 Catch:{ all -> 0x00b7 }
        r3 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_APP_ID;	 Catch:{ all -> 0x00b7 }
        r2 = m4211a(r0, r2, r3);	 Catch:{ all -> 0x00b7 }
        r3 = "com.facebook.accountkit.ClientToken";	 Catch:{ all -> 0x00b7 }
        r4 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_CLIENT_TOKEN;	 Catch:{ all -> 0x00b7 }
        r4 = m4211a(r0, r3, r4);	 Catch:{ all -> 0x00b7 }
        r3 = "com.facebook.accountkit.ApplicationName";	 Catch:{ all -> 0x00b7 }
        r5 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_APP_NAME;	 Catch:{ all -> 0x00b7 }
        r3 = m4211a(r0, r3, r5);	 Catch:{ all -> 0x00b7 }
        r5 = "com.facebook.accountkit.AccountKitFacebookAppEventsEnabled";	 Catch:{ all -> 0x00b7 }
        r6 = 1;	 Catch:{ all -> 0x00b7 }
        r5 = r0.getBoolean(r5, r6);	 Catch:{ all -> 0x00b7 }
        r6 = "com.facebook.accountkit.DefaultLanguage";	 Catch:{ all -> 0x00b7 }
        r7 = "en-us";	 Catch:{ all -> 0x00b7 }
        r0 = r0.getString(r6, r7);	 Catch:{ all -> 0x00b7 }
        r11.m4213a(r12, r0);	 Catch:{ all -> 0x00b7 }
        r6 = android.support.v4.content.C0436c.m1648a(r1);	 Catch:{ all -> 0x00b7 }
        r0 = new com.facebook.accountkit.internal.m;	 Catch:{ all -> 0x00b7 }
        r7 = r12.getApplicationContext();	 Catch:{ all -> 0x00b7 }
        r0.<init>(r7, r2, r5);	 Catch:{ all -> 0x00b7 }
        r5 = new com.facebook.accountkit.internal.b;	 Catch:{ all -> 0x00b7 }
        r5.<init>(r1, r6);	 Catch:{ all -> 0x00b7 }
        r9 = new com.facebook.accountkit.internal.p;	 Catch:{ all -> 0x00b7 }
        r9.<init>(r0, r5, r6);	 Catch:{ all -> 0x00b7 }
        r8 = new com.facebook.accountkit.internal.v;	 Catch:{ all -> 0x00b7 }
        r8.<init>(r0, r6);	 Catch:{ all -> 0x00b7 }
        r10 = new com.facebook.accountkit.internal.Initializer$a;	 Catch:{ all -> 0x00b7 }
        r0 = r10;	 Catch:{ all -> 0x00b7 }
        r7 = r9;	 Catch:{ all -> 0x00b7 }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00b7 }
        r11.f3244b = r10;	 Catch:{ all -> 0x00b7 }
        r0 = java.net.CookieManager.getDefault();	 Catch:{ all -> 0x00b7 }
        if (r0 != 0) goto L_0x009c;	 Catch:{ all -> 0x00b7 }
    L_0x008f:
        r0 = new java.net.CookieManager;	 Catch:{ all -> 0x00b7 }
        r1 = new com.facebook.accountkit.internal.d;	 Catch:{ all -> 0x00b7 }
        r1.<init>(r12);	 Catch:{ all -> 0x00b7 }
        r0.<init>(r1, r13);	 Catch:{ all -> 0x00b7 }
        java.net.CookieManager.setDefault(r0);	 Catch:{ all -> 0x00b7 }
    L_0x009c:
        r11.m4215k();	 Catch:{ all -> 0x00b7 }
        r12 = com.facebook.accountkit.internal.Initializer.State.INITIALIZED;	 Catch:{ all -> 0x00b7 }
        r11.f3245c = r12;	 Catch:{ all -> 0x00b7 }
        r12 = r9.m4418b();	 Catch:{ all -> 0x00b7 }
        r13 = "ak_sdk_init";	 Catch:{ all -> 0x00b7 }
        r12.m4372a(r13);	 Catch:{ all -> 0x00b7 }
        com.facebook.accountkit.internal.C1244r.m4447b();	 Catch:{ all -> 0x00b7 }
        monitor-exit(r11);
        return;
    L_0x00b1:
        r12 = com.facebook.accountkit.internal.Initializer.State.FAILED;	 Catch:{ all -> 0x00b7 }
        r11.f3245c = r12;	 Catch:{ all -> 0x00b7 }
        monitor-exit(r11);
        return;
    L_0x00b7:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.Initializer.a(android.content.Context, com.facebook.accountkit.AccountKit$InitializeCallback):void");
    }

    /* renamed from: a */
    C1218b m4216a() {
        C1252x.m4525a();
        return this.f3244b.f3235a;
    }

    /* renamed from: b */
    public Context m4218b() {
        C1252x.m4525a();
        return this.f3244b.f3236b;
    }

    /* renamed from: c */
    public String m4219c() {
        C1252x.m4525a();
        return this.f3244b.f3237c;
    }

    /* renamed from: d */
    String m4220d() {
        C1252x.m4525a();
        return this.f3244b.f3238d;
    }

    /* renamed from: e */
    String m4221e() {
        C1252x.m4525a();
        return this.f3244b.f3239e;
    }

    /* renamed from: f */
    public C1237m m4222f() {
        C1252x.m4525a();
        return this.f3244b.f3241g.m4418b();
    }

    /* renamed from: g */
    C1241p m4223g() {
        C1252x.m4525a();
        return this.f3244b.f3241g;
    }

    /* renamed from: h */
    C1249v m4224h() {
        C1252x.m4525a();
        return this.f3244b.f3242h;
    }

    /* renamed from: i */
    public boolean m4225i() {
        return this.f3245c == State.INITIALIZED;
    }

    /* renamed from: j */
    boolean m4226j() {
        return m4222f().m4383b();
    }

    /* renamed from: k */
    private synchronized void m4215k() {
        if (!m4225i()) {
            this.f3244b.f3235a.m4256b();
            Iterator it = this.f3243a.iterator();
            while (it.hasNext()) {
                ((InitializeCallback) it.next()).onInitialized();
            }
            this.f3243a.clear();
        }
    }

    /* renamed from: a */
    private static String m4211a(Bundle bundle, String str, InternalAccountKitError internalAccountKitError) throws AccountKitException {
        bundle = bundle.getString(str);
        if (bundle != null) {
            return bundle;
        }
        throw new AccountKitException(Type.INITIALIZATION_ERROR, internalAccountKitError);
    }

    /* renamed from: a */
    private boolean m4214a(String str) {
        for (Locale locale : Locale.getAvailableLocales()) {
            if (str.equalsIgnoreCase(locale.toString())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m4213a(Context context, String str) {
        if (m4214a(str)) {
            Locale locale = new Locale(str);
            str = context.getResources().getConfiguration();
            str.locale = locale;
            context.getResources().updateConfiguration(str, null);
        }
    }

    /* renamed from: a */
    private static void m4212a(android.content.Context r6) {
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
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x0025;
    L_0x0006:
        r0 = "android.sec.clipboard.ClipboardUIManager";	 Catch:{ Exception -> 0x0025 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0025 }
        r1 = "getInstance";	 Catch:{ Exception -> 0x0025 }
        r2 = 1;	 Catch:{ Exception -> 0x0025 }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0025 }
        r4 = android.content.Context.class;	 Catch:{ Exception -> 0x0025 }
        r5 = 0;	 Catch:{ Exception -> 0x0025 }
        r3[r5] = r4;	 Catch:{ Exception -> 0x0025 }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ Exception -> 0x0025 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0025 }
        r1 = 0;	 Catch:{ Exception -> 0x0025 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0025 }
        r2[r5] = r6;	 Catch:{ Exception -> 0x0025 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0025 }
    L_0x0025:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.Initializer.a(android.content.Context):void");
    }
}
