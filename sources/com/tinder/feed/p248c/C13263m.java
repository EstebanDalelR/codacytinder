package com.tinder.feed.p248c;

import com.tinder.feed.view.FeedMainView;
import com.tinder.feed.view.action.MatchProfileDisplayAction;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.m */
public final class C13263m implements Factory<MatchProfileDisplayAction> {
    /* renamed from: a */
    private final C9461b f42019a;
    /* renamed from: b */
    private final Provider<FeedMainView> f42020b;

    public /* synthetic */ Object get() {
        return m51313a();
    }

    public C13263m(C9461b c9461b, Provider<FeedMainView> provider) {
        this.f42019a = c9461b;
        this.f42020b = provider;
    }

    /* renamed from: a */
    public MatchProfileDisplayAction m51313a() {
        return C13263m.m51311a(this.f42019a, this.f42020b);
    }

    /* renamed from: a */
    public static MatchProfileDisplayAction m51311a(C9461b c9461b, Provider<FeedMainView> provider) {
        return C13263m.m51310a(c9461b, (FeedMainView) provider.get());
    }

    /* renamed from: b */
    public static C13263m m51312b(C9461b c9461b, Provider<FeedMainView> provider) {
        return new C13263m(c9461b, provider);
    }

    /* renamed from: a */
    public static MatchProfileDisplayAction m51310a(C9461b c9461b, FeedMainView feedMainView) {
        return (MatchProfileDisplayAction) C15521i.a(c9461b.m39563a(feedMainView), "Cannot return null from a non-@Nullable @Provides method");
    }
}
