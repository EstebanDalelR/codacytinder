package com.tinder.fastmatch.view;

import com.tinder.fastmatch.presenter.C9387c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.b */
public final class C11674b implements MembersInjector<FastMatchPreviewRowView> {
    /* renamed from: a */
    private final Provider<C9387c> f38161a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47466a((FastMatchPreviewRowView) obj);
    }

    /* renamed from: a */
    public void m47466a(FastMatchPreviewRowView fastMatchPreviewRowView) {
        C11674b.m47465a(fastMatchPreviewRowView, (C9387c) this.f38161a.get());
    }

    /* renamed from: a */
    public static void m47465a(FastMatchPreviewRowView fastMatchPreviewRowView, C9387c c9387c) {
        fastMatchPreviewRowView.f38123a = c9387c;
    }
}
