package com.tinder.reactions.dialog;

import com.tinder.reactions.dialog.p390a.C14621a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.dialog.b */
public final class C16316b implements MembersInjector<C16315a> {
    /* renamed from: a */
    private final Provider<C14621a> f50755a;

    public /* synthetic */ void injectMembers(Object obj) {
        m61523a((C16315a) obj);
    }

    /* renamed from: a */
    public void m61523a(C16315a c16315a) {
        C16316b.m61522a(c16315a, (C14621a) this.f50755a.get());
    }

    /* renamed from: a */
    public static void m61522a(C16315a c16315a, C14621a c14621a) {
        c16315a.f50754a = c14621a;
    }
}
