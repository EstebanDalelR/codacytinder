package com.tinder.app.dagger.module;

import com.tinder.common.logger.Logger;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent;
import com.tinder.verification.worker.C15393a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

public final class af implements Factory<C15393a> {
    /* renamed from: a */
    private final ad f40171a;
    /* renamed from: b */
    private final Provider<AddAuthAccountLinkModalEvent> f40172b;
    /* renamed from: c */
    private final Provider<Logger> f40173c;
    /* renamed from: d */
    private final Provider<C15679f> f40174d;

    public /* synthetic */ Object get() {
        return m48978a();
    }

    /* renamed from: a */
    public C15393a m48978a() {
        return m48977a(this.f40171a, this.f40172b, this.f40173c, this.f40174d);
    }

    /* renamed from: a */
    public static C15393a m48977a(ad adVar, Provider<AddAuthAccountLinkModalEvent> provider, Provider<Logger> provider2, Provider<C15679f> provider3) {
        return m48976a(adVar, (AddAuthAccountLinkModalEvent) provider.get(), (Logger) provider2.get(), (C15679f) provider3.get());
    }

    /* renamed from: a */
    public static C15393a m48976a(ad adVar, AddAuthAccountLinkModalEvent addAuthAccountLinkModalEvent, Logger logger, C15679f c15679f) {
        return (C15393a) C15521i.a(adVar.m35156a(addAuthAccountLinkModalEvent, logger, c15679f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
