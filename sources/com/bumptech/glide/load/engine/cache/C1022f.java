package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.engine.cache.f */
public class C1022f {
    /* renamed from: a */
    private final int f2824a;
    /* renamed from: b */
    private final int f2825b;
    /* renamed from: c */
    private final Context f2826c;

    /* renamed from: com.bumptech.glide.load.engine.cache.f$b */
    interface C1021b {
        /* renamed from: a */
        int mo1309a();

        /* renamed from: b */
        int mo1310b();
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.f$a */
    private static class C3044a implements C1021b {
        /* renamed from: a */
        private final DisplayMetrics f9489a;

        public C3044a(DisplayMetrics displayMetrics) {
            this.f9489a = displayMetrics;
        }

        /* renamed from: a */
        public int mo1309a() {
            return this.f9489a.widthPixels;
        }

        /* renamed from: b */
        public int mo1310b() {
            return this.f9489a.heightPixels;
        }
    }

    public C1022f(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new C3044a(context.getResources().getDisplayMetrics()));
    }

    C1022f(Context context, ActivityManager activityManager, C1021b c1021b) {
        this.f2826c = context;
        int a = C1022f.m3556a(activityManager);
        int a2 = (c1021b.mo1309a() * c1021b.mo1310b()) * 4;
        c1021b = a2 * 4;
        a2 *= 2;
        int i = a2 + c1021b;
        if (i <= a) {
            this.f2825b = a2;
            this.f2824a = c1021b;
        } else {
            c1021b = Math.round(((float) a) / 6.0f);
            this.f2825b = c1021b * 2;
            this.f2824a = c1021b * 4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3) != null) {
            c1021b = "MemorySizeCalculator";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Calculated memory cache size: ");
            stringBuilder.append(m3557a(this.f2825b));
            stringBuilder.append(" pool size: ");
            stringBuilder.append(m3557a(this.f2824a));
            stringBuilder.append(" memory class limited? ");
            stringBuilder.append(i > a);
            stringBuilder.append(" max size: ");
            stringBuilder.append(m3557a(a));
            stringBuilder.append(" memoryClass: ");
            stringBuilder.append(activityManager.getMemoryClass());
            stringBuilder.append(" isLowMemoryDevice: ");
            stringBuilder.append(C1022f.m3558b(activityManager));
            Log.d(c1021b, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public int m3559a() {
        return this.f2825b;
    }

    /* renamed from: b */
    public int m3560b() {
        return this.f2824a;
    }

    /* renamed from: a */
    private static int m3556a(ActivityManager activityManager) {
        return Math.round(((float) ((activityManager.getMemoryClass() * 1024) * 1024)) * (C1022f.m3558b(activityManager) != null ? 1051260355 : 1053609165));
    }

    /* renamed from: a */
    private String m3557a(int i) {
        return Formatter.formatFileSize(this.f2826c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m3558b(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return VERSION.SDK_INT < 11 ? true : null;
    }
}
