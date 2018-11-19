package com.tinder.match.adapter;

import com.tinder.match.viewmodel.C12102k;
import com.tinder.match.views.NewMatchRowView;
import java8.util.function.Consumer;

/* renamed from: com.tinder.match.adapter.g */
final /* synthetic */ class C12034g implements Consumer {
    /* renamed from: a */
    private final NewMatchRowView f39142a;

    private C12034g(NewMatchRowView newMatchRowView) {
        this.f39142a = newMatchRowView;
    }

    /* renamed from: a */
    static Consumer m48133a(NewMatchRowView newMatchRowView) {
        return new C12034g(newMatchRowView);
    }

    public void accept(Object obj) {
        this.f39142a.m48231a((C12102k) obj);
    }
}
