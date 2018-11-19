package com.tinder.common.p077b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* renamed from: com.tinder.common.b.a */
public class C2641a {
    /* renamed from: a */
    public static boolean m9991a(Collection<?> collection) {
        if (collection != null) {
            if (collection.isEmpty() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m9992a(Map<?, ?> map) {
        if (map != null) {
            if (map.isEmpty() == null) {
                return null;
            }
        }
        return true;
    }

    @Nonnull
    /* renamed from: a */
    public static <T> List<T> m9990a(@Nonnull List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }
}
