package com.leanplum.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesUtil {
    public static final String DEFAULT_STRING_VALUE = "";

    /* renamed from: a */
    private static SharedPreferences m9745a(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static void commitChanges(android.content.SharedPreferences.Editor r0) {
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
        r0.apply();	 Catch:{ NoSuchMethodError -> 0x0004 }
        return;
    L_0x0004:
        r0.commit();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.utils.SharedPreferencesUtil.commitChanges(android.content.SharedPreferences$Editor):void");
    }

    public static String getString(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static void setString(Context context, String str, String str2, String str3) {
        context = context.getSharedPreferences(str, 0).edit();
        context.putString(str2, str3);
        commitChanges(context);
    }
}
