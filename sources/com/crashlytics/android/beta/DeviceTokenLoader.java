package com.crashlytics.android.beta;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import io.fabric.sdk.android.services.cache.ValueLoader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipInputStream;

public class DeviceTokenLoader implements ValueLoader<String> {
    private static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
    private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = "assets/com.crashlytics.android.beta/dirfactor-device-token=";

    public java.lang.String load(android.content.Context r9) throws java.lang.Exception {
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
        r0 = java.lang.System.nanoTime();
        r2 = "";
        r3 = 0;
        r4 = "io.crash.air";	 Catch:{ NameNotFoundException -> 0x005b, FileNotFoundException -> 0x0049, IOException -> 0x0037 }
        r9 = r8.getZipInputStreamOfApkFrom(r9, r4);	 Catch:{ NameNotFoundException -> 0x005b, FileNotFoundException -> 0x0049, IOException -> 0x0037 }
        r3 = r8.determineDeviceToken(r9);	 Catch:{ NameNotFoundException -> 0x0033, FileNotFoundException -> 0x002e, IOException -> 0x0029, all -> 0x0025 }
        if (r9 == 0) goto L_0x0023;
    L_0x0013:
        r9.close();	 Catch:{ IOException -> 0x0017 }
        goto L_0x0023;
    L_0x0017:
        r9 = move-exception;
        r2 = io.fabric.sdk.android.C15608c.h();
        r4 = "Beta";
        r5 = "Failed to close the APK file";
        r2.e(r4, r5, r9);
    L_0x0023:
        r2 = r3;
        goto L_0x0078;
    L_0x0025:
        r0 = move-exception;
        r3 = r9;
        goto L_0x00a5;
    L_0x0029:
        r3 = move-exception;
        r7 = r3;
        r3 = r9;
        r9 = r7;
        goto L_0x0038;
    L_0x002e:
        r3 = move-exception;
        r7 = r3;
        r3 = r9;
        r9 = r7;
        goto L_0x004a;
    L_0x0033:
        r3 = r9;
        goto L_0x005b;
    L_0x0035:
        r0 = move-exception;
        goto L_0x00a5;
    L_0x0037:
        r9 = move-exception;
    L_0x0038:
        r4 = io.fabric.sdk.android.C15608c.h();	 Catch:{ all -> 0x0035 }
        r5 = "Beta";	 Catch:{ all -> 0x0035 }
        r6 = "Failed to read the APK file";	 Catch:{ all -> 0x0035 }
        r4.e(r5, r6, r9);	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x0078;
    L_0x0045:
        r3.close();	 Catch:{ IOException -> 0x006c }
        goto L_0x0078;
    L_0x0049:
        r9 = move-exception;
    L_0x004a:
        r4 = io.fabric.sdk.android.C15608c.h();	 Catch:{ all -> 0x0035 }
        r5 = "Beta";	 Catch:{ all -> 0x0035 }
        r6 = "Failed to find the APK file";	 Catch:{ all -> 0x0035 }
        r4.e(r5, r6, r9);	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x0078;
    L_0x0057:
        r3.close();	 Catch:{ IOException -> 0x006c }
        goto L_0x0078;
    L_0x005b:
        r9 = io.fabric.sdk.android.C15608c.h();	 Catch:{ all -> 0x0035 }
        r4 = "Beta";	 Catch:{ all -> 0x0035 }
        r5 = "Beta by Crashlytics app is not installed";	 Catch:{ all -> 0x0035 }
        r9.d(r4, r5);	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x0078;
    L_0x0068:
        r3.close();	 Catch:{ IOException -> 0x006c }
        goto L_0x0078;
    L_0x006c:
        r9 = move-exception;
        r3 = io.fabric.sdk.android.C15608c.h();
        r4 = "Beta";
        r5 = "Failed to close the APK file";
        r3.e(r4, r5, r9);
    L_0x0078:
        r3 = java.lang.System.nanoTime();
        r5 = r3 - r0;
        r0 = (double) r5;
        r3 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r0 = r0 / r3;
        r9 = io.fabric.sdk.android.C15608c.h();
        r3 = "Beta";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Beta device token load took ";
        r4.append(r5);
        r4.append(r0);
        r0 = "ms";
        r4.append(r0);
        r0 = r4.toString();
        r9.d(r3, r0);
        return r2;
    L_0x00a5:
        if (r3 == 0) goto L_0x00b7;
    L_0x00a7:
        r3.close();	 Catch:{ IOException -> 0x00ab }
        goto L_0x00b7;
    L_0x00ab:
        r9 = move-exception;
        r1 = io.fabric.sdk.android.C15608c.h();
        r2 = "Beta";
        r3 = "Failed to close the APK file";
        r1.e(r2, r3, r9);
    L_0x00b7:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.beta.DeviceTokenLoader.load(android.content.Context):java.lang.String");
    }

    ZipInputStream getZipInputStreamOfApkFrom(Context context, String str) throws NameNotFoundException, FileNotFoundException {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
    }

    String determineDeviceToken(ZipInputStream zipInputStream) throws IOException {
        zipInputStream = zipInputStream.getNextEntry();
        if (zipInputStream != null) {
            zipInputStream = zipInputStream.getName();
            if (zipInputStream.startsWith(DIRFACTOR_DEVICE_TOKEN_PREFIX)) {
                return zipInputStream.substring(DIRFACTOR_DEVICE_TOKEN_PREFIX.length(), zipInputStream.length() - 1);
            }
        }
        return "";
    }
}
