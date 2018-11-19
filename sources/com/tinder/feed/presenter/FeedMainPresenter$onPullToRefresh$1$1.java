package com.tinder.feed.presenter;

import com.tinder.domain.feed.FeedRequestResult;
import com.tinder.feed.analytics.C9434e;
import com.tinder.feed.analytics.C9434e.C11685c;
import com.tinder.feed.presenter.C9468e.C13995l;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/tinder/domain/feed/FeedRequestResult;", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedMainPresenter$onPullToRefresh$1$1 extends Lambda implements Function1<FeedRequestResult, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C13995l f44112a;
    /* renamed from: b */
    final /* synthetic */ Boolean f44113b;

    FeedMainPresenter$onPullToRefresh$1$1(C13995l c13995l, Boolean bool) {
        this.f44112a = c13995l;
        this.f44113b = bool;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53497a((FeedRequestResult) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53497a(@NotNull FeedRequestResult feedRequestResult) {
        C2668g.b(feedRequestResult, "result");
        C9468e c9468e = this.f44112a.f44135a;
        Boolean bool = this.f44113b;
        C2668g.a(bool, "hasNewFeedItems");
        c9468e.m39596a((C9434e) new C11685c(bool.booleanValue()), feedRequestResult);
    }
}
