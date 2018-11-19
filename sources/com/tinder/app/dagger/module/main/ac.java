package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.profiletab.p367a.C14458a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ac implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final Provider<C14458a> f40299a;

    public /* synthetic */ Object get() {
        return m49185a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49185a() {
        return m49184a(this.f40299a);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49184a(Provider<C14458a> provider) {
        return m49183a((C14458a) provider.get());
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49183a(C14458a c14458a) {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(c14458a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
