package com.tinder.feed.view;

import com.tinder.common.tracker.recyclerview.p199b.C8570i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "rangeUpdate", "Lcom/tinder/common/tracker/recyclerview/model/ListVisibleRangeUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class FeedMainView$t<T, R> implements Func1<C8570i, Completable> {
    /* renamed from: a */
    final /* synthetic */ FeedMainView f42051a;

    FeedMainView$t(FeedMainView feedMainView) {
        this.f42051a = feedMainView;
    }

    public /* synthetic */ Object call(Object obj) {
        return m51347a((C8570i) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Completable m51347a(C8570i c8570i) {
        return this.f42051a.getFeedRangeRepository$Tinder_release().setRange(c8570i.m36571a(), c8570i.m36572b());
    }
}
