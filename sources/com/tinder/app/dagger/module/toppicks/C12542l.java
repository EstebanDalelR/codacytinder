package com.tinder.app.dagger.module.toppicks;

import com.tinder.paywall.legacy.TopPicksPaywallViewFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.toppicks.l */
public final class C12542l implements Factory<TopPicksPaywallViewFactory> {
    /* renamed from: a */
    private final C8254a f40405a;

    public /* synthetic */ Object get() {
        return m49359a();
    }

    public C12542l(C8254a c8254a) {
        this.f40405a = c8254a;
    }

    /* renamed from: a */
    public TopPicksPaywallViewFactory m49359a() {
        return C12542l.m49356a(this.f40405a);
    }

    /* renamed from: a */
    public static TopPicksPaywallViewFactory m49356a(C8254a c8254a) {
        return C12542l.m49358c(c8254a);
    }

    /* renamed from: b */
    public static C12542l m49357b(C8254a c8254a) {
        return new C12542l(c8254a);
    }

    /* renamed from: c */
    public static TopPicksPaywallViewFactory m49358c(C8254a c8254a) {
        return (TopPicksPaywallViewFactory) C15521i.a(c8254a.m35236b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
