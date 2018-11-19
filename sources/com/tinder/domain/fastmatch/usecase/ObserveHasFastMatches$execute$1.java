package com.tinder.domain.fastmatch.usecase;

import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "fastMatchConfig", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "apply"}, k = 3, mv = {1, 1, 10})
final class ObserveHasFastMatches$execute$1<T1, T2, R> implements BiFunction<FastMatchConfig, FastMatchStatus, Boolean> {
    public static final ObserveHasFastMatches$execute$1 INSTANCE = new ObserveHasFastMatches$execute$1();

    ObserveHasFastMatches$execute$1() {
    }

    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(apply((FastMatchConfig) obj, (FastMatchStatus) obj2));
    }

    public final boolean apply(@NotNull FastMatchConfig fastMatchConfig, @NotNull FastMatchStatus fastMatchStatus) {
        C2668g.b(fastMatchConfig, "fastMatchConfig");
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        return (fastMatchConfig.isEnabled() == null || fastMatchStatus.getCount() <= null) ? null : true;
    }
}
