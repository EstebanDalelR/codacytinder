package com.snapchat.kit.sdk.bitmoji;

import android.content.Context;
import com.snapchat.kit.sdk.bitmoji.networking.C7864c;
import com.squareup.picasso.Picasso;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.g */
public final class C7857g implements Factory<Picasso> {
    /* renamed from: a */
    private final C5894b f28357a;
    /* renamed from: b */
    private final Provider<Context> f28358b;
    /* renamed from: c */
    private final Provider<C7864c> f28359c;

    public /* synthetic */ Object get() {
        return m33647a();
    }

    public C7857g(C5894b c5894b, Provider<Context> provider, Provider<C7864c> provider2) {
        this.f28357a = c5894b;
        this.f28358b = provider;
        this.f28359c = provider2;
    }

    /* renamed from: a */
    public Picasso m33647a() {
        return (Picasso) C15521i.a(this.f28357a.m25439a((Context) this.f28358b.get(), (C7864c) this.f28359c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<Picasso> m33646a(C5894b c5894b, Provider<Context> provider, Provider<C7864c> provider2) {
        return new C7857g(c5894b, provider, provider2);
    }
}
