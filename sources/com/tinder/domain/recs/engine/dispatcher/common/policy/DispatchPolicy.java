package com.tinder.domain.recs.engine.dispatcher.common.policy;

import com.tinder.domain.recs.engine.dispatcher.common.model.DispatcherState;
import com.tinder.domain.recs.model.Swipe;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/common/policy/DispatchPolicy;", "", "findDispatchableSwipes", "", "Lcom/tinder/domain/recs/model/Swipe;", "candidateSwipes", "state", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface DispatchPolicy {
    @NotNull
    Collection<Swipe> findDispatchableSwipes(@NotNull Collection<Swipe> collection, @NotNull DispatcherState dispatcherState);
}
