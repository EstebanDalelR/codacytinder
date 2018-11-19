package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.home.p259b.C9695a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ag implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final Provider<C9695a> f40306a;

    public /* synthetic */ Object get() {
        return m49200a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49200a() {
        return m49199a(this.f40306a);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49199a(Provider<C9695a> provider) {
        return m49198a((C9695a) provider.get());
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49198a(C9695a c9695a) {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(c9695a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
