package com.tinder.intropricing.domain.p264a;

import com.tinder.intropricing.domain.model.C9732b;
import com.tinder.intropricing.domain.model.IntroPricingPaywallType;
import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/intropricing/domain/usecases/ObserveIntroPricingAvailability;", "", "repository", "Lcom/tinder/intropricing/domain/repo/IntroPricingApplicationRepository;", "(Lcom/tinder/intropricing/domain/repo/IntroPricingApplicationRepository;)V", "execute", "Lio/reactivex/Observable;", "Lcom/tinder/intropricing/domain/model/IntroPricingAvailability;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.domain.a.a */
public final class C9730a {
    /* renamed from: a */
    private final IntroPricingApplicationRepository f32330a;

    @Inject
    public C9730a(@NotNull IntroPricingApplicationRepository introPricingApplicationRepository) {
        C2668g.b(introPricingApplicationRepository, "repository");
        this.f32330a = introPricingApplicationRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<C9732b> m40229a() {
        C3959e<C9732b> just = C3959e.just(new C9732b(false, IntroPricingPaywallType.THREE_SKU));
        C2668g.a(just, "Observable.just(\n       …Type.THREE_SKU)\n        )");
        return just;
    }
}
