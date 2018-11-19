package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.match.provider.C9876b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.x */
public final class C12523x implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final Provider<C9876b> f40361a;

    public /* synthetic */ Object get() {
        return m49285a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49285a() {
        return C12523x.m49284a(this.f40361a);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49284a(Provider<C9876b> provider) {
        return C12523x.m49283a((C9876b) provider.get());
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49283a(C9876b c9876b) {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(c9876b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
