package com.facebook.ads.internal.p047k.p048a;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.facebook.ads.internal.p039f.C1403a;
import com.facebook.ads.internal.p043j.p044a.C1433a;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.k.a.a */
public class C1475a {
    /* renamed from: a */
    private static String f4039a;
    /* renamed from: b */
    private static final Set<String> f4040b = new HashSet(1);
    /* renamed from: c */
    private static final Set<String> f4041c = new HashSet(2);

    /* renamed from: com.facebook.ads.internal.k.a.a$a */
    public enum C1474a {
        UNKNOWN(0),
        NONE(0),
        MOBILE_INTERNET(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        MOBILE_4G(4);
        
        /* renamed from: g */
        public final int f4038g;

        private C1474a(int i) {
            this.f4038g = i;
        }
    }

    static {
        f4040b.add("1ww8E0AYsR2oX5lndk2hwp2Uosk=\n");
        f4041c.add("toZ2GRnRjC9P5VVUdCpOrFH8lfQ=\n");
        f4041c.add("3lKvjNsfmrn+WmfDhvr2iVh/yRs=\n");
        f4041c.add("B08QtE4yLCdli4rptyqAEczXOeA=\n");
        f4041c.add("XZXI6anZbdKf+taURdnyUH5ipgM=\n");
    }

    /* renamed from: a */
    public static C1433a m5150a(Context context) {
        return C1475a.m5151a(context, null);
    }

    /* renamed from: a */
    public static C1433a m5151a(Context context, C1522c c1522c) {
        C1433a c1433a = new C1433a();
        C1475a.m5153a(context, c1433a, c1522c);
        return c1433a;
    }

