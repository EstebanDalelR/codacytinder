package com.tinder.feed.view;

import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.feed.view.tracker.C9551g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/feed/view/DeleteFeedViewTrackingData;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "feedViewModelWithPositionMap", "Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;", "(Lcom/tinder/feed/view/tracker/FeedViewModelWithPositionMap;)V", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.a */
public final class C3929a implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C9551g f12298a;

    @Inject
    public C3929a(@NotNull C9551g c9551g) {
        C2668g.m10309b(c9551g, "feedViewModelWithPositionMap");
        this.f12298a = c9551g;
    }

    @NotNull
    public Completable execute() {
        Object c = Completable.m10374c(this.f12298a.a());
        C2668g.m10305a(c, "Completable.mergeDelayEr…tionMap.clear()\n        )");
        return c;
    }
}
