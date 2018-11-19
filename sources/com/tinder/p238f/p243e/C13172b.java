package com.tinder.p238f.p243e;

import com.tinder.p238f.p336c.C11600a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.b */
public final class C13172b implements Factory<C9368a> {
    /* renamed from: a */
    private final Provider<C11602c> f41839a;
    /* renamed from: b */
    private final Provider<C11610o> f41840b;
    /* renamed from: c */
    private final Provider<C11608k> f41841c;
    /* renamed from: d */
    private final Provider<C11612s> f41842d;
    /* renamed from: e */
    private final Provider<C11609m> f41843e;
    /* renamed from: f */
    private final Provider<C11604g> f41844f;
    /* renamed from: g */
    private final Provider<C11600a> f41845g;
    /* renamed from: h */
    private final Provider<C11611q> f41846h;
    /* renamed from: i */
    private final Provider<C11603e> f41847i;
    /* renamed from: j */
    private final Provider<C11607i> f41848j;

    public /* synthetic */ Object get() {
        return m51100a();
    }

    public C13172b(Provider<C11602c> provider, Provider<C11610o> provider2, Provider<C11608k> provider3, Provider<C11612s> provider4, Provider<C11609m> provider5, Provider<C11604g> provider6, Provider<C11600a> provider7, Provider<C11611q> provider8, Provider<C11603e> provider9, Provider<C11607i> provider10) {
        this.f41839a = provider;
        this.f41840b = provider2;
        this.f41841c = provider3;
        this.f41842d = provider4;
        this.f41843e = provider5;
        this.f41844f = provider6;
        this.f41845g = provider7;
        this.f41846h = provider8;
        this.f41847i = provider9;
        this.f41848j = provider10;
    }

    /* renamed from: a */
    public C9368a m51100a() {
        return C13172b.m51098a(this.f41839a, this.f41840b, this.f41841c, this.f41842d, this.f41843e, this.f41844f, this.f41845g, this.f41846h, this.f41847i, this.f41848j);
    }

    /* renamed from: a */
    public static C9368a m51098a(Provider<C11602c> provider, Provider<C11610o> provider2, Provider<C11608k> provider3, Provider<C11612s> provider4, Provider<C11609m> provider5, Provider<C11604g> provider6, Provider<C11600a> provider7, Provider<C11611q> provider8, Provider<C11603e> provider9, Provider<C11607i> provider10) {
        return new C9368a((C11602c) provider.get(), (C11610o) provider2.get(), (C11608k) provider3.get(), (C11612s) provider4.get(), (C11609m) provider5.get(), (C11604g) provider6.get(), (C11600a) provider7.get(), (C11611q) provider8.get(), (C11603e) provider9.get(), (C11607i) provider10.get());
    }

    /* renamed from: b */
    public static C13172b m51099b(Provider<C11602c> provider, Provider<C11610o> provider2, Provider<C11608k> provider3, Provider<C11612s> provider4, Provider<C11609m> provider5, Provider<C11604g> provider6, Provider<C11600a> provider7, Provider<C11611q> provider8, Provider<C11603e> provider9, Provider<C11607i> provider10) {
        return new C13172b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
