package com.tinder.recs.analytics;

import com.tinder.recs.analytics.AddRecsRewindEvent.AddRecsRewindEventRequest;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "apply"}, k = 3, mv = {1, 1, 10})
final class AddRecsRewindEvent$execute$2<T, R> implements Function<Pair<? extends Boolean, ? extends Integer>, CompletableSource> {
    final /* synthetic */ AddRecsRewindEventRequest $request;
    final /* synthetic */ AddRecsRewindEvent this$0;

    AddRecsRewindEvent$execute$2(AddRecsRewindEvent addRecsRewindEvent, AddRecsRewindEventRequest addRecsRewindEventRequest) {
        this.this$0 = addRecsRewindEvent;
        this.$request = addRecsRewindEventRequest;
    }

    public final C3956a apply(@NotNull Pair<Boolean, Integer> pair) {
        C2668g.b(pair, "<name for destructuring parameter 0>");
        final boolean booleanValue = ((Boolean) pair.m59805c()).booleanValue();
        pair = ((Number) pair.m59806d()).intValue();
        return C3956a.a(new Callable<Object>() {
            public final void call() {
                this.this$0.fireworks.a(this.this$0.buildRecsRewindEvent(this.$request, booleanValue, pair));
            }
        });
    }
}
