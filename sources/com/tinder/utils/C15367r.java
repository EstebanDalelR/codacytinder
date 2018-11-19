package com.tinder.utils;

import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;

@Deprecated
/* renamed from: com.tinder.utils.r */
public class C15367r {
    /* renamed from: a */
    public static int m57677a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = android.os.Build.VERSION.SDK;	 Catch:{ Throwable -> 0x0007 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Throwable -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.utils.r.a():int");
    }

    /* renamed from: b */
    public static String m57678b() {
        return Build.MANUFACTURER;
    }

    /* renamed from: c */
    public static String m57679c() {
        return Build.MODEL;
    }

    @NonNull
    /* renamed from: d */
    public static String m57680d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Android ");
        stringBuilder.append(VERSION.RELEASE);
        return stringBuilder.toString();
    }
}
