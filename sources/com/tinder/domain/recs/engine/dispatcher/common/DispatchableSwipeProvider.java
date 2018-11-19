package com.tinder.domain.recs.engine.dispatcher.common;

import com.tinder.domain.recs.model.Swipe;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/DispatchableSwipeProvider;", "", "()V", "swipeSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "observeDispatchableSwipe", "Lrx/Observable;", "updateDispatchableSwipes", "", "dispatchableSwipes", "", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class DispatchableSwipeProvider {
    private final PublishSubject<Swipe> swipeSubject = PublishSubject.w();

    @NotNull
    public final Observable<Swipe> observeDispatchableSwipe() {
        Observable<Swipe> e = this.swipeSubject.k().e();
        C2668g.a(e, "swipeSubject.onBackpressureBuffer().asObservable()");
        return e;
    }

    public final void updateDispatchableSwipes(@NotNull Collection<Swipe> collection) {
        C2668g.b(collection, "dispatchableSwipes");
        Observable.a(collection).c(new DispatchableSwipeProvider$updateDispatchableSwipes$1(this));
    }
}
