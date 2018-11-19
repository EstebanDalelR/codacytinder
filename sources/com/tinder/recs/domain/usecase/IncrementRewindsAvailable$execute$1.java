package com.tinder.recs.domain.usecase;

import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "currentRewindCount", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Completable;"}, k = 3, mv = {1, 1, 10})
final class IncrementRewindsAvailable$execute$1<T, R> implements Function<Integer, CompletableSource> {
    final /* synthetic */ IncrementRewindsAvailable this$0;

    IncrementRewindsAvailable$execute$1(IncrementRewindsAvailable incrementRewindsAvailable) {
        this.this$0 = incrementRewindsAvailable;
    }

    @NotNull
    public final C3956a apply(@NotNull Integer num) {
        C2668g.b(num, "currentRewindCount");
        return this.this$0.rewindsAvailableRepository.updateRewindCount(num.intValue() + 1);
    }
}
