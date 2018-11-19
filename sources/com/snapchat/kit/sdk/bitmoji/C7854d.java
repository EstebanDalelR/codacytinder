package com.snapchat.kit.sdk.bitmoji;

import android.content.Context;
import com.squareup.okhttp.C5997b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.d */
public final class C7854d implements Factory<C5997b> {
    /* renamed from: a */
    private final C5894b f28351a;
    /* renamed from: b */
    private final Provider<Context> f28352b;
    /* renamed from: c */
    private final Provider<File> f28353c;

    public /* synthetic */ Object get() {
        return m33641a();
    }

    public C7854d(C5894b c5894b, Provider<Context> provider, Provider<File> provider2) {
        this.f28351a = c5894b;
        this.f28352b = provider;
        this.f28353c = provider2;
    }

    /* renamed from: a */
    public C5997b m33641a() {
        return (C5997b) C15521i.a(this.f28351a.m25437a((Context) this.f28352b.get(), (File) this.f28353c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5997b> m33640a(C5894b c5894b, Provider<Context> provider, Provider<File> provider2) {
        return new C7854d(c5894b, provider, provider2);
    }
}
