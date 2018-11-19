package com.tinder.account.view;

import com.tinder.account.p072a.C4300p;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.account.view.g */
public final class C7275g implements MembersInjector<UpdateEmailView> {
    /* renamed from: a */
    private final Provider<C4300p> f26188a;

    public /* synthetic */ void injectMembers(Object obj) {
        m31100a((UpdateEmailView) obj);
    }

    /* renamed from: a */
    public void m31100a(UpdateEmailView updateEmailView) {
        C7275g.m31099a(updateEmailView, (C4300p) this.f26188a.get());
    }

    /* renamed from: a */
    public static void m31099a(UpdateEmailView updateEmailView, C4300p c4300p) {
        updateEmailView.f26177a = c4300p;
    }
}
