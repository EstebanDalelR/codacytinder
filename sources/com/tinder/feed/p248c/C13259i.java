package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.p200c.C8574c;
import com.tinder.feed.view.model.FeedItem;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.i */
public final class C13259i implements Factory<C8574c<FeedItem>> {
    /* renamed from: a */
    private final C9461b f42011a;
    /* renamed from: b */
    private final Provider<C8574c<FeedItem>> f42012b;

    public /* synthetic */ Object get() {
        return m51297a();
    }

    public C13259i(C9461b c9461b, Provider<C8574c<FeedItem>> provider) {
        this.f42011a = c9461b;
        this.f42012b = provider;
    }

    /* renamed from: a */
    public C8574c<FeedItem> m51297a() {
        return C13259i.m51295a(this.f42011a, this.f42012b);
    }

    /* renamed from: a */
    public static C8574c<FeedItem> m51295a(C9461b c9461b, Provider<C8574c<FeedItem>> provider) {
        return C13259i.m51294a(c9461b, (C8574c) provider.get());
    }

    /* renamed from: b */
    public static C13259i m51296b(C9461b c9461b, Provider<C8574c<FeedItem>> provider) {
        return new C13259i(c9461b, provider);
    }

    /* renamed from: a */
    public static C8574c<FeedItem> m51294a(C9461b c9461b, C8574c<FeedItem> c8574c) {
        return (C8574c) C15521i.a(c9461b.m39557a((C8574c) c8574c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
