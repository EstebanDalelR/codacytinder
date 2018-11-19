package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.superlike.p421e.C15080a;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.l */
public final class C13177l implements Factory<C11608k> {
    /* renamed from: a */
    private final Provider<C15082f> f41857a;
    /* renamed from: b */
    private final Provider<LikeStatusProvider> f41858b;
    /* renamed from: c */
    private final Provider<C15080a> f41859c;
    /* renamed from: d */
    private final Provider<AbTestUtility> f41860d;
    /* renamed from: e */
    private final Provider<Logger> f41861e;

    public /* synthetic */ Object get() {
        return m51115a();
    }

    public C13177l(Provider<C15082f> provider, Provider<LikeStatusProvider> provider2, Provider<C15080a> provider3, Provider<AbTestUtility> provider4, Provider<Logger> provider5) {
        this.f41857a = provider;
        this.f41858b = provider2;
        this.f41859c = provider3;
        this.f41860d = provider4;
        this.f41861e = provider5;
    }

    /* renamed from: a */
    public C11608k m51115a() {
        return C13177l.m51113a(this.f41857a, this.f41858b, this.f41859c, this.f41860d, this.f41861e);
    }

    /* renamed from: a */
    public static C11608k m51113a(Provider<C15082f> provider, Provider<LikeStatusProvider> provider2, Provider<C15080a> provider3, Provider<AbTestUtility> provider4, Provider<Logger> provider5) {
        return new C11608k((C15082f) provider.get(), (LikeStatusProvider) provider2.get(), (C15080a) provider3.get(), (AbTestUtility) provider4.get(), (Logger) provider5.get());
    }

    /* renamed from: b */
    public static C13177l m51114b(Provider<C15082f> provider, Provider<LikeStatusProvider> provider2, Provider<C15080a> provider3, Provider<AbTestUtility> provider4, Provider<Logger> provider5) {
        return new C13177l(provider, provider2, provider3, provider4, provider5);
    }
}
