package com.tinder.webprofile.p486a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.reactivex.usecase.SimpleCompletableUseCase;
import com.tinder.etl.event.ep;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/webprofile/analytics/AddDeepLinkDeleteIdEvent;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lio/reactivex/Completable;", "webprofile_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.webprofile.a.c */
public final class C17271c implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f52939a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.a.c$a */
    static final class C17270a implements Action {
        /* renamed from: a */
        final /* synthetic */ C17271c f52938a;

        C17270a(C17271c c17271c) {
            this.f52938a = c17271c;
        }

        public final void run() {
            this.f52938a.f52939a.a(ep.a().a());
        }
    }

    @Inject
    public C17271c(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52939a = c2630h;
    }

    @NotNull
    public C3956a execute() {
        C3956a a = C3956a.a(new C17270a(this));
        C2668g.a(a, "Completable.fromAction {…addEvent(event)\n        }");
        return a;
    }
}
