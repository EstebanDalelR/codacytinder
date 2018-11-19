package com.tinder.updates.p443a;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.a.j */
public final class C18275j implements Factory<C15341i> {
    /* renamed from: a */
    private final Provider<KeepAliveScarletApi> f56604a;
    /* renamed from: b */
    private final Provider<C17205c> f56605b;
    /* renamed from: c */
    private final Provider<C17206e> f56606c;
    /* renamed from: d */
    private final Provider<C17207g> f56607d;
    /* renamed from: e */
    private final Provider<C15679f> f56608e;

    public /* synthetic */ Object get() {
        return m66203a();
    }

    public C18275j(Provider<KeepAliveScarletApi> provider, Provider<C17205c> provider2, Provider<C17206e> provider3, Provider<C17207g> provider4, Provider<C15679f> provider5) {
        this.f56604a = provider;
        this.f56605b = provider2;
        this.f56606c = provider3;
        this.f56607d = provider4;
        this.f56608e = provider5;
    }

    /* renamed from: a */
    public C15341i m66203a() {
        return C18275j.m66201a(this.f56604a, this.f56605b, this.f56606c, this.f56607d, this.f56608e);
    }

    /* renamed from: a */
    public static C15341i m66201a(Provider<KeepAliveScarletApi> provider, Provider<C17205c> provider2, Provider<C17206e> provider3, Provider<C17207g> provider4, Provider<C15679f> provider5) {
        return new C15341i((KeepAliveScarletApi) provider.get(), (C17205c) provider2.get(), (C17206e) provider3.get(), (C17207g) provider4.get(), (C15679f) provider5.get());
    }

    /* renamed from: b */
    public static C18275j m66202b(Provider<KeepAliveScarletApi> provider, Provider<C17205c> provider2, Provider<C17206e> provider3, Provider<C17207g> provider4, Provider<C15679f> provider5) {
        return new C18275j(provider, provider2, provider3, provider4, provider5);
    }
}
