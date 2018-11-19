package com.tinder.chat.injection.p188a;

import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.chat.injection.a.v */
public final class C12730v implements Factory<ViewVisibleObserver> {
    /* renamed from: a */
    private final C8440a f41048a;

    public /* synthetic */ Object get() {
        return m50100a();
    }

    public C12730v(C8440a c8440a) {
        this.f41048a = c8440a;
    }

    /* renamed from: a */
    public ViewVisibleObserver m50100a() {
        return C12730v.m50097a(this.f41048a);
    }

    /* renamed from: a */
    public static ViewVisibleObserver m50097a(C8440a c8440a) {
        return C12730v.m50099c(c8440a);
    }

    /* renamed from: b */
    public static C12730v m50098b(C8440a c8440a) {
        return new C12730v(c8440a);
    }

    /* renamed from: c */
    public static ViewVisibleObserver m50099c(C8440a c8440a) {
        return (ViewVisibleObserver) C15521i.a(c8440a.m36032d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
