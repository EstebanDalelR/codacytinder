package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.main.model.MainPage;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.z */
public final class C12525z implements Factory<Set<OnPageSelectedListener>> {
    /* renamed from: a */
    private final Provider<List<MainPage>> f40363a;
    /* renamed from: b */
    private final Provider<Map<MainPage, OnPageSelectedListener>> f40364b;

    public /* synthetic */ Object get() {
        return m49292a();
    }

    /* renamed from: a */
    public Set<OnPageSelectedListener> m49292a() {
        return C12525z.m49291a(this.f40363a, this.f40364b);
    }

    /* renamed from: a */
    public static Set<OnPageSelectedListener> m49291a(Provider<List<MainPage>> provider, Provider<Map<MainPage, OnPageSelectedListener>> provider2) {
        return C12525z.m49290a((List) provider.get(), (Map) provider2.get());
    }

    /* renamed from: a */
    public static Set<OnPageSelectedListener> m49290a(List<MainPage> list, Map<MainPage, OnPageSelectedListener> map) {
        return (Set) C15521i.a(MainViewModule.a(list, map), "Cannot return null from a non-@Nullable @Provides method");
    }
}
