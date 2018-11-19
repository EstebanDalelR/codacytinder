package com.tinder.core.experiment;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/core/experiment/PersistentConnectionExperimentUtility;", "", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "isPersistentConnectionEnabled", "", "()Z", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.m */
public final class C8597m {
    /* renamed from: a */
    private final boolean f30427a;

    @Inject
    public C8597m(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f30427a = abTestUtility.isPersistentConnectionEnabled();
    }

    /* renamed from: a */
    public final boolean m36697a() {
        return this.f30427a;
    }
}
