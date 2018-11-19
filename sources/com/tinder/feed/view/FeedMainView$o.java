package com.tinder.feed.view;

import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
final class FeedMainView$o<T> implements Action1<Boolean> {
    /* renamed from: a */
    final /* synthetic */ FeedMainView f44154a;

    FeedMainView$o(FeedMainView feedMainView) {
        this.f44154a = feedMainView;
    }

    public /* synthetic */ void call(Object obj) {
        m53530a((Boolean) obj);
    }

    /* renamed from: a */
    public final void m53530a(Boolean bool) {
        this.f44154a.getPresenter$Tinder_release().m39620g();
    }
}
