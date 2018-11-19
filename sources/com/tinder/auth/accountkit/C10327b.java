package com.tinder.auth.accountkit;

import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.accountkit.b */
public final class C10327b implements MembersInjector<AccountKitErrorHeaderFragment> {
    /* renamed from: a */
    private final Provider<C12564c> f33733a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42106a((AccountKitErrorHeaderFragment) obj);
    }

    /* renamed from: a */
    public void m42106a(AccountKitErrorHeaderFragment accountKitErrorHeaderFragment) {
        C10327b.m42105a(accountKitErrorHeaderFragment, this.f33733a.get());
    }

    /* renamed from: a */
    public static void m42105a(AccountKitErrorHeaderFragment accountKitErrorHeaderFragment, Object obj) {
        accountKitErrorHeaderFragment.f33728a = (C12564c) obj;
    }
}
