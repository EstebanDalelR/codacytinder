package com.tinder.recs.analytics;

import com.tinder.common.navigation.Screen;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/tinder/common/navigation/Screen;", "test"}, k = 3, mv = {1, 1, 10})
final class RecsSessionTracker$startTracking$3<T> implements Predicate<Pair<? extends Screen, ? extends Screen>> {
    public static final RecsSessionTracker$startTracking$3 INSTANCE = new RecsSessionTracker$startTracking$3();

    RecsSessionTracker$startTracking$3() {
    }

    public final boolean test(@NotNull Pair<? extends Screen, ? extends Screen> pair) {
        C2668g.b(pair, "it");
        return C2668g.a((Screen) pair.m59803a(), (Screen) pair.m59804b()) ^ 1;
    }
}
