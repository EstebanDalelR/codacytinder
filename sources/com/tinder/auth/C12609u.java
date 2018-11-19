package com.tinder.auth;

import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.managers.bk;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.u */
public final class C12609u implements Factory<UpdateAccountPasswordLastShownDateProvider> {
    /* renamed from: a */
    private final C8266a f40704a;
    /* renamed from: b */
    private final Provider<bk> f40705b;

    public /* synthetic */ Object get() {
        return m49807a();
    }

    /* renamed from: a */
    public UpdateAccountPasswordLastShownDateProvider m49807a() {
        return C12609u.m49806a(this.f40704a, this.f40705b);
    }

    /* renamed from: a */
    public static UpdateAccountPasswordLastShownDateProvider m49806a(C8266a c8266a, Provider<bk> provider) {
        return C12609u.m49805a(c8266a, (bk) provider.get());
    }

    /* renamed from: a */
    public static UpdateAccountPasswordLastShownDateProvider m49805a(C8266a c8266a, bk bkVar) {
        return (UpdateAccountPasswordLastShownDateProvider) C15521i.a(c8266a.m35293a(bkVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
