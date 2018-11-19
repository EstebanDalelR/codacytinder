package com.tinder.account.p072a;

import com.tinder.account.p085b.C3876a;
import com.tinder.account.p085b.C3877b;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.auth.interactor.C2637a;
import com.tinder.common.provider.C8550g;
import com.tinder.managers.UserMetaManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.account.a.o */
public final class C4299o implements Factory<C4298a> {
    /* renamed from: a */
    private final Provider<UpdateAccountPasswordLastShownDateProvider> f14013a;
    /* renamed from: b */
    private final Provider<C8550g> f14014b;
    /* renamed from: c */
    private final Provider<C3876a> f14015c;
    /* renamed from: d */
    private final Provider<C3877b> f14016d;
    /* renamed from: e */
    private final Provider<UserMetaManager> f14017e;
    /* renamed from: f */
    private final Provider<C2637a> f14018f;

    public /* synthetic */ Object get() {
        return m17291a();
    }

    /* renamed from: a */
    public C4298a m17291a() {
        return C4299o.m17290a(this.f14013a, this.f14014b, this.f14015c, this.f14016d, this.f14017e, this.f14018f);
    }

    /* renamed from: a */
    public static C4298a m17290a(Provider<UpdateAccountPasswordLastShownDateProvider> provider, Provider<C8550g> provider2, Provider<C3876a> provider3, Provider<C3877b> provider4, Provider<UserMetaManager> provider5, Provider<C2637a> provider6) {
        return new C4298a((UpdateAccountPasswordLastShownDateProvider) provider.get(), (C8550g) provider2.get(), (C3876a) provider3.get(), (C3877b) provider4.get(), (UserMetaManager) provider5.get(), (C2637a) provider6.get());
    }

    /* renamed from: a */
    public static C4298a m17289a(UpdateAccountPasswordLastShownDateProvider updateAccountPasswordLastShownDateProvider, C8550g c8550g, C3876a c3876a, C3877b c3877b, UserMetaManager userMetaManager, C2637a c2637a) {
        return new C4298a(updateAccountPasswordLastShownDateProvider, c8550g, c3876a, c3877b, userMetaManager, c2637a);
    }
}
