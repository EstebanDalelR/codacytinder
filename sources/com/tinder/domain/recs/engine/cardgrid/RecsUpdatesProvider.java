package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.domain.recs.model.RecsUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/engine/cardgrid/RecsUpdatesProvider;", "", "()V", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "get", "observe", "Lrx/Observable;", "update", "", "newUpdate", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RecsUpdatesProvider {
    private final C19785a<RecsUpdate> subject = C19785a.w();

    @Nullable
    public final synchronized RecsUpdate get() {
        C19785a c19785a;
        c19785a = this.subject;
        C2668g.a(c19785a, "subject");
        return (RecsUpdate) c19785a.A();
    }

    @NotNull
    public final Observable<RecsUpdate> observe() {
        Observable<RecsUpdate> k = this.subject.e().g().k();
        C2668g.a(k, "subject.asObservable()\n …  .onBackpressureBuffer()");
        return k;
    }

    public final synchronized void update(@NotNull RecsUpdate recsUpdate) {
        C2668g.b(recsUpdate, "newUpdate");
        this.subject.onNext(recsUpdate);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Emitted RecsUpdate: ");
        stringBuilder.append(recsUpdate);
        C0001a.b(stringBuilder.toString(), new Object[0]);
    }
}
