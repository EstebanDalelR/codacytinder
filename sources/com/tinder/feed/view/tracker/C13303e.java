package com.tinder.feed.view.tracker;

import com.tinder.common.tracker.recyclerview.p200c.C8574c;
import com.tinder.feed.view.model.FeedItem;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.tracker.e */
public final class C13303e implements Factory<C9548d> {
    /* renamed from: a */
    private final Provider<C9547b> f42162a;
    /* renamed from: b */
    private final Provider<C8574c<FeedItem>> f42163b;

    public /* synthetic */ Object get() {
        return m51463a();
    }

    public C13303e(Provider<C9547b> provider, Provider<C8574c<FeedItem>> provider2) {
        this.f42162a = provider;
        this.f42163b = provider2;
    }

    /* renamed from: a */
    public C9548d m51463a() {
        return C13303e.m51461a(this.f42162a, this.f42163b);
    }

    /* renamed from: a */
    public static C9548d m51461a(Provider<C9547b> provider, Provider<C8574c<FeedItem>> provider2) {
        return new C9548d((C9547b) provider.get(), (C8574c) provider2.get());
    }

    /* renamed from: b */
    public static C13303e m51462b(Provider<C9547b> provider, Provider<C8574c<FeedItem>> provider2) {
        return new C13303e(provider, provider2);
    }
}
