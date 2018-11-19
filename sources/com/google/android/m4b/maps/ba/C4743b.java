package com.google.android.m4b.maps.ba;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.ba.b */
public final class C4743b {
    /* renamed from: a */
    public static boolean f17387a;
    /* renamed from: b */
    public static final boolean f17388b;
    /* renamed from: c */
    public static final boolean f17389c;
    /* renamed from: d */
    public static final boolean f17390d;
    /* renamed from: e */
    private static final String[] f17391e = new String[]{"SOJU", "SOJUA", "SOJUK", "SOJU_L10N", "GT-I9000", "GT-I9000B", "GT-I9000M", "GT-I9000T", "SC-02B", "SGH-T959", "SGH-T959D", "SGH-T959V", "VIBRANT T959", "SHW-M110S", "SCH-I400", "SGH-I897", "SGH-I896"};
    /* renamed from: f */
    private static final String[] f17392f = new String[]{"RTGB", "SHADOW_VZW", "DAYTONA"};
    /* renamed from: g */
    private static final String[] f17393g = new String[]{"SHADOW_VZW", "DAYTONA", "SPYDER_VZW"};
    /* renamed from: h */
    private static final String[] f17394h = new String[]{"SHADOW", "DAYTONA", "SPYDER"};
    /* renamed from: i */
    private static final String[] f17395i = new String[]{"HTC_VISION"};
    /* renamed from: j */
    private static final String[] f17396j = new String[]{"HTC_MARVEL", "HTC_MARVELC", "MARVELC"};
    /* renamed from: k */
    private static final String[] f17397k = new String[]{"PASSION", "PASSION_KT", "PASSION_VF"};
    /* renamed from: l */
    private static final String[] f17398l = new String[]{"HTC_PYRAMID", "HTC_VIGOR"};
    /* renamed from: m */
    private static final String[] f17399m = new String[]{"SONY ERICSSON"};
    /* renamed from: n */
    private static final String[] f17400n = new String[]{"TG03", "F11EIF"};
    /* renamed from: o */
    private static boolean f17401o;
    /* renamed from: p */
    private static boolean f17402p;
    /* renamed from: q */
    private static boolean f17403q;
    /* renamed from: r */
    private static boolean f17404r;
    /* renamed from: s */
    private static boolean f17405s;
    /* renamed from: t */
    private static volatile String f17406t;
    /* renamed from: u */
    private static boolean f17407u;

    static {
        Object obj;
        Object toUpperCase = Build.PRODUCT == null ? "" : Build.PRODUCT.toUpperCase();
        Object toUpperCase2 = Build.BOARD == null ? "" : Build.BOARD.toUpperCase();
        if (Build.MANUFACTURER == null) {
            obj = "";
        } else {
            obj = Build.MANUFACTURER.toUpperCase();
        }
        boolean z = false;
        boolean z2 = Arrays.asList(f17391e).contains(toUpperCase) && !C4742a.m21084a();
        f17387a = z2;
        f17401o = Arrays.asList(f17395i).contains(toUpperCase);
        f17388b = Arrays.asList(f17392f).contains(toUpperCase);
        if (VERSION.SDK_INT == 10 && (Arrays.asList(f17393g).contains(toUpperCase) || Arrays.asList(f17394h).contains(toUpperCase2))) {
            z = true;
        }
        f17402p = z;
        f17403q = Arrays.asList(f17399m).contains(obj);
        f17389c = Arrays.asList(f17396j).contains(toUpperCase);
        f17390d = Arrays.asList(f17397k).contains(toUpperCase);
        f17404r = Arrays.asList(f17398l).contains(toUpperCase);
        f17405s = Arrays.asList(f17400n).contains(toUpperCase);
    }

    /* renamed from: a */
    public static void m21085a(String str) {
        f17406t = str;
    }

    /* renamed from: a */
    public static void m21086a(boolean z) {
        f17407u = z;
    }
}
