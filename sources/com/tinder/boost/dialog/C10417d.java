package com.tinder.boost.dialog;

import com.tinder.boost.presenter.C12629r;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.dialog.d */
public final class C10417d implements MembersInjector<BoostSummaryDialog> {
    /* renamed from: a */
    private final Provider<C12629r> f33981a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42296a((BoostSummaryDialog) obj);
    }

    /* renamed from: a */
    public void m42296a(BoostSummaryDialog boostSummaryDialog) {
        C10417d.m42295a(boostSummaryDialog, (C12629r) this.f33981a.get());
    }

    /* renamed from: a */
    public static void m42295a(BoostSummaryDialog boostSummaryDialog, C12629r c12629r) {
        boostSummaryDialog.f43480a = c12629r;
    }
}
