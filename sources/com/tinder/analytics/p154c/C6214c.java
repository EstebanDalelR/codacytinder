package com.tinder.analytics.p154c;

import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.p153b.C6211a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/analytics/usecase/TrackSuperlikeableUsedEvent;", "", "crmEventTracker", "Lcom/tinder/analytics/CrmEventTracker;", "(Lcom/tinder/analytics/CrmEventTracker;)V", "execute", "", "analytics_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.c.c */
public final class C6214c {
    /* renamed from: a */
    private final CrmEventTracker f22777a;

    @Inject
    public C6214c(@NotNull CrmEventTracker crmEventTracker) {
        C2668g.b(crmEventTracker, "crmEventTracker");
        this.f22777a = crmEventTracker;
    }

    /* renamed from: a */
    public final void m26843a() {
        this.f22777a.trackEvent(new C6211a("Superlikeable.Used", null, 2, null));
    }
}