    /* renamed from: a */
    private static String m5152a(Context context, String str, String str2) {
        Class cls = Class.forName(str);
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class, Class.forName(str2)});
        declaredConstructor.setAccessible(true);
        try {
            String str3 = (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(new Object[]{context, null}), new Object[0]);
            return str3;
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    /* renamed from: a */
    private static void m5153a(Context context, C1433a c1433a, C1522c c1522c) {
        c1433a.m5029c(30000);
        c1433a.m5027b(3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1475a.m5159c(context, c1522c));
        stringBuilder.append(" [FBAN/AudienceNetworkForAndroid;FBSN/");
        stringBuilder.append("Android");
        stringBuilder.append(";FBSV/");
        stringBuilder.append(C1403a.f3822a);
        stringBuilder.append(";FBAB/");
        stringBuilder.append(C1403a.f3825d);
        stringBuilder.append(";FBAV/");
        stringBuilder.append(C1403a.f3827f);
        stringBuilder.append(";FBBV/");
        stringBuilder.append(C1403a.f3828g);
        stringBuilder.append(";FBVS/");
        stringBuilder.append("4.27.0");
        stringBuilder.append(";FBLC/");
        stringBuilder.append(Locale.getDefault().toString());
        stringBuilder.append("]");
        c1433a.m5012a("user-agent", stringBuilder.toString());
    }

    /* renamed from: a */
    public static boolean m5154a() {
        Object urlPrefix = AdInternalSettings.getUrlPrefix();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(".sb");
    }

    /* renamed from: b */
    public static C1433a m5155b() {
        return C1475a.m5150a(null);
    }

    /* renamed from: b */
    public static C1433a m5156b(Context context) {
        return C1475a.m5157b(context, null);
    }

    /* renamed from: b */
    public static C1433a m5157b(Context context, C1522c c1522c) {
        C1433a c1433a = new C1433a();
        C1475a.m5153a(context, c1433a, c1522c);
        if (!C1475a.m5154a()) {
            c1433a.m5028b(f4041c);
            c1433a.m5021a(f4040b);
        }
        return c1433a;
    }

    /* renamed from: c */
    public static C1474a m5158c(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return C1474a.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() != 0) {
                    return C1474a.MOBILE_INTERNET;
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return C1474a.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return C1474a.MOBILE_3G;
                    case 13:
                        return C1474a.MOBILE_4G;
                    default:
                        return C1474a.UNKNOWN;
                }
            }
        }
        return C1474a.NONE;
    }

    /* renamed from: c */
    private static java.lang.String m5159c(android.content.Context r2, com.facebook.ads.internal.protocol.C1522c r3) {
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
        if (r2 != 0) goto L_0x0005;
    L_0x0002:
        r2 = "Unknown";
        return r2;
    L_0x0005:
        r0 = com.facebook.ads.internal.protocol.C1522c.NATIVE_250;
        if (r3 == r0) goto L_0x0065;
    L_0x0009:
        r0 = com.facebook.ads.internal.protocol.C1522c.NATIVE_UNKNOWN;
        if (r3 == r0) goto L_0x0065;
    L_0x000d:
        if (r3 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0065;
    L_0x0010:
        r3 = f4039a;
        if (r3 == 0) goto L_0x0017;
    L_0x0014:
        r2 = f4039a;
        return r2;
    L_0x0017:
        r3 = com.facebook.ads.internal.p047k.p048a.C1475a.class;
        monitor-enter(r3);
        r0 = f4039a;	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0022;	 Catch:{ all -> 0x0062 }
    L_0x001e:
        r2 = f4039a;	 Catch:{ all -> 0x0062 }
        monitor-exit(r3);	 Catch:{ all -> 0x0062 }
        return r2;	 Catch:{ all -> 0x0062 }
    L_0x0022:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0062 }
        r1 = 17;
        if (r0 < r1) goto L_0x0032;
    L_0x0028:
        r0 = com.facebook.ads.internal.p047k.p048a.C1475a.m5160d(r2);	 Catch:{ Exception -> 0x0032 }
        f4039a = r0;	 Catch:{ Exception -> 0x0032 }
        r0 = f4039a;	 Catch:{ Exception -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0062 }
        return r0;
    L_0x0032:
        r0 = "android.webkit.WebSettings";	 Catch:{ Exception -> 0x003d }
        r1 = "android.webkit.WebView";	 Catch:{ Exception -> 0x003d }
        r0 = com.facebook.ads.internal.p047k.p048a.C1475a.m5152a(r2, r0, r1);	 Catch:{ Exception -> 0x003d }
        f4039a = r0;	 Catch:{ Exception -> 0x003d }
        goto L_0x005e;
    L_0x003d:
        r0 = "android.webkit.WebSettingsClassic";	 Catch:{ Exception -> 0x0048 }
        r1 = "android.webkit.WebViewClassic";	 Catch:{ Exception -> 0x0048 }
        r0 = com.facebook.ads.internal.p047k.p048a.C1475a.m5152a(r2, r0, r1);	 Catch:{ Exception -> 0x0048 }
        f4039a = r0;	 Catch:{ Exception -> 0x0048 }
        goto L_0x005e;
    L_0x0048:
        r0 = new android.webkit.WebView;	 Catch:{ all -> 0x0062 }
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x0062 }
        r0.<init>(r2);	 Catch:{ all -> 0x0062 }
        r2 = r0.getSettings();	 Catch:{ all -> 0x0062 }
        r2 = r2.getUserAgentString();	 Catch:{ all -> 0x0062 }
        f4039a = r2;	 Catch:{ all -> 0x0062 }
        r0.destroy();	 Catch:{ all -> 0x0062 }
    L_0x005e:
        monitor-exit(r3);	 Catch:{ all -> 0x0062 }
        r2 = f4039a;
        return r2;
    L_0x0062:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0062 }
        throw r2;
    L_0x0065:
        r2 = "http.agent";
        r2 = java.lang.System.getProperty(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.a.a.c(android.content.Context, com.facebook.ads.internal.protocol.c):java.lang.String");
    }

    @TargetApi(17)
    /* renamed from: d */
    private static String m5160d(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
}
