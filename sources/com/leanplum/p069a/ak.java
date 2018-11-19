package com.leanplum.p069a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.leanplum.Leanplum;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.leanplum.a.ak */
public class ak {
    /* renamed from: a */
    private static String f21141a = "com.google.android.c2dm.permission.SEND";
    /* renamed from: b */
    private static String f21142b = "com.google.android.c2dm.permission.RECEIVE";
    /* renamed from: c */
    private static String f21143c = "com.google.android.c2dm.intent.RECEIVE";
    /* renamed from: d */
    private static String f21144d = "com.google.android.c2dm.intent.REGISTRATION";
    /* renamed from: e */
    private static String f21145e = "com.google.android.gms.iid.InstanceID";
    /* renamed from: f */
    private static String f21146f = "com.google.android.gms.gcm.GcmReceiver";
    /* renamed from: g */
    private static String f21147g = "com.google.firebase.INSTANCE_ID_EVENT";
    /* renamed from: h */
    private static String f21148h = "com.google.firebase.MESSAGING_EVENT";
    /* renamed from: i */
    private static String f21149i = "com.leanplum.LeanplumPushInstanceIDService";
    /* renamed from: j */
    private static String f21150j = "com.leanplum.LeanplumPushListenerService";
    /* renamed from: k */
    private static String f21151k = "com.leanplum.LeanplumPushFcmListenerService";
    /* renamed from: l */
    private static String f21152l = "com.leanplum.LeanplumPushFirebaseMessagingService";
    /* renamed from: m */
    private static String f21153m = "com.leanplum.LeanplumPushRegistrationService";
    /* renamed from: n */
    private static String f21154n = "com.leanplum.LeanplumPushReceiver";
    /* renamed from: o */
    private static final String f21155o = "WebSocketClient";
    /* renamed from: y */
    private static TrustManager[] f21156y;
    /* renamed from: p */
    private URI f21157p;
    /* renamed from: q */
    private bv f21158q;
    /* renamed from: r */
    private Socket f21159r;
    /* renamed from: s */
    private Thread f21160s;
    /* renamed from: t */
    private HandlerThread f21161t;
    /* renamed from: u */
    private Handler f21162u;
    /* renamed from: v */
    private List<BasicNameValuePair> f21163v;
    /* renamed from: w */
    private C5729y f21164w;
    /* renamed from: x */
    private final Object f21165x;

    /* renamed from: a */
    public static java.lang.Class m25027a(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ak.a(java.lang.String):java.lang.Class");
    }

    /* renamed from: a */
    public static boolean m25035a(android.content.Context r2, android.content.pm.PackageManager r3, java.lang.Class r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = com.leanplum.p069a.ak.m25042b(r2, r3, r4);
        r0 = 0;
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r3 = 1;
        r1 = new android.content.Intent;	 Catch:{ Throwable -> 0x0012 }
        r1.<init>(r2, r4);	 Catch:{ Throwable -> 0x0012 }
        r2.startService(r1);	 Catch:{ Throwable -> 0x0012 }
        return r3;
    L_0x0012:
        r2 = new java.lang.Object[r3];
        r3 = new java.lang.StringBuilder;
        r1 = "Could not start service ";
        r3.<init>(r1);
        r4 = r4.getName();
        r3.append(r4);
        r3 = r3.toString();
        r2[r0] = r3;
        com.leanplum.p069a.ao.b(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ak.a(android.content.Context, android.content.pm.PackageManager, java.lang.Class):boolean");
    }

    /* renamed from: b */
    public static boolean m25042b(android.content.Context r3, android.content.pm.PackageManager r4, java.lang.Class r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r5 == 0) goto L_0x002c;
    L_0x0003:
        if (r3 == 0) goto L_0x002c;
    L_0x0005:
        if (r4 != 0) goto L_0x0008;
    L_0x0007:
        goto L_0x002c;
    L_0x0008:
        r1 = 1;
        r2 = new android.content.ComponentName;	 Catch:{ Throwable -> 0x0012 }
        r2.<init>(r3, r5);	 Catch:{ Throwable -> 0x0012 }
        r4.setComponentEnabledSetting(r2, r1, r1);	 Catch:{ Throwable -> 0x0012 }
        return r1;
    L_0x0012:
        r3 = new java.lang.Object[r1];
        r4 = new java.lang.StringBuilder;
        r1 = "Could not enable component ";
        r4.<init>(r1);
        r5 = r5.getName();
        r4.append(r5);
        r4 = r4.toString();
        r3[r0] = r4;
        com.leanplum.p069a.ao.b(r3);
        return r0;
    L_0x002c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ak.b(android.content.Context, android.content.pm.PackageManager, java.lang.Class):boolean");
    }

