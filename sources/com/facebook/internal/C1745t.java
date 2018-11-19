package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.login.DefaultAudience;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.t */
public final class C1745t {
    /* renamed from: a */
    private static final String f4816a = "com.facebook.internal.t";
    /* renamed from: b */
    private static final List<C1743e> f4817b = C1745t.m6046e();
    /* renamed from: c */
    private static final List<C1743e> f4818c = C1745t.m6047f();
    /* renamed from: d */
    private static final Map<String, List<C1743e>> f4819d = C1745t.m6050g();
    /* renamed from: e */
    private static final AtomicBoolean f4820e = new AtomicBoolean(false);
    /* renamed from: f */
    private static final List<Integer> f4821f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: com.facebook.internal.t$1 */
    static class C17421 implements Runnable {
        C17421() {
        }

        public void run() {
            try {
                for (C1743e a : C1745t.f4817b) {
                    a.m6009a(true);
                }
            } finally {
                C1745t.f4820e.set(false);
            }
        }
    }

    /* renamed from: com.facebook.internal.t$e */
    private static abstract class C1743e {
        /* renamed from: a */
        private TreeSet<Integer> f4813a;

        /* renamed from: a */
        protected abstract String mo1858a();

        /* renamed from: b */
        protected abstract String mo1859b();

        private C1743e() {
        }

        /* renamed from: c */
        public TreeSet<Integer> m6012c() {
            if (this.f4813a == null) {
                m6009a(false);
            }
            return this.f4813a;
        }

        /* renamed from: a */
        private synchronized void m6009a(boolean z) {
            if (!z) {
                if (!this.f4813a) {
                }
            }
            this.f4813a = C1745t.m6037b(this);
        }
    }

    /* renamed from: com.facebook.internal.t$f */
    public static class C1744f {
        /* renamed from: a */
        private C1743e f4814a;
        /* renamed from: b */
        private int f4815b;

        /* renamed from: a */
        public static C1744f m6015a(C1743e c1743e, int i) {
            C1744f c1744f = new C1744f();
            c1744f.f4814a = c1743e;
            c1744f.f4815b = i;
            return c1744f;
        }

        /* renamed from: a */
        public static C1744f m6014a() {
            C1744f c1744f = new C1744f();
            c1744f.f4815b = -1;
            return c1744f;
        }

        private C1744f() {
        }

        /* renamed from: b */
        public int m6017b() {
            return this.f4815b;
        }
    }

    /* renamed from: com.facebook.internal.t$a */
    private static class C3418a extends C1743e {
        /* renamed from: a */
        protected String mo1858a() {
            return "com.facebook.arstudio.player";
        }

        /* renamed from: b */
        protected String mo1859b() {
            return null;
        }

        private C3418a() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.t$b */
    private static class C3419b extends C1743e {
        /* renamed from: a */
        protected String mo1858a() {
            return "com.facebook.lite";
        }

        /* renamed from: b */
        protected String mo1859b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private C3419b() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.t$c */
    private static class C3420c extends C1743e {
        /* renamed from: a */
        protected String mo1858a() {
            return "com.facebook.katana";
        }

        /* renamed from: b */
        protected String mo1859b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C3420c() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.t$d */
    private static class C3421d extends C1743e {
        /* renamed from: a */
        protected String mo1858a() {
            return "com.facebook.orca";
        }

        /* renamed from: b */
        protected String mo1859b() {
            return null;
        }

        private C3421d() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.t$g */
    private static class C3422g extends C1743e {
        /* renamed from: a */
        protected String mo1858a() {
            return "com.facebook.wakizashi";
        }

        /* renamed from: b */
        protected String mo1859b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C3422g() {
            super();
        }
    }

    /* renamed from: e */
    private static List<C1743e> m6046e() {
        List<C1743e> arrayList = new ArrayList();
        arrayList.add(new C3420c());
        arrayList.add(new C3422g());
        return arrayList;
    }

