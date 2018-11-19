package com.facebook.accountkit.internal;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.facebook.accountkit.internal.l */
final class C1236l {
    /* renamed from: a */
    private static final String f3312a = C1236l.class.getCanonicalName();
    /* renamed from: b */
    private static final Map<String, String> f3313b = new FacebookAppEventLogger$1();
    /* renamed from: c */
    private Object f3314c = null;

    C1236l(android.content.Context r8) {
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
        r7 = this;
        r7.<init>();
        r0 = 0;
        r7.f3314c = r0;
        r1 = com.facebook.accountkit.internal.C1236l.m4365a();
        if (r1 == 0) goto L_0x0038;
    L_0x000c:
        r1 = "com.facebook.appevents.AppEventsLogger";	 Catch:{ ClassNotFoundException -> 0x0038 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0038 }
        r2 = "newLogger";	 Catch:{ NoSuchMethodException -> 0x0032 }
        r3 = 1;	 Catch:{ NoSuchMethodException -> 0x0032 }
        r4 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x0032 }
        r5 = android.content.Context.class;	 Catch:{ NoSuchMethodException -> 0x0032 }
        r6 = 0;	 Catch:{ NoSuchMethodException -> 0x0032 }
        r4[r6] = r5;	 Catch:{ NoSuchMethodException -> 0x0032 }
        r1 = r1.getMethod(r2, r4);	 Catch:{ NoSuchMethodException -> 0x0032 }
        r2 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x002b }
        r2[r6] = r8;	 Catch:{ Exception -> 0x002b }
        r8 = r1.invoke(r0, r2);	 Catch:{ Exception -> 0x002b }
        r7.f3314c = r8;	 Catch:{ Exception -> 0x002b }
        goto L_0x0038;
    L_0x002b:
        r8 = move-exception;
        r0 = f3312a;	 Catch:{ NoSuchMethodException -> 0x0032 }
        com.facebook.accountkit.internal.C1251w.m4492a(r0, r8);	 Catch:{ NoSuchMethodException -> 0x0032 }
        goto L_0x0038;
    L_0x0032:
        r8 = move-exception;
        r0 = f3312a;	 Catch:{ ClassNotFoundException -> 0x0038 }
        com.facebook.accountkit.internal.C1251w.m4492a(r0, r8);	 Catch:{ ClassNotFoundException -> 0x0038 }
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.l.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public void m4366a(String str, Bundle bundle, boolean z) {
        if (z) {
            m4367a(str, (Double) false, bundle);
        }
    }

    /* renamed from: a */
    void m4367a(String str, Double d, Bundle bundle) {
        if (!(((String) f3313b.get(str)) == null || this.f3314c == null)) {
            try {
                Method method = this.f3314c.getClass().getMethod("logSdkEvent", new Class[]{String.class, Double.class, Bundle.class});
                try {
                    method.invoke(this.f3314c, new Object[]{str, d, bundle});
                } catch (Exception e) {
                    C1251w.m4492a(f3312a, e);
                }
            } catch (Exception e2) {
                C1251w.m4492a(f3312a, e2);
            }
        }
    }

    /* renamed from: a */
    static boolean m4365a() {
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
        r0 = 0;
        r1 = "com.facebook.FacebookSdk";	 Catch:{ ClassNotFoundException -> 0x002a }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x002a }
        r2 = "isInitialized";	 Catch:{ NoSuchMethodException -> 0x0024 }
        r3 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0024 }
        r1 = r1.getMethod(r2, r3);	 Catch:{ NoSuchMethodException -> 0x0024 }
        r2 = 0;
        r3 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x001d }
        r1 = r1.invoke(r2, r3);	 Catch:{ Exception -> 0x001d }
        r1 = (java.lang.Boolean) r1;	 Catch:{ Exception -> 0x001d }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x001d }
        return r1;
    L_0x001d:
        r1 = move-exception;
        r2 = f3312a;	 Catch:{ NoSuchMethodException -> 0x0024 }
        com.facebook.accountkit.internal.C1251w.m4492a(r2, r1);	 Catch:{ NoSuchMethodException -> 0x0024 }
        goto L_0x002a;
    L_0x0024:
        r1 = move-exception;
        r2 = f3312a;	 Catch:{ ClassNotFoundException -> 0x002a }
        com.facebook.accountkit.internal.C1251w.m4492a(r2, r1);	 Catch:{ ClassNotFoundException -> 0x002a }
    L_0x002a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.l.a():boolean");
    }
}
