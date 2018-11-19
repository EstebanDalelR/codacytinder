package com.tinder.messageads.p349f;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.messageads.f.b */
public final class C13477b implements Factory<C12126a> {
    /* renamed from: a */
    private final Provider<Function0<DateTime>> f42740a;

    public /* synthetic */ Object get() {
        return m52048a();
    }

    public C13477b(Provider<Function0<DateTime>> provider) {
        this.f42740a = provider;
    }

    /* renamed from: a */
    public C12126a m52048a() {
        return C13477b.m52046a(this.f42740a);
    }

    /* renamed from: a */
    public static C12126a m52046a(Provider<Function0<DateTime>> provider) {
        return new C12126a((Function0) provider.get());
    }

    /* renamed from: b */
    public static C13477b m52047b(Provider<Function0<DateTime>> provider) {
        return new C13477b(provider);
    }
}
