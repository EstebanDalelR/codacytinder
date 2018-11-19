package com.tinder.match.viewmodel;

import android.content.res.Resources;
import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.model.visitor.MatchNameVisitor;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.viewmodel.g */
public final class C13466g implements Factory<C9889e> {
    /* renamed from: a */
    private final Provider<Resources> f42724a;
    /* renamed from: b */
    private final Provider<MatchAvatarUrlsVisitor> f42725b;
    /* renamed from: c */
    private final Provider<MatchNameVisitor> f42726c;

    public /* synthetic */ Object get() {
        return m52028a();
    }

    public C13466g(Provider<Resources> provider, Provider<MatchAvatarUrlsVisitor> provider2, Provider<MatchNameVisitor> provider3) {
        this.f42724a = provider;
        this.f42725b = provider2;
        this.f42726c = provider3;
    }

    /* renamed from: a */
    public C9889e m52028a() {
        return C13466g.m52026a(this.f42724a, this.f42725b, this.f42726c);
    }

    /* renamed from: a */
    public static C9889e m52026a(Provider<Resources> provider, Provider<MatchAvatarUrlsVisitor> provider2, Provider<MatchNameVisitor> provider3) {
        return new C9889e((Resources) provider.get(), (MatchAvatarUrlsVisitor) provider2.get(), (MatchNameVisitor) provider3.get());
    }

    /* renamed from: b */
    public static C13466g m52027b(Provider<Resources> provider, Provider<MatchAvatarUrlsVisitor> provider2, Provider<MatchNameVisitor> provider3) {
        return new C13466g(provider, provider2, provider3);
    }
}
