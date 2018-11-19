package com.tinder.tinderplus.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleCompletableUseCase;
import com.tinder.tinderplus.model.C15219p;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddPlusRestoreFailureEvent;", "Lcom/tinder/domain/common/usecase/SimpleCompletableUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "etlEventFactory", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;)V", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tinderplus.analytics.c */
public final class C16937c implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C2630h f52212a;
    /* renamed from: b */
    private final C15219p f52213b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.c$a */
    static final class C18969a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16937c f58659a;

        C18969a(C16937c c16937c) {
            this.f58659a = c16937c;
        }

        public final void call() {
            this.f58659a.f52212a.a(this.f58659a.f52213b.m57269a());
        }
    }

    @Inject
    public C16937c(@NotNull C2630h c2630h, @NotNull C15219p c15219p) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15219p, "etlEventFactory");
        this.f52212a = c2630h;
        this.f52213b = c15219p;
    }

    @NotNull
    public Completable execute() {
        Completable a = Completable.a(new C18969a(this));
        C2668g.a(a, "Completable.fromAction {…addEvent(event)\n        }");
        return a;
    }
}
