package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ad;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class be {
    /* renamed from: a */
    private final Set<bb<?>> f7493a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static <L> bb<L> m8975a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        ad.m9046a((Object) l, (Object) "Listener must not be null");
        ad.m9046a((Object) looper, (Object) "Looper must not be null");
        ad.m9046a((Object) str, (Object) "Listener type must not be null");
        return new bb(looper, l, str);
    }

    /* renamed from: a */
    public static <L> bd<L> m8976a(@NonNull L l, @NonNull String str) {
        ad.m9046a((Object) l, (Object) "Listener must not be null");
        ad.m9046a((Object) str, (Object) "Listener type must not be null");
        ad.m9048a(str, (Object) "Listener type must not be empty");
        return new bd(l, str);
    }

    /* renamed from: a */
    public final void m8977a() {
        for (bb a : this.f7493a) {
            a.m8971a();
        }
        this.f7493a.clear();
    }
}
