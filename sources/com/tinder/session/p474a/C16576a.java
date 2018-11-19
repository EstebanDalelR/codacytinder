package com.tinder.session.p474a;

import com.tinder.data.ObservingProvider;
import com.tinder.domain.session.SessionState;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/session/provider/SessionStateProvider;", "Lcom/tinder/data/ObservingProvider;", "Lcom/tinder/domain/session/SessionState;", "()V", "state", "Lrx/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "get", "observe", "Lrx/Observable;", "update", "", "newState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.a.a */
public final class C16576a implements ObservingProvider<SessionState> {
    /* renamed from: a */
    private final C19785a<SessionState> f51277a = C19785a.f(SessionState.INACTIVE);

    public /* synthetic */ Object get() {
        return m62008a();
    }

    public /* synthetic */ void update(Object obj) {
        m62009a((SessionState) obj);
    }

    @NotNull
    /* renamed from: a */
    public SessionState m62008a() {
        C19785a c19785a = this.f51277a;
        C2668g.a(c19785a, "state");
        Object A = c19785a.A();
        C2668g.a(A, "state.value");
        return (SessionState) A;
    }

    @NotNull
    public Observable<SessionState> observe() {
        Observable<SessionState> f = this.f51277a.e().f();
        C2668g.a(f, "state.asObservable().distinct()");
        return f;
    }

    /* renamed from: a */
    public void m62009a(@Nullable SessionState sessionState) {
        if (sessionState != null) {
            this.f51277a.onNext(sessionState);
        }
    }
}