    /* renamed from: a */
    public static boolean m25036a(android.content.Context r2, android.content.pm.PackageManager r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        if (r2 == 0) goto L_0x0012;
    L_0x0003:
        if (r3 != 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0012;
    L_0x0006:
        r1 = new android.content.ComponentName;	 Catch:{ Throwable -> 0x0011 }
        r1.<init>(r2, r4);	 Catch:{ Throwable -> 0x0011 }
        r2 = 2;	 Catch:{ Throwable -> 0x0011 }
        r4 = 1;	 Catch:{ Throwable -> 0x0011 }
        r3.setComponentEnabledSetting(r1, r2, r4);	 Catch:{ Throwable -> 0x0011 }
        return r4;
    L_0x0011:
        return r0;
    L_0x0012:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ak.a(android.content.Context, android.content.pm.PackageManager, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static boolean m25045c(Context context, PackageManager packageManager, Class cls) {
        if (!(cls == null || context == null)) {
            if (packageManager != null) {
                context = packageManager.getComponentEnabledSetting(new ComponentName(context, cls));
                if (context != null) {
                    if (2 != context) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static java.lang.String m25028a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.leanplum.Leanplum.getContext();	 Catch:{ Throwable -> 0x001b }
        r1 = r0.getPackageManager();	 Catch:{ Throwable -> 0x001b }
        r0 = r0.getPackageName();	 Catch:{ Throwable -> 0x001b }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Throwable -> 0x001b }
        r0 = r1.getApplicationInfo(r0, r2);	 Catch:{ Throwable -> 0x001b }
        r0 = r0.metaData;	 Catch:{ Throwable -> 0x001b }
        r1 = "LP_NOTIFICATION";	 Catch:{ Throwable -> 0x001b }
        r0 = r0.getString(r1);	 Catch:{ Throwable -> 0x001b }
        return r0;
    L_0x001b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ak.a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m25038a(String str, boolean z, boolean z2) {
        Context context = Leanplum.getContext();
        if (context == null) {
            return false;
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        if (z) {
            z = new StringBuilder("<permission android:name=\"");
            z.append(str);
            z.append("\" android:protectionLevel=\"signature\" />\n");
            z = z.toString();
        } else {
            z = "";
        }
        if (z2) {
            z2 = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("In order to use push notifications, you need to enable the ");
            stringBuilder.append(str);
            stringBuilder.append(" permission in your AndroidManifest.xml file. Add this within the <manifest> section:\n");
            stringBuilder.append(z);
            stringBuilder.append("<uses-permission android:name=\"");
            stringBuilder.append(str);
            stringBuilder.append("\" />");
            z2[0] = stringBuilder.toString();
            ao.a(z2);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m25037a(com.leanplum.p069a.al r8, java.lang.String r9, boolean r10, java.lang.String r11, java.util.List<java.lang.String> r12, java.lang.String r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.leanplum.Leanplum.getContext();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = 1;
        if (r12 == 0) goto L_0x007f;
    L_0x000b:
        r3 = r12.iterator();
    L_0x000f:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x00a4;
    L_0x0015:
        r4 = r3.next();
        r4 = (java.lang.String) r4;
        r5 = com.leanplum.p069a.al.RECEIVER;
        if (r8 != r5) goto L_0x002d;
    L_0x001f:
        r5 = r0.getPackageManager();
        r6 = new android.content.Intent;
        r6.<init>(r4);
        r4 = r5.queryBroadcastReceivers(r6, r1);
        goto L_0x003a;
    L_0x002d:
        r5 = r0.getPackageManager();
        r6 = new android.content.Intent;
        r6.<init>(r4);
        r4 = r5.queryIntentServices(r6, r1);
    L_0x003a:
        if (r4 != 0) goto L_0x003d;
    L_0x003c:
        return r1;
    L_0x003d:
        r4 = r4.iterator();
        r5 = 0;
    L_0x0042:
        r6 = r4.hasNext();
        if (r6 == 0) goto L_0x0071;
    L_0x0048:
        r6 = r4.next();
        r6 = (android.content.pm.ResolveInfo) r6;
        if (r6 == 0) goto L_0x0042;
    L_0x0050:
        r7 = com.leanplum.p069a.al.RECEIVER;
        if (r8 != r7) goto L_0x0057;
    L_0x0054:
        r6 = r6.activityInfo;
        goto L_0x0059;
    L_0x0057:
        r6 = r6.serviceInfo;
    L_0x0059:
        if (r6 == 0) goto L_0x0042;
    L_0x005b:
        r7 = r6.name;
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x0042;
    L_0x0063:
        r7 = r6.packageName;
        if (r7 == 0) goto L_0x0042;
    L_0x0067:
        r6 = r6.packageName;
        r6 = r6.equals(r13);
        if (r6 == 0) goto L_0x0042;
    L_0x006f:
        r5 = 1;
        goto L_0x0042;
    L_0x0071:
        if (r5 != 0) goto L_0x000f;
    L_0x0073:
        r0 = new java.lang.Object[r2];
        r8 = com.leanplum.p069a.ak.m25039b(r8, r9, r10, r11, r12, r13);
        r0[r1] = r8;
        com.leanplum.p069a.ao.a(r0);
        return r1;
    L_0x007f:
        r3 = com.leanplum.p069a.al.RECEIVER;	 Catch:{ NameNotFoundException -> 0x00a5 }
        if (r8 != r3) goto L_0x0094;	 Catch:{ NameNotFoundException -> 0x00a5 }
    L_0x0083:
        r3 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00a5 }
        r4 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x00a5 }
        r0 = r0.getPackageName();	 Catch:{ NameNotFoundException -> 0x00a5 }
        r4.<init>(r0, r9);	 Catch:{ NameNotFoundException -> 0x00a5 }
        r3.getReceiverInfo(r4, r1);	 Catch:{ NameNotFoundException -> 0x00a5 }
        goto L_0x00a4;	 Catch:{ NameNotFoundException -> 0x00a5 }
    L_0x0094:
        r3 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00a5 }
        r4 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x00a5 }
        r0 = r0.getPackageName();	 Catch:{ NameNotFoundException -> 0x00a5 }
        r4.<init>(r0, r9);	 Catch:{ NameNotFoundException -> 0x00a5 }
        r3.getServiceInfo(r4, r1);	 Catch:{ NameNotFoundException -> 0x00a5 }
    L_0x00a4:
        return r2;
    L_0x00a5:
        r0 = new java.lang.Object[r2];
        r8 = com.leanplum.p069a.ak.m25039b(r8, r9, r10, r11, r12, r13);
        r0[r1] = r8;
        com.leanplum.p069a.ao.a(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ak.a(com.leanplum.a.al, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.String):boolean");
    }

    /* renamed from: b */
    private static String m25039b(al alVar, String str, boolean z, String str2, List<String> list, String str3) {
        StringBuilder stringBuilder = new StringBuilder("Push notifications requires you to add the ");
        stringBuilder.append(alVar.name().toLowerCase());
        stringBuilder.append(" ");
        stringBuilder.append(str);
        stringBuilder.append(" to your AndroidManifest.xml file.Add this code within the <application> section:\n");
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        stringBuilder2.append("<");
        stringBuilder2.append(alVar.name().toLowerCase());
        stringBuilder2.append("\n");
        stringBuilder2.append("    android:name=\"");
        stringBuilder2.append(str);
        stringBuilder2.append("\"\n");
        stringBuilder2.append("    android:exported=\"");
        stringBuilder2.append(Boolean.toString(z));
        stringBuilder2.append("\"");
        if (str2 != null) {
            stringBuilder2.append("\n    android:permission=\"");
            stringBuilder2.append(str2);
            stringBuilder2.append("\"");
        }
        stringBuilder2.append(">\n");
        if (list != null) {
            stringBuilder2.append("    <intent-filter>\n");
            for (String str4 : list) {
                stringBuilder2.append("        <action android:name=\"");
                stringBuilder2.append(str4);
                stringBuilder2.append("\" />\n");
            }
            if (str3 != null) {
                stringBuilder2.append("        <category android:name=\"");
                stringBuilder2.append(str3);
                stringBuilder2.append("\" />\n");
            }
            stringBuilder2.append("    </intent-filter>\n");
        }
        stringBuilder2.append("</");
        stringBuilder2.append(alVar.name().toLowerCase());
        stringBuilder2.append(">");
        return stringBuilder2.toString();
    }

    /* renamed from: a */
    private static void m25034a(TrustManager[] trustManagerArr) {
        f21156y = trustManagerArr;
    }

    public ak(URI uri, bv bvVar, List<BasicNameValuePair> list) {
        this.f21165x = new Object();
        this.f21157p = uri;
        this.f21158q = bvVar;
        this.f21163v = null;
        this.f21164w = new C5729y(this);
        this.f21161t = new HandlerThread("websocket-thread");
        this.f21161t.start();
        this.f21162u = new Handler(this.f21161t.getLooper());
    }

    /* renamed from: b */
    public bv m25055b() {
        return this.f21158q;
    }

    /* renamed from: c */
    public void m25058c() {
        if (this.f21160s == null || !this.f21160s.isAlive()) {
            this.f21160s = new Thread(new bs(this));
            this.f21160s.start();
        }
    }

    /* renamed from: d */
    public void m25059d() {
        if (this.f21159r != null) {
            this.f21162u.post(new bt(this));
        }
    }

    /* renamed from: b */
    public void m25056b(String str) {
        m25057b(this.f21164w.m25174a(str));
    }

    /* renamed from: a */
    public void m25054a(byte[] bArr) {
        m25057b(this.f21164w.m25175a(bArr));
    }

    /* renamed from: c */
    private static StatusLine m25044c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return BasicLineParser.parseStatusLine(str, new BasicLineParser());
    }

    /* renamed from: d */
    private static Header m25047d(String str) {
        return BasicLineParser.parseHeader(str, new BasicLineParser());
    }

    /* renamed from: a */
    private static String m25030a(C5730z c5730z) throws IOException {
        int read = c5730z.read();
        if (read == -1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (read != 10) {
            if (read != 13) {
                stringBuilder.append((char) read);
            }
            read = c5730z.read();
            if (read == -1) {
                return null;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: e */
    private static String m25048e() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((int) (Math.random() * 256.0d));
        }
        return Base64.encodeToString(bArr, 0).trim();
    }

    /* renamed from: b */
    void m25057b(byte[] bArr) {
        this.f21162u.post(new bu(this, bArr));
    }

    /* renamed from: f */
    private static SSLSocketFactory m25051f() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, f21156y, null);
        return instance.getSocketFactory();
    }

    /* renamed from: b */
    static /* synthetic */ SSLSocketFactory m25040b(ak akVar) throws NoSuchAlgorithmException, KeyManagementException {
        akVar = SSLContext.getInstance("TLS");
        akVar.init(null, f21156y, null);
        return akVar.getSocketFactory();
    }

    /* renamed from: d */
    static /* synthetic */ String m25046d(ak akVar) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((int) (Math.random() * 256.0d));
        }
        return Base64.encodeToString(bArr, 0).trim();
    }

    /* renamed from: a */
    static /* synthetic */ String m25029a(ak akVar, C5730z c5730z) throws IOException {
        akVar = c5730z.read();
        if (akVar == -1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (akVar != 10) {
            if (akVar != 13) {
                stringBuilder.append((char) akVar);
            }
            akVar = c5730z.read();
            if (akVar == -1) {
                return null;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static /* synthetic */ StatusLine m25033a(ak akVar, String str) {
        if (TextUtils.isEmpty(str) != null) {
            return null;
        }
        return BasicLineParser.parseStatusLine(str, new BasicLineParser());
    }
}
