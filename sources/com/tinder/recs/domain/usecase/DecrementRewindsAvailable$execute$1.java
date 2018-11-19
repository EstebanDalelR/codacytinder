package com.tinder.recs.domain.usecase;

import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "currentRewindCount", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/CompletableSource;"}, k = 3, mv = {1, 1, 10})
final class DecrementRewindsAvailable$execute$1<T, R> implements Function<Integer, CompletableSource> {
    final /* synthetic */ DecrementRewindsAvailable this$0;

    DecrementRewindsAvailable$execute$1(DecrementRewindsAvailable decrementRewindsAvailable) {
        this.this$0 = decrementRewindsAvailable;
    }

    public final CompletableSource apply(@NotNull Integer num) {
        C2668g.b(num, "currentRewindCount");
        num = num.intValue() - 1;
        if (num >= null) {
            return this.this$0.rewindsAvailableRepository.updateRewindCount(num);
        }
        return C3956a.a();
    }
}
