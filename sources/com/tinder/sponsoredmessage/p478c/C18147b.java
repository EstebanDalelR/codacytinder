package com.tinder.sponsoredmessage.p478c;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.sponsoredmessage.c.b */
public final class C18147b implements Factory<C16842a> {
    /* renamed from: a */
    private final Provider<Function0<DateTime>> f56314a;

    public /* synthetic */ Object get() {
        return m65845a();
    }

    public C18147b(Provider<Function0<DateTime>> provider) {
        this.f56314a = provider;
    }

    /* renamed from: a */
    public C16842a m65845a() {
        return C18147b.m65843a(this.f56314a);
    }

    /* renamed from: a */
    public static C16842a m65843a(Provider<Function0<DateTime>> provider) {
        return new C16842a((Function0) provider.get());
    }

    /* renamed from: b */
    public static C18147b m65844b(Provider<Function0<DateTime>> provider) {
        return new C18147b(provider);
    }
}
