package com.tinder.tinderplus.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.model.C15219p.C15218b;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddPlusSkuOfferedEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "etlEventFactory", "Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/tinderplus/model/TinderPlusEtlEventFactory;Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tinderplus.analytics.e */
public final class C16939e implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C15219p f52216a;
    /* renamed from: b */
    private final C2630h f52217b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.e$a */
    static final class C18971a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16939e f58662a;

        C18971a(C16939e c16939e) {
            this.f58662a = c16939e;
        }

        public final void call() {
            this.f58662a.f52217b.a(this.f58662a.f52216a.m57270a(C15218b.m57256h().mo12632a()));
        }
    }

    @Inject
    public C16939e(@NotNull C15219p c15219p, @NotNull C2630h c2630h) {
        C2668g.b(c15219p, "etlEventFactory");
        C2668g.b(c2630h, "fireworks");
        this.f52216a = c15219p;
        this.f52217b = c2630h;
    }

    public void execute() {
        Completable.a(new C18971a(this)).b(Schedulers.io()).b(RxUtils.b());
    }
}
