package com.tinder.profile.view;

import com.tinder.profile.view.ProfileInstagramView.C14446a;
import com.tinder.utils.C15377z;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.view.o */
public final class C17774o implements Factory<C14446a> {
    /* renamed from: a */
    private final Provider<C15377z> f55456a;

    public /* synthetic */ Object get() {
        return m64962a();
    }

    /* renamed from: a */
    public C14446a m64962a() {
        return C17774o.m64961a(this.f55456a);
    }

    /* renamed from: a */
    public static C14446a m64961a(Provider<C15377z> provider) {
        return new C14446a((C15377z) provider.get());
    }

    /* renamed from: a */
    public static C14446a m64960a(C15377z c15377z) {
        return new C14446a(c15377z);
    }
}
