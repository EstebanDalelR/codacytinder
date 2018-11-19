package com.tinder.module;

import android.content.Context;
import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dl implements Factory<BitmojiAuthRepository> {
    /* renamed from: a */
    private final bs f42923a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42924b;
    /* renamed from: c */
    private final Provider<Context> f42925c;

    public /* synthetic */ Object get() {
        return m52377a();
    }

    public dl(bs bsVar, Provider<AbTestUtility> provider, Provider<Context> provider2) {
        this.f42923a = bsVar;
        this.f42924b = provider;
        this.f42925c = provider2;
    }

    /* renamed from: a */
    public BitmojiAuthRepository m52377a() {
        return m52375a(this.f42923a, this.f42924b, this.f42925c);
    }

    /* renamed from: a */
    public static BitmojiAuthRepository m52375a(bs bsVar, Provider<AbTestUtility> provider, Provider<Context> provider2) {
        return m52374a(bsVar, (AbTestUtility) provider.get(), (Context) provider2.get());
    }

    /* renamed from: b */
    public static dl m52376b(bs bsVar, Provider<AbTestUtility> provider, Provider<Context> provider2) {
        return new dl(bsVar, provider, provider2);
    }

    /* renamed from: a */
    public static BitmojiAuthRepository m52374a(bs bsVar, AbTestUtility abTestUtility, Context context) {
        return (BitmojiAuthRepository) C15521i.a(bsVar.m40801a(abTestUtility, context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
