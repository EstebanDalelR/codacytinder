package com.tinder.chat.injection.p188a;

import android.content.Context;
import com.tinder.chat.view.action.FullscreenImageDisplayAction;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.o */
public final class C12723o implements Factory<FullscreenImageDisplayAction> {
    /* renamed from: a */
    private final C8440a f41034a;
    /* renamed from: b */
    private final Provider<Context> f41035b;

    public /* synthetic */ Object get() {
        return m50074a();
    }

    public C12723o(C8440a c8440a, Provider<Context> provider) {
        this.f41034a = c8440a;
        this.f41035b = provider;
    }

    /* renamed from: a */
    public FullscreenImageDisplayAction m50074a() {
        return C12723o.m50072a(this.f41034a, this.f41035b);
    }

    /* renamed from: a */
    public static FullscreenImageDisplayAction m50072a(C8440a c8440a, Provider<Context> provider) {
        return C12723o.m50071a(c8440a, (Context) provider.get());
    }

    /* renamed from: b */
    public static C12723o m50073b(C8440a c8440a, Provider<Context> provider) {
        return new C12723o(c8440a, provider);
    }

    /* renamed from: a */
    public static FullscreenImageDisplayAction m50071a(C8440a c8440a, Context context) {
        return (FullscreenImageDisplayAction) C15521i.a(c8440a.m36014a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
