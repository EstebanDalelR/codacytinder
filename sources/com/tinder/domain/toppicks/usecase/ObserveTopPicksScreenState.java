package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.reactivex.usecase.FlowableResultUseCase;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.TopPicksScreenState;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksScreenState;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableResultUseCase;", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "topPicksSessionObserver", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;Lkotlin/jvm/functions/Function0;)V", "execute", "Lio/reactivex/Flowable;", "resolveNotLoadedState", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "resolveScreenState", "session", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "resolveStateForGoldUsers", "resolveStateForNonGoldUsers", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ObserveTopPicksScreenState implements FlowableResultUseCase<TopPicksScreenState> {
    private final Function0<DateTime> dateTimeProvider;
    private final SubscriptionProvider subscriptionProvider;
    private final ObserveTopPicksSession topPicksSessionObserver;

    @Inject
    public ObserveTopPicksScreenState(@NotNull SubscriptionProvider subscriptionProvider, @NotNull ObserveTopPicksSession observeTopPicksSession, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(observeTopPicksSession, "topPicksSessionObserver");
        C2668g.b(function0, "dateTimeProvider");
        this.subscriptionProvider = subscriptionProvider;
        this.topPicksSessionObserver = observeTopPicksSession;
        this.dateTimeProvider = function0;
    }

    @NotNull
    public C3957b<TopPicksScreenState> execute() {
        C3957b<TopPicksScreenState> a = C3957b.a(RxJavaInteropExtKt.toV2Flowable(this.subscriptionProvider.observe()), this.topPicksSessionObserver.execute(), new ObserveTopPicksScreenState$execute$1(this));
        C2668g.a(a, "Flowable.combineLatest(\n…, session)\n            })");
        return a;
    }

    private final TopPicksScreenState resolveScreenState(Subscription subscription, TopPicksSession topPicksSession) {
        if (topPicksSession.getRefreshTime().isBefore((ReadableInstant) this.dateTimeProvider.invoke())) {
            return resolveNotLoadedState(subscription);
        }
        if (subscription.isGold() != null) {
            return resolveStateForGoldUsers(topPicksSession);
        }
        return resolveStateForNonGoldUsers(topPicksSession);
    }

    private final TopPicksScreenState resolveNotLoadedState(Subscription subscription) {
        if (subscription.isGold() != null) {
            return TopPicksScreenState.NOT_LOADED_GOLD;
        }
        return TopPicksScreenState.NOT_LOADED_NON_GOLD;
    }

    private final TopPicksScreenState resolveStateForGoldUsers(TopPicksSession topPicksSession) {
        if (topPicksSession.getHasTopPicks()) {
            return TopPicksScreenState.GOLD;
        }
        if (topPicksSession.getHasTeasers() != null) {
            return TopPicksScreenState.GOLD_EXHAUSTED;
        }
        return TopPicksScreenState.TOP_PICKS_NOT_AVAILABLE;
    }

    private final TopPicksScreenState resolveStateForNonGoldUsers(TopPicksSession topPicksSession) {
        if (topPicksSession.getHasTeasers() != null) {
            return TopPicksScreenState.NON_GOLD;
        }
        return TopPicksScreenState.TOP_PICKS_NOT_AVAILABLE;
    }
}
