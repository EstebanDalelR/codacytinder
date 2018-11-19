package com.tinder.module;

import com.tinder.match.sponsoredmessage.ViewedSponsoredMessageCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.module.z */
public final class C13505z implements Factory<ViewedSponsoredMessageCache> {
    /* renamed from: a */
    private final C9940d f43095a;

    public /* synthetic */ Object get() {
        return m52611a();
    }

    public C13505z(C9940d c9940d) {
        this.f43095a = c9940d;
    }

    /* renamed from: a */
    public ViewedSponsoredMessageCache m52611a() {
        return C13505z.m52608a(this.f43095a);
    }

    /* renamed from: a */
    public static ViewedSponsoredMessageCache m52608a(C9940d c9940d) {
        return C13505z.m52610c(c9940d);
    }

    /* renamed from: b */
    public static C13505z m52609b(C9940d c9940d) {
        return new C13505z(c9940d);
    }

    /* renamed from: c */
    public static ViewedSponsoredMessageCache m52610c(C9940d c9940d) {
        return (ViewedSponsoredMessageCache) C15521i.a(c9940d.m40873c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
