package com.tinder.utils;

import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ae implements MembersInjector<OkHttpGlideModule> {
    /* renamed from: a */
    private final Provider<Factory> f52814a;

    public /* synthetic */ void injectMembers(Object obj) {
        m63119a((OkHttpGlideModule) obj);
    }

    /* renamed from: a */
    public void m63119a(OkHttpGlideModule okHttpGlideModule) {
        m63118a(okHttpGlideModule, (Factory) this.f52814a.get());
    }

    /* renamed from: a */
    public static void m63118a(OkHttpGlideModule okHttpGlideModule, Factory factory) {
        okHttpGlideModule.f52809a = factory;
    }
}
