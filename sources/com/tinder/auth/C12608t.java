package com.tinder.auth;

import com.tinder.account.data.UpdateAccountDataStore;
import com.tinder.auth.repository.AccountService;
import com.tinder.model.network.ErrorResponseConverter;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.t */
public final class C12608t implements Factory<UpdateAccountDataStore> {
    /* renamed from: a */
    private final C8266a f40701a;
    /* renamed from: b */
    private final Provider<AccountService> f40702b;
    /* renamed from: c */
    private final Provider<ErrorResponseConverter> f40703c;

    public /* synthetic */ Object get() {
        return m49804a();
    }

    /* renamed from: a */
    public UpdateAccountDataStore m49804a() {
        return C12608t.m49803a(this.f40701a, this.f40702b, this.f40703c);
    }

    /* renamed from: a */
    public static UpdateAccountDataStore m49803a(C8266a c8266a, Provider<AccountService> provider, Provider<ErrorResponseConverter> provider2) {
        return C12608t.m49802a(c8266a, (AccountService) provider.get(), (ErrorResponseConverter) provider2.get());
    }

    /* renamed from: a */
    public static UpdateAccountDataStore m49802a(C8266a c8266a, AccountService accountService, ErrorResponseConverter errorResponseConverter) {
        return (UpdateAccountDataStore) C15521i.a(c8266a.m35292a(accountService, errorResponseConverter), "Cannot return null from a non-@Nullable @Provides method");
    }
}
