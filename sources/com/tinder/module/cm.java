package com.tinder.module;

import com.google.gson.Gson;
import com.tinder.model.network.ErrorResponseConverter;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cm implements Factory<ErrorResponseConverter> {
    /* renamed from: a */
    private final bs f42871a;
    /* renamed from: b */
    private final Provider<Gson> f42872b;

    public /* synthetic */ Object get() {
        return m52279a();
    }

    public cm(bs bsVar, Provider<Gson> provider) {
        this.f42871a = bsVar;
        this.f42872b = provider;
    }

    /* renamed from: a */
    public ErrorResponseConverter m52279a() {
        return m52277a(this.f42871a, this.f42872b);
    }

    /* renamed from: a */
    public static ErrorResponseConverter m52277a(bs bsVar, Provider<Gson> provider) {
        return m52276a(bsVar, (Gson) provider.get());
    }

    /* renamed from: b */
    public static cm m52278b(bs bsVar, Provider<Gson> provider) {
        return new cm(bsVar, provider);
    }

    /* renamed from: a */
    public static ErrorResponseConverter m52276a(bs bsVar, Gson gson) {
        return (ErrorResponseConverter) C15521i.a(bsVar.m40818a(gson), "Cannot return null from a non-@Nullable @Provides method");
    }
}
