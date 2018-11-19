package com.tinder.app.dagger.module;

import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.n */
public final class C12526n implements Factory<ViewVisibleObserver> {
    /* renamed from: a */
    private static final C12526n f40365a = new C12526n();

    public /* synthetic */ Object get() {
        return m49295a();
    }

    /* renamed from: a */
    public ViewVisibleObserver m49295a() {
        return C12526n.m49293b();
    }

    /* renamed from: b */
    public static ViewVisibleObserver m49293b() {
        return C12526n.m49294c();
    }

    /* renamed from: c */
    public static ViewVisibleObserver m49294c() {
        return (ViewVisibleObserver) C15521i.a(C8250h.m35196b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
