package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.iu;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureShowIntroEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/reactions/analytics/GestureIntroFrom;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lrx/Completable;", "request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.f */
public final class C16275f implements CompletableUseCase<GestureIntroFrom> {
    /* renamed from: a */
    private final C2630h f50685a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.f$a */
    static final class C18654a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16275f f58124a;
        /* renamed from: b */
        final /* synthetic */ GestureIntroFrom f58125b;

        C18654a(C16275f c16275f, GestureIntroFrom gestureIntroFrom) {
            this.f58124a = c16275f;
            this.f58125b = gestureIntroFrom;
        }

        public final void call() {
            this.f58124a.f50685a.a(iu.a().a(this.f58125b.getAnalyticsValue()).a());
        }
    }

    @Inject
    public C16275f(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f50685a = c2630h;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m61457a((GestureIntroFrom) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m61457a(@NotNull GestureIntroFrom gestureIntroFrom) {
        C2668g.b(gestureIntroFrom, "request");
        gestureIntroFrom = Completable.a(new C18654a(this, gestureIntroFrom));
        C2668g.a(gestureIntroFrom, "Completable.fromAction {…ShowIntroEvent)\n        }");
        return gestureIntroFrom;
    }
}
