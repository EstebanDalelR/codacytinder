package com.tinder.module;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cq implements Factory<InputMethodManager> {
    /* renamed from: a */
    private final bs f42878a;
    /* renamed from: b */
    private final Provider<Context> f42879b;

    public /* synthetic */ Object get() {
        return m52295a();
    }

    public cq(bs bsVar, Provider<Context> provider) {
        this.f42878a = bsVar;
        this.f42879b = provider;
    }

    /* renamed from: a */
    public InputMethodManager m52295a() {
        return m52293a(this.f42878a, this.f42879b);
    }

    /* renamed from: a */
    public static InputMethodManager m52293a(bs bsVar, Provider<Context> provider) {
        return m52292a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static cq m52294b(bs bsVar, Provider<Context> provider) {
        return new cq(bsVar, provider);
    }

    /* renamed from: a */
    public static InputMethodManager m52292a(bs bsVar, Context context) {
        return (InputMethodManager) C15521i.a(bsVar.m40833d(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
