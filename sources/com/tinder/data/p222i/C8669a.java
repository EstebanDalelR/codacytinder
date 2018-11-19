package com.tinder.data.p222i;

import com.tinder.domain.typingindicator.TypingIndicatorConfig;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.NoConfig;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/typingindicator/TypingIndicatorConfigDataStore;", "", "()V", "configProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "kotlin.jvm.PlatformType", "observeConfig", "Lio/reactivex/Flowable;", "updateConfig", "", "config", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.i.a */
public final class C8669a {
    /* renamed from: a */
    private final C18430a<TypingIndicatorConfig> f30523a = BehaviorProcessor.d(NoConfig.INSTANCE).u();

    @NotNull
    /* renamed from: a */
    public final C3957b<TypingIndicatorConfig> m36940a() {
        C3957b<TypingIndicatorConfig> d = this.f30523a.g().d();
        C2668g.a(d, "configProcessor.hide().distinctUntilChanged()");
        return d;
    }

    /* renamed from: a */
    public final void m36941a(@NotNull TypingIndicatorConfig typingIndicatorConfig) {
        C2668g.b(typingIndicatorConfig, "config");
        this.f30523a.onNext(typingIndicatorConfig);
    }
}
