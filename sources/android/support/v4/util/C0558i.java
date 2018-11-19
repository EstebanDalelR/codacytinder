package android.support.v4.util;

import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import java.util.Objects;

/* renamed from: android.support.v4.util.i */
public class C0558i {
    /* renamed from: a */
    public static boolean m2057a(@Nullable Object obj, @Nullable Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                obj = null;
                return obj;
            }
        }
        obj = true;
        return obj;
    }
}
