package com.tinder.app.dagger.module.main;

import com.tinder.feed.p341b.C11695a;
import com.tinder.main.model.MainPage;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;

public final class ad implements Factory<List<MainPage>> {
    /* renamed from: a */
    private final Provider<C11695a> f40300a;

    public /* synthetic */ Object get() {
        return m49189a();
    }

    public ad(Provider<C11695a> provider) {
        this.f40300a = provider;
    }

    /* renamed from: a */
    public List<MainPage> m49189a() {
        return m49187a(this.f40300a);
    }

    /* renamed from: a */
    public static List<MainPage> m49187a(Provider<C11695a> provider) {
        return m49186a((C11695a) provider.get());
    }

    /* renamed from: b */
    public static ad m49188b(Provider<C11695a> provider) {
        return new ad(provider);
    }

    /* renamed from: a */
    public static List<MainPage> m49186a(C11695a c11695a) {
        return (List) C15521i.a(MainViewModule.a(c11695a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
