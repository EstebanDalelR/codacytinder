package com.tinder.domain.common.reactivex;

import io.reactivex.functions.BiFunction;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "T", "throwable", "retryIndex", "apply", "(Ljava/lang/Throwable;Ljava/lang/Integer;)Lkotlin/Pair;"}, k = 3, mv = {1, 1, 10})
final class RetryOnErrorTransformer$createRetryNotification$1<T1, T2, R> implements BiFunction<Throwable, Integer, Pair<? extends Throwable, ? extends Integer>> {
    public static final RetryOnErrorTransformer$createRetryNotification$1 INSTANCE = new RetryOnErrorTransformer$createRetryNotification$1();

    RetryOnErrorTransformer$createRetryNotification$1() {
    }

    @NotNull
    public final Pair<Throwable, Integer> apply(@NotNull Throwable th, @NotNull Integer num) {
        C2668g.b(th, "throwable");
        C2668g.b(num, "retryIndex");
        return C15811g.a(th, num);
    }
}
