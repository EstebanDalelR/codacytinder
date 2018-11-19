package com.tinder.app.dagger.module.main;

import com.tinder.feed.p341b.C11695a;
import com.tinder.main.model.MainPage;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.v */
public final class C12521v implements Factory<MainPage> {
    /* renamed from: a */
    private final Provider<C11695a> f40356a;

    public /* synthetic */ Object get() {
        return m49278a();
    }

    public C12521v(Provider<C11695a> provider) {
        this.f40356a = provider;
    }

    /* renamed from: a */
    public MainPage m49278a() {
        return C12521v.m49276a(this.f40356a);
    }

    /* renamed from: a */
    public static MainPage m49276a(Provider<C11695a> provider) {
        return C12521v.m49275a((C11695a) provider.get());
    }

    /* renamed from: b */
    public static C12521v m49277b(Provider<C11695a> provider) {
        return new C12521v(provider);
    }

    /* renamed from: a */
    public static MainPage m49275a(C11695a c11695a) {
        return (MainPage) C15521i.a(MainViewModule.b(c11695a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
