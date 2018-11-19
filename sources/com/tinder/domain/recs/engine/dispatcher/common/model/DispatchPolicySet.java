package com.tinder.domain.recs.engine.dispatcher.common.model;

import com.tinder.domain.recs.engine.dispatcher.common.policy.AddPendingSwipes;
import com.tinder.domain.recs.engine.dispatcher.common.policy.DispatchPolicy;
import com.tinder.domain.recs.engine.dispatcher.common.policy.LimitConcurrency;
import com.tinder.domain.recs.engine.dispatcher.common.policy.RetryFailedSwipes;
import com.tinder.domain.recs.engine.dispatcher.common.policy.SortByPriority;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatchPolicySet;", "", "()V", "dispatchPolicies", "Ljava/util/ArrayList;", "Lcom/tinder/domain/recs/engine/dispatcher/common/policy/DispatchPolicy;", "addDispatchPolicy", "dispatchPolicy", "", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class DispatchPolicySet {
    public static final Companion Companion = new Companion();
    private final ArrayList<DispatchPolicy> dispatchPolicies = new ArrayList();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatchPolicySet$Companion;", "", "()V", "defaultPolicies", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatchPolicySet;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final DispatchPolicySet defaultPolicies() {
            return new DispatchPolicySet().addDispatchPolicy(new RetryFailedSwipes()).addDispatchPolicy(new AddPendingSwipes()).addDispatchPolicy(new SortByPriority()).addDispatchPolicy(new LimitConcurrency());
        }
    }

    @NotNull
    public final List<DispatchPolicy> dispatchPolicies() {
        return this.dispatchPolicies;
    }

    @NotNull
    public final DispatchPolicySet addDispatchPolicy(@NotNull DispatchPolicy dispatchPolicy) {
        C2668g.b(dispatchPolicy, "dispatchPolicy");
        this.dispatchPolicies.add(dispatchPolicy);
        return this;
    }
}
