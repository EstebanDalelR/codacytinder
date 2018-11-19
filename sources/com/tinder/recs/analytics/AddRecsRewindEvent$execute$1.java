package com.tinder.recs.analytics;

import com.tinder.domain.common.model.Subscription;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "rewindsAvailable", "apply"}, k = 3, mv = {1, 1, 10})
final class AddRecsRewindEvent$execute$1<T1, T2, R> implements BiFunction<Subscription, Integer, Pair<? extends Boolean, ? extends Integer>> {
    public static final AddRecsRewindEvent$execute$1 INSTANCE = new AddRecsRewindEvent$execute$1();

    AddRecsRewindEvent$execute$1() {
    }

    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return apply((Subscription) obj, ((Number) obj2).intValue());
    }

    @NotNull
    public final Pair<Boolean, Integer> apply(@NotNull Subscription subscription, int i) {
        C2668g.b(subscription, "subscription");
        return new Pair(Boolean.valueOf(subscription.isActiveSubscription()), Integer.valueOf(i));
    }
}
