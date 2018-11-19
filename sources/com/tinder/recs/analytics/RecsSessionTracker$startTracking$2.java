package com.tinder.recs.analytics;

import com.tinder.common.navigation.Screen;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/common/navigation/Screen;", "previousScreens", "currentScreens", "apply"}, k = 3, mv = {1, 1, 10})
final class RecsSessionTracker$startTracking$2<T1, T2, R> implements BiFunction<Pair<? extends Screen, ? extends Screen>, Pair<? extends Screen, ? extends Screen>, Pair<? extends Screen, ? extends Screen>> {
    public static final RecsSessionTracker$startTracking$2 INSTANCE = new RecsSessionTracker$startTracking$2();

    RecsSessionTracker$startTracking$2() {
    }

    @NotNull
    public final Pair<Screen, Screen> apply(@NotNull Pair<? extends Screen, ? extends Screen> pair, @NotNull Pair<? extends Screen, ? extends Screen> pair2) {
        C2668g.b(pair, "previousScreens");
        C2668g.b(pair2, "currentScreens");
        return new Pair(pair.m59804b(), pair2.m59804b());
    }
}
