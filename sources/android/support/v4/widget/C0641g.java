package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.g */
public final class C0641g {
    /* renamed from: a */
    private static final C0640b f1982a;

    /* renamed from: android.support.v4.widget.g$b */
    static class C0640b {
        C0640b() {
        }

        /* renamed from: a */
        public void mo628a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.widget.g$a */
    static class C2907a extends C0640b {
        C2907a() {
        }

        /* renamed from: a */
        public void mo628a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1982a = new C2907a();
        } else {
            f1982a = new C0640b();
        }
    }

    /* renamed from: a */
    public static void m2576a(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        f1982a.mo628a(edgeEffect, f, f2);
    }
}
