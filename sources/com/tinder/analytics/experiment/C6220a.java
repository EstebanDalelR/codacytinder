package com.tinder.analytics.experiment;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.etl.event.aaf;
import com.tinder.etl.event.aai;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/analytics/experiment/AbTestVariantsReporter;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/analytics/fireworks/Fireworks;)V", "sendVariantAddEvent", "", "sendVariantResetEvent", "reason", "Lcom/tinder/analytics/experiment/VariantResetReason;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.experiment.a */
public final class C6220a {
    /* renamed from: a */
    private final AbTestUtility f22784a;
    /* renamed from: b */
    private final C2630h f22785b;

    @Inject
    public C6220a(@NotNull AbTestUtility abTestUtility, @NotNull C2630h c2630h) {
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c2630h, "fireworks");
        this.f22784a = abTestUtility;
        this.f22785b = c2630h;
    }

    /* renamed from: a */
    public final void m26851a(@NotNull VariantResetReason variantResetReason) {
        C2668g.b(variantResetReason, "reason");
        this.f22785b.a(aai.a().a(variantResetReason.getValue()).a());
    }

    /* renamed from: a */
    public final void m26850a() {
        for (Long a : this.f22784a.getVariantIds()) {
            this.f22785b.a(aaf.a().a(a).a());
        }
    }
}
