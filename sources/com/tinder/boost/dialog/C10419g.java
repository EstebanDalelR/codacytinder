package com.tinder.boost.dialog;

import com.tinder.boost.presenter.C12633s;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.dialog.g */
public final class C10419g implements MembersInjector<BoostUpdateDialog> {
    /* renamed from: a */
    private final Provider<C12633s> f33983a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42298a((BoostUpdateDialog) obj);
    }

    /* renamed from: a */
    public void m42298a(BoostUpdateDialog boostUpdateDialog) {
        C10419g.m42297a(boostUpdateDialog, (C12633s) this.f33983a.get());
    }

    /* renamed from: a */
    public static void m42297a(BoostUpdateDialog boostUpdateDialog, C12633s c12633s) {
        boostUpdateDialog.f43483a = c12633s;
    }
}
