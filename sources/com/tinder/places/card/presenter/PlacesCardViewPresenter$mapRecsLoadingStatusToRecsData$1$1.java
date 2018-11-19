package com.tinder.places.card.presenter;

import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.places.card.presenter.C10133f.C10132a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "p1", "Lcom/tinder/domain/recs/model/RecsUpdate;", "Lkotlin/ParameterName;", "name", "update", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesCardViewPresenter$mapRecsLoadingStatusToRecsData$1$1 extends FunctionReference implements Function1<RecsUpdate, List<? extends String>> {
    PlacesCardViewPresenter$mapRecsLoadingStatusToRecsData$1$1(C10132a c10132a) {
        super(1, c10132a);
    }

    public final String getName() {
        return "mapRecsUpdateToImageUrls";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10132a.class);
    }

    public final String getSignature() {
        return "mapRecsUpdateToImageUrls(Lcom/tinder/domain/recs/model/RecsUpdate;)Ljava/util/List;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54440a((RecsUpdate) obj);
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m54440a(@NotNull RecsUpdate recsUpdate) {
        C2668g.b(recsUpdate, "p1");
        return ((C10132a) this.receiver).m41434a(recsUpdate);
    }
}
