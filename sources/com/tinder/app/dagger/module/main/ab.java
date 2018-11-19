package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ab implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private static final ab f40298a = new ab();

    public /* synthetic */ Object get() {
        return m49182a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49182a() {
        return m49179b();
    }

    /* renamed from: b */
    public static OnPageSelectedListener m49179b() {
        return m49181d();
    }

    /* renamed from: c */
    public static ab m49180c() {
        return f40298a;
    }

    /* renamed from: d */
    public static OnPageSelectedListener m49181d() {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
