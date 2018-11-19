package com.tinder.reactions.navigation.mediator;

import com.tinder.reactions.drawer.provider.DrawerEventProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.navigation.mediator.d */
public final class C16375d implements MembersInjector<C16374a> {
    /* renamed from: a */
    private final Provider<DrawerEventProvider> f50924a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61755a((C16374a) obj);
    }

    /* renamed from: a */
    public void m61755a(C16374a c16374a) {
        C16375d.m61754a(c16374a, (DrawerEventProvider) this.f50924a.get());
    }

    /* renamed from: a */
    public static void m61754a(C16374a c16374a, DrawerEventProvider drawerEventProvider) {
        c16374a.f50920a = drawerEventProvider;
    }
}
