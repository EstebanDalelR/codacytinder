package com.tinder.managers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.content.C0432b;
import com.tinder.module.ForApplication;
import javax.inject.Inject;

public class bt {
    /* renamed from: a */
    private final Context f32604a;

    @Inject
    public bt(@ForApplication Context context) {
        this.f32604a = context;
    }

    /* renamed from: a */
    public boolean m40514a() {
        return VERSION.SDK_INT >= 23;
    }

    /* renamed from: b */
    public boolean m40517b() {
        return m40515a("android.permission.ACCESS_COARSE_LOCATION");
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    public boolean m40518c() {
        return m40514a() ? m40515a("android.permission.READ_EXTERNAL_STORAGE") : true;
    }

    /* renamed from: a */
    public boolean m40515a(String str) {
        return C0432b.b(this.f32604a, str) == null ? true : null;
    }

    /* renamed from: a */
    public boolean m40516a(int[] iArr) {
        if (iArr == null) {
            throw new NullPointerException("grant results is null.");
        } else if (iArr.length < 1) {
            return false;
        } else {
            for (int i : iArr) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
