package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: com.appsflyer.z */
final class C0961z {
    /* renamed from: a */
    private static String f2550a;

    /* renamed from: a */
    public static synchronized String m3280a(WeakReference<Context> weakReference) {
        synchronized (C0961z.class) {
            if (weakReference.get() == null) {
                weakReference = f2550a;
                return weakReference;
            }
            if (f2550a == null) {
                String c = C0961z.m3283c(weakReference);
                if (c != null) {
                    f2550a = c;
                } else {
                    try {
                        File file = new File(((Context) weakReference.get()).getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            f2550a = C0961z.m3279a(file);
                            file.delete();
                        } else {
                            f2550a = C0961z.m3282b(weakReference);
                        }
                        C0961z.m3281a(weakReference, f2550a);
                    } catch (Throwable e) {
                        AFLogger.m3073a("Error getting AF unique ID", e);
                    }
                }
                if (f2550a != null) {
                    AppsFlyerProperties.m3086a().m3092a(InstrumentationConstantsKt.FIELD_UID, f2550a);
                }
            }
            weakReference = f2550a;
            return weakReference;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static java.lang.String m3279a(java.io.File r5) {
        /*
        r0 = 0;
        r1 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x002f }
        r2 = "r";
        r1.<init>(r5, r2);	 Catch:{ IOException -> 0x002f }
        r2 = r1.length();	 Catch:{ IOException -> 0x0028, all -> 0x0025 }
        r5 = (int) r2;	 Catch:{ IOException -> 0x0028, all -> 0x0025 }
        r5 = new byte[r5];	 Catch:{ IOException -> 0x0028, all -> 0x0025 }
        r1.readFully(r5);	 Catch:{ IOException -> 0x0020, all -> 0x0025 }
        r1.close();	 Catch:{ IOException -> 0x0020, all -> 0x0025 }
        r1.close();	 Catch:{ IOException -> 0x0019 }
        goto L_0x0043;
    L_0x0019:
        r0 = move-exception;
        r1 = "Exception while trying to close the InstallationFile";
        com.appsflyer.AFLogger.m3073a(r1, r0);
        goto L_0x0043;
    L_0x0020:
        r0 = move-exception;
        r4 = r1;
        r1 = r5;
        r5 = r0;
        goto L_0x002b;
    L_0x0025:
        r5 = move-exception;
        r0 = r1;
        goto L_0x004f;
    L_0x0028:
        r5 = move-exception;
        r4 = r1;
        r1 = r0;
    L_0x002b:
        r0 = r4;
        goto L_0x0031;
    L_0x002d:
        r5 = move-exception;
        goto L_0x004f;
    L_0x002f:
        r5 = move-exception;
        r1 = r0;
    L_0x0031:
        r2 = "Exception while reading InstallationFile: ";
        com.appsflyer.AFLogger.m3073a(r2, r5);	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x0042;
    L_0x0038:
        r0.close();	 Catch:{ IOException -> 0x003c }
        goto L_0x0042;
    L_0x003c:
        r5 = move-exception;
        r0 = "Exception while trying to close the InstallationFile";
        com.appsflyer.AFLogger.m3073a(r0, r5);
    L_0x0042:
        r5 = r1;
    L_0x0043:
        r0 = new java.lang.String;
        if (r5 == 0) goto L_0x0048;
    L_0x0047:
        goto L_0x004b;
    L_0x0048:
        r5 = 0;
        r5 = new byte[r5];
    L_0x004b:
        r0.<init>(r5);
        return r0;
    L_0x004f:
        if (r0 == 0) goto L_0x005b;
    L_0x0051:
        r0.close();	 Catch:{ IOException -> 0x0055 }
        goto L_0x005b;
    L_0x0055:
        r0 = move-exception;
        r1 = "Exception while trying to close the InstallationFile";
        com.appsflyer.AFLogger.m3073a(r1, r0);
    L_0x005b:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.z.a(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    private static String m3282b(WeakReference<Context> weakReference) throws NameNotFoundException {
        weakReference = ((Context) weakReference.get()).getPackageManager().getPackageInfo(((Context) weakReference.get()).getPackageName(), 0);
        if (VERSION.SDK_INT >= 9) {
            return C0961z.m3278a(weakReference.firstInstallTime);
        }
        return UUID.randomUUID().toString();
    }

    @NonNull
    /* renamed from: a */
    static String m3278a(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(j);
        stringBuilder.append("-");
        stringBuilder.append(Math.abs(new SecureRandom().nextLong()));
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private static String m3283c(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return null;
        }
        return ((Context) weakReference.get()).getSharedPreferences("appsflyer-data", 0).getString("AF_INSTALLATION", null);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private static void m3281a(WeakReference<Context> weakReference, String str) throws NameNotFoundException {
        weakReference = ((Context) weakReference.get()).getSharedPreferences("appsflyer-data", 0).edit();
        weakReference.putString("AF_INSTALLATION", str);
        if (VERSION.SDK_INT >= 9) {
            weakReference.apply();
        } else {
            weakReference.commit();
        }
    }
}
