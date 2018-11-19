package dagger.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: dagger.internal.a */
public final class C15514a {
    /* renamed from: d */
    private static int m57992d(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: a */
    public static <T> List<T> m57988a(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* renamed from: a */
    public static boolean m57989a(List<?> list) {
        boolean z = false;
        if (list.size() < 2) {
            return false;
        }
        if (list.size() != new HashSet(list).size()) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    static <T> HashSet<T> m57990b(int i) {
        return new HashSet(C15514a.m57992d(i));
    }

    /* renamed from: c */
    static <K, V> LinkedHashMap<K, V> m57991c(int i) {
        return new LinkedHashMap(C15514a.m57992d(i));
    }
}
