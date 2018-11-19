package com.tinder.recs.card;

import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.recs.model.SuperLikeableGameTeaserRec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/recs/card/SuperLikeableGameTeaserRecCard;", "Lcom/tinder/cardstack/model/Card;", "Lcom/tinder/domain/recs/model/SuperLikeableGameTeaserRec;", "item", "(Lcom/tinder/domain/recs/model/SuperLikeableGameTeaserRec;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGameTeaserRecCard extends C8395a<SuperLikeableGameTeaserRec> {
    public SuperLikeableGameTeaserRecCard(@NotNull SuperLikeableGameTeaserRec superLikeableGameTeaserRec) {
        C2668g.b(superLikeableGameTeaserRec, "item");
        super(superLikeableGameTeaserRec.getId(), superLikeableGameTeaserRec);
    }
}
