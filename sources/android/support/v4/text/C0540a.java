package android.support.v4.text;

import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: android.support.v4.text.a */
public final class C0540a {
    /* renamed from: a */
    private static Method f1674a;
    /* renamed from: b */
    private static Method f1675b;

    static {
        if (VERSION.SDK_INT >= 21) {
            try {
                f1675b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
                return;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f1674a = cls.getMethod("getScript", new Class[]{String.class});
                f1675b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e2) {
            f1674a = null;
            f1675b = null;
            Log.w("ICUCompat", e2);
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m1990a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f1675b.invoke(null, new Object[]{locale})).getScript();
            } catch (Throwable e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (Throwable e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String b = C0540a.m1991b(locale);
        if (b != null) {
            return C0540a.m1989a(b);
        }
        return null;
    }

    /* renamed from: a */
    private static String m1989a(String str) {
        try {
            if (f1674a != null) {
                return (String) f1674a.invoke(null, new Object[]{str});
            }
        } catch (String str2) {
            Log.w("ICUCompat", str2);
        } catch (String str22) {
            Log.w("ICUCompat", str22);
        }
        return null;
    }

    /* renamed from: b */
    private static String m1991b(Locale locale) {
        locale = locale.toString();
        try {
            if (f1675b != null) {
                return (String) f1675b.invoke(null, new Object[]{locale});
            }
        } catch (Throwable e) {
            Log.w("ICUCompat", e);
        } catch (Throwable e2) {
            Log.w("ICUCompat", e2);
        }
        return locale;
    }
}
