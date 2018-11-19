package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.C8572b;
import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.feed.c.h */
public final class C13258h implements Factory<C8572b> {
    /* renamed from: a */
    private final C9461b f42006a;
    /* renamed from: b */
    private final Provider<ListItemViewDurationRepository> f42007b;
    /* renamed from: c */
    private final Provider<C8575e> f42008c;
    /* renamed from: d */
    private final Provider<C8573a> f42009d;
    /* renamed from: e */
    private final Provider<Function0<DateTime>> f42010e;

    public /* synthetic */ Object get() {
        return m51293a();
    }

    public C13258h(C9461b c9461b, Provider<ListItemViewDurationRepository> provider, Provider<C8575e> provider2, Provider<C8573a> provider3, Provider<Function0<DateTime>> provider4) {
        this.f42006a = c9461b;
        this.f42007b = provider;
        this.f42008c = provider2;
        this.f42009d = provider3;
        this.f42010e = provider4;
    }

    /* renamed from: a */
    public C8572b m51293a() {
        return C13258h.m51291a(this.f42006a, this.f42007b, this.f42008c, this.f42009d, this.f42010e);
    }

    /* renamed from: a */
    public static C8572b m51291a(C9461b c9461b, Provider<ListItemViewDurationRepository> provider, Provider<C8575e> provider2, Provider<C8573a> provider3, Provider<Function0<DateTime>> provider4) {
        return C13258h.m51290a(c9461b, (ListItemViewDurationRepository) provider.get(), (C8575e) provider2.get(), (C8573a) provider3.get(), (Function0) provider4.get());
    }

    /* renamed from: b */
    public static C13258h m51292b(C9461b c9461b, Provider<ListItemViewDurationRepository> provider, Provider<C8575e> provider2, Provider<C8573a> provider3, Provider<Function0<DateTime>> provider4) {
        return new C13258h(c9461b, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static C8572b m51290a(C9461b c9461b, ListItemViewDurationRepository listItemViewDurationRepository, C8575e c8575e, C8573a c8573a, Function0<DateTime> function0) {
        return (C8572b) C15521i.a(c9461b.m39555a(listItemViewDurationRepository, c8575e, c8573a, (Function0) function0), "Cannot return null from a non-@Nullable @Provides method");
    }
}
