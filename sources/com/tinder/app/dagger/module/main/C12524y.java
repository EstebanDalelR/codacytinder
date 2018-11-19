package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.main.y */
public final class C12524y implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private static final C12524y f40362a = new C12524y();

    public /* synthetic */ Object get() {
        return m49289a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49289a() {
        return C12524y.m49286b();
    }

    /* renamed from: b */
    public static OnPageSelectedListener m49286b() {
        return C12524y.m49288d();
    }

    /* renamed from: c */
    public static C12524y m49287c() {
        return f40362a;
    }

    /* renamed from: d */
    public static OnPageSelectedListener m49288d() {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
