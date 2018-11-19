package com.tinder.feed.view;

import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u0018\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "feedItemId", "selectedCarouselItems", "", "call"}, k = 3, mv = {1, 1, 10})
final class FeedMainView$j<T1, T2, R> implements Func2<T, U, R> {
    /* renamed from: a */
    public static final FeedMainView$j f42047a = new FeedMainView$j();

    FeedMainView$j() {
    }

    public /* synthetic */ Object call(Object obj, Object obj2) {
        return m51343a((String) obj, (Map) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final Pair<String, String> m51343a(String str, Map<String, String> map) {
        return C15811g.a(str, map.get(str));
    }
}
