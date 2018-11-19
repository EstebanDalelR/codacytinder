package com.tinder.recs.card;

import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/card/TopPickTeaserRecCard;", "Lcom/tinder/cardstack/model/Card;", "Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "item", "(Lcom/tinder/domain/recs/model/TopPickTeaserRec;)V", "getItem", "()Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPickTeaserRecCard extends C8395a<TopPickTeaserRec> {
    @NotNull
    private final TopPickTeaserRec item;

    @NotNull
    public final TopPickTeaserRec getItem() {
        return this.item;
    }

    public TopPickTeaserRecCard(@NotNull TopPickTeaserRec topPickTeaserRec) {
        C2668g.b(topPickTeaserRec, "item");
        super(topPickTeaserRec.getId(), topPickTeaserRec);
        this.item = topPickTeaserRec;
    }
}
