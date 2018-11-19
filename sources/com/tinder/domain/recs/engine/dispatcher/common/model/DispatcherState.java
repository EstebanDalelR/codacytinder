package com.tinder.domain.recs.engine.dispatcher.common.model;

import com.tinder.domain.recs.model.Swipe;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0002\u0010\u0004J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\"\u001a\u00020#H\u0016R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "", "()V", "state", "(Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;)V", "swipesMap", "Ljava/util/HashMap;", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState$DispatchStatus;", "", "Lcom/tinder/domain/recs/model/Swipe;", "addSwipes", "", "swipes", "", "toDispatchStatus", "addingToPending", "allSwipes", "equals", "", "other", "failedSwipes", "getSwipes", "dispatchStatus", "hashCode", "", "moveSwipes", "fromDispatchStatus", "movingToFailed", "movingToRunning", "movingToSuccessful", "pendingSwipes", "putSwipes", "runningSwipes", "successfulSwipes", "toString", "", "DispatchStatus", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class DispatcherState {
    private final HashMap<DispatchStatus, Set<Swipe>> swipesMap = new HashMap();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState$DispatchStatus;", "", "(Ljava/lang/String;I)V", "PENDING", "RUNNING", "SUCCESSFUL", "FAILED", "engine_release"}, k = 1, mv = {1, 1, 9})
    private enum DispatchStatus {
    }

    public DispatcherState() {
        for (Object put : DispatchStatus.values()) {
            this.swipesMap.put(put, ak.a());
        }
    }

    public DispatcherState(@NotNull DispatcherState dispatcherState) {
        C2668g.b(dispatcherState, "state");
        this.swipesMap.putAll((Map) dispatcherState.swipesMap);
    }

    @NotNull
    public final Set<Swipe> allSwipes() {
        HashSet hashSet = new HashSet();
        for (DispatchStatus swipes : DispatchStatus.values()) {
            hashSet.addAll(getSwipes(swipes));
        }
        return hashSet;
    }

    @NotNull
    public final Set<Swipe> pendingSwipes() {
        return getSwipes(DispatchStatus.PENDING);
    }

    @NotNull
    public final Set<Swipe> runningSwipes() {
        return getSwipes(DispatchStatus.RUNNING);
    }

    @NotNull
    public final Set<Swipe> successfulSwipes() {
        return getSwipes(DispatchStatus.SUCCESSFUL);
    }

    @NotNull
    public final Set<Swipe> failedSwipes() {
        return getSwipes(DispatchStatus.FAILED);
    }

    @NotNull
    public final DispatcherState addingToPending(@NotNull Collection<Swipe> collection) {
        C2668g.b(collection, "swipes");
        if (collection.isEmpty()) {
            return this;
        }
        DispatcherState dispatcherState = new DispatcherState(this);
        dispatcherState.addSwipes(collection, DispatchStatus.PENDING);
        return dispatcherState;
    }

    @NotNull
    public final DispatcherState movingToRunning(@NotNull Collection<Swipe> collection) {
        C2668g.b(collection, "swipes");
        if (collection.isEmpty()) {
            return this;
        }
        DispatcherState dispatcherState = new DispatcherState(this);
        HashSet hashSet = new HashSet(collection);
        hashSet.retainAll(pendingSwipes());
        if (!hashSet.isEmpty()) {
            dispatcherState.moveSwipes(hashSet, DispatchStatus.PENDING, DispatchStatus.RUNNING);
        }
        hashSet = new HashSet(collection);
        hashSet.retainAll(failedSwipes());
        if (hashSet.isEmpty() == null) {
            dispatcherState.moveSwipes(hashSet, DispatchStatus.FAILED, DispatchStatus.RUNNING);
        }
        return dispatcherState;
    }

    @NotNull
    public final DispatcherState movingToSuccessful(@NotNull Collection<Swipe> collection) {
        C2668g.b(collection, "swipes");
        if (collection.isEmpty()) {
            return this;
        }
        DispatcherState dispatcherState = new DispatcherState(this);
        dispatcherState.moveSwipes(collection, DispatchStatus.RUNNING, DispatchStatus.SUCCESSFUL);
        return dispatcherState;
    }

    @NotNull
    public final DispatcherState movingToFailed(@NotNull Collection<Swipe> collection) {
        C2668g.b(collection, "swipes");
        if (collection.isEmpty()) {
            return this;
        }
        DispatcherState dispatcherState = new DispatcherState(this);
        dispatcherState.moveSwipes(collection, DispatchStatus.RUNNING, DispatchStatus.FAILED);
        return dispatcherState;
    }

    private final void addSwipes(Collection<Swipe> collection, DispatchStatus dispatchStatus) {
        HashSet hashSet = new HashSet(collection);
        if (hashSet.removeAll(allSwipes()) != null) {
            throw ((Throwable) new IllegalArgumentException("Swipes have been scheduled"));
        }
        hashSet.addAll(pendingSwipes());
        putSwipes(dispatchStatus, hashSet);
    }

    private final void moveSwipes(Collection<Swipe> collection, DispatchStatus dispatchStatus, DispatchStatus dispatchStatus2) {
        Set swipes = getSwipes(dispatchStatus);
        if (swipes.containsAll(collection)) {
            Collection collection2 = swipes;
            HashSet hashSet = new HashSet(collection2);
            hashSet.removeAll(collection);
            Set swipes2 = getSwipes(dispatchStatus2);
            HashSet hashSet2 = new HashSet(collection);
            if (hashSet2.retainAll(collection2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot move swipes: ");
                stringBuilder.append(collection);
                stringBuilder.append(" from: ");
                stringBuilder.append(dispatchStatus);
                stringBuilder.append(" to: ");
                stringBuilder.append(dispatchStatus2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            hashSet2.addAll(swipes2);
            putSwipes(dispatchStatus, hashSet);
            putSwipes(dispatchStatus2, hashSet2);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot move swipes: ");
        stringBuilder.append(collection);
        stringBuilder.append(" from: ");
        stringBuilder.append(dispatchStatus);
        stringBuilder.append(" to: ");
        stringBuilder.append(dispatchStatus2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final Set<Swipe> getSwipes(DispatchStatus dispatchStatus) {
        dispatchStatus = this.swipesMap.get(dispatchStatus);
        if (dispatchStatus == null) {
            C2668g.a();
        }
        return (Set) dispatchStatus;
    }

    private final void putSwipes(DispatchStatus dispatchStatus, Set<Swipe> set) {
        this.swipesMap.put(dispatchStatus, Collections.unmodifiableSet(set));
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("State{pendingSwipes=");
        stringBuilder.append(pendingSwipes());
        stringBuilder.append(",dispatchingSwipes=");
        stringBuilder.append(runningSwipes());
        stringBuilder.append(',');
        stringBuilder.append("successfulSwipes=");
        stringBuilder.append(successfulSwipes());
        stringBuilder.append(",failedSwipes=");
        stringBuilder.append(failedSwipes());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DispatcherState) {
            return C2668g.a(this.swipesMap, ((DispatcherState) obj).swipesMap);
        }
        return null;
    }

    public int hashCode() {
        return this.swipesMap.hashCode();
    }
}
