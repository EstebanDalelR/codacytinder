package com.tinder.recs.presenter;

import com.tinder.deeplink.p229b.C8819a.C8818a;
import java8.util.Optional;
import java8.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "deepLinkedRecDetailsOptional", "Ljava8/util/Optional;", "Lcom/tinder/deeplink/provider/DeepLinkedEventProvider$DeepLinkedRecDetails;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$subscribeToDeepLinkedRecEvent$1<T> implements Action1<Optional<C8818a>> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$subscribeToDeepLinkedRecEvent$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void call(Optional<C8818a> optional) {
        optional.m59126a(new Consumer<C8818a>() {
            public final void accept(C8818a c8818a) {
                RecsPresenter recsPresenter = this.this$0;
                C2668g.a(c8818a, "it");
                recsPresenter.deepLinkedRecReceived(c8818a);
            }
        }, new Runnable() {
            public final void run() {
                this.this$0.deepLinkedRecLoadFailed();
            }
        });
    }
}
