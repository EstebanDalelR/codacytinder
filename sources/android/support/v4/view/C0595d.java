package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.d */
public final class C0595d {
    /* renamed from: a */
    static final C0594b f1793a;
    /* renamed from: b */
    private static Field f1794b;
    /* renamed from: c */
    private static boolean f1795c;

    /* renamed from: android.support.v4.view.d$b */
    static class C0594b {
        C0594b() {
        }

        /* renamed from: a */
        public void mo595a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                C0595d.m2316a(layoutInflater, (Factory2) factory);
            } else {
                C0595d.m2316a(layoutInflater, factory2);
            }
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.view.d$a */
    static class C2895a extends C0594b {
        C2895a() {
        }

        /* renamed from: a */
        public void mo595a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: a */
    static void m2316a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1795c) {
            try {
                f1794b = LayoutInflater.class.getDeclaredField("mFactory2");
                f1794b.setAccessible(true);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                stringBuilder.append(LayoutInflater.class.getName());
                stringBuilder.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder.toString(), e);
            }
            f1795c = true;
        }
        if (f1794b != null) {
            try {
                f1794b.set(layoutInflater, factory2);
            } catch (Factory2 factory22) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                stringBuilder2.append(layoutInflater);
                stringBuilder2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder2.toString(), factory22);
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1793a = new C2895a();
        } else {
            f1793a = new C0594b();
        }
    }

    /* renamed from: b */
    public static void m2317b(@NonNull LayoutInflater layoutInflater, @NonNull Factory2 factory2) {
        f1793a.mo595a(layoutInflater, factory2);
    }
}
