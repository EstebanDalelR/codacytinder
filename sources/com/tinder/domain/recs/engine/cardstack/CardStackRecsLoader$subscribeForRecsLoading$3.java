package com.tinder.domain.recs.engine.cardstack;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
final class CardStackRecsLoader$subscribeForRecsLoading$3<T> implements Action1<Throwable> {
    final /* synthetic */ CardStackRecsLoader this$0;

    CardStackRecsLoader$subscribeForRecsLoading$3(CardStackRecsLoader cardStackRecsLoader) {
        this.this$0 = cardStackRecsLoader;
    }

    public final void call(Throwable th) {
        CardStackRecsLoader cardStackRecsLoader = this.this$0;
        C2668g.a(th, "it");
        cardStackRecsLoader.handleRecsLoadingError(th);
    }
}