    /* renamed from: f */
    private static List<C1743e> m6047f() {
        List<C1743e> arrayList = new ArrayList(C1745t.m6046e());
        arrayList.add(0, new C3418a());
        return arrayList;
    }

    /* renamed from: g */
    private static Map<String, List<C1743e>> m6050g() {
        Map<String, List<C1743e>> hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3421d());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f4817b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f4817b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f4817b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f4817b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f4818c);
        return hashMap;
    }

    /* renamed from: a */
    static Intent m6022a(Context context, Intent intent, C1743e c1743e) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null || C1706g.m5888a(context, resolveActivity.activityInfo.packageName) == null) {
            return null;
        }
        return intent;
    }

    /* renamed from: b */
    static Intent m6035b(Context context, Intent intent, C1743e c1743e) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || C1706g.m5888a(context, resolveService.serviceInfo.packageName) == null) {
            return null;
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m6024a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3) {
        C1743e c3419b = new C3419b();
        return C1745t.m6022a(context, C1745t.m6026a(c3419b, str, (Collection) collection, str2, z, z2, defaultAudience, str3), c3419b);
    }

    /* renamed from: a */
    private static Intent m6026a(C1743e c1743e, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3) {
        z = c1743e.mo1859b();
        if (!z) {
            return null;
        }
        c1743e = new Intent().setClassName(c1743e.mo1858a(), z).putExtra("client_id", str);
        c1743e.putExtra("facebook_sdk_version", FacebookSdk.m3996g());
        if (Utility.m5786a((Collection) collection) == null) {
            c1743e.putExtra(QueryParams.SCOPE, TextUtils.join(",", collection));
        }
        if (Utility.m5785a(str2) == null) {
            c1743e.putExtra("e2e", str2);
        }
        c1743e.putExtra("state", str3);
        c1743e.putExtra(QueryParams.RESPONSE_TYPE, "token,signed_request");
        c1743e.putExtra("return_scopes", "true");
        if (z2) {
            c1743e.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
        }
        c1743e.putExtra("legacy_override", FacebookSdk.m3995f());
        c1743e.putExtra("auth_type", "rerequest");
        return c1743e;
    }

    /* renamed from: b */
    public static Intent m6036b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3) {
        for (C1743e c1743e : f4817b) {
            Intent a = C1745t.m6022a(context, C1745t.m6026a(c1743e, str, (Collection) collection, str2, z, z2, defaultAudience, str3), c1743e);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final int m6018a() {
        return ((Integer) f4821f.get(0)).intValue();
    }

    /* renamed from: a */
    public static boolean m6033a(int i) {
        return f4821f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: a */
    public static Intent m6023a(Context context, String str, String str2, C1744f c1744f, Bundle bundle) {
        if (c1744f == null) {
            return null;
        }
        C1743e a = c1744f.f4814a;
        if (a == null) {
            return null;
        }
        Intent a2 = C1745t.m6022a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(a.mo1858a()).addCategory("android.intent.category.DEFAULT"), a);
        if (a2 == null) {
            return null;
        }
        C1745t.m6032a(a2, str, str2, c1744f.f4815b, bundle);
        return a2;
    }

    /* renamed from: a */
    public static void m6032a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String i2 = FacebookSdk.m3998i();
        String j = FacebookSdk.m3999j();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", i2);
        if (C1745t.m6033a(i) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            Utility.m5772a(bundle2, "app_name", j);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (Utility.m5785a(j) == null) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", j);
        }
        intent.putExtras(bundle);
    }

    /* renamed from: a */
    public static Intent m6025a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID b = C1745t.m6038b(intent);
        if (b == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", C1745t.m6019a(intent));
        intent = new Bundle();
        intent.putString("action_id", b.toString());
        if (facebookException != null) {
            intent.putBundle("error", C1745t.m6027a(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", intent);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    public static Intent m6021a(Context context) {
        for (C1743e c1743e : f4817b) {
            Intent b = C1745t.m6035b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(c1743e.mo1858a()).addCategory("android.intent.category.DEFAULT"), c1743e);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m6019a(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: b */
    public static java.util.UUID m6038b(android.content.Intent r2) {
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
        r0 = 0;
        if (r2 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = com.facebook.internal.C1745t.m6019a(r2);
        r1 = com.facebook.internal.C1745t.m6033a(r1);
        if (r1 == 0) goto L_0x001f;
    L_0x000e:
        r1 = "com.facebook.platform.protocol.BRIDGE_ARGS";
        r2 = r2.getBundleExtra(r1);
        if (r2 == 0) goto L_0x001d;
    L_0x0016:
        r1 = "action_id";
        r2 = r2.getString(r1);
        goto L_0x0025;
    L_0x001d:
        r2 = r0;
        goto L_0x0025;
    L_0x001f:
        r1 = "com.facebook.platform.protocol.CALL_ID";
        r2 = r2.getStringExtra(r1);
    L_0x0025:
        if (r2 == 0) goto L_0x002c;
    L_0x0027:
        r2 = java.util.UUID.fromString(r2);	 Catch:{ IllegalArgumentException -> 0x002c }
        goto L_0x002d;
    L_0x002c:
        r2 = r0;
    L_0x002d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.t.b(android.content.Intent):java.util.UUID");
    }

    /* renamed from: c */
    public static Bundle m6041c(Intent intent) {
        if (C1745t.m6033a(C1745t.m6019a(intent))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
        return null;
    }

    /* renamed from: d */
    public static Bundle m6043d(Intent intent) {
        if (C1745t.m6033a(C1745t.m6019a(intent))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        }
        return intent.getExtras();
    }

    /* renamed from: e */
    public static Bundle m6045e(Intent intent) {
        int a = C1745t.m6019a(intent);
        intent = intent.getExtras();
        if (C1745t.m6033a(a)) {
            if (intent != null) {
                return intent.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
        }
        return intent;
    }

    /* renamed from: f */
    public static boolean m6048f(Intent intent) {
        Bundle c = C1745t.m6041c(intent);
        if (c != null) {
            return c.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    /* renamed from: g */
    public static Bundle m6049g(Intent intent) {
        if (!C1745t.m6048f(intent)) {
            return null;
        }
        Bundle c = C1745t.m6041c(intent);
        if (c != null) {
            return c.getBundle("error");
        }
        return intent.getExtras();
    }

    /* renamed from: a */
    public static FacebookException m6028a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || string.equalsIgnoreCase("UserCanceled") == null) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    /* renamed from: a */
    public static Bundle m6027a(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if ((facebookException instanceof FacebookOperationCanceledException) != null) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: b */
    public static int m6034b(int i) {
        return C1745t.m6030a(f4817b, new int[]{i}).m6017b();
    }

    /* renamed from: a */
    public static C1744f m6029a(String str, int[] iArr) {
        return C1745t.m6030a((List) f4819d.get(str), iArr);
    }

    /* renamed from: a */
    private static C1744f m6030a(List<C1743e> list, int[] iArr) {
        C1745t.m6039b();
        if (list == null) {
            return C1744f.m6014a();
        }
        for (C1743e c1743e : list) {
            int a = C1745t.m6020a(c1743e.m6012c(), C1745t.m6018a(), iArr);
            if (a != -1) {
                return C1744f.m6015a(c1743e, a);
            }
        }
        return C1744f.m6014a();
    }

    /* renamed from: b */
    public static void m6039b() {
        if (f4820e.compareAndSet(false, true)) {
            FacebookSdk.m3990c().execute(new C17421());
        }
    }

    /* renamed from: b */
    private static java.util.TreeSet<java.lang.Integer> m6037b(com.facebook.internal.C1745t.C1743e r8) {
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
        r0 = new java.util.TreeSet;
        r0.<init>();
        r1 = com.facebook.FacebookSdk.m3994e();
        r2 = r1.getContentResolver();
        r1 = "version";
        r4 = new java.lang.String[]{r1};
        r3 = com.facebook.internal.C1745t.m6040c(r8);
        r1 = 0;
        r5 = com.facebook.FacebookSdk.m3994e();	 Catch:{ all -> 0x0076 }
        r5 = r5.getPackageManager();	 Catch:{ all -> 0x0076 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0076 }
        r6.<init>();	 Catch:{ all -> 0x0076 }
        r8 = r8.mo1858a();	 Catch:{ all -> 0x0076 }
        r6.append(r8);	 Catch:{ all -> 0x0076 }
        r8 = ".provider.PlatformProvider";	 Catch:{ all -> 0x0076 }
        r6.append(r8);	 Catch:{ all -> 0x0076 }
        r8 = r6.toString();	 Catch:{ all -> 0x0076 }
        r6 = 0;
        r8 = r5.resolveContentProvider(r8, r6);	 Catch:{ RuntimeException -> 0x003b }
        goto L_0x0044;
    L_0x003b:
        r8 = move-exception;
        r5 = f4816a;	 Catch:{ all -> 0x0076 }
        r6 = "Failed to query content resolver.";	 Catch:{ all -> 0x0076 }
        android.util.Log.e(r5, r6, r8);	 Catch:{ all -> 0x0076 }
        r8 = r1;
    L_0x0044:
        if (r8 == 0) goto L_0x0070;
    L_0x0046:
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ NullPointerException -> 0x004f, NullPointerException -> 0x004f, NullPointerException -> 0x004f }
        r1 = r8;
        goto L_0x0056;
    L_0x004f:
        r8 = f4816a;	 Catch:{ all -> 0x0076 }
        r2 = "Failed to query content resolver.";	 Catch:{ all -> 0x0076 }
        android.util.Log.e(r8, r2);	 Catch:{ all -> 0x0076 }
    L_0x0056:
        if (r1 == 0) goto L_0x0070;	 Catch:{ all -> 0x0076 }
    L_0x0058:
        r8 = r1.moveToNext();	 Catch:{ all -> 0x0076 }
        if (r8 == 0) goto L_0x0070;	 Catch:{ all -> 0x0076 }
    L_0x005e:
        r8 = "version";	 Catch:{ all -> 0x0076 }
        r8 = r1.getColumnIndex(r8);	 Catch:{ all -> 0x0076 }
        r8 = r1.getInt(r8);	 Catch:{ all -> 0x0076 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0076 }
        r0.add(r8);	 Catch:{ all -> 0x0076 }
        goto L_0x0058;
    L_0x0070:
        if (r1 == 0) goto L_0x0075;
    L_0x0072:
        r1.close();
    L_0x0075:
        return r0;
    L_0x0076:
        r8 = move-exception;
        if (r1 == 0) goto L_0x007c;
    L_0x0079:
        r1.close();
    L_0x007c:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.t.b(com.facebook.internal.t$e):java.util.TreeSet<java.lang.Integer>");
    }

    /* renamed from: a */
    public static int m6020a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        treeSet = treeSet.descendingIterator();
        int i2 = -1;
        int i3 = length;
        length = -1;
        while (treeSet.hasNext()) {
            int intValue = ((Integer) treeSet.next()).intValue();
            length = Math.max(length, intValue);
            while (i3 >= 0 && iArr[i3] > intValue) {
                i3--;
            }
            if (i3 < 0) {
                return -1;
            }
            if (iArr[i3] == intValue) {
                if (i3 % 2 == 0) {
                    i2 = Math.min(length, i);
                }
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static Uri m6040c(C1743e c1743e) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("content://");
        stringBuilder.append(c1743e.mo1858a());
        stringBuilder.append(".provider.PlatformProvider/versions");
        return Uri.parse(stringBuilder.toString());
    }
}
