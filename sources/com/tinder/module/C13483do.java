package com.tinder.module;

import android.content.ContentResolver;
import com.tinder.screenshot.C16569e;
import com.tinder.screenshotty.C14830c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.do */
public final class C13483do implements Factory<C14830c> {
    /* renamed from: a */
    private final bs f42930a;
    /* renamed from: b */
    private final Provider<ContentResolver> f42931b;
    /* renamed from: c */
    private final Provider<C16569e> f42932c;

    public /* synthetic */ Object get() {
        return m52389a();
    }

    public C13483do(bs bsVar, Provider<ContentResolver> provider, Provider<C16569e> provider2) {
        this.f42930a = bsVar;
        this.f42931b = provider;
        this.f42932c = provider2;
    }

    /* renamed from: a */
    public C14830c m52389a() {
        return C13483do.m52387a(this.f42930a, this.f42931b, this.f42932c);
    }

    /* renamed from: a */
    public static C14830c m52387a(bs bsVar, Provider<ContentResolver> provider, Provider<C16569e> provider2) {
        return C13483do.m52386a(bsVar, (ContentResolver) provider.get(), (C16569e) provider2.get());
    }

    /* renamed from: b */
    public static C13483do m52388b(bs bsVar, Provider<ContentResolver> provider, Provider<C16569e> provider2) {
        return new C13483do(bsVar, provider, provider2);
    }

    /* renamed from: a */
    public static C14830c m52386a(bs bsVar, ContentResolver contentResolver, C16569e c16569e) {
        return (C14830c) C15521i.a(bsVar.m40820a(contentResolver, c16569e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
