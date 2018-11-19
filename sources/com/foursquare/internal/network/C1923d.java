package com.foursquare.internal.network;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.internal.util.C1947i;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.FsLog;
import com.foursquare.internal.util.Func1;
import com.foursquare.pilgrim.WifiScanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.internal.network.d */
public class C1923d {
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: a */
    private static C1923d f5179a;
    /* renamed from: b */
    private Context f5180b;
    /* renamed from: c */
    private List<ScanResult> f5181c;
    /* renamed from: d */
    private long f5182d;
    /* renamed from: e */
    private long f5183e;
    /* renamed from: f */
    private BroadcastReceiver f5184f = new C19221(this);

    /* renamed from: com.foursquare.internal.network.d$1 */
    class C19221 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C1923d f5178a;

        C19221(C1923d c1923d) {
            this.f5178a = c1923d;
        }

        public void onReceive(Context context, Intent intent) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                try {
                    this.f5178a.f5181c = C1923d.m6728b(wifiManager.getScanResults());
                    this.f5178a.f5182d = System.currentTimeMillis();
                } catch (Context context2) {
                    FsLog.m6806c("NetworkScanManager", "Error examining completed wifi scan.", context2);
                }
            }
        }
    }

    /* renamed from: com.foursquare.internal.network.d$2 */
    class C35002 implements Func1<ScanResult, WifiScanResult> {
        /* renamed from: a */
        final /* synthetic */ C1923d f10574a;

        C35002(C1923d c1923d) {
            this.f10574a = c1923d;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13276a((ScanResult) obj);
        }

        /* renamed from: a */
        public WifiScanResult m13276a(ScanResult scanResult) {
            return WifiScanResult.create(scanResult);
        }
    }

    private C1923d(Context context) {
        this.f5180b = context;
        this.f5180b.registerReceiver(this.f5184f, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    /* renamed from: a */
    public static void m6726a(Context context) {
        if (f5179a == null) {
            f5179a = new C1923d(context);
        }
    }

    /* renamed from: a */
    public static C1923d m6723a() {
        if (f5179a != null) {
            return f5179a;
        }
        throw new IllegalStateException("Please call init before using get");
    }

    /* renamed from: g */
    private boolean m6733g() {
        return this.f5180b != null && C1947i.m6837a().mo2015b(this.f5180b);
    }

    /* renamed from: b */
    public List<ScanResult> m6737b() {
        return m6734h() ? this.f5181c : null;
    }

    @Nullable
    /* renamed from: c */
    public String m6738c() {
        WifiInfo c = C1923d.m6731c(this.f5180b);
        if (c == null) {
            return null;
        }
        String ssid = c.getSSID();
        if ("<unknown ssid>".equals(ssid)) {
            return null;
        }
        return ssid;
    }

    @Nullable
    /* renamed from: c */
    private static WifiInfo m6731c(@NonNull Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            if (wifiManager.isWifiEnabled()) {
                context = wifiManager.getConnectionInfo();
                if (context != null) {
                    if (context.getNetworkId() != -1) {
                        return context;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: h */
    private boolean m6734h() {
        return System.currentTimeMillis() - this.f5182d < 120000 && this.f5181c != null;
    }

    /* renamed from: i */
    private void m6735i() {
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
        r0 = r2.f5180b;
        r0 = com.foursquare.internal.network.C1923d.m6729b(r0);
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.f5180b;
        r0 = r0.getApplicationContext();
        r1 = "wifi";
        r0 = r0.getSystemService(r1);
        r0 = (android.net.wifi.WifiManager) r0;
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        return;
    L_0x001a:
        r1 = 0;
        r0 = r0.startScan();	 Catch:{ Exception -> 0x0020 }
        goto L_0x0021;
    L_0x0020:
        r0 = 0;
    L_0x0021:
        r1 = "NetworkScanManager";
        if (r0 == 0) goto L_0x0028;
    L_0x0025:
        r0 = "Starting wifi scan.";
        goto L_0x002a;
    L_0x0028:
        r0 = "Error starting wifi scan.";
    L_0x002a:
        com.foursquare.internal.util.FsLog.m6803b(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.d.i():void");
    }

    /* renamed from: a */
    public boolean m6736a(SharedPreferences sharedPreferences) {
        return m6727a(2, sharedPreferences);
    }

    /* renamed from: a */
    private boolean m6727a(int r6, android.content.SharedPreferences r7) {
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
        r5 = this;
        r0 = r5.f5183e;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        r0 = 0;
        if (r4 <= 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r1 = r5.m6733g();	 Catch:{ Exception -> 0x003a }
        if (r1 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x003a }
    L_0x0010:
        r1 = r5.m6734h();	 Catch:{ Exception -> 0x003a }
        if (r1 != 0) goto L_0x0039;	 Catch:{ Exception -> 0x003a }
    L_0x0016:
        r1 = com.foursquare.internal.network.C1923d.m6730b(r7);	 Catch:{ Exception -> 0x003a }
        if (r1 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x003a }
    L_0x001c:
        goto L_0x0039;	 Catch:{ Exception -> 0x003a }
    L_0x001d:
        com.foursquare.internal.network.C1923d.m6732c(r7);	 Catch:{ Exception -> 0x003a }
        r5.m6735i();	 Catch:{ Exception -> 0x003a }
        r7 = 0;	 Catch:{ Exception -> 0x003a }
    L_0x0024:
        r1 = r7 + 1;	 Catch:{ Exception -> 0x003a }
        r2 = 5;	 Catch:{ Exception -> 0x003a }
        r2 = java.lang.Math.min(r2, r6);	 Catch:{ Exception -> 0x003a }
        if (r7 >= r2) goto L_0x0034;
    L_0x002d:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        android.os.SystemClock.sleep(r2);	 Catch:{ Exception -> 0x0032 }
    L_0x0032:
        r7 = r1;
        goto L_0x0024;
    L_0x0034:
        r5.m6739d();	 Catch:{ Exception -> 0x003a }
        r6 = 1;
        return r6;
    L_0x0039:
        return r0;
    L_0x003a:
        r6 = "NetworkScanManager";
        r7 = "Couldnt start a wifi scan";
        com.foursquare.internal.util.FsLog.m6803b(r6, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.d.a(int, android.content.SharedPreferences):boolean");
    }

    /* renamed from: d */
    public boolean m6739d() {
        this.f5183e = 0;
        return true;
    }

    @NonNull
    /* renamed from: e */
    public List<WifiScanResult> m6740e() {
        if (m6734h()) {
            return CollectionUtils.m6790a(this.f5181c, new C35002(this));
        }
        return Collections.emptyList();
    }

    @android.support.annotation.Nullable
    /* renamed from: f */
    public java.lang.String m6741f() {
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
        r8 = this;
        r0 = r8.m6734h();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r8.f5181c;
        if (r0 == 0) goto L_0x0071;
    L_0x000c:
        r2 = r0.isEmpty();
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0071;
    L_0x0013:
        r1 = new java.util.ArrayList;
        r2 = r0.size();
        r1.<init>(r2);
        r0 = r0.iterator();
    L_0x0020:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x006a;
    L_0x0026:
        r2 = r0.next();
        r2 = (android.net.wifi.ScanResult) r2;
        r3 = ",";	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4 = 5;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4 = new java.lang.Object[r4];	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r5 = 0;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = com.foursquare.internal.util.C1947i.m6837a();	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = r6.mo2013a(r2);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4[r5] = r6;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r5 = 1;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = r2.SSID;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r7 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = java.net.URLEncoder.encode(r6, r7);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4[r5] = r6;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r5 = 2;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = r2.BSSID;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4[r5] = r6;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r5 = 3;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = r2.frequency;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4[r5] = r6;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r5 = 4;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r2 = r2.level;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r4[r5] = r2;	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r2 = android.text.TextUtils.join(r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        r1.add(r2);	 Catch:{ UnsupportedEncodingException -> 0x0020 }
        goto L_0x0020;
    L_0x006a:
        r0 = ";";
        r0 = android.text.TextUtils.join(r0, r1);
        return r0;
    L_0x0071:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.d.f():java.lang.String");
    }

    /* renamed from: b */
    public static boolean m6729b(android.content.Context r1) {
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
        if (r1 != 0) goto L_0x000d;
    L_0x0002:
        r1 = com.foursquare.internal.network.C1923d.m6723a();	 Catch:{ Exception -> 0x000b }
        r1 = r1.m6733g();	 Catch:{ Exception -> 0x000b }
        return r1;
    L_0x000b:
        r1 = 0;
        return r1;
    L_0x000d:
        r0 = com.foursquare.internal.util.C1947i.m6837a();
        r1 = r1.getApplicationContext();
        r1 = r0.mo2015b(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.d.b(android.content.Context):boolean");
    }

    /* renamed from: b */
    private static List<ScanResult> m6728b(List<ScanResult> list) {
        List<ScanResult> arrayList = new ArrayList();
        for (ScanResult scanResult : list) {
            String str = scanResult.SSID;
            if (str == null || !str.endsWith("_nomap")) {
                arrayList.add(scanResult);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m6730b(SharedPreferences sharedPreferences) {
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        long j = sharedPreferences.getLong("NETWORK_SCAN_FIRST_SCAN", 0);
        sharedPreferences = sharedPreferences.getInt("NETWORK_SCAN_SCAN_COUNT", 0);
        if (j != 0 && System.currentTimeMillis() - j <= TimeUnit.HOURS.toMillis(1) && sharedPreferences >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static void m6732c(SharedPreferences sharedPreferences) {
        long j = sharedPreferences.getLong("NETWORK_SCAN_FIRST_SCAN", 0);
        int i = sharedPreferences.getInt("NETWORK_SCAN_SCAN_COUNT", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j == 0 || currentTimeMillis - j > TimeUnit.HOURS.toMillis(1)) {
            j = currentTimeMillis;
            i = 0;
        }
        sharedPreferences.edit().putLong("NETWORK_SCAN_FIRST_SCAN", j).putInt("NETWORK_SCAN_SCAN_COUNT", i + 1).apply();
    }
}
