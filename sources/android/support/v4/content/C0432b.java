package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.content.b */
public class C0432b {
    /* renamed from: a */
    private static final Object f1460a = new Object();
    /* renamed from: b */
    private static TypedValue f1461b;

    /* renamed from: a */
    public static boolean m1642a(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: a */
    public static void m1641a(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    @NonNull
    /* renamed from: a */
    public static File[] m1644a(@NonNull Context context, @Nullable String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    @NonNull
    /* renamed from: a */
    public static File[] m1643a(@NonNull Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    @Nullable
    /* renamed from: a */
    public static Drawable m1640a(@NonNull Context context, @DrawableRes int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f1460a) {
            if (f1461b == null) {
                f1461b = new TypedValue();
            }
            context.getResources().getValue(i, f1461b, true);
            i = f1461b.resourceId;
        }
        return context.getResources().getDrawable(i);
    }

    @Nullable
    /* renamed from: b */
    public static ColorStateList m1646b(@NonNull Context context, @ColorRes int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    @ColorInt
    /* renamed from: c */
    public static int m1647c(@NonNull Context context, @ColorRes int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static int m1645b(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
