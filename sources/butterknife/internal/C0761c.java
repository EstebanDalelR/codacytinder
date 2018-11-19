package butterknife.internal;

import android.support.annotation.IdRes;
import android.util.TypedValue;
import android.view.View;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: butterknife.internal.c */
public final class C0761c {
    /* renamed from: a */
    private static final TypedValue f2070a = new TypedValue();

    @SafeVarargs
    /* renamed from: a */
    public static <T> List<T> m2683a(T... tArr) {
        return new C0760b(C0761c.m2685b(tArr));
    }

    /* renamed from: b */
    private static <T> T[] m2685b(T[] tArr) {
        int i = 0;
        for (T t : tArr) {
            if (t != null) {
                int i2 = i + 1;
                tArr[i] = t;
                i = i2;
            }
        }
        if (i == r0) {
            return tArr;
        }
        Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
        System.arraycopy(tArr, 0, objArr, 0, i);
        return objArr;
    }

    /* renamed from: a */
    public static <T> T m2680a(View view, @IdRes int i, String str, Class<T> cls) {
        return C0761c.m2686c(view.findViewById(i), i, str, cls);
    }

    /* renamed from: a */
    public static View m2679a(View view, @IdRes int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        view = C0761c.m2682a(view, i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Required view '");
        stringBuilder.append(view);
        stringBuilder.append("' with ID ");
        stringBuilder.append(i);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static <T> T m2684b(View view, @IdRes int i, String str, Class<T> cls) {
        return C0761c.m2686c(C0761c.m2679a(view, i, str), i, str, cls);
    }

    /* renamed from: c */
    public static <T> T m2686c(View view, @IdRes int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (Class<T> cls2) {
            view = C0761c.m2682a(view, i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View '");
            stringBuilder.append(view);
            stringBuilder.append("' with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" for ");
            stringBuilder.append(str);
            stringBuilder.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(stringBuilder.toString(), cls2);
        }
    }

    /* renamed from: a */
    public static <T> T m2681a(Object obj, String str, int i, String str2, int i2, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (Object obj2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Parameter #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of method '");
            stringBuilder.append(str);
            stringBuilder.append("' was of the wrong type for parameter #");
            stringBuilder.append(i2 + 1);
            stringBuilder.append(" of method '");
            stringBuilder.append(str2);
            stringBuilder.append("'. See cause for more info.");
            throw new IllegalStateException(stringBuilder.toString(), obj2);
        }
    }

    /* renamed from: a */
    private static String m2682a(View view, @IdRes int i) {
        if (view.isInEditMode()) {
            return "<unavailable while editing>";
        }
        return view.getContext().getResources().getResourceEntryName(i);
    }
}
