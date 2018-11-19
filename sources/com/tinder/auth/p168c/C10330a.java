package com.tinder.auth.p168c;

import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.analytics.fireworks.C2633r;
import com.tinder.analytics.fireworks.EventInterceptor;
import com.tinder.common.provider.C2643c;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/tinder/auth/usecase/AuthAnalyticsInterceptor;", "Lcom/tinder/analytics/fireworks/EventInterceptor;", "localeProvider", "Lcom/tinder/common/provider/DefaultLocaleProvider;", "(Lcom/tinder/common/provider/DefaultLocaleProvider;)V", "country", "Lcom/tinder/analytics/fireworks/FireworksField;", "getCountry", "()Lcom/tinder/analytics/fireworks/FireworksField;", "version", "getVersion", "intercept", "Lcom/tinder/analytics/fireworks/FireworksEvent;", "builder", "Lcom/tinder/analytics/fireworks/FireworksEvent$Builder;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.c.a */
public final class C10330a implements EventInterceptor {
    @NotNull
    /* renamed from: a */
    private final C2633r f33736a = C2633r.a("version", String.class);
    @NotNull
    /* renamed from: b */
    private final C2633r f33737b = C2633r.a("localeCountry", String.class);
    /* renamed from: c */
    private final C2643c f33738c;

    @Inject
    public C10330a(@NotNull C2643c c2643c) {
        C2668g.b(c2643c, "localeProvider");
        this.f33738c = c2643c;
    }

    @NotNull
    public C2632i intercept(@NotNull C2631a c2631a) {
        C2668g.b(c2631a, "builder");
        c2631a = c2631a.a();
        C2668g.a(c2631a, "event");
        if ((C2668g.a("App.Session", c2631a.b()) ^ 1) != 0) {
            return c2631a;
        }
        c2631a = c2631a.a();
        c2631a.a(this.f33736a, "authV2");
        c2631a.a(this.f33737b, this.f33738c.a().getCountry());
        c2631a = c2631a.a();
        C2668g.a(c2631a, "newBuilder.build()");
        return c2631a;
    }
}
