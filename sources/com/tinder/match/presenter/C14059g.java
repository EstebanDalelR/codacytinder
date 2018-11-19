package com.tinder.match.presenter;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.domain.match.model.MessageAdMatch;
import rx.functions.Action1;

/* renamed from: com.tinder.match.presenter.g */
final /* synthetic */ class C14059g implements Action1 {
    /* renamed from: a */
    private final C9868e f44570a;
    /* renamed from: b */
    private final MessageAdMatch f44571b;

    C14059g(C9868e c9868e, MessageAdMatch messageAdMatch) {
        this.f44570a = c9868e;
        this.f44571b = messageAdMatch;
    }

    public void call(Object obj) {
        this.f44570a.m40604a(this.f44571b, (TabbedPageLayout$Page) obj);
    }
}
