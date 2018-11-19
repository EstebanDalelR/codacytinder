package com.tinder.app.dagger.module.main;

import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.ChildViewPreDetachListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.main.m */
public final class C12512m implements Factory<ChildViewPreDetachListener> {
    /* renamed from: a */
    private final C8251a f40336a;

    public /* synthetic */ Object get() {
        return m49244a();
    }

    public C12512m(C8251a c8251a) {
        this.f40336a = c8251a;
    }

    /* renamed from: a */
    public ChildViewPreDetachListener m49244a() {
        return C12512m.m49241a(this.f40336a);
    }

    /* renamed from: a */
    public static ChildViewPreDetachListener m49241a(C8251a c8251a) {
        return C12512m.m49243c(c8251a);
    }

    /* renamed from: b */
    public static C12512m m49242b(C8251a c8251a) {
        return new C12512m(c8251a);
    }

    /* renamed from: c */
    public static ChildViewPreDetachListener m49243c(C8251a c8251a) {
        return (ChildViewPreDetachListener) C15521i.a(c8251a.m35215d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
