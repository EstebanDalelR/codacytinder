package com.tinder.domain.recs;

import com.tinder.domain.recs.model.Rec;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/recs/GlobalRecsConsumptionEventPublisher;", "", "publish", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface GlobalRecsConsumptionEventPublisher {
    void publish(@NotNull Rec rec);
}
