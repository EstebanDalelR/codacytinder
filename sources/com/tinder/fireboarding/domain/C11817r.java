package com.tinder.fireboarding.domain;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.model.SwipeOrigin;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/domain/RemoveFireboardingRec;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/fireboarding/domain/Level;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "(Lcom/tinder/domain/recs/RecsEngine;)V", "execute", "", "request", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.r */
public final class C11817r implements VoidUseCase<Level> {
    /* renamed from: a */
    private final RecsEngine f38545a;

    public C11817r(@NotNull RecsEngine recsEngine) {
        C2668g.b(recsEngine, "recsEngine");
        this.f38545a = recsEngine;
    }

    public /* synthetic */ void execute(Object obj) {
        m47730a((Level) obj);
    }

    /* renamed from: a */
    public void m47730a(@NotNull Level level) {
        C2668g.b(level, "request");
        C11803i c11803i = new C11803i(level);
        this.f38545a.processPassOnRec(c11803i, new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.CARD));
    }
}
