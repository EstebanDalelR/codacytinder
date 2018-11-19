package io.branch.referral;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class aa {
    /* renamed from: a */
    static String f48182a;
    /* renamed from: b */
    int f48183b = 0;
    /* renamed from: c */
    private Context f48184c;
    /* renamed from: d */
    private boolean f48185d;

    /* renamed from: io.branch.referral.aa$b */
    private class C17303b extends C15582d<Void, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ aa f52980a;
        /* renamed from: b */
        private final aa$a f52981b;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m63267a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m63268a((Void) obj);
        }

        public C17303b(aa aaVar, aa$a aa_a) {
            this.f52980a = aaVar;
            this.f52981b = aa_a;
        }

        /* renamed from: a */
        protected Void m63267a(Void... voidArr) {
            voidArr = new CountDownLatch(1);
            new Thread(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C17303b f48181b;

                public void run() {
                    Process.setThreadPriority(-19);
                    Object a = this.f48181b.f52980a.m58291p();
                    this.f48181b.f52980a.m58286a(a);
                    this.f48181b.f52980a.m58289b(a);
                    voidArr.countDown();
                }
            }).start();
            try {
                voidArr.await(1500, TimeUnit.MILLISECONDS);
            } catch (Void[] voidArr2) {
                voidArr2.printStackTrace();
            }
            return null;
        }

        /* renamed from: a */
        protected void m63268a(Void voidR) {
            super.onPostExecute(voidR);
            if (this.f52981b != null) {
                this.f52981b.e();
            }
        }
    }

    /* renamed from: j */
    String m58303j() {
        return "Android";
    }

    aa(Context context) {
        this.f48184c = context;
        this.f48185d = true;
    }

    /* renamed from: a */
    String m58292a(boolean z) {
        if (this.f48184c == null) {
            return "bnc_no_value";
        }
        String str = null;
        if (!(z || Branch.f12571a)) {
            str = Secure.getString(this.f48184c.getContentResolver(), "android_id");
        }
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.f48185d = false;
        }
        return str;
    }

    /* renamed from: a */
    boolean m58293a() {
        return this.f48185d;
    }

    /* renamed from: b */
    String m58295b() {
        String str = "";
        try {
            return this.f48184c.getPackageManager().getPackageInfo(this.f48184c.getPackageName(), 0).packageName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: c */
    String m58296c() {
        return m58287a(this.f48184c.getPackageName());
    }

    /* renamed from: a */
    private java.lang.String m58287a(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = "bnc_no_value";
        r1 = r4.m58297d();
        if (r1 != 0) goto L_0x0062;
    L_0x0008:
        r1 = 0;
        r2 = r4.f48184c;	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r2 = r2.getPackageManager();	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r3 = 0;	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r5 = r2.getApplicationInfo(r5, r3);	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r5 = r5.publicSourceDir;	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r2 = new java.util.jar.JarFile;	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r2.<init>(r5);	 Catch:{ Exception -> 0x0057, all -> 0x004a }
        r5 = "AndroidManifest.xml";	 Catch:{ Exception -> 0x0058, all -> 0x0048 }
        r5 = r2.getEntry(r5);	 Catch:{ Exception -> 0x0058, all -> 0x0048 }
        r5 = r2.getInputStream(r5);	 Catch:{ Exception -> 0x0058, all -> 0x0048 }
        r1 = r5.available();	 Catch:{ Exception -> 0x0046, all -> 0x0043 }
        r1 = new byte[r1];	 Catch:{ Exception -> 0x0046, all -> 0x0043 }
        r5.read(r1);	 Catch:{ Exception -> 0x0046, all -> 0x0043 }
        r3 = new io.branch.referral.b;	 Catch:{ Exception -> 0x0046, all -> 0x0043 }
        r3.<init>();	 Catch:{ Exception -> 0x0046, all -> 0x0043 }
        r1 = r3.m58319a(r1);	 Catch:{ Exception -> 0x0046, all -> 0x0043 }
        if (r5 == 0) goto L_0x003c;
    L_0x0039:
        r5.close();	 Catch:{ IOException -> 0x0041 }
    L_0x003c:
        if (r2 == 0) goto L_0x0041;	 Catch:{ IOException -> 0x0041 }
    L_0x003e:
        r2.close();	 Catch:{ IOException -> 0x0041 }
    L_0x0041:
        r0 = r1;
        goto L_0x0062;
    L_0x0043:
        r0 = move-exception;
        r1 = r5;
        goto L_0x004c;
    L_0x0046:
        r1 = r5;
        goto L_0x0058;
    L_0x0048:
        r0 = move-exception;
        goto L_0x004c;
    L_0x004a:
        r0 = move-exception;
        r2 = r1;
    L_0x004c:
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.close();	 Catch:{ IOException -> 0x0056 }
    L_0x0051:
        if (r2 == 0) goto L_0x0056;	 Catch:{ IOException -> 0x0056 }
    L_0x0053:
        r2.close();	 Catch:{ IOException -> 0x0056 }
    L_0x0056:
        throw r0;
    L_0x0057:
        r2 = r1;
    L_0x0058:
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ IOException -> 0x0062 }
    L_0x005d:
        if (r2 == 0) goto L_0x0062;	 Catch:{ IOException -> 0x0062 }
    L_0x005f:
        r2.close();	 Catch:{ IOException -> 0x0062 }
    L_0x0062:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.aa.a(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    boolean m58297d() {
        ActivityManager activityManager = (ActivityManager) this.f48184c.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* renamed from: e */
    java.lang.String m58298e() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f48184c;	 Catch:{ NameNotFoundException -> 0x001b }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r3.f48184c;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x001b }
        r0 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x001b }
        if (r1 == 0) goto L_0x0018;	 Catch:{ NameNotFoundException -> 0x001b }
    L_0x0015:
        r0 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x001b }
        return r0;	 Catch:{ NameNotFoundException -> 0x001b }
    L_0x0018:
        r0 = "bnc_no_value";	 Catch:{ NameNotFoundException -> 0x001b }
        return r0;
    L_0x001b:
        r0 = "bnc_no_value";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.aa.e():java.lang.String");
    }

    /* renamed from: f */
    String m58299f() {
        return Build.MANUFACTURER;
    }

    /* renamed from: g */
    String m58300g() {
        return Build.MODEL;
    }

    /* renamed from: h */
    String m58301h() {
        return Locale.getDefault() != null ? Locale.getDefault().getCountry() : "";
    }

    /* renamed from: i */
    String m58302i() {
        return Locale.getDefault() != null ? Locale.getDefault().getLanguage() : "";
    }

    /* renamed from: k */
    int m58304k() {
        return VERSION.SDK_INT;
    }

    /* renamed from: l */
    DisplayMetrics m58305l() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f48184c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: m */
    public boolean m58306m() {
        boolean z = false;
        if (this.f48184c.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        NetworkInfo networkInfo = ((ConnectivityManager) this.f48184c.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            z = true;
        }
        return z;
    }

    /* renamed from: p */
    private java.lang.Object m58291p() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = 0;
        r1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient";	 Catch:{ Throwable -> 0x0020 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0020 }
        r2 = "getAdvertisingIdInfo";	 Catch:{ Throwable -> 0x0020 }
        r3 = 1;	 Catch:{ Throwable -> 0x0020 }
        r4 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x0020 }
        r5 = android.content.Context.class;	 Catch:{ Throwable -> 0x0020 }
        r6 = 0;	 Catch:{ Throwable -> 0x0020 }
        r4[r6] = r5;	 Catch:{ Throwable -> 0x0020 }
        r1 = r1.getMethod(r2, r4);	 Catch:{ Throwable -> 0x0020 }
        r2 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0020 }
        r3 = r7.f48184c;	 Catch:{ Throwable -> 0x0020 }
        r2[r6] = r3;	 Catch:{ Throwable -> 0x0020 }
        r1 = r1.invoke(r0, r2);	 Catch:{ Throwable -> 0x0020 }
        r0 = r1;
    L_0x0020:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.aa.p():java.lang.Object");
    }

    /* renamed from: a */
    private java.lang.String m58286a(java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getClass();	 Catch:{ Exception -> 0x0017 }
        r1 = "getId";	 Catch:{ Exception -> 0x0017 }
        r2 = 0;	 Catch:{ Exception -> 0x0017 }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0017 }
        r0 = r0.getMethod(r1, r3);	 Catch:{ Exception -> 0x0017 }
        r1 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0017 }
        r5 = r0.invoke(r5, r1);	 Catch:{ Exception -> 0x0017 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x0017 }
        f48182a = r5;	 Catch:{ Exception -> 0x0017 }
    L_0x0017:
        r5 = f48182a;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.aa.a(java.lang.Object):java.lang.String");
    }

    /* renamed from: b */
    private int m58289b(java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getClass();	 Catch:{ Exception -> 0x001b }
        r1 = "isLimitAdTrackingEnabled";	 Catch:{ Exception -> 0x001b }
        r2 = 0;	 Catch:{ Exception -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001b }
        r0 = r0.getMethod(r1, r3);	 Catch:{ Exception -> 0x001b }
        r1 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x001b }
        r5 = r0.invoke(r5, r1);	 Catch:{ Exception -> 0x001b }
        r5 = (java.lang.Boolean) r5;	 Catch:{ Exception -> 0x001b }
        r5 = r5.booleanValue();	 Catch:{ Exception -> 0x001b }
        r4.f48183b = r5;	 Catch:{ Exception -> 0x001b }
    L_0x001b:
        r5 = r4.f48183b;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.aa.b(java.lang.Object):int");
    }

    /* renamed from: a */
    boolean m58294a(aa$a aa_a) {
        if (!TextUtils.isEmpty(f48182a)) {
            return false;
        }
        new C17303b(this, aa_a).m58328a(new Void[0]);
        return true;
    }

    /* renamed from: n */
    static java.lang.String m58290n() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "";
        r1 = java.net.NetworkInterface.getNetworkInterfaces();	 Catch:{ Throwable -> 0x004b }
        r1 = java.util.Collections.list(r1);	 Catch:{ Throwable -> 0x004b }
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x004b }
    L_0x000e:
        r2 = r1.hasNext();	 Catch:{ Throwable -> 0x004b }
        if (r2 == 0) goto L_0x004b;	 Catch:{ Throwable -> 0x004b }
    L_0x0014:
        r2 = r1.next();	 Catch:{ Throwable -> 0x004b }
        r2 = (java.net.NetworkInterface) r2;	 Catch:{ Throwable -> 0x004b }
        r2 = r2.getInetAddresses();	 Catch:{ Throwable -> 0x004b }
        r2 = java.util.Collections.list(r2);	 Catch:{ Throwable -> 0x004b }
        r2 = r2.iterator();	 Catch:{ Throwable -> 0x004b }
    L_0x0026:
        r3 = r2.hasNext();	 Catch:{ Throwable -> 0x004b }
        if (r3 == 0) goto L_0x000e;	 Catch:{ Throwable -> 0x004b }
    L_0x002c:
        r3 = r2.next();	 Catch:{ Throwable -> 0x004b }
        r3 = (java.net.InetAddress) r3;	 Catch:{ Throwable -> 0x004b }
        r4 = r3.isLoopbackAddress();	 Catch:{ Throwable -> 0x004b }
        if (r4 != 0) goto L_0x0026;	 Catch:{ Throwable -> 0x004b }
    L_0x0038:
        r3 = r3.getHostAddress();	 Catch:{ Throwable -> 0x004b }
        r4 = 58;	 Catch:{ Throwable -> 0x004b }
        r4 = r3.indexOf(r4);	 Catch:{ Throwable -> 0x004b }
        if (r4 >= 0) goto L_0x0046;
    L_0x0044:
        r4 = 1;
        goto L_0x0047;
    L_0x0046:
        r4 = 0;
    L_0x0047:
        if (r4 == 0) goto L_0x0026;
    L_0x0049:
        r0 = r3;
        goto L_0x000e;
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.aa.n():java.lang.String");
    }

    /* renamed from: o */
    String m58307o() {
        switch (((UiModeManager) this.f48184c.getSystemService("uimode")).getCurrentModeType()) {
            case 0:
                return "UI_MODE_TYPE_UNDEFINED";
            case 1:
                return "UI_MODE_TYPE_NORMAL";
            case 2:
                return "UI_MODE_TYPE_DESK";
            case 3:
                return "UI_MODE_TYPE_CAR";
            case 4:
                return "UI_MODE_TYPE_TELEVISION";
            case 5:
                return "UI_MODE_TYPE_APPLIANCE";
            case 6:
                return "UI_MODE_TYPE_WATCH";
            default:
                return "UI_MODE_TYPE_UNDEFINED";
        }
    }
}
