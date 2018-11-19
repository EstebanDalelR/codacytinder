package com.tinder.base.p174d.p175a;

import android.util.LruCache;
import com.tinder.base.p174d.p175a.C8307c.C8306a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0007J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/base/network/interceptor/ImagePerformanceCache;", "", "maxCapacity", "", "(I)V", "performanceCache", "Landroid/util/LruCache;", "", "Lcom/tinder/base/network/interceptor/ImagePerformance;", "getMeasuredTimes", "urlPath", "recordUrlPerformanceTime", "", "time", "", "statusCode", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.d.a.d */
public final class C8308d {
    /* renamed from: a */
    private final LruCache<String, C8307c> f29587a;

    public C8308d(int i) {
        this.f29587a = new LruCache(i);
    }

    @Nullable
    /* renamed from: a */
    public final C8307c m35404a(@NotNull String str) {
        C2668g.b(str, "urlPath");
        return (C8307c) this.f29587a.get(str);
    }

    /* renamed from: a */
    public final void m35405a(@NotNull String str, long j, int i) {
        C2668g.b(str, "urlPath");
        C8307c c8307c = (C8307c) this.f29587a.get(str);
        if (c8307c != null) {
            List d = C19301m.d(c8307c.m35403a());
            d.add(new C8306a(j, i));
            j = new C8307c(str, d);
        } else {
            j = new C8307c(str, C19301m.a(new C8306a(j, i)));
        }
        this.f29587a.put(str, j);
    }
}
