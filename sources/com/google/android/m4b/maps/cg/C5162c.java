package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Bundle;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.p113m.C5475a;

/* renamed from: com.google.android.m4b.maps.cg.c */
public final class C5162c {
    /* renamed from: a */
    private static final String[] f19162a = new String[]{"anthias", "carp", "smelt", "sparrow", "sprat", "tetra", "wren"};
    /* renamed from: b */
    private boolean f19163b = false;
    /* renamed from: c */
    private final boolean f19164c;
    /* renamed from: d */
    private final C5161a f19165d;

    /* renamed from: com.google.android.m4b.maps.cg.c$a */
    static class C5161a {
        /* renamed from: a */
        private final SharedPreferences f19161a;

        C5161a(Context context) {
            this.f19161a = context.getSharedPreferences("com.google.maps.api.android.lib6.impl.PREFERENCES_FILE", 0);
        }

        /* renamed from: a */
        public final boolean m23072a() {
            return this.f19161a.contains("IsLowBitDisplay");
        }

        /* renamed from: b */
        public final boolean m23073b() {
            return this.f19161a.getBoolean("IsLowBitDisplay", false);
        }

        /* renamed from: a */
        public final void m23071a(boolean z) {
            Editor edit = this.f19161a.edit();
            edit.putBoolean("IsLowBitDisplay", z);
            edit.commit();
        }
    }

    /* renamed from: a */
    public static C5162c m23074a(Context context) {
        return C5475a.m23830a(context) ? new C5162c(new C5161a(context)) : null;
    }

    private C5162c(C5161a c5161a) {
        this.f19165d = c5161a;
        if (this.f19165d.m23072a() != null) {
            this.f19164c = this.f19165d.m23073b();
        } else {
            this.f19164c = C5162c.m23075a(Build.DEVICE);
        }
    }

    /* renamed from: a */
    private static boolean m23075a(String str) {
        String[] strArr = f19162a;
        for (int i = 0; i < 7; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m23077a() {
        return this.f19163b;
    }

    /* renamed from: b */
    public final String m23078b() {
        return this.f19164c ? "RoadmapAmbiactiveLowBit" : "RoadmapAmbiactive";
    }

    /* renamed from: c */
    public final bg m23079c() {
        return this.f19164c ? bg.f17770z : bg.f17769y;
    }

    /* renamed from: a */
    public final void m23076a(Bundle bundle) {
        if (bundle != null) {
            this.f19165d.m23071a(bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
        this.f19163b = true;
    }

    /* renamed from: d */
    public final void m23080d() {
        this.f19163b = false;
    }
}
