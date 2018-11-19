package com.tinder.chat.injection.p188a;

import android.content.Context;
import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.view.action.MatchProfileDisplayAction;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.s */
public final class C12727s implements Factory<MatchProfileDisplayAction> {
    /* renamed from: a */
    private final C8440a f41042a;
    /* renamed from: b */
    private final Provider<Context> f41043b;
    /* renamed from: c */
    private final Provider<C10540v> f41044c;

    public /* synthetic */ Object get() {
        return m50089a();
    }

    public C12727s(C8440a c8440a, Provider<Context> provider, Provider<C10540v> provider2) {
        this.f41042a = c8440a;
        this.f41043b = provider;
        this.f41044c = provider2;
    }

    /* renamed from: a */
    public MatchProfileDisplayAction m50089a() {
        return C12727s.m50087a(this.f41042a, this.f41043b, this.f41044c);
    }

    /* renamed from: a */
    public static MatchProfileDisplayAction m50087a(C8440a c8440a, Provider<Context> provider, Provider<C10540v> provider2) {
        return C12727s.m50086a(c8440a, (Context) provider.get(), (C10540v) provider2.get());
    }

    /* renamed from: b */
    public static C12727s m50088b(C8440a c8440a, Provider<Context> provider, Provider<C10540v> provider2) {
        return new C12727s(c8440a, provider, provider2);
    }

    /* renamed from: a */
    public static MatchProfileDisplayAction m50086a(C8440a c8440a, Context context, C10540v c10540v) {
        return (MatchProfileDisplayAction) C15521i.a(c8440a.m36015a(context, c10540v), "Cannot return null from a non-@Nullable @Provides method");
    }
}
