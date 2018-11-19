package com.tinder.core.experiment;

import com.tinder.common.provider.C8550g;
import com.tinder.core.experiment.PlacesToggleCollapseDetails.Variant;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/core/experiment/PlacesToggleCollapseDefaultExperiment;", "", "deviceVariantMapper", "Lcom/tinder/core/experiment/DeviceVariantMapper;", "Lcom/tinder/core/experiment/PlacesToggleCollapseDetails$Variant;", "todayDateProvider", "Lcom/tinder/common/provider/TodayDateProvider;", "(Lcom/tinder/core/experiment/DeviceVariantMapper;Lcom/tinder/common/provider/TodayDateProvider;)V", "details", "Lcom/tinder/core/experiment/PlacesToggleCollapseDetails;", "variant", "getVariant", "()Lcom/tinder/core/experiment/PlacesToggleCollapseDetails$Variant;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.o */
public final class C8598o {
    /* renamed from: a */
    private final PlacesToggleCollapseDetails f30428a = new PlacesToggleCollapseDetails();
    /* renamed from: b */
    private final C8593g<Variant> f30429b;
    /* renamed from: c */
    private final C8550g f30430c;

    @Inject
    public C8598o(@NotNull C8593g<Variant> c8593g, @NotNull C8550g c8550g) {
        C2668g.b(c8593g, "deviceVariantMapper");
        C2668g.b(c8550g, "todayDateProvider");
        this.f30429b = c8593g;
        this.f30430c = c8550g;
    }

    @NotNull
    /* renamed from: a */
    public final Variant m36698a() {
        if (C8599p.f30433c.contains(this.f30430c.m36535b())) {
            return (Variant) this.f30429b.m36685a((AuthExperimentDetailsProvider) this.f30428a);
        }
        return this.f30428a.m43043a();
    }
}
