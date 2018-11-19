package com.tinder.module;

import android.content.Context;
import android.content.SharedPreferences;
import com.tinder.bitmoji.C8321a;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bw implements Factory<BitmojiImageUrlRepository> {
    /* renamed from: a */
    private final bs f42834a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42835b;
    /* renamed from: c */
    private final Provider<Context> f42836c;
    /* renamed from: d */
    private final Provider<SharedPreferences> f42837d;
    /* renamed from: e */
    private final Provider<C8321a> f42838e;

    public /* synthetic */ Object get() {
        return m52212a();
    }

    public bw(bs bsVar, Provider<AbTestUtility> provider, Provider<Context> provider2, Provider<SharedPreferences> provider3, Provider<C8321a> provider4) {
        this.f42834a = bsVar;
        this.f42835b = provider;
        this.f42836c = provider2;
        this.f42837d = provider3;
        this.f42838e = provider4;
    }

    /* renamed from: a */
    public BitmojiImageUrlRepository m52212a() {
        return m52210a(this.f42834a, this.f42835b, this.f42836c, this.f42837d, this.f42838e);
    }

    /* renamed from: a */
    public static BitmojiImageUrlRepository m52210a(bs bsVar, Provider<AbTestUtility> provider, Provider<Context> provider2, Provider<SharedPreferences> provider3, Provider<C8321a> provider4) {
        return m52209a(bsVar, (AbTestUtility) provider.get(), (Context) provider2.get(), (SharedPreferences) provider3.get(), (C8321a) provider4.get());
    }

    /* renamed from: b */
    public static bw m52211b(bs bsVar, Provider<AbTestUtility> provider, Provider<Context> provider2, Provider<SharedPreferences> provider3, Provider<C8321a> provider4) {
        return new bw(bsVar, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static BitmojiImageUrlRepository m52209a(bs bsVar, AbTestUtility abTestUtility, Context context, SharedPreferences sharedPreferences, C8321a c8321a) {
        return (BitmojiImageUrlRepository) C15521i.a(bsVar.m40802a(abTestUtility, context, sharedPreferences, c8321a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
