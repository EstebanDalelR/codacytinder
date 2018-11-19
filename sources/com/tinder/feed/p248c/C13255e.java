package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.RecyclerViewItemTracker;
import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import com.tinder.feed.usecase.C11707c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.e */
public final class C13255e implements Factory<RecyclerViewItemTracker> {
    /* renamed from: a */
    private final C9461b f41997a;
    /* renamed from: b */
    private final Provider<C8575e> f41998b;
    /* renamed from: c */
    private final Provider<C8576g> f41999c;
    /* renamed from: d */
    private final Provider<C8577i> f42000d;
    /* renamed from: e */
    private final Provider<C11707c> f42001e;

    public /* synthetic */ Object get() {
        return m51281a();
    }

    public C13255e(C9461b c9461b, Provider<C8575e> provider, Provider<C8576g> provider2, Provider<C8577i> provider3, Provider<C11707c> provider4) {
        this.f41997a = c9461b;
        this.f41998b = provider;
        this.f41999c = provider2;
        this.f42000d = provider3;
        this.f42001e = provider4;
    }

    /* renamed from: a */
    public RecyclerViewItemTracker m51281a() {
        return C13255e.m51279a(this.f41997a, this.f41998b, this.f41999c, this.f42000d, this.f42001e);
    }

    /* renamed from: a */
    public static RecyclerViewItemTracker m51279a(C9461b c9461b, Provider<C8575e> provider, Provider<C8576g> provider2, Provider<C8577i> provider3, Provider<C11707c> provider4) {
        return C13255e.m51278a(c9461b, (C8575e) provider.get(), (C8576g) provider2.get(), (C8577i) provider3.get(), (C11707c) provider4.get());
    }

    /* renamed from: b */
    public static C13255e m51280b(C9461b c9461b, Provider<C8575e> provider, Provider<C8576g> provider2, Provider<C8577i> provider3, Provider<C11707c> provider4) {
        return new C13255e(c9461b, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static RecyclerViewItemTracker m51278a(C9461b c9461b, C8575e c8575e, C8576g c8576g, C8577i c8577i, C11707c c11707c) {
        return (RecyclerViewItemTracker) C15521i.a(c9461b.m39554a(c8575e, c8576g, c8577i, c11707c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
