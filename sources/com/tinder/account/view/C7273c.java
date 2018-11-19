package com.tinder.account.view;

import com.tinder.account.p072a.C4298a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.account.view.c */
public final class C7273c implements MembersInjector<UpdateAccountEmailPasswordActivity> {
    /* renamed from: a */
    private final Provider<C4298a> f26186a;

    public /* synthetic */ void injectMembers(Object obj) {
        m31096a((UpdateAccountEmailPasswordActivity) obj);
    }

    /* renamed from: a */
    public void m31096a(UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity) {
        C7273c.m31095a(updateAccountEmailPasswordActivity, (C4298a) this.f26186a.get());
    }

    /* renamed from: a */
    public static void m31095a(UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity, C4298a c4298a) {
        updateAccountEmailPasswordActivity.f29416a = c4298a;
    }
}
