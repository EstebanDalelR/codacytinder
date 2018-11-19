package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.f */
public final class C0390f {

    /* renamed from: android.support.v4.app.f$a */
    static class C0389a {
        /* renamed from: a */
        private static Method f1322a;
        /* renamed from: b */
        private static boolean f1323b;
        /* renamed from: c */
        private static Method f1324c;
        /* renamed from: d */
        private static boolean f1325d;

        /* renamed from: a */
        public static IBinder m1451a(Bundle bundle, String str) {
            if (!f1323b) {
                try {
                    f1322a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1322a.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f1323b = true;
            }
            if (f1322a != null) {
                try {
                    return (IBinder) f1322a.invoke(bundle, new Object[]{str});
                } catch (Bundle bundle2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", bundle2);
                    f1322a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1452a(Bundle bundle, String str, IBinder iBinder) {
            if (!f1325d) {
                try {
                    f1324c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1324c.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f1325d = true;
            }
            if (f1324c != null) {
                try {
                    f1324c.invoke(bundle, new Object[]{str, iBinder});
                } catch (Bundle bundle2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", bundle2);
                    f1324c = null;
                }
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static IBinder m1453a(@NonNull Bundle bundle, @Nullable String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0389a.m1451a(bundle, str);
    }

    /* renamed from: a */
    public static void m1454a(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0389a.m1452a(bundle, str, iBinder);
        }
    }
}
