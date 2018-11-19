package com.tinder.webprofile.p486a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.reactivex.usecase.SimpleCompletableUseCase;
import com.tinder.etl.event.eo;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/webprofile/analytics/AddDeepLinkCreateIdEvent;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lio/reactivex/Completable;", "webprofile_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.webprofile.a.b */
public final class C17269b implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f52937a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.a.b$a */
    static final class C17268a implements Action {
        /* renamed from: a */
        final /* synthetic */ C17269b f52936a;

        C17268a(C17269b c17269b) {
            this.f52936a = c17269b;
        }

        public final void run() {
            this.f52936a.f52937a.a(eo.a().a());
        }
    }

    @Inject
    public C17269b(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52937a = c2630h;
    }

    @NotNull
    public C3956a execute() {
        C3956a a = C3956a.a(new C17268a(this));
        C2668g.a(a, "Completable.fromAction {…addEvent(event)\n        }");
        return a;
    }
}
