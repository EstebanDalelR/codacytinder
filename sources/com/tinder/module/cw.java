package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.interactors.C9717h;
import com.tinder.interactors.p262a.C9712i;
import com.tinder.purchase.p371a.C14479a;
import com.tinder.superlike.p418a.C15066a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cw implements Factory<C9717h> {
    /* renamed from: a */
    private final bs f42891a;
    /* renamed from: b */
    private final Provider<C9712i> f42892b;
    /* renamed from: c */
    private final Provider<C15066a> f42893c;
    /* renamed from: d */
    private final Provider<C14479a> f42894d;
    /* renamed from: e */
    private final Provider<AbTestUtility> f42895e;

    public /* synthetic */ Object get() {
        return m52319a();
    }

    public cw(bs bsVar, Provider<C9712i> provider, Provider<C15066a> provider2, Provider<C14479a> provider3, Provider<AbTestUtility> provider4) {
        this.f42891a = bsVar;
        this.f42892b = provider;
        this.f42893c = provider2;
        this.f42894d = provider3;
        this.f42895e = provider4;
    }

    /* renamed from: a */
    public C9717h m52319a() {
        return m52317a(this.f42891a, this.f42892b, this.f42893c, this.f42894d, this.f42895e);
    }

    /* renamed from: a */
    public static C9717h m52317a(bs bsVar, Provider<C9712i> provider, Provider<C15066a> provider2, Provider<C14479a> provider3, Provider<AbTestUtility> provider4) {
        return m52316a(bsVar, (C9712i) provider.get(), (C15066a) provider2.get(), (C14479a) provider3.get(), (AbTestUtility) provider4.get());
    }

    /* renamed from: b */
    public static cw m52318b(bs bsVar, Provider<C9712i> provider, Provider<C15066a> provider2, Provider<C14479a> provider3, Provider<AbTestUtility> provider4) {
        return new cw(bsVar, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static C9717h m52316a(bs bsVar, C9712i c9712i, C15066a c15066a, C14479a c14479a, AbTestUtility abTestUtility) {
        return (C9717h) C15521i.a(bsVar.m40815a(c9712i, c15066a, c14479a, abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
