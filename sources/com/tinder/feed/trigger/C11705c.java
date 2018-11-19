package com.tinder.feed.trigger;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.profile.usecase.IsUserDueForFeedTooltip;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import io.reactivex.functions.BiFunction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/feed/trigger/ShouldShowFeedTooltip;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "isUserDueForFeedTooltip", "Lcom/tinder/domain/profile/usecase/IsUserDueForFeedTooltip;", "observeHasNewFeedItems", "Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;", "(Lcom/tinder/domain/profile/usecase/IsUserDueForFeedTooltip;Lcom/tinder/domain/feed/usecase/ObserveHasNewFeedItems;)V", "execute", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.trigger.c */
public final class C11705c implements ObservableResultUseCase<Boolean> {
    /* renamed from: a */
    private final IsUserDueForFeedTooltip f38214a;
    /* renamed from: b */
    private final ObserveHasNewFeedItems f38215b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isUserDueForFeedTooltip", "hasNewFeedItems", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.trigger.c$a */
    static final class C11704a<T1, T2, R> implements BiFunction<Boolean, Boolean, Boolean> {
        /* renamed from: a */
        public static final C11704a f38213a = new C11704a();

        C11704a() {
        }

        /* renamed from: a */
        public final boolean m47531a(boolean z, boolean z2) {
            return z && z2;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return Boolean.valueOf(m47531a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
        }
    }

    @Inject
    public C11705c(@NotNull IsUserDueForFeedTooltip isUserDueForFeedTooltip, @NotNull ObserveHasNewFeedItems observeHasNewFeedItems) {
        C2668g.b(isUserDueForFeedTooltip, "isUserDueForFeedTooltip");
        C2668g.b(observeHasNewFeedItems, "observeHasNewFeedItems");
        this.f38214a = isUserDueForFeedTooltip;
        this.f38215b = observeHasNewFeedItems;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> combineLatest = C3959e.combineLatest(this.f38214a.execute().e(), RxJavaInteropExtKt.toV2Observable(this.f38215b.execute()), C11704a.f38213a);
        C2668g.a(combineLatest, "combineLatest(\n         …             })\n        )");
        return combineLatest;
    }
}
