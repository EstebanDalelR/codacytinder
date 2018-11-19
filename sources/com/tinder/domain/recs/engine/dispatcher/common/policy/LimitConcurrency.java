package com.tinder.domain.recs.engine.dispatcher.common.policy;

import com.tinder.domain.recs.engine.dispatcher.common.model.DispatcherState;
import com.tinder.domain.recs.model.Swipe;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/LimitConcurrency;", "Lcom/tinder/domain/recs/engine/dispatcher/common/policy/DispatchPolicy;", "()V", "findDispatchableSwipes", "", "Lcom/tinder/domain/recs/model/Swipe;", "candidateSwipes", "state", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "isDispatchable", "", "swipe", "dispatchableSwipes", "", "remainingSize", "", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class LimitConcurrency implements DispatchPolicy {
    private static final int CONCURRENCY_LIMIT = 5;
    public static final Companion Companion = new Companion();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/LimitConcurrency$Companion;", "", "()V", "CONCURRENCY_LIMIT", "", "getCONCURRENCY_LIMIT", "()I", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }

        private final int getCONCURRENCY_LIMIT() {
            return LimitConcurrency.CONCURRENCY_LIMIT;
        }
    }

    @NotNull
    public Collection<Swipe> findDispatchableSwipes(@NotNull Collection<Swipe> collection, @NotNull DispatcherState dispatcherState) {
        C2668g.b(collection, "candidateSwipes");
        C2668g.b(dispatcherState, "state");
        int access$getCONCURRENCY_LIMIT$p = Companion.getCONCURRENCY_LIMIT() - dispatcherState.runningSwipes().size();
        dispatcherState = new HashSet();
        for (Swipe swipe : collection) {
            if (isDispatchable(swipe, (Set) dispatcherState, access$getCONCURRENCY_LIMIT$p)) {
                dispatcherState.add(swipe);
            }
        }
        return (Collection) dispatcherState;
    }

    private final boolean isDispatchable(Swipe swipe, Set<Swipe> set, int i) {
        boolean z = true;
        switch (swipe.getType()) {
            case SUPERLIKE:
                return true;
            case LIKE:
            case PASS:
                if (set.size() >= i) {
                    z = false;
                }
                return z;
            default:
                return false;
        }
    }
}
