package com.tinder.data.toppicks;

import com.tinder.data.adapter.C2646o;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/toppicks/TeaserRecToTopPickTeaserAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "Lcom/tinder/domain/recs/model/Rec;", "()V", "fromApi", "rec", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.g */
public final class C11008g extends C2646o<TopPickTeaser, Rec> {
    @Nullable
    /* renamed from: a */
    public TopPickTeaser m43655a(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        if (!(rec instanceof TopPickTeaserRec)) {
            rec = null;
        }
        TopPickTeaserRec topPickTeaserRec = (TopPickTeaserRec) rec;
        if (topPickTeaserRec == null) {
            return null;
        }
        return new TopPickTeaser(topPickTeaserRec.getId(), new DateTime(topPickTeaserRec.getExpirationTime()), topPickTeaserRec.getImageUrl(), topPickTeaserRec.getTags());
    }
}
