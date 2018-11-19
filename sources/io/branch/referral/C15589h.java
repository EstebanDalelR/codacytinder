package io.branch.referral;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import io.branch.referral.Defines.Jsonkey;

/* renamed from: io.branch.referral.h */
class C15589h {
    /* renamed from: h */
    private static C15589h f48212h = null;
    /* renamed from: j */
    private static int f48213j = 750;
    /* renamed from: a */
    Object f48214a = null;
    /* renamed from: b */
    boolean f48215b = false;
    /* renamed from: c */
    Class<?> f48216c;
    /* renamed from: d */
    Class<?> f48217d;
    /* renamed from: e */
    Class<?> f48218e;
    /* renamed from: f */
    Class<?> f48219f;
    /* renamed from: g */
    Class<?> f48220g;
    /* renamed from: i */
    private final Handler f48221i;
    /* renamed from: k */
    private boolean f48222k = true;

    /* renamed from: io.branch.referral.h$a */
    private abstract class C15587a implements ServiceConnection {
        /* renamed from: h */
        final /* synthetic */ C15589h f48211h;

        /* renamed from: a */
        public abstract void mo12768a(ComponentName componentName, Object obj);

        public C15587a(C15589h c15589h) {
            this.f48211h = c15589h;
        }

        public final void onServiceConnected(android.content.ComponentName r10, android.os.IBinder r11) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r9 = this;
            r0 = 0;
            r1 = r9.f48211h;	 Catch:{ Throwable -> 0x0043 }
            r1 = r1.f48216c;	 Catch:{ Throwable -> 0x0043 }
            r2 = 2;	 Catch:{ Throwable -> 0x0043 }
            r3 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x0043 }
            r4 = r9.f48211h;	 Catch:{ Throwable -> 0x0043 }
            r4 = r4.f48220g;	 Catch:{ Throwable -> 0x0043 }
            r5 = 0;	 Catch:{ Throwable -> 0x0043 }
            r3[r5] = r4;	 Catch:{ Throwable -> 0x0043 }
            r4 = android.content.ComponentName.class;	 Catch:{ Throwable -> 0x0043 }
            r6 = 1;	 Catch:{ Throwable -> 0x0043 }
            r3[r6] = r4;	 Catch:{ Throwable -> 0x0043 }
            r1 = r1.getDeclaredConstructor(r3);	 Catch:{ Throwable -> 0x0043 }
            r1.setAccessible(r6);	 Catch:{ Throwable -> 0x0043 }
            r3 = "android.support.customtabs.ICustomTabsService$a";	 Catch:{ Throwable -> 0x0043 }
            r3 = java.lang.Class.forName(r3);	 Catch:{ Throwable -> 0x0043 }
            r4 = "asInterface";	 Catch:{ Throwable -> 0x0043 }
            r7 = new java.lang.Class[r6];	 Catch:{ Throwable -> 0x0043 }
            r8 = android.os.IBinder.class;	 Catch:{ Throwable -> 0x0043 }
            r7[r5] = r8;	 Catch:{ Throwable -> 0x0043 }
            r3 = r3.getMethod(r4, r7);	 Catch:{ Throwable -> 0x0043 }
            r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0043 }
            r4 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0043 }
            r4[r5] = r11;	 Catch:{ Throwable -> 0x0043 }
            r11 = r3.invoke(r0, r4);	 Catch:{ Throwable -> 0x0043 }
            r2[r5] = r11;	 Catch:{ Throwable -> 0x0043 }
            r2[r6] = r10;	 Catch:{ Throwable -> 0x0043 }
            r11 = r1.newInstance(r2);	 Catch:{ Throwable -> 0x0043 }
            r9.mo12768a(r10, r11);	 Catch:{ Throwable -> 0x0043 }
            goto L_0x0046;
        L_0x0043:
            r9.mo12768a(r0, r0);
        L_0x0046:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.h.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }
    }

    /* renamed from: io.branch.referral.h$b */
    interface C15588b {
        /* renamed from: a */
        void mo12766a();
    }

    private C15589h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>();
        r0 = 0;
        r2.f48214a = r0;
        r0 = 1;
        r2.f48222k = r0;
        r0 = 0;
        r2.f48215b = r0;
        r1 = "android.support.customtabs.b";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f48216c = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.d";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f48217d = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.a";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f48218e = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.e";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f48219f = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.ICustomTabsService";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f48220g = r1;	 Catch:{ Throwable -> 0x0035 }
        goto L_0x0037;
    L_0x0035:
        r2.f48222k = r0;
    L_0x0037:
        r0 = new android.os.Handler;
        r0.<init>();
        r2.f48221i = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.h.<init>():void");
    }

    /* renamed from: a */
    public static C15589h m58354a() {
        if (f48212h == null) {
            f48212h = new C15589h();
        }
        return f48212h;
    }

    /* renamed from: a */
    public void m58357a(android.content.Context r13, java.lang.String r14, io.branch.referral.C15591k r15, io.branch.referral.C15593m r16, io.branch.referral.aa r17, io.branch.referral.C15589h.C15588b r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r8 = r12;
        r9 = r18;
        r6 = 0;
        r8.f48215b = r6;
        r0 = java.lang.System.currentTimeMillis();
        r2 = r16.m58398E();
        r4 = r0 - r2;
        r0 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0020;
    L_0x0019:
        r0 = r8.f48215b;
        r8.m58355a(r9, r0);
        goto L_0x00cd;
    L_0x0020:
        r0 = r8.f48222k;
        if (r0 != 0) goto L_0x002b;
    L_0x0024:
        r0 = r8.f48215b;
        r8.m58355a(r9, r0);
        goto L_0x00cd;
    L_0x002b:
        r0 = r15.m58379d();	 Catch:{ Throwable -> 0x00c8 }
        if (r0 == 0) goto L_0x00bb;	 Catch:{ Throwable -> 0x00c8 }
    L_0x0031:
        r0 = r8;	 Catch:{ Throwable -> 0x00c8 }
        r1 = r14;	 Catch:{ Throwable -> 0x00c8 }
        r2 = r15;	 Catch:{ Throwable -> 0x00c8 }
        r3 = r16;	 Catch:{ Throwable -> 0x00c8 }
        r4 = r17;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r13;	 Catch:{ Throwable -> 0x00c8 }
        r4 = r0.m58353a(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x00c8 }
        if (r4 == 0) goto L_0x00b5;	 Catch:{ Throwable -> 0x00c8 }
    L_0x003f:
        r0 = r8.f48221i;	 Catch:{ Throwable -> 0x00c8 }
        r1 = new io.branch.referral.h$1;	 Catch:{ Throwable -> 0x00c8 }
        r1.<init>(r8, r9);	 Catch:{ Throwable -> 0x00c8 }
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ Throwable -> 0x00c8 }
        r0.postDelayed(r1, r2);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f48216c;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "bindCustomTabsService";	 Catch:{ Throwable -> 0x00c8 }
        r2 = 3;	 Catch:{ Throwable -> 0x00c8 }
        r3 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x00c8 }
        r5 = android.content.Context.class;	 Catch:{ Throwable -> 0x00c8 }
        r3[r6] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r5 = java.lang.String.class;	 Catch:{ Throwable -> 0x00c8 }
        r7 = 1;	 Catch:{ Throwable -> 0x00c8 }
        r3[r7] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r8.f48217d;	 Catch:{ Throwable -> 0x00c8 }
        r10 = 2;	 Catch:{ Throwable -> 0x00c8 }
        r3[r10] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r0.getMethod(r1, r3);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f48216c;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "warmup";	 Catch:{ Throwable -> 0x00c8 }
        r3 = new java.lang.Class[r7];	 Catch:{ Throwable -> 0x00c8 }
        r5 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00c8 }
        r3[r6] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r3 = r0.getMethod(r1, r3);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f48216c;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "newSession";	 Catch:{ Throwable -> 0x00c8 }
        r5 = new java.lang.Class[r7];	 Catch:{ Throwable -> 0x00c8 }
        r11 = r8.f48218e;	 Catch:{ Throwable -> 0x00c8 }
        r5[r6] = r11;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r0.getMethod(r1, r5);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f48219f;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "mayLaunchUrl";	 Catch:{ Throwable -> 0x00c8 }
        r2 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x00c8 }
        r11 = android.net.Uri.class;	 Catch:{ Throwable -> 0x00c8 }
        r2[r6] = r11;	 Catch:{ Throwable -> 0x00c8 }
        r6 = android.os.Bundle.class;	 Catch:{ Throwable -> 0x00c8 }
        r2[r7] = r6;	 Catch:{ Throwable -> 0x00c8 }
        r6 = java.util.List.class;	 Catch:{ Throwable -> 0x00c8 }
        r2[r10] = r6;	 Catch:{ Throwable -> 0x00c8 }
        r6 = r0.getMethod(r1, r2);	 Catch:{ Throwable -> 0x00c8 }
        r10 = new android.content.Intent;	 Catch:{ Throwable -> 0x00c8 }
        r0 = "android.support.customtabs.action.CustomTabsService";	 Catch:{ Throwable -> 0x00c8 }
        r10.<init>(r0);	 Catch:{ Throwable -> 0x00c8 }
        r0 = "com.android.chrome";	 Catch:{ Throwable -> 0x00c8 }
        r10.setPackage(r0);	 Catch:{ Throwable -> 0x00c8 }
        r11 = new io.branch.referral.h$2;	 Catch:{ Throwable -> 0x00c8 }
        r0 = r11;	 Catch:{ Throwable -> 0x00c8 }
        r1 = r8;	 Catch:{ Throwable -> 0x00c8 }
        r2 = r3;	 Catch:{ Throwable -> 0x00c8 }
        r3 = r5;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r6;	 Catch:{ Throwable -> 0x00c8 }
        r6 = r16;	 Catch:{ Throwable -> 0x00c8 }
        r7 = r9;	 Catch:{ Throwable -> 0x00c8 }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Throwable -> 0x00c8 }
        r0 = 33;	 Catch:{ Throwable -> 0x00c8 }
        r1 = r13;	 Catch:{ Throwable -> 0x00c8 }
        r1.bindService(r10, r11, r0);	 Catch:{ Throwable -> 0x00c8 }
        goto L_0x00cd;	 Catch:{ Throwable -> 0x00c8 }
    L_0x00b5:
        r0 = r8.f48215b;	 Catch:{ Throwable -> 0x00c8 }
        r8.m58355a(r9, r0);	 Catch:{ Throwable -> 0x00c8 }
        goto L_0x00cd;	 Catch:{ Throwable -> 0x00c8 }
    L_0x00bb:
        r0 = r8.f48215b;	 Catch:{ Throwable -> 0x00c8 }
        r8.m58355a(r9, r0);	 Catch:{ Throwable -> 0x00c8 }
        r0 = "BranchSDK";	 Catch:{ Throwable -> 0x00c8 }
        r1 = "Cannot use cookie-based matching since device id is not available";	 Catch:{ Throwable -> 0x00c8 }
        android.util.Log.d(r0, r1);	 Catch:{ Throwable -> 0x00c8 }
        goto L_0x00cd;
    L_0x00c8:
        r0 = r8.f48215b;
        r8.m58355a(r9, r0);
    L_0x00cd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.h.a(android.content.Context, java.lang.String, io.branch.referral.k, io.branch.referral.m, io.branch.referral.aa, io.branch.referral.h$b):void");
    }

    /* renamed from: a */
    private void m58355a(final C15588b c15588b, boolean z) {
        if (c15588b == null) {
            return;
        }
        if (z) {
            new Handler().postDelayed(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C15589h f48210b;

                public void run() {
                    c15588b.mo12766a();
                }
            }, (long) f48213j);
        } else {
            c15588b.mo12766a();
        }
    }

    /* renamed from: a */
    private Uri m58353a(String str, C15591k c15591k, C15593m c15593m, aa aaVar, Context context) {
        if (TextUtils.isEmpty(str) != null) {
            return null;
        }
        aaVar = new StringBuilder();
        aaVar.append("https://");
        aaVar.append(str);
        aaVar.append("/_strong_match?os=");
        aaVar.append(c15591k.m58380e());
        str = aaVar.toString();
        aaVar = new StringBuilder();
        aaVar.append(str);
        aaVar.append("&");
        aaVar.append(Jsonkey.HardwareID.getKey());
        aaVar.append("=");
        aaVar.append(c15591k.m58379d());
        str = aaVar.toString();
        aaVar = (c15591k.m58378c() != null ? Jsonkey.HardwareIDTypeVendor : Jsonkey.HardwareIDTypeRandom).getKey();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("&");
        stringBuilder.append(Jsonkey.HardwareIDType.getKey());
        stringBuilder.append("=");
        stringBuilder.append(aaVar);
        str = stringBuilder.toString();
        if (aa.f48182a != null && C2666j.a(context) == null) {
            aaVar = new StringBuilder();
            aaVar.append(str);
            aaVar.append("&");
            aaVar.append(Jsonkey.GoogleAdvertisingID.getKey());
            aaVar.append("=");
            aaVar.append(aa.f48182a);
            str = aaVar.toString();
        }
        if (c15593m.m58427g().equals("bnc_no_value") == null) {
            aaVar = new StringBuilder();
            aaVar.append(str);
            aaVar.append("&");
            aaVar.append(Jsonkey.DeviceFingerprintID.getKey());
            aaVar.append("=");
            aaVar.append(c15593m.m58427g());
            str = aaVar.toString();
        }
        if (c15591k.m58377b().equals("bnc_no_value") == null) {
            aaVar = new StringBuilder();
            aaVar.append(str);
            aaVar.append("&");
            aaVar.append(Jsonkey.AppVersion.getKey());
            aaVar.append("=");
            aaVar.append(c15591k.m58377b());
            str = aaVar.toString();
        }
        if (c15593m.m58425f().equals("bnc_no_value") == null) {
            c15591k = new StringBuilder();
            c15591k.append(str);
            c15591k.append("&");
            c15591k.append(Jsonkey.BranchKey.getKey());
            c15591k.append("=");
            c15591k.append(c15593m.m58425f());
            str = c15591k.toString();
        }
        c15591k = new StringBuilder();
        c15591k.append(str);
        c15591k.append("&sdk=android2.17.1");
        return Uri.parse(c15591k.toString());
    }
}
