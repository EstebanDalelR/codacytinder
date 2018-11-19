package com.tinder.domain.recs.engine;

import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.PreSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SuccessfulSwipeTerminationRule;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver;", "", "resolveSwipeRules", "Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver$SwipeProcessingRulesChain;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "SwipeProcessingRulesChain", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface SwipeProcessingRulesResolver {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/recs/engine/SwipeProcessingRulesResolver$SwipeProcessingRulesChain;", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "(Lcom/tinder/domain/recs/model/Swipe;)V", "postConsumptionRules", "", "Lcom/tinder/domain/recs/rule/PostSwipeConsumptionRule;", "preConsumptionRules", "Lcom/tinder/domain/recs/rule/PreSwipeConsumptionRule;", "successfulTerminationRules", "Lcom/tinder/domain/recs/rule/SuccessfulSwipeTerminationRule;", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "addPostSwipeConsumptionRule", "postConsumptionRule", "addPreSwipeConsumptionRule", "preConsumptionRule", "addSuccessfulTerminationRule", "successfulSwipeTerminationRule", "getPostConsumptionRules", "", "getPreConsumptionRules", "getSuccessfulTerminationRules", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class SwipeProcessingRulesChain {
        private final Set<PostSwipeConsumptionRule> postConsumptionRules = ((Set) new LinkedHashSet());
        private final Set<PreSwipeConsumptionRule> preConsumptionRules = ((Set) new LinkedHashSet());
        private final Set<SuccessfulSwipeTerminationRule> successfulTerminationRules = ((Set) new LinkedHashSet());
        @NotNull
        private final Swipe swipe;

        public SwipeProcessingRulesChain(@NotNull Swipe swipe) {
            C2668g.b(swipe, "swipe");
            this.swipe = swipe;
        }

        @NotNull
        public final Swipe getSwipe() {
            return this.swipe;
        }

        @NotNull
        public final SwipeProcessingRulesChain addPreSwipeConsumptionRule(@NotNull PreSwipeConsumptionRule preSwipeConsumptionRule) {
            C2668g.b(preSwipeConsumptionRule, "preConsumptionRule");
            this.preConsumptionRules.add(preSwipeConsumptionRule);
            return this;
        }

        @NotNull
        public final SwipeProcessingRulesChain addPostSwipeConsumptionRule(@NotNull PostSwipeConsumptionRule postSwipeConsumptionRule) {
            C2668g.b(postSwipeConsumptionRule, "postConsumptionRule");
            this.postConsumptionRules.add(postSwipeConsumptionRule);
            return this;
        }

        @NotNull
        public final SwipeProcessingRulesChain addSuccessfulTerminationRule(@NotNull SuccessfulSwipeTerminationRule successfulSwipeTerminationRule) {
            C2668g.b(successfulSwipeTerminationRule, "successfulSwipeTerminationRule");
            this.successfulTerminationRules.add(successfulSwipeTerminationRule);
            return this;
        }

        @NotNull
        public final Set<PreSwipeConsumptionRule> getPreConsumptionRules() {
            Set<PreSwipeConsumptionRule> unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.preConsumptionRules));
            C2668g.a(unmodifiableSet, "Collections.unmodifiable…Set(preConsumptionRules))");
            return unmodifiableSet;
        }

        @NotNull
        public final Set<PostSwipeConsumptionRule> getPostConsumptionRules() {
            Set<PostSwipeConsumptionRule> unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.postConsumptionRules));
            C2668g.a(unmodifiableSet, "Collections.unmodifiable…et(postConsumptionRules))");
            return unmodifiableSet;
        }

        @NotNull
        public final Set<SuccessfulSwipeTerminationRule> getSuccessfulTerminationRules() {
            Set<SuccessfulSwipeTerminationRule> unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.successfulTerminationRules));
            C2668g.a(unmodifiableSet, "Collections.unmodifiable…cessfulTerminationRules))");
            return unmodifiableSet;
        }
    }

    @NotNull
    SwipeProcessingRulesChain resolveSwipeRules(@NotNull Swipe swipe);
}
