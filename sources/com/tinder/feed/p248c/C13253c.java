package com.tinder.feed.p248c;

import com.tinder.feed.p341b.C11695a;
import com.tinder.feed.usecase.FeedFirstOpened;
import com.tinder.home.p259b.C9695a;
import com.tinder.match.provider.C9879g;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.c */
public final class C13253c implements Factory<FeedFirstOpened> {
    /* renamed from: a */
    private final C9461b f41991a;
    /* renamed from: b */
    private final Provider<C11695a> f41992b;
    /* renamed from: c */
    private final Provider<C9695a> f41993c;
    /* renamed from: d */
    private final Provider<C9879g> f41994d;

    public /* synthetic */ Object get() {
        return m51273a();
    }

    /* renamed from: a */
    public FeedFirstOpened m51273a() {
        return C13253c.m51272a(this.f41991a, this.f41992b, this.f41993c, this.f41994d);
    }

    /* renamed from: a */
    public static FeedFirstOpened m51272a(C9461b c9461b, Provider<C11695a> provider, Provider<C9695a> provider2, Provider<C9879g> provider3) {
        return C13253c.m51271a(c9461b, (C11695a) provider.get(), (C9695a) provider2.get(), (C9879g) provider3.get());
    }

    /* renamed from: a */
    public static FeedFirstOpened m51271a(C9461b c9461b, C11695a c11695a, C9695a c9695a, C9879g c9879g) {
        return (FeedFirstOpened) C15521i.a(c9461b.m39562a(c11695a, c9695a, c9879g), "Cannot return null from a non-@Nullable @Provides method");
    }
}
