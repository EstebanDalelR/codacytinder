package com.tinder.chat.injection.p188a;

import android.content.Context;
import com.tinder.chat.analytics.aj;
import com.tinder.chat.view.action.FullscreenGifDisplayAction;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.injection.a.n */
public final class C12722n implements Factory<FullscreenGifDisplayAction> {
    /* renamed from: a */
    private final C8440a f41031a;
    /* renamed from: b */
    private final Provider<Context> f41032b;
    /* renamed from: c */
    private final Provider<aj> f41033c;

    public /* synthetic */ Object get() {
        return m50070a();
    }

    /* renamed from: a */
    public FullscreenGifDisplayAction m50070a() {
        return C12722n.m50069a(this.f41031a, this.f41032b, this.f41033c);
    }

    /* renamed from: a */
    public static FullscreenGifDisplayAction m50069a(C8440a c8440a, Provider<Context> provider, Provider<aj> provider2) {
        return C12722n.m50068a(c8440a, (Context) provider.get(), (aj) provider2.get());
    }

    /* renamed from: a */
    public static FullscreenGifDisplayAction m50068a(C8440a c8440a, Context context, aj ajVar) {
        return (FullscreenGifDisplayAction) C15521i.a(c8440a.m36013a(context, ajVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
