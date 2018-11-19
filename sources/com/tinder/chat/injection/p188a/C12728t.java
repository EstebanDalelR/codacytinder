package com.tinder.chat.injection.p188a;

import com.tinder.chat.view.provider.C8514q.C8513c;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.chat.injection.a.t */
public final class C12728t implements Factory<C8513c> {
    /* renamed from: a */
    private final C8440a f41045a;

    public /* synthetic */ Object get() {
        return m50092a();
    }

    /* renamed from: a */
    public C8513c m50092a() {
        return C12728t.m50090a(this.f41045a);
    }

    /* renamed from: a */
    public static C8513c m50090a(C8440a c8440a) {
        return C12728t.m50091b(c8440a);
    }

    /* renamed from: b */
    public static C8513c m50091b(C8440a c8440a) {
        return (C8513c) C15521i.a(c8440a.m36020a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
