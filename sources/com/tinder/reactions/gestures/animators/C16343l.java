package com.tinder.reactions.gestures.animators;

import com.tinder.domain.reactions.provider.StrikeReactionTypesProvider;
import com.tinder.reactions.p385c.C16290l;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.gestures.animators.l */
public final class C16343l implements MembersInjector<C16342k> {
    /* renamed from: a */
    private final Provider<C16290l> f50841a;
    /* renamed from: b */
    private final Provider<StrikeReactionTypesProvider> f50842b;
    /* renamed from: c */
    private final Provider<String> f50843c;

    public /* synthetic */ void injectMembers(Object obj) {
        m61652a((C16342k) obj);
    }

    /* renamed from: a */
    public void m61652a(C16342k c16342k) {
        C16343l.m61650a(c16342k, (C16290l) this.f50841a.get());
        C16343l.m61649a(c16342k, (StrikeReactionTypesProvider) this.f50842b.get());
        C16343l.m61651a(c16342k, (String) this.f50843c.get());
    }

    /* renamed from: a */
    public static void m61650a(C16342k c16342k, C16290l c16290l) {
        c16342k.f50837a = c16290l;
    }

    /* renamed from: a */
    public static void m61649a(C16342k c16342k, StrikeReactionTypesProvider strikeReactionTypesProvider) {
        c16342k.f50838b = strikeReactionTypesProvider;
    }

    /* renamed from: a */
    public static void m61651a(C16342k c16342k, String str) {
        c16342k.f50839c = str;
    }
}
