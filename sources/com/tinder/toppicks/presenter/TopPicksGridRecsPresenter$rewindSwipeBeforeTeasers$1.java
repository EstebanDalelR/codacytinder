package com.tinder.toppicks.presenter;

import com.tinder.domain.recs.model.Rec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00072\u0015\u0010\b\u001a\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "", "Lcom/tinder/domain/recs/model/Rec;", "Lkotlin/ParameterName;", "name", "currentRecs", "p2", "swipedIndex", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksGridRecsPresenter$rewindSwipeBeforeTeasers$1 extends FunctionReference implements Function2<List<? extends Rec>, Integer, Integer> {
    TopPicksGridRecsPresenter$rewindSwipeBeforeTeasers$1(C17082e c17082e) {
        super(2, c17082e);
    }

    public final String getName() {
        return "calculateRewindBeforeTeasersPosition";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C17082e.class);
    }

    public final String getSignature() {
        return "calculateRewindBeforeTeasersPosition(Ljava/util/List;I)I";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(m68153a((List) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: a */
    public final int m68153a(@NotNull List<? extends Rec> list, int i) {
        C2668g.b(list, "p1");
        return ((C17082e) this.receiver).m62893a((List) list, i);
    }
}
