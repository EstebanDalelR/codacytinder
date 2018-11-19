package com.snapchat.kit.sdk.bitmoji;

import android.content.Context;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.c */
public final class C7853c implements Factory<File> {
    /* renamed from: a */
    private final C5894b f28349a;
    /* renamed from: b */
    private final Provider<Context> f28350b;

    public /* synthetic */ Object get() {
        return m33639a();
    }

    public C7853c(C5894b c5894b, Provider<Context> provider) {
        this.f28349a = c5894b;
        this.f28350b = provider;
    }

    /* renamed from: a */
    public File m33639a() {
        return (File) C15521i.a(this.f28349a.m25440a((Context) this.f28350b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<File> m33638a(C5894b c5894b, Provider<Context> provider) {
        return new C7853c(c5894b, provider);
    }
}
