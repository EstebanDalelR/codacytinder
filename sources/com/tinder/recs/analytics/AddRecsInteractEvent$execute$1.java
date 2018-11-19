package com.tinder.recs.analytics;

import com.tinder.etl.event.ty;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/RecsInteractEvent;", "call"}, k = 3, mv = {1, 1, 10})
final class AddRecsInteractEvent$execute$1<T, R> implements Func1<ty, Completable> {
    final /* synthetic */ AddRecsInteractEvent this$0;

    AddRecsInteractEvent$execute$1(AddRecsInteractEvent addRecsInteractEvent) {
        this.this$0 = addRecsInteractEvent;
    }

    public final Completable call(final ty tyVar) {
        return Completable.a(new Callable<Object>() {
            public final void call() {
                this.this$0.fireworks.a(tyVar);
            }
        });
    }
}
