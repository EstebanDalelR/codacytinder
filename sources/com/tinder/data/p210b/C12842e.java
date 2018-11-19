package com.tinder.data.p210b;

import com.tinder.common.logger.Logger;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.data.b.e */
public final class C12842e implements Factory<Logger> {
    /* renamed from: a */
    private final C8620d f41278a;

    public /* synthetic */ Object get() {
        return m50438a();
    }

    public C12842e(C8620d c8620d) {
        this.f41278a = c8620d;
    }

    /* renamed from: a */
    public Logger m50438a() {
        return C12842e.m50435a(this.f41278a);
    }

    /* renamed from: a */
    public static Logger m50435a(C8620d c8620d) {
        return C12842e.m50437c(c8620d);
    }

    /* renamed from: b */
    public static C12842e m50436b(C8620d c8620d) {
        return new C12842e(c8620d);
    }

    /* renamed from: c */
    public static Logger m50437c(C8620d c8620d) {
        return (Logger) C15521i.a(c8620d.m36766a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
