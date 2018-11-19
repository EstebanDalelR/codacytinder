package com.tinder.tinderplus.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.model.C15219p.C15218b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddPlusSettingsRestoreEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/purchase/domain/model/Offer;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "etlEventFactory", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;)V", "createPlusRestoreOptions", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory$Options;", "offer", "execute", "Lrx/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tinderplus.analytics.d */
public final class C16938d implements CompletableUseCase<C14510e> {
    /* renamed from: a */
    private final C2630h f52214a;
    /* renamed from: b */
    private final C15219p f52215b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.d$a */
    static final class C18970a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16938d f58660a;
        /* renamed from: b */
        final /* synthetic */ C14510e f58661b;

        C18970a(C16938d c16938d, C14510e c14510e) {
            this.f58660a = c16938d;
            this.f58661b = c14510e;
        }

        public final void call() {
            this.f58660a.f52214a.a(this.f58660a.f52215b.m57272c(this.f58660a.m62628b(this.f58661b)));
        }
    }

    @Inject
    public C16938d(@NotNull C2630h c2630h, @NotNull C15219p c15219p) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15219p, "etlEventFactory");
        this.f52214a = c2630h;
        this.f52215b = c15219p;
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m62629a((C14510e) obj);
    }

    @NotNull
    /* renamed from: a */
    public Completable m62629a(@NotNull C14510e c14510e) {
        C2668g.b(c14510e, "offer");
        c14510e = Completable.a(new C18970a(this, c14510e));
        C2668g.a(c14510e, "Completable.fromAction {…addEvent(event)\n        }");
        return c14510e;
    }

    /* renamed from: b */
    private final C15218b m62628b(C14510e c14510e) {
        c14510e = C15218b.m57256h().mo12629a(Integer.valueOf(24)).mo12631a(false).mo12628a(c14510e).mo12634b(C17554o.m64195a()).mo12630a(C17554o.m64195a()).mo12632a();
        C2668g.a(c14510e, "TinderPlusEtlEventFactor…\n                .build()");
        return c14510e;
    }
}
