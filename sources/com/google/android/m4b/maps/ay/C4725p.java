package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.ap.C4658e;
import com.google.android.m4b.maps.aq.C7435a;
import com.google.android.m4b.maps.at.C4670c;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5579p;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.ay.p */
public final class C4725p {
    /* renamed from: a */
    private static boolean f17345a;
    /* renamed from: b */
    private static volatile boolean f17346b;
    /* renamed from: c */
    private static volatile boolean f17347c;
    /* renamed from: d */
    private static volatile int f17348d;
    /* renamed from: e */
    private static volatile float f17349e;
    /* renamed from: f */
    private static volatile float f17350f;
    /* renamed from: g */
    private static volatile float f17351g;
    /* renamed from: h */
    private static volatile C4727s f17352h;
    /* renamed from: i */
    private static volatile C4658e f17353i;
    /* renamed from: j */
    private static boolean f17354j;

    /* renamed from: a */
    public static void m21023a(Context context) {
        String[] split = "en ar bg ca cs da de el en_GB es es_MX et fi fr hr hu it iw ja ko lt lv nl no pl pt_BR pt_PT ro ru sk sl sr sv tl tr uk vi zh zh_CN".split(" ");
        boolean z = false;
        if (VERSION.SDK_INT < 14) {
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                Object obj;
                String d = C4727s.m21042d(C4727s.m21040a(str));
                if (!(d.equals("ar") || d.equals("fa"))) {
                    if (!d.equals("iw")) {
                        obj = null;
                        if (obj == null) {
                            arrayList.add(str);
                        }
                    }
                }
                obj = 1;
                if (obj == null) {
                    arrayList.add(str);
                }
            }
            split = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        C4727s c4727s = new C4727s(null);
        String locale = Locale.getDefault().toString();
        c4727s.m21046b(locale);
        String a = C4727s.m21041a(locale, split);
        locale = C4727s.m21043e(locale);
        if (C4725p.m21024a(C4727s.m21043e(a)) && !C4725p.m21024a(locale)) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(locale).length());
            stringBuilder.append(a);
            stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
            stringBuilder.append(locale);
            a = stringBuilder.toString();
        }
        c4727s.m21047c(a);
        f17352h = c4727s;
        PackageManager packageManager = context.getPackageManager();
        f17346b = packageManager.hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        f17347c = packageManager.hasSystemFeature("android.hardware.touchscreen.multitouch");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f17348d = displayMetrics.densityDpi;
        f17349e = displayMetrics.density;
        float f = (float) f17348d;
        if (((double) (Math.abs(displayMetrics.xdpi - f) / f)) <= 0.25d) {
            if (((double) (Math.abs(displayMetrics.ydpi - f) / f)) <= 0.25d) {
                f17350f = displayMetrics.xdpi;
                f17351g = displayMetrics.ydpi;
                if (Math.hypot((double) (((float) displayMetrics.widthPixels) / f17350f), (double) (((float) displayMetrics.heightPixels) / f17351g)) >= 7.0d) {
                    z = true;
                }
                f17345a = z;
                f17353i = new C7435a(context);
                f17354j = context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            }
        }
        f17350f = f;
        f17351g = f;
        if (Math.hypot((double) (((float) displayMetrics.widthPixels) / f17350f), (double) (((float) displayMetrics.heightPixels) / f17351g)) >= 7.0d) {
            z = true;
        }
        f17345a = z;
        f17353i = new C7435a(context);
        f17354j = context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* renamed from: a */
    public static String m21022a() {
        return f17352h.m21045a();
    }

    /* renamed from: c */
    public static C4658e m21026c() {
        return f17353i;
    }

    /* renamed from: d */
    public static int m21027d() {
        return f17348d;
    }

    /* renamed from: e */
    public static float m21028e() {
        return f17350f;
    }

    /* renamed from: f */
    public static float m21029f() {
        return f17351g;
    }

    /* renamed from: g */
    public static double m21030g() {
        return (double) f17349e;
    }

    /* renamed from: i */
    public static boolean m21032i() {
        return f17346b;
    }

    /* renamed from: a */
    private static boolean m21024a(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static String m21033j() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        str = String.valueOf(str.replace('-', '_'));
        str2 = String.valueOf(str2.replace('-', '_'));
        str3 = String.valueOf(str3.replace('-', '_'));
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 10) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("android:");
        stringBuilder.append(str);
        stringBuilder.append("-");
        stringBuilder.append(str2);
        stringBuilder.append("-");
        stringBuilder.append(str3);
        str = stringBuilder.toString();
        return f17354j ? String.valueOf(str).concat("-wear") : str;
    }

    /* renamed from: a */
    public static PackageInfo m21021a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Context context2) {
            throw new AssertionError(context2);
        }
    }

    /* renamed from: k */
    public static boolean m21034k() {
        return f17345a;
    }

    /* renamed from: l */
    public static boolean m21035l() {
        return !f17354j;
    }

    /* renamed from: m */
    public static boolean m21036m() {
        return f17354j;
    }

    /* renamed from: n */
    public static boolean m21037n() {
        return f17345a;
    }

    /* renamed from: b */
    public static String m21025b() {
        Object a = f17352h.m21045a();
        C5571j.m24292a(a);
        Locale locale = new Locale(C5579p.m24318a(C4727s.m21042d(a)), C5579p.m24318a(C4727s.m21043e(a)));
        if (VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            stringBuilder.append('-');
            stringBuilder.append(country);
        }
        country = locale.getVariant();
        if (!country.isEmpty()) {
            stringBuilder.append('-');
            stringBuilder.append(country);
        }
        return stringBuilder.toString();
    }

    /* renamed from: h */
    public static boolean m21031h() {
        return f17348d > Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    }

    /* renamed from: a */
    public static int m21020a(int i) {
        return C4670c.m20881a(((double) f17349e) * 20.0d);
    }
}
