package com.tinder.recs.domain.usecase;

import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Insert;
import io.reactivex.functions.Predicate;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "test"}, k = 3, mv = {1, 1, 10})
final class RecsFirstInserted$execute$1<T> implements Predicate<RecsUpdate> {
    public static final RecsFirstInserted$execute$1 INSTANCE = new RecsFirstInserted$execute$1();

    RecsFirstInserted$execute$1() {
    }

    public final boolean test(@NotNull RecsUpdate recsUpdate) {
        C2668g.b(recsUpdate, "it");
        return ((((Collection) recsUpdate.getCurrentRecs()).isEmpty() ^ 1) == 0 || (recsUpdate instanceof Insert) == null) ? false : true;
    }
}
