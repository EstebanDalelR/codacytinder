package com.tinder.app.dagger.module;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.main.trigger.MainTriggerMediator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.w */
public final class C12548w implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final C8253o f40419a;
    /* renamed from: b */
    private final Provider<MainTriggerMediator> f40420b;

    public /* synthetic */ Object get() {
        return m49382a();
    }

    public C12548w(C8253o c8253o, Provider<MainTriggerMediator> provider) {
        this.f40419a = c8253o;
        this.f40420b = provider;
    }

    /* renamed from: a */
    public OnPageSelectedListener m49382a() {
        return C12548w.m49380a(this.f40419a, this.f40420b);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49380a(C8253o c8253o, Provider<MainTriggerMediator> provider) {
        return C12548w.m49379a(c8253o, (MainTriggerMediator) provider.get());
    }

    /* renamed from: b */
    public static C12548w m49381b(C8253o c8253o, Provider<MainTriggerMediator> provider) {
        return new C12548w(c8253o, provider);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49379a(C8253o c8253o, MainTriggerMediator mainTriggerMediator) {
        return (OnPageSelectedListener) C15521i.a(c8253o.m35218a(mainTriggerMediator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
