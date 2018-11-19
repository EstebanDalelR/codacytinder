package com.tinder.module;

import com.tinder.addy.tracker.TrackingUrlsDecorator;
import com.tinder.messageads.p349f.C12126a;
import com.tinder.sponsoredmessage.p478c.C16842a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.module.x */
public final class C13503x implements Factory<Set<TrackingUrlsDecorator>> {
    /* renamed from: a */
    private final C9940d f43090a;
    /* renamed from: b */
    private final Provider<C12126a> f43091b;
    /* renamed from: c */
    private final Provider<C16842a> f43092c;

    public /* synthetic */ Object get() {
        return m52603a();
    }

    public C13503x(C9940d c9940d, Provider<C12126a> provider, Provider<C16842a> provider2) {
        this.f43090a = c9940d;
        this.f43091b = provider;
        this.f43092c = provider2;
    }

    /* renamed from: a */
    public Set<TrackingUrlsDecorator> m52603a() {
        return C13503x.m52601a(this.f43090a, this.f43091b, this.f43092c);
    }

    /* renamed from: a */
    public static Set<TrackingUrlsDecorator> m52601a(C9940d c9940d, Provider<C12126a> provider, Provider<C16842a> provider2) {
        return C13503x.m52600a(c9940d, (C12126a) provider.get(), (C16842a) provider2.get());
    }

    /* renamed from: b */
    public static C13503x m52602b(C9940d c9940d, Provider<C12126a> provider, Provider<C16842a> provider2) {
        return new C13503x(c9940d, provider, provider2);
    }

    /* renamed from: a */
    public static Set<TrackingUrlsDecorator> m52600a(C9940d c9940d, C12126a c12126a, C16842a c16842a) {
        return (Set) C15521i.a(c9940d.m40868a(c12126a, c16842a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
