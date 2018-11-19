package com.tinder.feed.analytics.session;

import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.feed.analytics.session.p */
public final class C13247p implements Factory<C9455n> {
    /* renamed from: a */
    private final Provider<ObserveHasNewFeedItems> f41982a;
    /* renamed from: b */
    private final Provider<C9451h> f41983b;
    /* renamed from: c */
    private final Provider<C9453j> f41984c;
    /* renamed from: d */
    private final Provider<Function0<DateTime>> f41985d;

    public /* synthetic */ Object get() {
        return m51263a();
    }

    public C13247p(Provider<ObserveHasNewFeedItems> provider, Provider<C9451h> provider2, Provider<C9453j> provider3, Provider<Function0<DateTime>> provider4) {
        this.f41982a = provider;
        this.f41983b = provider2;
        this.f41984c = provider3;
        this.f41985d = provider4;
    }

    /* renamed from: a */
    public C9455n m51263a() {
        return C13247p.m51261a(this.f41982a, this.f41983b, this.f41984c, this.f41985d);
    }

    /* renamed from: a */
    public static C9455n m51261a(Provider<ObserveHasNewFeedItems> provider, Provider<C9451h> provider2, Provider<C9453j> provider3, Provider<Function0<DateTime>> provider4) {
        return new C9455n((ObserveHasNewFeedItems) provider.get(), (C9451h) provider2.get(), (C9453j) provider3.get(), (Function0) provider4.get());
    }

    /* renamed from: b */
    public static C13247p m51262b(Provider<ObserveHasNewFeedItems> provider, Provider<C9451h> provider2, Provider<C9453j> provider3, Provider<Function0<DateTime>> provider4) {
        return new C13247p(provider, provider2, provider3, provider4);
    }
}
