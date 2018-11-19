package com.tinder.loops.activity;

import android.arch.lifecycle.ViewModelProvider.Factory;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.activity.b */
public final class C11908b implements MembersInjector<TrimAndCropActivity> {
    /* renamed from: a */
    private final Provider<Factory> f38804a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47912a((TrimAndCropActivity) obj);
    }

    /* renamed from: a */
    public void m47912a(TrimAndCropActivity trimAndCropActivity) {
        C11908b.m47911a(trimAndCropActivity, (Factory) this.f38804a.get());
    }

    /* renamed from: a */
    public static void m47911a(TrimAndCropActivity trimAndCropActivity, Factory factory) {
        trimAndCropActivity.f45385b = factory;
    }
}
