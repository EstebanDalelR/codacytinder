package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.uk;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsSessionEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/etl/event/RecsSessionEvent;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createCompletable", "Lio/reactivex/Completable;", "request", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddRecsSessionEvent implements VoidUseCase<uk> {
    private final C2630h fireworks;

    @Inject
    public AddRecsSessionEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.fireworks = c2630h;
    }

    public void execute(@NotNull uk ukVar) {
        C2668g.b(ukVar, "request");
        ukVar = createCompletable(ukVar).b(C15756a.m59010b());
        Action action = AddRecsSessionEvent$execute$1.INSTANCE;
        Function1 function1 = AddRecsSessionEvent$execute$2.INSTANCE;
        if (function1 != null) {
            function1 = new AddRecsSessionEvent$sam$io_reactivex_functions_Consumer$0(function1);
        }
        ukVar.a(action, (Consumer) function1);
    }

    private final C3956a createCompletable(uk ukVar) {
        ukVar = C3956a.a(new AddRecsSessionEvent$createCompletable$1(this, ukVar));
        C2668g.a(ukVar, "Completable.fromAction {…works.addEvent(request) }");
        return ukVar;
    }
}
