package com.tinder.chat.view.action;

import com.tinder.chat.analytics.C10538s;
import com.tinder.chat.analytics.ah;
import com.tinder.chat.analytics.aj;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class af implements Factory<ae> {
    /* renamed from: a */
    private final Provider<ChatContextualMenuDisplayAction> f41088a;
    /* renamed from: b */
    private final Provider<aj> f41089b;
    /* renamed from: c */
    private final Provider<ah> f41090c;
    /* renamed from: d */
    private final Provider<C10538s> f41091d;

    public /* synthetic */ Object get() {
        return m50135a();
    }

    public af(Provider<ChatContextualMenuDisplayAction> provider, Provider<aj> provider2, Provider<ah> provider3, Provider<C10538s> provider4) {
        this.f41088a = provider;
        this.f41089b = provider2;
        this.f41090c = provider3;
        this.f41091d = provider4;
    }

    /* renamed from: a */
    public ae m50135a() {
        return m50133a(this.f41088a, this.f41089b, this.f41090c, this.f41091d);
    }

    /* renamed from: a */
    public static ae m50133a(Provider<ChatContextualMenuDisplayAction> provider, Provider<aj> provider2, Provider<ah> provider3, Provider<C10538s> provider4) {
        return new ae((ChatContextualMenuDisplayAction) provider.get(), (aj) provider2.get(), (ah) provider3.get(), (C10538s) provider4.get());
    }

    /* renamed from: b */
    public static af m50134b(Provider<ChatContextualMenuDisplayAction> provider, Provider<aj> provider2, Provider<ah> provider3, Provider<C10538s> provider4) {
        return new af(provider, provider2, provider3, provider4);
    }
}
