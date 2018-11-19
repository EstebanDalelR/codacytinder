package com.tinder.session.usecase;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.aw;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/session/usecase/AppSessionAnalyticsReporter;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "sendSessionEndEvent", "", "sendSessionEvent", "action", "", "sendSessionStartEvent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.usecase.a */
public final class C14835a {
    /* renamed from: a */
    private final C2630h f46448a;

    @Inject
    public C14835a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f46448a = c2630h;
    }

    /* renamed from: a */
    public final void m56204a() {
        m56203a(C14836b.f46449a);
    }

    /* renamed from: a */
    private final void m56203a(String str) {
        this.f46448a.a(aw.a().a(str).a());
    }
}
