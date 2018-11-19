package com.tinder.analytics.p153b;

import android.support.annotation.NonNull;
import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.analytics.fireworks.EventInterceptor;
import com.tinder.analytics.p152a.C6208a;
import javax.inject.Inject;

/* renamed from: com.tinder.analytics.b.d */
public class C7317d implements EventInterceptor {
    @NonNull
    /* renamed from: a */
    private final CrmEventTracker f26438a;
    /* renamed from: b */
    private final C6208a f26439b;

    @Inject
    C7317d(@NonNull CrmEventTracker crmEventTracker, C6208a c6208a) {
        this.f26438a = crmEventTracker;
        this.f26439b = c6208a;
    }

    @NonNull
    public C2632i intercept(@NonNull C2631a c2631a) {
        c2631a = c2631a.a();
        this.f26438a.trackEvent(this.f26439b.m26834a(c2631a));
        return c2631a;
    }
}
