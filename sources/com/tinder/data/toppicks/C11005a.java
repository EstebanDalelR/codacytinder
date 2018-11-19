package com.tinder.data.toppicks;

import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.subjects.C19040a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/toppicks/InMemoryTopPicksSessionRepository;", "Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "()V", "sessionSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "kotlin.jvm.PlatformType", "getCurrentSession", "observeTopPicksSession", "Lio/reactivex/Flowable;", "updateCurrentSession", "", "topPicksSession", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.a */
public final class C11005a implements TopPicksSessionRepository {
    /* renamed from: a */
    private final C19040a<TopPicksSession> f35741a = C19040a.a(new TopPicksSession(new DateTime(0), false, false, false, false, 30, null));

    @NotNull
    public C3957b<TopPicksSession> observeTopPicksSession() {
        C3957b<TopPicksSession> toFlowable = this.f35741a.toFlowable(BackpressureStrategy.LATEST);
        C2668g.a(toFlowable, "sessionSubject.toFlowabl…kpressureStrategy.LATEST)");
        return toFlowable;
    }

    public void updateCurrentSession(@NotNull TopPicksSession topPicksSession) {
        C2668g.b(topPicksSession, "topPicksSession");
        this.f35741a.onNext(topPicksSession);
    }

    @NotNull
    public TopPicksSession getCurrentSession() {
        C19040a c19040a = this.f35741a;
        C2668g.a(c19040a, "sessionSubject");
        Object b = c19040a.b();
        C2668g.a(b, "sessionSubject.value");
        return (TopPicksSession) b;
    }
}
