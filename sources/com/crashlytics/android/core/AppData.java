package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import io.fabric.sdk.android.services.common.IdManager;

class AppData {
    public final String apiKey;
    public final String buildId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public static AppData create(Context context, IdManager idManager, String str, String str2) throws NameNotFoundException {
        String packageName = context.getPackageName();
        String i = idManager.i();
        context = context.getPackageManager().getPackageInfo(packageName, null);
        return new AppData(str, str2, i, packageName, Integer.toString(context.versionCode), context.versionName == null ? "0.0" : context.versionName);
    }

    AppData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.apiKey = str;
        this.buildId = str2;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
    }
}
