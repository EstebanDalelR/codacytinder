package com.tinder.data.message;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

public final class ad implements Factory<Function0<DateTime>> {
    /* renamed from: a */
    private final C8698t f41463a;

    public /* synthetic */ Object get() {
        return m50641a();
    }

    /* renamed from: a */
    public Function0<DateTime> m50641a() {
        return m50639a(this.f41463a);
    }

    /* renamed from: a */
    public static Function0<DateTime> m50639a(C8698t c8698t) {
        return m50640b(c8698t);
    }

    /* renamed from: b */
    public static Function0<DateTime> m50640b(C8698t c8698t) {
        return (Function0) C15521i.a(c8698t.m37162b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
