package com.tinder.intropricing.domain.worker;

import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001a\b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u0019\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/intropricing/domain/worker/IntroPricingWorkerRegistry;", "", "set", "", "Lcom/tinder/intropricing/domain/worker/IntroPricingWorker;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Set;)V", "start", "", "stop", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.intropricing.domain.worker.a */
public final class C9733a {
    /* renamed from: a */
    private final Set<IntroPricingWorker> f32335a;

    @Inject
    public C9733a(@NotNull Set<IntroPricingWorker> set) {
        C2668g.b(set, "set");
        this.f32335a = set;
    }

    /* renamed from: a */
    public final void m40231a() {
        for (IntroPricingWorker onStart : this.f32335a) {
            onStart.onStart();
        }
    }

    /* renamed from: b */
    public final void m40232b() {
        for (IntroPricingWorker onStop : this.f32335a) {
            onStop.onStop();
        }
    }
}
