package com.tinder.chat.analytics;

import com.tinder.chat.view.provider.C10650w;
import com.tinder.common.logger.Logger;
import com.tinder.typingindicator.provider.C15327a;
import com.tinder.typingindicator.usecase.C17172a;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

public final class ar implements Factory<am> {
    /* renamed from: a */
    private final Provider<String> f40952a;
    /* renamed from: b */
    private final Provider<C15327a> f40953b;
    /* renamed from: c */
    private final Provider<C17172a> f40954c;
    /* renamed from: d */
    private final Provider<Function0<Long>> f40955d;
    /* renamed from: e */
    private final Provider<C10650w> f40956e;
    /* renamed from: f */
    private final Provider<Logger> f40957f;

    public /* synthetic */ Object get() {
        return m49976a();
    }

    public ar(Provider<String> provider, Provider<C15327a> provider2, Provider<C17172a> provider3, Provider<Function0<Long>> provider4, Provider<C10650w> provider5, Provider<Logger> provider6) {
        this.f40952a = provider;
        this.f40953b = provider2;
        this.f40954c = provider3;
        this.f40955d = provider4;
        this.f40956e = provider5;
        this.f40957f = provider6;
    }

    /* renamed from: a */
    public am m49976a() {
        return m49974a(this.f40952a, this.f40953b, this.f40954c, this.f40955d, this.f40956e, this.f40957f);
    }

    /* renamed from: a */
    public static am m49974a(Provider<String> provider, Provider<C15327a> provider2, Provider<C17172a> provider3, Provider<Function0<Long>> provider4, Provider<C10650w> provider5, Provider<Logger> provider6) {
        return new am((String) provider.get(), (C15327a) provider2.get(), (C17172a) provider3.get(), (Function0) provider4.get(), (C10650w) provider5.get(), (Logger) provider6.get());
    }

    /* renamed from: b */
    public static ar m49975b(Provider<String> provider, Provider<C15327a> provider2, Provider<C17172a> provider3, Provider<Function0<Long>> provider4, Provider<C10650w> provider5, Provider<Logger> provider6) {
        return new ar(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
