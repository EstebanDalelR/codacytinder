package com.tinder.domain.recs.engine.dispatcher.common;

import com.tinder.domain.recs.engine.dispatcher.common.model.DispatcherState;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;
import rx.subjects.C19786b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010R*\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058G@GX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR2\u0010\r\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/DispatcherStateProvider;", "", "()V", "serializedStateSubject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "kotlin.jvm.PlatformType", "newState", "state", "getState", "()Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "setState", "(Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;)V", "stateSubject", "Lrx/subjects/BehaviorSubject;", "observeState", "Lrx/Observable;", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class DispatcherStateProvider {
    private final C19786b<DispatcherState, DispatcherState> serializedStateSubject = new C19786b(this.stateSubject);
    private final C19785a<DispatcherState> stateSubject = C19785a.f(new DispatcherState());

    @NotNull
    public final synchronized DispatcherState getState() {
        Object A;
        C19785a c19785a = this.stateSubject;
        C2668g.a(c19785a, "stateSubject");
        A = c19785a.A();
        C2668g.a(A, "stateSubject.value");
        return (DispatcherState) A;
    }

    public final synchronized void setState(@NotNull DispatcherState dispatcherState) {
        C2668g.b(dispatcherState, "newState");
        if ((C2668g.a(dispatcherState, getState()) ^ 1) != 0) {
            this.stateSubject.onNext(dispatcherState);
        }
    }

    @NotNull
    public final Observable<DispatcherState> observeState() {
        Observable<DispatcherState> e = this.serializedStateSubject.k().e();
        C2668g.a(e, "serializedStateSubject.o…reBuffer().asObservable()");
        return e;
    }
}
