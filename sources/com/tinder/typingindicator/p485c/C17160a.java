package com.tinder.typingindicator.p485c;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.C8597m;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/typingindicator/experiment/AbTestTypingIndicatorExperimentUtility;", "Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;", "persistentConnectionExperimentUtility", "Lcom/tinder/core/experiment/PersistentConnectionExperimentUtility;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/PersistentConnectionExperimentUtility;Lcom/tinder/core/experiment/AbTestUtility;)V", "isTypingIndicatorEnabled", "", "()Z", "isTypingIndicatorMorphAnimationEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.c.a */
public final class C17160a implements TypingIndicatorExperimentUtility {
    /* renamed from: a */
    private final boolean f52688a;
    /* renamed from: b */
    private final boolean f52689b;

    @Inject
    public C17160a(@NotNull C8597m c8597m, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(c8597m, "persistentConnectionExperimentUtility");
        C2668g.b(abTestUtility, "abTestUtility");
        boolean z = false;
        c8597m = (c8597m.a() == null || abTestUtility.typingIndicatorEnabled() == null) ? null : true;
        this.f52688a = c8597m;
        if (!(isTypingIndicatorEnabled() == null || abTestUtility.typingIndicatorMorphAnimationEnabled() == null)) {
            z = true;
        }
        this.f52689b = z;
    }

    public boolean isTypingIndicatorEnabled() {
        return this.f52688a;
    }

    public boolean isTypingIndicatorMorphAnimationEnabled() {
        return this.f52689b;
    }
}
