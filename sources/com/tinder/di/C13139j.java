package com.tinder.di;

import com.tinder.domain.recs.engine.SwipeProcessor.SwipeRulesProcessor;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.di.j */
public final class C13139j implements Factory<SwipeRulesProcessor> {
    /* renamed from: a */
    private final C8839d f41798a;

    public /* synthetic */ Object get() {
        return m51053a();
    }

    public C13139j(C8839d c8839d) {
        this.f41798a = c8839d;
    }

    /* renamed from: a */
    public SwipeRulesProcessor m51053a() {
        return (SwipeRulesProcessor) C15521i.a(this.f41798a.m37600c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13139j m51052a(C8839d c8839d) {
        return new C13139j(c8839d);
    }
}
