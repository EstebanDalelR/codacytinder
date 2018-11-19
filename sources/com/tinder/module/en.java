package com.tinder.module;

import com.tinder.managers.bj;
import com.tinder.managers.bk;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class en implements Factory<bj> {
    /* renamed from: a */
    private final ec f42985a;
    /* renamed from: b */
    private final Provider<bk> f42986b;
    /* renamed from: c */
    private final Provider<C2664c> f42987c;

    public /* synthetic */ Object get() {
        return m52479a();
    }

    public en(ec ecVar, Provider<bk> provider, Provider<C2664c> provider2) {
        this.f42985a = ecVar;
        this.f42986b = provider;
        this.f42987c = provider2;
    }

    /* renamed from: a */
    public bj m52479a() {
        return m52477a(this.f42985a, this.f42986b, this.f42987c);
    }

    /* renamed from: a */
    public static bj m52477a(ec ecVar, Provider<bk> provider, Provider<C2664c> provider2) {
        return m52476a(ecVar, (bk) provider.get(), (C2664c) provider2.get());
    }

    /* renamed from: b */
    public static en m52478b(ec ecVar, Provider<bk> provider, Provider<C2664c> provider2) {
        return new en(ecVar, provider, provider2);
    }

    /* renamed from: a */
    public static bj m52476a(ec ecVar, bk bkVar, C2664c c2664c) {
        return (bj) C15521i.a(ecVar.m40884a(bkVar, c2664c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
