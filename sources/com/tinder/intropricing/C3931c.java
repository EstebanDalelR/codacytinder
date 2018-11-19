package com.tinder.intropricing;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.intropricing.domain.worker.C9733a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/intropricing/StopIntroPricingWorkers;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "abTesting", "Lcom/tinder/core/experiment/AbTestUtility;", "introPricingWorkerRegistry", "Lcom/tinder/intropricing/domain/worker/IntroPricingWorkerRegistry;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/intropricing/domain/worker/IntroPricingWorkerRegistry;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.c */
public final class C3931c implements SimpleVoidUseCase {
    /* renamed from: a */
    private final AbTestUtility f12305a;
    /* renamed from: b */
    private final C9733a f12306b;

    @Inject
    public C3931c(@NotNull AbTestUtility abTestUtility, @NotNull C9733a c9733a) {
        C2668g.m10309b(abTestUtility, "abTesting");
        C2668g.m10309b(c9733a, "introPricingWorkerRegistry");
        this.f12305a = abTestUtility;
        this.f12306b = c9733a;
    }

    public void execute() {
        if (this.f12305a.isIntroPricingEnabled()) {
            this.f12306b.b();
        }
    }
}
