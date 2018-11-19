package com.tinder.feed.view;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u001a\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class FeedMainView$k<T> implements Action1<Pair<? extends String, ? extends String>> {
    /* renamed from: a */
    final /* synthetic */ FeedMainView f44152a;

    FeedMainView$k(FeedMainView feedMainView) {
        this.f44152a = feedMainView;
    }

    public /* synthetic */ void call(Object obj) {
        m53528a((Pair) obj);
    }

    /* renamed from: a */
    public final void m53528a(Pair<String, String> pair) {
        FeedMainView feedMainView = this.f44152a;
        Object a = pair.a();
        C2668g.a(a, "it.first");
        C9488c.m39672a(feedMainView, (String) a, (String) pair.b());
    }
}
