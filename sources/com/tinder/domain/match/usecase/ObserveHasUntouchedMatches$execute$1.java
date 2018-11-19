package com.tinder.domain.match.usecase;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Long;)Z"}, k = 3, mv = {1, 1, 10})
final class ObserveHasUntouchedMatches$execute$1<T, R> implements Function<T, R> {
    public static final ObserveHasUntouchedMatches$execute$1 INSTANCE = new ObserveHasUntouchedMatches$execute$1();

    ObserveHasUntouchedMatches$execute$1() {
    }

    public /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(apply((Long) obj));
    }

    public final boolean apply(@NotNull Long l) {
        C2668g.b(l, "it");
        return l.longValue() > 0 ? true : null;
    }
}
