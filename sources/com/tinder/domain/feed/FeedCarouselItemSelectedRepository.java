package com.tinder.domain.feed;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;", "", "clear", "Lio/reactivex/Completable;", "observe", "Lio/reactivex/Observable;", "", "", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "put", "feedItemId", "feedCarouselItemSelected", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface FeedCarouselItemSelectedRepository {
    @NotNull
    C3956a clear();

    @NotNull
    C3959e<Map<String, FeedCarouselItemSelected>> observe();

    @NotNull
    C3956a put(@NotNull String str, @NotNull FeedCarouselItemSelected feedCarouselItemSelected);
}
