package com.tinder.domain.recs.engine.dispatcher.common.policy;

import com.tinder.domain.recs.engine.dispatcher.common.model.DispatcherState;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u00050\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/SortByPriority;", "Lcom/tinder/domain/recs/engine/dispatcher/common/policy/DispatchPolicy;", "()V", "previousPendingSwipes", "Ljava/util/HashSet;", "Lcom/tinder/domain/recs/model/Swipe;", "sortedPendingSwipes", "Ljava/util/PriorityQueue;", "kotlin.jvm.PlatformType", "compareSwipes", "", "swipe1", "swipe2", "findDispatchableSwipes", "", "candidateSwipes", "state", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class SortByPriority implements DispatchPolicy {
    public static final Companion Companion = new Companion();
    private static final int INITIAL_CAPACITY = 11;
    private static final List<Type> SWIPE_TYPE_PRECEDENCE = Arrays.asList(new Type[]{Type.SUPERLIKE, Type.LIKE, Type.PASS});
    private final HashSet<Swipe> previousPendingSwipes = new HashSet();
    private final PriorityQueue<Swipe> sortedPendingSwipes = new PriorityQueue(Companion.getINITIAL_CAPACITY(), new SortByPriority$sortedPendingSwipes$1(this));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R8\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/SortByPriority$Companion;", "", "()V", "INITIAL_CAPACITY", "", "getINITIAL_CAPACITY", "()I", "SWIPE_TYPE_PRECEDENCE", "", "Lcom/tinder/domain/recs/model/Swipe$Type;", "kotlin.jvm.PlatformType", "", "getSWIPE_TYPE_PRECEDENCE", "()Ljava/util/List;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }

        private final List<Type> getSWIPE_TYPE_PRECEDENCE() {
            return SortByPriority.SWIPE_TYPE_PRECEDENCE;
        }

        private final int getINITIAL_CAPACITY() {
            return SortByPriority.INITIAL_CAPACITY;
        }
    }

    @NotNull
    public Collection<Swipe> findDispatchableSwipes(@NotNull Collection<Swipe> collection, @NotNull DispatcherState dispatcherState) {
        C2668g.b(collection, "candidateSwipes");
        C2668g.b(dispatcherState, "state");
        dispatcherState = new HashSet(collection);
        dispatcherState.removeAll(this.previousPendingSwipes);
        HashSet hashSet = new HashSet(this.previousPendingSwipes);
        hashSet.removeAll(collection);
        this.sortedPendingSwipes.addAll((Collection) dispatcherState);
        this.sortedPendingSwipes.removeAll(hashSet);
        this.previousPendingSwipes.clear();
        this.previousPendingSwipes.addAll(collection);
        return new ArrayList((Collection) this.sortedPendingSwipes);
    }

    private final int compareSwipes(Swipe swipe, Swipe swipe2) {
        return Companion.getSWIPE_TYPE_PRECEDENCE().indexOf(swipe.getType()) - Companion.getSWIPE_TYPE_PRECEDENCE().indexOf(swipe2.getType());
    }
}
