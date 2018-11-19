package com.tinder.data.message;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.data.message.w */
public final class C12961w implements Factory<Function0<String>> {
    /* renamed from: a */
    private final C8698t f41516a;

    public /* synthetic */ Object get() {
        return m50689a();
    }

    /* renamed from: a */
    public Function0<String> m50689a() {
        return C12961w.m50687a(this.f41516a);
    }

    /* renamed from: a */
    public static Function0<String> m50687a(C8698t c8698t) {
        return C12961w.m50688b(c8698t);
    }

    /* renamed from: b */
    public static Function0<String> m50688b(C8698t c8698t) {
        return (Function0) C15521i.a(c8698t.m37160a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
