package com.snapchat.kit.sdk.util;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.FileProvider;
import java.io.File;

public class SnapUtils {
    /* renamed from: a */
    private static boolean m25577a(int i) {
        return i >= SnapConstants.SNAPCHAT_MIN_VERSION_CODE;
    }

    public static boolean isSnapchatInstalled(android.content.pm.PackageManager r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = r2.getApplicationInfo(r3, r0);	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2.getPackageInfo(r3, r0);	 Catch:{ NameNotFoundException -> 0x0017 }
        r3 = r1.enabled;	 Catch:{ NameNotFoundException -> 0x0017 }
        if (r3 == 0) goto L_0x0016;	 Catch:{ NameNotFoundException -> 0x0017 }
    L_0x000d:
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = m25577a(r2);	 Catch:{ NameNotFoundException -> 0x0017 }
        if (r2 == 0) goto L_0x0016;
    L_0x0015:
        r0 = 1;
    L_0x0016:
        return r0;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.util.SnapUtils.isSnapchatInstalled(android.content.pm.PackageManager, java.lang.String):boolean");
    }

    public static String getFileProviderAuthority(@NonNull Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append(".fileprovider");
        return stringBuilder.toString();
    }

    @Nullable
    public static Uri getFileProviderUri(@NonNull Context context, @Nullable File file) {
        return file == null ? null : FileProvider.a(context, getFileProviderAuthority(context), file);
    }
}
