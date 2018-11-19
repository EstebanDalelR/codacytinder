package android.support.v4.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.app.C0387b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionChecker {

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    /* renamed from: a */
    public static int m1638a(@NonNull Context context, @NonNull String str, int i, int i2, @Nullable String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        str = C0387b.m1450a(str);
        if (str == null) {
            return 0;
        }
        if (str2 == null) {
            i2 = context.getPackageManager().getPackagesForUid(i2);
            if (i2 != 0) {
                if (i2.length > null) {
                    str2 = i2[0];
                }
            }
            return -1;
        }
        if (C0387b.m1449a(context, str, str2) != null) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m1637a(@NonNull Context context, @NonNull String str) {
        return m1638a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: b */
    public static int m1639b(@NonNull Context context, @NonNull String str) {
        return m1638a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
