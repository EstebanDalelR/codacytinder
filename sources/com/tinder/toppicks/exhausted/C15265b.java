package com.tinder.toppicks.exhausted;

import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import com.tinder.recs.domain.model.CustomRecEngineResetReason;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPresenter;", "", "resetTopPickSession", "Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;", "(Lcom/tinder/domain/toppicks/usecase/ResetTopPickSession;)V", "target", "Lcom/tinder/toppicks/exhausted/TopPicksExhaustedTarget;", "dropTarget", "", "resetSession", "resetReason", "Lcom/tinder/recs/domain/model/CustomRecEngineResetReason;", "takeTarget", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.exhausted.b */
public final class C15265b {
    /* renamed from: a */
    private final ResetTopPickSession f47386a;

    @Inject
    public C15265b(@NotNull ResetTopPickSession resetTopPickSession) {
        C2668g.b(resetTopPickSession, "resetTopPickSession");
        this.f47386a = resetTopPickSession;
    }

    /* renamed from: a */
    public final void m57365a(@NotNull CustomRecEngineResetReason customRecEngineResetReason) {
        C2668g.b(customRecEngineResetReason, "resetReason");
        this.f47386a.execute(customRecEngineResetReason);
    }
}
