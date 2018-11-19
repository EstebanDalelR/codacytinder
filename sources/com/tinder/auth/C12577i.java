package com.tinder.auth;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.aa;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.repository.AuthRepository;
import com.tinder.auth.repository.AuthService;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.model.network.ErrorResponseConverter;
import com.tinder.p071a.C2602d;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.i */
public final class C12577i implements Factory<AuthRepository> {
    /* renamed from: a */
    private final C8266a f40632a;
    /* renamed from: b */
    private final Provider<AuthService> f40633b;
    /* renamed from: c */
    private final Provider<ErrorResponseConverter> f40634c;
    /* renamed from: d */
    private final Provider<C2602d> f40635d;
    /* renamed from: e */
    private final Provider<C10333h> f40636e;
    /* renamed from: f */
    private final Provider<UniqueIdFactory> f40637f;
    /* renamed from: g */
    private final Provider<C2630h> f40638g;
    /* renamed from: h */
    private final Provider<AbTestUtility> f40639h;
    /* renamed from: i */
    private final Provider<aa> f40640i;

    public /* synthetic */ Object get() {
        return m49717a();
    }

    public C12577i(C8266a c8266a, Provider<AuthService> provider, Provider<ErrorResponseConverter> provider2, Provider<C2602d> provider3, Provider<C10333h> provider4, Provider<UniqueIdFactory> provider5, Provider<C2630h> provider6, Provider<AbTestUtility> provider7, Provider<aa> provider8) {
        this.f40632a = c8266a;
        this.f40633b = provider;
        this.f40634c = provider2;
        this.f40635d = provider3;
        this.f40636e = provider4;
        this.f40637f = provider5;
        this.f40638g = provider6;
        this.f40639h = provider7;
        this.f40640i = provider8;
    }

    /* renamed from: a */
    public AuthRepository m49717a() {
        return C12577i.m49715a(this.f40632a, this.f40633b, this.f40634c, this.f40635d, this.f40636e, this.f40637f, this.f40638g, this.f40639h, this.f40640i);
    }

    /* renamed from: a */
    public static AuthRepository m49715a(C8266a c8266a, Provider<AuthService> provider, Provider<ErrorResponseConverter> provider2, Provider<C2602d> provider3, Provider<C10333h> provider4, Provider<UniqueIdFactory> provider5, Provider<C2630h> provider6, Provider<AbTestUtility> provider7, Provider<aa> provider8) {
        return C12577i.m49714a(c8266a, (AuthService) provider.get(), (ErrorResponseConverter) provider2.get(), (C2602d) provider3.get(), (C10333h) provider4.get(), (UniqueIdFactory) provider5.get(), (C2630h) provider6.get(), (AbTestUtility) provider7.get(), (aa) provider8.get());
    }

    /* renamed from: b */
    public static C12577i m49716b(C8266a c8266a, Provider<AuthService> provider, Provider<ErrorResponseConverter> provider2, Provider<C2602d> provider3, Provider<C10333h> provider4, Provider<UniqueIdFactory> provider5, Provider<C2630h> provider6, Provider<AbTestUtility> provider7, Provider<aa> provider8) {
        return new C12577i(c8266a, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: a */
    public static AuthRepository m49714a(C8266a c8266a, AuthService authService, ErrorResponseConverter errorResponseConverter, C2602d c2602d, C10333h c10333h, UniqueIdFactory uniqueIdFactory, C2630h c2630h, AbTestUtility abTestUtility, aa aaVar) {
        return (AuthRepository) C15521i.a(c8266a.m35298a(authService, errorResponseConverter, c2602d, c10333h, uniqueIdFactory, c2630h, abTestUtility, aaVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
