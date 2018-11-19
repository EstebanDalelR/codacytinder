package com.tinder.module;

import com.tinder.feed.p341b.C11695a;
import com.tinder.match.navigation.MatchSubscreensTracker;
import com.tinder.match.p291b.C12042a;
import com.tinder.match.provider.C9879g;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class es implements Factory<MatchSubscreensTracker> {
    /* renamed from: a */
    private final er f42998a;
    /* renamed from: b */
    private final Provider<C11695a> f42999b;
    /* renamed from: c */
    private final Provider<C9879g> f43000c;
    /* renamed from: d */
    private final Provider<C12042a> f43001d;

    public /* synthetic */ Object get() {
        return m52495a();
    }

    public es(er erVar, Provider<C11695a> provider, Provider<C9879g> provider2, Provider<C12042a> provider3) {
        this.f42998a = erVar;
        this.f42999b = provider;
        this.f43000c = provider2;
        this.f43001d = provider3;
    }

    /* renamed from: a */
    public MatchSubscreensTracker m52495a() {
        return m52493a(this.f42998a, this.f42999b, this.f43000c, this.f43001d);
    }

    /* renamed from: a */
    public static MatchSubscreensTracker m52493a(er erVar, Provider<C11695a> provider, Provider<C9879g> provider2, Provider<C12042a> provider3) {
        return m52492a(erVar, (C11695a) provider.get(), (C9879g) provider2.get(), (C12042a) provider3.get());
    }

    /* renamed from: b */
    public static es m52494b(er erVar, Provider<C11695a> provider, Provider<C9879g> provider2, Provider<C12042a> provider3) {
        return new es(erVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static MatchSubscreensTracker m52492a(er erVar, C11695a c11695a, C9879g c9879g, C12042a c12042a) {
        return (MatchSubscreensTracker) C15521i.a(erVar.m40892a(c11695a, c9879g, c12042a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
