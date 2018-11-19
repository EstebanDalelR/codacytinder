package com.facebook.devicerequests.p057a;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build.VERSION;
import com.facebook.FacebookSdk;
import com.facebook.internal.C1712j;
import com.facebook.internal.SmartLoginOption;
import java.util.HashMap;

/* renamed from: com.facebook.devicerequests.a.a */
public class C1679a {
    /* renamed from: a */
    private static HashMap<String, RegistrationListener> f4605a = new HashMap();

    /* renamed from: a */
    public static java.lang.String m5680a() {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "device";	 Catch:{ JSONException -> 0x0013 }
        r2 = android.os.Build.DEVICE;	 Catch:{ JSONException -> 0x0013 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0013 }
        r1 = "model";	 Catch:{ JSONException -> 0x0013 }
        r2 = android.os.Build.MODEL;	 Catch:{ JSONException -> 0x0013 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0013 }
    L_0x0013:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.devicerequests.a.a.a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m5681a(String str) {
        return C1679a.m5683b() ? C1679a.m5685d(str) : null;
    }

    /* renamed from: b */
    public static boolean m5683b() {
        return VERSION.SDK_INT >= 16 && C1712j.m5907a(FacebookSdk.m3998i()).m5902g().contains(SmartLoginOption.Enabled);
    }

    /* renamed from: b */
    public static android.graphics.Bitmap m5682b(java.lang.String r15) {
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
        r5 = new java.util.EnumMap;
        r0 = com.google.zxing.EncodeHintType.class;
        r5.<init>(r0);
        r0 = com.google.zxing.EncodeHintType.MARGIN;
        r1 = 2;
        r1 = java.lang.Integer.valueOf(r1);
        r5.put(r0, r1);
        r6 = 0;
        r0 = new com.google.zxing.e;	 Catch:{ WriterException -> 0x005a }
        r0.<init>();	 Catch:{ WriterException -> 0x005a }
        r2 = com.google.zxing.BarcodeFormat.QR_CODE;	 Catch:{ WriterException -> 0x005a }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ WriterException -> 0x005a }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ WriterException -> 0x005a }
        r1 = r15;	 Catch:{ WriterException -> 0x005a }
        r15 = r0.encode(r1, r2, r3, r4, r5);	 Catch:{ WriterException -> 0x005a }
        r14 = r15.c();	 Catch:{ WriterException -> 0x005a }
        r13 = r15.b();	 Catch:{ WriterException -> 0x005a }
        r0 = r14 * r13;	 Catch:{ WriterException -> 0x005a }
        r8 = new int[r0];	 Catch:{ WriterException -> 0x005a }
        r0 = 0;	 Catch:{ WriterException -> 0x005a }
        r1 = 0;	 Catch:{ WriterException -> 0x005a }
    L_0x0030:
        if (r1 >= r14) goto L_0x004b;	 Catch:{ WriterException -> 0x005a }
    L_0x0032:
        r2 = r1 * r13;	 Catch:{ WriterException -> 0x005a }
        r3 = 0;	 Catch:{ WriterException -> 0x005a }
    L_0x0035:
        if (r3 >= r13) goto L_0x0048;	 Catch:{ WriterException -> 0x005a }
    L_0x0037:
        r4 = r2 + r3;	 Catch:{ WriterException -> 0x005a }
        r5 = r15.a(r3, r1);	 Catch:{ WriterException -> 0x005a }
        if (r5 == 0) goto L_0x0042;	 Catch:{ WriterException -> 0x005a }
    L_0x003f:
        r5 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;	 Catch:{ WriterException -> 0x005a }
        goto L_0x0043;	 Catch:{ WriterException -> 0x005a }
    L_0x0042:
        r5 = -1;	 Catch:{ WriterException -> 0x005a }
    L_0x0043:
        r8[r4] = r5;	 Catch:{ WriterException -> 0x005a }
        r3 = r3 + 1;	 Catch:{ WriterException -> 0x005a }
        goto L_0x0035;	 Catch:{ WriterException -> 0x005a }
    L_0x0048:
        r1 = r1 + 1;	 Catch:{ WriterException -> 0x005a }
        goto L_0x0030;	 Catch:{ WriterException -> 0x005a }
    L_0x004b:
        r15 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ WriterException -> 0x005a }
        r15 = android.graphics.Bitmap.createBitmap(r13, r14, r15);	 Catch:{ WriterException -> 0x005a }
        r9 = 0;
        r11 = 0;
        r12 = 0;
        r7 = r15;
        r10 = r13;
        r7.setPixels(r8, r9, r10, r11, r12, r13, r14);	 Catch:{ WriterException -> 0x005b }
        goto L_0x005b;
    L_0x005a:
        r15 = r6;
    L_0x005b:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.devicerequests.a.a.b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static void m5684c(String str) {
        C1679a.m5686e(str);
    }

    @TargetApi(16)
    /* renamed from: d */
    private static boolean m5685d(final String str) {
        if (f4605a.containsKey(str)) {
            return true;
        }
        String replace = FacebookSdk.m3996g().replace('.', '|');
        r3 = new Object[3];
        r3[1] = String.format("%s-%s", new Object[]{"android", replace});
        r3[2] = str;
        replace = String.format("%s_%s_%s", r3);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(replace);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) FacebookSdk.m3994e().getSystemService("servicediscovery");
        RegistrationListener c16781 = new RegistrationListener() {
            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }

            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (replace.equals(nsdServiceInfo.getServiceName()) == null) {
                    C1679a.m5684c(str);
                }
            }

            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                C1679a.m5684c(str);
            }
        };
        f4605a.put(str, c16781);
        nsdManager.registerService(nsdServiceInfo, 1, c16781);
        return true;
    }

    @TargetApi(16)
    /* renamed from: e */
    private static void m5686e(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f4605a.get(str);
        if (registrationListener != null) {
            ((NsdManager) FacebookSdk.m3994e().getSystemService("servicediscovery")).unregisterService(registrationListener);
            f4605a.remove(str);
        }
    }
}
