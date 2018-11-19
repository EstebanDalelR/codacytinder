package android.support.v4.text;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: android.support.v4.text.c */
public final class C0543c {
    /* renamed from: a */
    private static final Locale f1682a = new Locale("", "");

    /* renamed from: a */
    public static int m1995a(@Nullable Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(f1682a))) {
            String a = C0540a.m1990a(locale);
            if (a == null) {
                return C0543c.m1996b(locale);
            }
            if (!(a.equalsIgnoreCase("Arab") == null && a.equalsIgnoreCase("Hebr") == null)) {
                return 1;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m1996b(@NonNull Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }
}
