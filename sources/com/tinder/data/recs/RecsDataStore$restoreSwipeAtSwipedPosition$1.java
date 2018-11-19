package com.tinder.data.recs;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Swipe;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "Lcom/tinder/domain/recs/model/Rec;", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 1, 9})
final class RecsDataStore$restoreSwipeAtSwipedPosition$1 extends Lambda implements Function2<List<? extends Rec>, Integer, Integer> {
    /* renamed from: a */
    final /* synthetic */ Swipe f43992a;

    RecsDataStore$restoreSwipeAtSwipedPosition$1(Swipe swipe) {
        this.f43992a = swipe;
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(m53432a((List) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: a */
    public final int m53432a(@NotNull List<? extends Rec> list, int i) {
        C2668g.b(list, "<anonymous parameter 0>");
        return this.f43992a.getActionContext().getSwipedPosition$engine_release();
    }
}
