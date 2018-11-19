package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class af implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private static final af f40305a = new af();

    public /* synthetic */ Object get() {
        return m49197a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49197a() {
        return m49194b();
    }

    /* renamed from: b */
    public static OnPageSelectedListener m49194b() {
        return m49196d();
    }

    /* renamed from: c */
    public static af m49195c() {
        return f40305a;
    }

    /* renamed from: d */
    public static OnPageSelectedListener m49196d() {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
