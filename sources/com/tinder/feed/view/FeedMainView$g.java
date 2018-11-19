package com.tinder.feed.view;

import com.tinder.domain.feed.FeedCarouselItemSelected;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "map", "kotlin.jvm.PlatformType", "item", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "call"}, k = 3, mv = {1, 1, 10})
final class FeedMainView$g<T1, T2, R> implements Func2<R, T, R> {
    /* renamed from: a */
    public static final FeedMainView$g f42044a = new FeedMainView$g();

    FeedMainView$g() {
    }

    public /* synthetic */ Object call(Object obj, Object obj2) {
        return m51340a((Map) obj, (FeedCarouselItemSelected) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m51340a(Map<String, String> map, FeedCarouselItemSelected feedCarouselItemSelected) {
        C2668g.a(map, "map");
        return ae.a(map, C15811g.a(feedCarouselItemSelected.getFeedItemId(), feedCarouselItemSelected.getMediaItemId()));
    }
}
