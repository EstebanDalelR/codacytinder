package com.tinder.module;

import android.app.Application;
import android.support.text.emoji.EmojiCompat.C0282c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cl implements Factory<C0282c> {
    /* renamed from: a */
    private final bs f42869a;
    /* renamed from: b */
    private final Provider<Application> f42870b;

    public /* synthetic */ Object get() {
        return m52275a();
    }

    /* renamed from: a */
    public C0282c m52275a() {
        return m52274a(this.f42869a, this.f42870b);
    }

    /* renamed from: a */
    public static C0282c m52274a(bs bsVar, Provider<Application> provider) {
        return m52273a(bsVar, (Application) provider.get());
    }

    /* renamed from: a */
    public static C0282c m52273a(bs bsVar, Application application) {
        return (C0282c) C15521i.a(bsVar.m40825b(application), "Cannot return null from a non-@Nullable @Provides method");
    }
}
