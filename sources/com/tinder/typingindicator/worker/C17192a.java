package com.tinder.typingindicator.worker;

import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import dagger.Lazy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/worker/ExperimentAwareTypingIndicatorWorker;", "Lcom/tinder/typingindicator/worker/TypingIndicatorWorker;", "experimentUtility", "Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;", "typingIndicatorEnabledWorker", "Ldagger/Lazy;", "Lcom/tinder/typingindicator/worker/TypingIndicatorEnabledWorker;", "typingIndicatorDisabledWorker", "Lcom/tinder/typingindicator/worker/TypingIndicatorDisabledWorker;", "(Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;Ldagger/Lazy;Ldagger/Lazy;)V", "internalTypingIndicatorWorker", "kotlin.jvm.PlatformType", "start", "", "stop", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.worker.a */
public final class C17192a implements TypingIndicatorWorker {
    /* renamed from: a */
    private final TypingIndicatorWorker f52756a;

    @Inject
    public C17192a(@NotNull TypingIndicatorExperimentUtility typingIndicatorExperimentUtility, @NotNull Lazy<C17203e> lazy, @NotNull Lazy<C17193c> lazy2) {
        C2668g.b(typingIndicatorExperimentUtility, "experimentUtility");
        C2668g.b(lazy, "typingIndicatorEnabledWorker");
        C2668g.b(lazy2, "typingIndicatorDisabledWorker");
        if (typingIndicatorExperimentUtility.isTypingIndicatorEnabled() != null) {
            typingIndicatorExperimentUtility = (TypingIndicatorWorker) lazy.get();
        } else {
            typingIndicatorExperimentUtility = (TypingIndicatorWorker) lazy2.get();
        }
        this.f52756a = typingIndicatorExperimentUtility;
    }

    public void start() {
        this.f52756a.start();
    }

    public void stop() {
        this.f52756a.stop();
    }
}
