package com.tinder.places.map.view;

import com.tinder.places.map.p314a.C10229a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.map.view.e */
public final class C12391e implements MembersInjector<C14217c> {
    /* renamed from: a */
    private final Provider<C10229a> f40019a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48795a((C14217c) obj);
    }

    /* renamed from: a */
    public void m48795a(C14217c c14217c) {
        C12391e.m48794a(c14217c, (C10229a) this.f40019a.get());
    }

    /* renamed from: a */
    public static void m48794a(C14217c c14217c, C10229a c10229a) {
        c14217c.f45052b = c10229a;
    }
}
