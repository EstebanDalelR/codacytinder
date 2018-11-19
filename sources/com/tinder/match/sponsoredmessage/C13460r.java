package com.tinder.match.sponsoredmessage;

import com.tinder.sponsoredmessage.SponsoredMessageViewedCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.match.sponsoredmessage.r */
public final class C13460r implements Factory<SponsoredMessageViewedCache> {
    /* renamed from: a */
    private final C9882h f42685a;

    public /* synthetic */ Object get() {
        return m51988a();
    }

    public C13460r(C9882h c9882h) {
        this.f42685a = c9882h;
    }

    /* renamed from: a */
    public SponsoredMessageViewedCache m51988a() {
        return C13460r.m51985a(this.f42685a);
    }

    /* renamed from: a */
    public static SponsoredMessageViewedCache m51985a(C9882h c9882h) {
        return C13460r.m51987c(c9882h);
    }

    /* renamed from: b */
    public static C13460r m51986b(C9882h c9882h) {
        return new C13460r(c9882h);
    }

    /* renamed from: c */
    public static SponsoredMessageViewedCache m51987c(C9882h c9882h) {
        return (SponsoredMessageViewedCache) C15521i.a(c9882h.m40664a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
