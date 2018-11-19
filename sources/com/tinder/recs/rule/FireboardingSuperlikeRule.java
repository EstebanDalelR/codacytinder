package com.tinder.recs.rule;

import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.fireboarding.domain.C11808l;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C9566h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/recs/rule/FireboardingSuperlikeRule;", "Lcom/tinder/domain/recs/rule/PreSwipeConsumptionRule;", "isSuperlikeEnabled", "Lcom/tinder/fireboarding/domain/IsSuperlikeEnabled;", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "(Lcom/tinder/fireboarding/domain/IsSuperlikeEnabled;Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;)V", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FireboardingSuperlikeRule implements PreSwipeConsumptionRule {
    private final C11808l isSuperlikeEnabled;
    private final C11811o observeFireboardingConfig;

    @Inject
    public FireboardingSuperlikeRule(@NotNull C11808l c11808l, @NotNull C11811o c11811o) {
        C2668g.b(c11808l, "isSuperlikeEnabled");
        C2668g.b(c11811o, "observeFireboardingConfig");
        this.isSuperlikeEnabled = c11808l;
        this.observeFireboardingConfig = c11811o;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (swipe.getType() == Type.SUPERLIKE && ((C9566h) this.observeFireboardingConfig.execute().c()).a() != null && ((Boolean) this.isSuperlikeEnabled.execute().a()).booleanValue() == null) {
            return ResultType.INTERRUPT;
        }
        return ResultType.PROCEED;
    }
}
