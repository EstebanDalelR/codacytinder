package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.analytics.C11131k;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.q */
public final class C12516q implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final C8251a f40346a;
    /* renamed from: b */
    private final Provider<C11131k> f40347b;

    public /* synthetic */ Object get() {
        return m49259a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49259a() {
        return C12516q.m49258a(this.f40346a, this.f40347b);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49258a(C8251a c8251a, Provider<C11131k> provider) {
        return C12516q.m49257a(c8251a, (C11131k) provider.get());
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49257a(C8251a c8251a, C11131k c11131k) {
        return (OnPageSelectedListener) C15521i.a(c8251a.m35212b(c11131k), "Cannot return null from a non-@Nullable @Provides method");
    }
}
