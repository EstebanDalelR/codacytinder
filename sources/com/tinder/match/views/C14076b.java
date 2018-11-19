package com.tinder.match.views;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import rx.functions.Action1;

/* renamed from: com.tinder.match.views.b */
final /* synthetic */ class C14076b implements Action1 {
    /* renamed from: a */
    private final MatchListView f44595a;

    C14076b(MatchListView matchListView) {
        this.f44595a = matchListView;
    }

    public void call(Object obj) {
        this.f44595a.a((TabbedPageLayout$Page) obj);
    }
}
