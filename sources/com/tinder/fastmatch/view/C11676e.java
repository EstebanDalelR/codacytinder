package com.tinder.fastmatch.view;

import com.tinder.fastmatch.presenter.C11629g;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.e */
public final class C11676e implements MembersInjector<FastMatchRecsActivity> {
    /* renamed from: a */
    private final Provider<C11629g> f38164a;
    /* renamed from: b */
    private final Provider<Register> f38165b;
    /* renamed from: c */
    private final Provider<InAppNotificationsPresenter> f38166c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47473a((FastMatchRecsActivity) obj);
    }

    /* renamed from: a */
    public void m47473a(FastMatchRecsActivity fastMatchRecsActivity) {
        C11676e.m47470a(fastMatchRecsActivity, (C11629g) this.f38164a.get());
        C11676e.m47471a(fastMatchRecsActivity, (Register) this.f38165b.get());
        C11676e.m47472a(fastMatchRecsActivity, (InAppNotificationsPresenter) this.f38166c.get());
    }

    /* renamed from: a */
    public static void m47470a(FastMatchRecsActivity fastMatchRecsActivity, C11629g c11629g) {
        fastMatchRecsActivity.f45363a = c11629g;
    }

    /* renamed from: a */
    public static void m47471a(FastMatchRecsActivity fastMatchRecsActivity, Register register) {
        fastMatchRecsActivity.f45364b = register;
    }

    /* renamed from: a */
    public static void m47472a(FastMatchRecsActivity fastMatchRecsActivity, InAppNotificationsPresenter inAppNotificationsPresenter) {
        fastMatchRecsActivity.f45365c = inAppNotificationsPresenter;
    }
}
