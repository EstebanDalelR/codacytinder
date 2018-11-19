package com.tinder.recs.analytics;

import com.tinder.common.navigation.Screen;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/common/navigation/Screen;", "it", "apply"}, k = 3, mv = {1, 1, 10})
final class RecsSessionTracker$startTracking$1<T, R> implements Function<T, R> {
    public static final RecsSessionTracker$startTracking$1 INSTANCE = new RecsSessionTracker$startTracking$1();

    RecsSessionTracker$startTracking$1() {
    }

    @NotNull
    public final Pair<Screen, Screen> apply(@NotNull Screen screen) {
        C2668g.b(screen, "it");
        return new Pair(null, screen);
    }
}
