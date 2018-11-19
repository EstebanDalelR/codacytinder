package com.tinder.analytics.attribution;

import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.analytics.fireworks.EventInterceptor;
import com.tinder.common.p077b.C2641a;
import java.util.Collections;
import java.util.Map;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.tinder.analytics.attribution.g */
public class C3916g implements EventInterceptor {
    /* renamed from: a */
    private final AttributionTracker f12203a;
    /* renamed from: b */
    private final g$a f12204b;

    @Inject
    public C3916g(AttributionTracker attributionTracker, g$a g_a) {
        this.f12203a = attributionTracker;
        this.f12204b = g_a;
    }

    @NotNull
    public C2632i intercept(@NotNull C2631a c2631a) {
        C2632i a = c2631a.m9864a();
        if (!m14679a(a)) {
            return a;
        }
        Map emptyMap = Collections.emptyMap();
        if (!C2641a.m9992a(a.m9870c())) {
            emptyMap = (Map) StreamSupport.a(a.m9870c().entrySet()).collect(Collectors.a(C7312h.f26433a, C7313i.f26434a));
        }
        String b = m14680b(a);
        this.f12203a.trackEvent(b, emptyMap);
        if (this.f12204b.b(b)) {
            this.f12203a.trackEvent("All.Purchase", emptyMap);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m14679a(@Nonnull C2632i c2632i) {
        return this.f12204b.a(c2632i.m9869b());
    }

    /* renamed from: b */
    private String m14680b(C2632i c2632i) {
        return c2632i.m9869b();
    }
}
